package com.tools20022.generators;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
	final Set<EReference> keepRefs;

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

		{
			List<String> names = Arrays.asList("simpleType", "complexType", "businessElementTrace",
					"businessComponentTrace");
			Set<EReference> tmp = new HashSet<>();
			for (EClassifier ecc : ecorePackage.getEClassifiers()) {
				if (!(ecc instanceof EClass))
					continue;
				for (EReference eRef : ((EClass) ecc).getEAllReferences()) {
					if (!names.contains(eRef.getName()))
						continue;
					tmp.add(eRef);
				}
			}
			tmp.add(assocDomainRef);
			keepRefs = Collections.unmodifiableSet(tmp);
		}

	}

	EClass getEClassByName(String eClassName) {
		return (EClass) ecorePackage.getEClassifier(eClassName);
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

	public ConsistentSubset createSubSet(Predicate<EObject> filter, ProgressMonitor monitor) throws Exception {
		ConsistentSubset css = new ConsistentSubset();
		css.executeFilter(filter, monitor);
		return css;
	}

	public class ConsistentSubset {
		Set<EObject> markedForRetain = new HashSet<>();
		Set<EObject> optionalBusinessAssoc = new HashSet<>();

		private void executeFilter(Predicate<EObject> filter, ProgressMonitor monitor) throws Exception {

			/*** Phase 1: collect seed set ***/

			xmiRootEObj.eAllContents().forEachRemaining(eObj -> {
				if (filter.test(eObj)) {
					markedForRetain.add(eObj);
				}
			});
			monitor.info("Seed selection completed");

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

		int extendRetainSet(Set<EObject> markedForRetain, ProgressMonitor monitor) {
			int startCount = markedForRetain.size();

			Set<EObject> newMarks = new HashSet<>();

			// Loop on objects
			for (EObject eObj : new HashSet<EObject>(markedForRetain)) {
				monitor.info("Extend object: " + ECoreIOHelper.toString(eObj));

				// Add container

				if (eObj.eContainer() != null) {
					markedForRetain.add(eObj.eContainer());
					monitor.info("  - add container: " + ECoreIOHelper.toString(eObj.eContainer()));
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
				monitor.info("  - skip optional businessAssoc " + ECoreIOHelper.toString(refObj));
			}

			newMarks.add(refObj);
			monitor.info("  - add by ref: " + eRef.getName() + "->" + ECoreIOHelper.toString(refObj));
		}

		public Map<EClass,List<EObject>> getSatistics(){
			return markedForRetain.stream().collect(Collectors.groupingBy(EObject::eClass));
		}
		public void saveFilteredXmiModel(Path outFile) throws Exception {
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
			Files.write(outFile, xmiBytes);
		}

	}
}
