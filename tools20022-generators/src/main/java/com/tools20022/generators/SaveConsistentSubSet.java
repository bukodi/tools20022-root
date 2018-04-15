package com.tools20022.generators;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Saves the consistent subset of the full eRepository. It is useful, for
 * creating smaller models for tests. This class uses only the EMF eCore+XMI
 * layer.
 */
public class SaveConsistentSubSet {

	final EPackage ecorePackage;
	final EObject xmiRootEObj;
	final Set<EReference> dontAddRefContents;

	final EReference businessAssocType;
	final EAttribute businessAssocMinOccurs;
	final EReference assocDomainRef;

	// Set<String> keepRefs = Stream.of("simpleType", "complexType")
	// .collect(Collectors.toSet());
	// private boolean keepRequiredBusinessAssociationEnds = false;

	public SaveConsistentSubSet(EPackage ecorePackage, EObject xmiRootEObj) {
		this.ecorePackage = ecorePackage;
		this.xmiRootEObj = xmiRootEObj;

		// Hardcoded ecore objects
		assocDomainRef = (EReference) ((EClass) ecorePackage.getEClassifier("BusinessComponent"))
				.getEStructuralFeature("associationDomain");
		businessAssocType = (EReference) ((EClass) ecorePackage.getEClassifier("BusinessAssociationEnd"))
				.getEStructuralFeature("type");
		businessAssocMinOccurs = (EAttribute) ((EClass) ecorePackage.getEClassifier("BusinessAssociationEnd"))
				.getEStructuralFeature("minOccurs");
		{
			Set<EReference> tmp = new HashSet<>();
			tmp.add((EReference) ((EClass) ecorePackage.getEClassifier("DataDictionary"))
					.getEStructuralFeature("topLevelDictionaryEntry"));
			tmp.add((EReference) ((EClass) ecorePackage.getEClassifier("BusinessProcessCatalogue"))
					.getEStructuralFeature("topLevelCatalogueEntry"));
			tmp.add((EReference) ((EClass) ecorePackage.getEClassifier("BusinessArea"))
					.getEStructuralFeature("messageDefinition"));
			dontAddRefContents = Collections.unmodifiableSet(tmp);
		}

	}

	EClass getEClassByName(String eClassName) {
		return (EClass) ecorePackage.getEClassifier(eClassName);
	}

	public ConsistentSubset createSubSet(Predicate<EObject> filter, boolean skipBusinessComponents, ProgressMonitor monitor) throws Exception {
		Set<EObject> seedSet = new HashSet<>();
		xmiRootEObj.eAllContents().forEachRemaining(eObj -> {
			if (filter.test(eObj)) {
				seedSet.add(eObj);
			}
		});
		monitor.info("Seed selection completed");
		
		return createSubSet(seedSet, skipBusinessComponents, monitor);
	}

	public ConsistentSubset createSubSet(Set<EObject> seedSet, boolean skipBusinessComponents, ProgressMonitor monitor) throws Exception {
		ConsistentSubset css = new ConsistentSubset(skipBusinessComponents);
		css.executeFilter(seedSet, monitor);
		return css;
	}

	public class ConsistentSubset {
		final boolean skipBusinessComponents;
		Set<EObject> markedForRetain = new HashSet<>();
		Set<EObject> optionalBusinessAssoc = new HashSet<>();
		final Set<EReference> keepRefs;

		public ConsistentSubset(boolean skipBusinessComponents) {
			this.skipBusinessComponents = skipBusinessComponents;
			
			{
				List<String> names = new ArrayList<>();
				names.add("simpleType");
				names.add("complexType");
				if( ! skipBusinessComponents ) {
					names.add( "businessElementTrace");
					names.add( "businessComponentTrace");
				}
				Set<EReference> tmp = new HashSet<>();
				for (EClassifier ecc : ecorePackage.getEClassifiers()) {
					if (!(ecc instanceof EClass))
						continue;
					for (EReference eRef : ((EClass) ecc).getEAllReferences()) {
						if( "trace".equals(eRef.getName()) && eRef.getEContainingClass().getName().equals("CodeSet") ) {
							tmp.add(eRef);
						}
						
						if (!names.contains(eRef.getName()))
							continue;
						tmp.add(eRef);
					}
				}
				tmp.add(assocDomainRef);
				tmp.add((EReference) ((EClass) ecorePackage.getEClassifier("Amount"))
						.getEStructuralFeature("currencyIdentifierSet"));

				keepRefs = Collections.unmodifiableSet(tmp);
			}

		}

		private void executeFilter(Set<EObject> seedSet, ProgressMonitor monitor) throws Exception {

			/*** Phase 1: collect seed set ***/
			markedForRetain.addAll(seedSet);

			/*** Phase 2: extend retainSet ***/
			for (int round = 1;; round++) {
				monitor.info("--- Round " + round + " ---");
				int addedObjects = extendRetainSet(markedForRetain, monitor);
				monitor.info("" + addedObjects + " objects added in " + round + ". round. All objects: "
						+ markedForRetain.size());
				if (addedObjects == 0)
					break;
			}
			/*** Phase 3: add optional business assoc if the target type retained ***/
			for (EObject eObj : optionalBusinessAssoc) {
				EObject refEntity = (EObject) eObj.eGet(businessAssocType);
				if (markedForRetain.contains(refEntity)) {
					markedForRetain.add(eObj);
				}
			}

			monitor.info("End size: " + markedForRetain.size());
		}

		boolean keepThisRef(EReference eRef, EObject eObj) {
			if (eRef.isContainer())
				return false;

			boolean keepThisRef = keepRefs.contains(eRef);
			keepThisRef = keepThisRef || (eRef.isMany() && eRef.getLowerBound() > 0);
			keepThisRef = keepThisRef || (!eRef.isMany() && (!eRef.isChangeable() || eRef.isRequired()));
			keepThisRef = keepThisRef || (eRef.isContainment() && (!dontAddRefContents.contains(eRef)));
			if (!keepThisRef)
				return false;

			return true;
		}

		int extendRetainSet(Set<EObject> markedForRetain, ProgressMonitor monitor) {
			int startCount = markedForRetain.size();

			Set<EObject> newMarks = new HashSet<>();

			// Loop on objects
			for (EObject eObj : new HashSet<EObject>(markedForRetain)) {
				monitor.trace("Extend object: " + ECoreIOHelper.toString(eObj));

				// Add container

				if (eObj.eContainer() != null) {
					markedForRetain.add(eObj.eContainer());
					monitor.trace("  - add container: " + ECoreIOHelper.toString(eObj.eContainer()));
				}

				// Loop on references
				for (EReference eRef : eObj.eClass().getEAllReferences()) {
					if (!keepThisRef(eRef, eObj))
						continue;
					Object value = eObj.eGet(eRef);
					if (value == null) {
						continue;
					} else if (value instanceof List) {
						List<EObject> list = (List<EObject>) value;
						for (EObject refObj : list) {
							addObject(eRef, refObj, markedForRetain, newMarks, monitor);
							// newMarks.computeIfAbsent(eRef, x -> new
							// HashSet<>()).add(refObj);
						}
					} else if (value instanceof EObject) {
						EObject refObj = (EObject) value;
						addObject(eRef, refObj, markedForRetain, newMarks, monitor);
					} else {
						throw new RuntimeException("Invalid value: " + value);
					}

				}
			}

			// Return delta
			markedForRetain.addAll(newMarks);
			return markedForRetain.size() - startCount;
		}

		void addObject(EReference eRef, EObject refObj, Set<EObject> markedForRetain, Set<EObject> newMarks,
				ProgressMonitor monitor) {
			// Don't add if this is an optional entity association
			if (assocDomainRef.equals(eRef)) {
				Object minOccursValue = refObj.eGet(businessAssocMinOccurs);
				if (minOccursValue == null || (((Integer) minOccursValue).intValue() == 0)) {
					// Store this optional BusinessAssociationEnd for later use
					optionalBusinessAssoc.add(refObj);
					return;
				}
				monitor.trace("  - skip optional businessAssoc " + ECoreIOHelper.toString(refObj));
			}

			newMarks.add(refObj);
			monitor.trace("  - add by ref: " + eRef.getName() + "->" + ECoreIOHelper.toString(refObj));
		}

		public Map<EClass,List<EObject>> getSatistics(){
			return markedForRetain.stream().collect(Collectors.groupingBy(EObject::eClass));
		}
		
		public void saveFilteredXmiModel(Path outFile) throws Exception {
			byte[] xmiBytes = createFilteredXmiModel();
			Files.write(outFile, xmiBytes);			
		}

		public byte[] createFilteredXmiModel() throws Exception {
			Collection<EObject> copySet = EcoreUtil.copyAll(markedForRetain);
			
			/*** Phase 3: remove missing references ***/
			for (EObject eObj : markedForRetain) {
				for (EReference eRef : eObj.eClass().getEAllReferences()) {
					List<EObject> refObjList;
					{
						Object value = eObj.eGet(eRef);
						if (value == null) {
							continue;
						} else if (value instanceof List) {
							refObjList = new ArrayList<>((List<EObject>) value);
						} else if (value instanceof EObject) {
							refObjList = Arrays.asList((EObject) value);
						} else {
							throw new RuntimeException("Invalid value: " + value);
						}
					}

					if (keepThisRef(eRef, eObj)) {
						// Check
						for (EObject refObj : refObjList) {
							if (markedForRetain.contains(refObj))
								continue;
							throw new RuntimeException("Missing referenced object: " + ECoreIOHelper.toString(eObj)
									+ "." + eRef.getName() + " -> " + ECoreIOHelper.toString(refObj));
						}
					} else {
						// Clear if not contained
						for (EObject refObj : refObjList) {
							if (markedForRetain.contains(refObj))
								continue;
							EcoreUtil.remove(eObj, eRef, refObj);
						}
					}
				}
			}
			
			byte[] xmiBytes = ECoreIOHelper.writeXMIResource(xmiRootEObj);
			return xmiBytes;
		}

	}

	public Predicate<EObject> filterLatestVersion( ) {
		EClass eClassModelEntity = (EClass) ecorePackage.getEClassifier("ModelEntiy");
		EReference eRefNextVersions = (EReference) eClassModelEntity.getEStructuralFeature("nextVersions");

		Predicate<EObject> filter = eObj -> {
			if ( ! ((List) eObj.eGet(eRefNextVersions)).isEmpty())
				return false;
			return true;
		};

		return filter;
	}

	/*public Predicate<EObject> filterBusinessArea( String businessAreaName, boolean onlyTheLatesVersion ) {
		EClass eClassMessageDefinition = (EClass) ecorePackage.getEClassifier("MessageDefinition");
		EAttribute eAttrName = (EAttribute) eClassMessageDefinition.getEStructuralFeature("name");
		// Predicate<EObject> filter = eObj -> {
		// if (!eClassMessageDefinition.equals(eObj.eClass()))
		// return false;
		// String name = (String) eObj.eGet(eAttrName);
		// return "MandateInitiationRequestV05".equals(name);
		// };

		EClass eClassBusinessArea = (EClass) ecorePackage.getEClassifier("BusinessArea");
		EAttribute eAttrCode = (EAttribute) eClassBusinessArea.getEStructuralFeature("code");
		// Predicate<EObject> filter = eObj -> {
		// if (!eClassBusinessArea.equals(eObj.eClass()))
		// return false;
		// String name = (String) eObj.eGet(eAttrCode);
		// return "pain".equals(name);
		// };

		Predicate<EObject> filter = eObj -> {
			if (!eClassMessageDefinition.equals(eObj.eClass()))
				return false;
			if ( ! ((List) eObj.eGet(eRefNextVersions)).isEmpty())
				return false;
			EObject ba = eObj.eContainer();
			String code = (String) ba.eGet(eAttrCode);
//			if (!"acmt".equals(code))
//				return false;
			if ( ! ((List) ba.eGet(eRefNextVersions)).isEmpty())
				return false;
			return true;
		};

		return filter;
	}*/

	public Predicate<EObject> filterMessageDefinitions( String businessAreaName ) {
		EClass eClassMessageDefinition = (EClass) ecorePackage.getEClassifier("MessageDefinition");
		EAttribute eAttrName = (EAttribute) eClassMessageDefinition.getEStructuralFeature("name");
		EReference eRefNextVersions = (EReference) eClassMessageDefinition.getEStructuralFeature("nextVersions");
		// Predicate<EObject> filter = eObj -> {
		// if (!eClassMessageDefinition.equals(eObj.eClass()))
		// return false;
		// String name = (String) eObj.eGet(eAttrName);
		// return "MandateInitiationRequestV05".equals(name);
		// };

		EClass eClassBusinessArea = (EClass) ecorePackage.getEClassifier("BusinessArea");
		EAttribute eAttrCode = (EAttribute) eClassBusinessArea.getEStructuralFeature("code");
		// Predicate<EObject> filter = eObj -> {
		// if (!eClassBusinessArea.equals(eObj.eClass()))
		// return false;
		// String name = (String) eObj.eGet(eAttrCode);
		// return "pain".equals(name);
		// };

		Predicate<EObject> filter = eObj -> {
			if (!eClassMessageDefinition.equals(eObj.eClass()))
				return false;
			if ( ! ((List) eObj.eGet(eRefNextVersions)).isEmpty())
				return false;
			EObject ba = eObj.eContainer();
			String code = (String) ba.eGet(eAttrCode);
//			if (!"acmt".equals(code))
//				return false;
			if ( ! ((List) ba.eGet(eRefNextVersions)).isEmpty())
				return false;
			return true;
		};

		return filter;
	}
	
	public EObject getLatestBusinessAreaByCode( String code ) {
		EClass eClassBusinessArea = (EClass) ecorePackage.getEClassifier("BusinessArea");
		EAttribute eAttrCode = (EAttribute) eClassBusinessArea.getEStructuralFeature("code");
		EReference eRefNextVersions = (EReference) eClassBusinessArea.getEStructuralFeature("nextVersions");
		Set<EObject> matchingEObjs = new HashSet<>();
		for( TreeIterator<EObject> tit = xmiRootEObj.eAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if( ! eClassBusinessArea.equals( eObject.eClass()) ) 
				continue;
			if( ! code.equals( eObject.eGet(eAttrCode) ) )
				continue;
			if( ! ((List)eObject.eGet(eRefNextVersions) ).isEmpty() )
				continue;
			matchingEObjs.add(eObject);
		}
		if( matchingEObjs.isEmpty() )
			throw new NoSuchElementException();
		if( matchingEObjs.size() > 1 )
			throw new RuntimeException();
		return matchingEObjs.iterator().next();
	}

	public Map<String,EObject> getLatestBusinessAreas() {
		Map<String,EObject> areasbyCode = new HashMap<>();
		EClass eClassBusinessArea = (EClass) ecorePackage.getEClassifier("BusinessArea");
		EAttribute eAttrCode = (EAttribute) eClassBusinessArea.getEStructuralFeature("code");
		EAttribute eAttrName = (EAttribute) eClassBusinessArea.getEStructuralFeature("name");
		EReference eRefNextVersions = (EReference) eClassBusinessArea.getEStructuralFeature("nextVersions");
		Set<EObject> matchingEObjs = new HashSet<>();
		for( TreeIterator<EObject> tit = xmiRootEObj.eAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if( ! eClassBusinessArea.equals( eObject.eClass()) ) 
				continue;
			if( ! ((String)eObject.eGet(eAttrName) ).endsWith("- Latest version - master") )
				continue;
			String code = (String) eObject.eGet(eAttrCode); 
			if( areasbyCode.containsKey(code) )
				throw new RuntimeException();
			areasbyCode.put(code, eObject);
		}
		return areasbyCode;
	}

	public EObject getBusinessAreaByName( String name ) {

		EClass eClassMessageDefinition = (EClass) ecorePackage.getEClassifier("MessageDefinition");
		EAttribute eAttrName = (EAttribute) eClassMessageDefinition.getEStructuralFeature("name");
		EReference eRefNextVersions = (EReference) eClassMessageDefinition.getEStructuralFeature("nextVersions");
		// Predicate<EObject> filter = eObj -> {
		// if (!eClassMessageDefinition.equals(eObj.eClass()))
		// return false;
		// String name = (String) eObj.eGet(eAttrName);
		// return "MandateInitiationRequestV05".equals(name);
		// };

		EClass eClassBusinessArea = (EClass) ecorePackage.getEClassifier("BusinessArea");
		EAttribute eAttrCode = (EAttribute) eClassBusinessArea.getEStructuralFeature("code");
		// Predicate<EObject> filter = eObj -> {
		// if (!eClassBusinessArea.equals(eObj.eClass()))
		// return false;
		// String name = (String) eObj.eGet(eAttrCode);
		// return "pain".equals(name);
		// };		
		for( TreeIterator<EObject> tit = xmiRootEObj.eAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if( ! eClassBusinessArea.equals( eObject.eClass()) ) 
				continue;
			if( name.equals( eObject.eGet(eAttrName) ) )
				return eObject;
		}
		throw new NoSuchElementException();
	}
	
	public Predicate<EObject> filterMsgDefByMsgIds( List<String> expected_ids ) {

		EClass eClassMsgDefId = (EClass) ecorePackage.getEClassifier("MessageDefinitionIdentifier");
		EAttribute eAttrMsgDefArea = (EAttribute) eClassMsgDefId.getEStructuralFeature("businessArea");
		EAttribute eAttrMsgDefFunc = (EAttribute) eClassMsgDefId.getEStructuralFeature("messageFunctionality");
		EAttribute eAttrMsgDefFlavour = (EAttribute) eClassMsgDefId.getEStructuralFeature("flavour");
		EAttribute eAttrMsgDefVer = (EAttribute) eClassMsgDefId.getEStructuralFeature("version");
		
		String[] idArray = new String[expected_ids.size()];
		expected_ids.toArray(idArray);
		Arrays.sort( idArray );
		
		Predicate<EObject> filter = eObject-> {
			if( ! eClassMsgDefId.equals( eObject.eClass()) ) 
				return false;

			String area = (String)eObject.eGet(eAttrMsgDefArea);
			String func = (String)eObject.eGet(eAttrMsgDefFunc);
			String flavour = (String)eObject.eGet(eAttrMsgDefFlavour);
			String ver = (String)eObject.eGet(eAttrMsgDefVer);
			
			String actual_id = area + "." + func + "." + flavour + "." + ver;
			return Arrays.binarySearch(idArray, actual_id) >= 0;

		};
		return filter;
	}
	
	public Predicate<EObject> filterEClassAndName( String eClassName, String expectedName ) {

		EClass selectedEClass = (EClass) ecorePackage.getEClassifier(eClassName);
		EAttribute eAttrName = (EAttribute) (((EClass) ecorePackage.getEClassifier("RepositoryConcept")).getEStructuralFeature("name"));
		
		Predicate<EObject> filter = eObject-> {
			if( ! selectedEClass.equals( eObject.eClass()) ) 
				return false;
			
			String actualName = (String)eObject.eGet(eAttrName);
			return expectedName.equals(actualName);

		};
		return filter;
	}
	


	
}
