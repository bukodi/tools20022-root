package com.tools20022.generators;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.DanglingHREFException;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * Saves the consistent subset of the full eRepository.
 * It is useful, for creating smaller models for tests.
 * This class uses only the EMF eCore+XMI layer.  
 */
public class SaveConsistentSubSet {

	EPackage ecorePackage;
	EObject xmiRootEObj;
	//final Set<EClass> dontAddContents;
	final Set<EReference> dontAddRefContents;
	final Set<EReference> keepRefs;

	final EReference businessAssocType;
	final EAttribute businessAssocMinOccurs;

	Set<EObject> markedForRetain = new HashSet<>();
//	Set<String> keepRefs = Stream.of("simpleType", "complexType")
//			.collect(Collectors.toSet());
	private boolean keepRequiredBusinessAssociationEnds = false;

	public SaveConsistentSubSet() {				
		Path ecorePath = Paths.get("../tools20022-repogenerator/src/main/resources/model/ISO20022.ecore"); 
		Path xmiPath = Paths.get("../tools20022-repogenerator/src/main/resources/model/20170516_ISO20022_2013_eRepository.iso20022");
		ecorePackage = ECoreIOHelper.loadECorePackage(ecorePath);
		xmiRootEObj = ECoreIOHelper.loadXMIResource(xmiPath);
		
		businessAssocType = (EReference)((EClass) ecorePackage.getEClassifier("BusinessAssociationEnd")).getEStructuralFeature("type");
		businessAssocMinOccurs= (EAttribute)((EClass) ecorePackage.getEClassifier("BusinessAssociationEnd")).getEStructuralFeature("minOccurs");
		{
			Set<EReference> tmp = new HashSet<>(); 
			tmp.add((EReference)((EClass) ecorePackage.getEClassifier("DataDictionary")).getEStructuralFeature("topLevelDictionaryEntry"));
			tmp.add((EReference)((EClass) ecorePackage.getEClassifier("BusinessProcessCatalogue")).getEStructuralFeature("topLevelCatalogueEntry"));
			tmp.add((EReference)((EClass) ecorePackage.getEClassifier("BusinessArea")).getEStructuralFeature("messageDefinition"));
			dontAddRefContents = Collections.unmodifiableSet(tmp);
		}
		
		{
			List<String> names = Arrays.asList("simpleType", "complexType", "businessElementTrace", "businessComponentTrace");
			Set<EReference> tmp = new HashSet<>();
			for( EClassifier ecc : ecorePackage.getEClassifiers() ) {
				if( ! (ecc instanceof EClass) )
					continue;
				for( EReference eRef : ((EClass)ecc).getEAllReferences() ) {
					if( ! names.contains(eRef.getName()) )
						continue;
					tmp.add(eRef);
				}
			}
			keepRefs = Collections.unmodifiableSet(tmp);
		}

	}

	public static void main(String[] args) throws Exception {
		SaveConsistentSubSet scss = new SaveConsistentSubSet();

		// "MessageDefinition", "MandateInitiationRequestV05"
		Path tmpFile = Files.createTempFile("test", "iso20022");
		scss.saveTestFile(tmpFile);
	}

	EClass getEClassByName(String eClassName) {
		return (EClass) ecorePackage.getEClassifier(eClassName);
	}

	public void saveTestFile(Path outFile) throws Exception {

		EClass eClassMsgDef = (EClass) ecorePackage.getEClassifier("MessageDefinition");
		EAttribute eAttrName = (EAttribute) eClassMsgDef.getEStructuralFeature("name");

		/*** Phase 1: collect seed set ***/

		long now = System.currentTimeMillis();
		xmiRootEObj.eAllContents().forEachRemaining(eObj -> {
			if (eClassMsgDef.equals(eObj.eClass())) {
				String name = (String) eObj.eGet(eAttrName);
				if ("MandateInitiationRequestV05".equals(name)) {
					markedForRetain.add(eObj);
//					eObj.eAllContents().forEachRemaining(c -> {
//						markedForRetain.add(c);
//					});
					;
				}
			}
		});
		System.out.println(System.currentTimeMillis() - now);
		System.out.println();

		/*** Phase 2: extend retainSet ***/
		for (int round = 1;; round++) {
			System.out.println("--- Round " + round + " ---");
			int addedObjects = extendRetainSet(markedForRetain);
			System.out.println("" + addedObjects + " objects added in " + round + ". round. All objects: "
					+ markedForRetain.size());
			System.out.println();
			if (addedObjects == 0)
				break;
		}

		/*** Phase 3: remove missing references ***/
		markedForRetain.add(xmiRootEObj);
		for (EObject level1Obj : xmiRootEObj.eContents()) {
			markedForRetain.add(level1Obj);
		}

		for (EObject eObj : markedForRetain) {
			EList<EStructuralFeature> eSFList = eObj.eClass().getEAllStructuralFeatures();
			for (EStructuralFeature eSF : eSFList) {
				if (!(eSF instanceof EReference))
					continue;
				EReference eRef = (EReference) eSF;
				if (eRef.isRequired() || !eRef.isChangeable())
					continue;
				if ("simpleType".equals(eRef.getName()) || "complexType".equals(eRef.getName()))
					continue;

				Object value = eObj.eGet(eRef);
				if (value == null)
					continue;

				if (eRef.isMany()) {
					List<EObject> list = new ArrayList<>((EList<EObject>) value);
					for (EObject refObj : list) {
						if (markedForRetain.contains(refObj))
							continue;
						EcoreUtil.remove(eObj, eRef, refObj);
					}
				} else {
					EObject refObj = (EObject) value;
					EcoreUtil.remove(eObj, eRef, refObj);
				}
			}
		}

		byte[] xmiBytes = ECoreIOHelper.writeXMIResource(xmiRootEObj);
		Files.write(outFile, xmiBytes);
		
	}

	int extendRetainSet(Set<EObject> markedForRetain) {
		int startCount = markedForRetain.size();

		Set<EObject> newMarks = new HashSet<>();

		// Loop on objects
		for (EObject eObj : new HashSet<EObject>(markedForRetain)) {
			System.out.println( "Extend object: " + toString(eObj));
			
			// Add container
			if (eObj.eContainer() != null) {
				markedForRetain.add(eObj.eContainer());				
				System.out.println( "  - add container: " + toString(eObj.eContainer()));
			}

			// Loop on references
			for (EReference eRef : eObj.eClass().getEAllReferences()) {
				if (eRef.isContainer())
					continue;
				
				boolean keepThisRef = keepRefs.contains(eRef);
				keepThisRef = keepThisRef || (eRef.isMany() && eRef.getLowerBound() > 0);
				keepThisRef = keepThisRef || (!eRef.isMany() && (!eRef.isChangeable() || eRef.isRequired()));
				keepThisRef = keepThisRef || ( eRef.isContainment() && (! dontAddRefContents.contains( eRef)));
				if( ! keepThisRef )
					continue;
				
				if( businessAssocType.equals( eRef ) ) {
					Object minOccursValue = eObj.eGet(businessAssocMinOccurs);
					if (minOccursValue == null)
						continue;
					if (((Integer) minOccursValue).intValue() == 0)
						continue;
					if( ! keepRequiredBusinessAssociationEnds )
						continue;					
				}
								
				Object value = eObj.eGet(eRef);
				if (value == null) {
					continue;
				} else if( value instanceof List ) {
					List<EObject> list = (List<EObject>) value;
					for (EObject refObj : list) {
						addObject(eRef, refObj, markedForRetain, newMarks);
						// newMarks.computeIfAbsent(eRef, x -> new
						// HashSet<>()).add(refObj);
					}					
				} else if ( value instanceof EObject ) {
					EObject refObj = (EObject) value;
					addObject(eRef, refObj, markedForRetain, newMarks);					
				} else {
					throw new RuntimeException("Invalid value: " + value );
				}
				
			}
		}

		// Return delta
		markedForRetain.addAll(newMarks);
		return markedForRetain.size() - startCount;
	}

	void addObject(EReference eRef, EObject refObj, Set<EObject> markedForRetain, Set<EObject> newMarks) {
		// newMarks.computeIfAbsent(eRef, x -> new HashSet<>()).add(refObj);
//		if( markedForRetain.contains(refObj))
//			return;
		
		newMarks.add(refObj);
		System.out.println("  - add by ref: " + eRef.getName() + "->" + toString(refObj));
//		if( "topLevelDictionaryEntry".equals( eRef.getName()) ) {
//			System.out.println("Bingo");
//		}
//		if (dontAddRefContents.contains(eRef))
//			return;
//		TreeIterator<EObject> contentIterator = refObj.eAllContents();
//		for (; contentIterator.hasNext();) {
//			EObject eChild = contentIterator.next();
//			if ("BusinessAssociationEnd".equals(eChild.eClass().getName())) {
//				EStructuralFeature eSF = eChild.eClass().getEStructuralFeature("minOccurs");
//				Object minOccursValue = eChild.eGet(eSF);
//				if (minOccursValue == null)
//					continue;
//				if (((Integer) minOccursValue).intValue() == 0)
//					continue;
//				if( ! keepRequiredBusinessAssociationEnds )
//					continue;
//			}
//			
//			newMarks.add(eChild);
//			System.out.println( "    - child of the ref : " + toString(refObj) + "/" + toString(eChild) );			
//		}
	}

	String toString( EObject eObj ) {
		Optional<EAttribute> nameAttr = eObj.eClass().getEAllAttributes().stream().filter(eAttr->eAttr.getName().equalsIgnoreCase("name")).findFirst();
		return "[" + eObj.eClass().getName() + "]" + (nameAttr.isPresent()? eObj.eGet( nameAttr.get() ) : "-no name-");
	}
}
