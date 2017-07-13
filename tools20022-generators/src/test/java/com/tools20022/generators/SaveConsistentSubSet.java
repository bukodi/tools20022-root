package com.tools20022.generators;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import com.tools20022.generators.PerformantXMIResourceFactoryImpl;

/**
 * Saves the consistent subset of the full eRepository.
 * It is useful, for creating samller models for tests.
 * This class uses only the EMF eCore+XMI layer.  
 */
public class SaveConsistentSubSet {

	EPackage ecorePackage;
	EObject xmiRootEObj;
	Set<EObject> markedForRetain = new HashSet<>();
	Set<String> dontAddContents = Stream.of("Repository", "BusinessProcessCatalogue", "DataDictionary", "BusinessArea")
			.collect(Collectors.toSet());
	Set<String> keepRefs = Stream.of("simpleType", "complexType")
			.collect(Collectors.toSet());
//	Set<String> keepRefs = Stream.of("simpleType", "complexType", "businessElementTrace", "businessComponentTrace")
//			.collect(Collectors.toSet());
	private boolean keepRequiredBusinessAssociationEnds = false;

	public SaveConsistentSubSet(String ecoreResource, String xmiResource) {
		ecorePackage = loadECorePackage(ecoreResource);
		xmiRootEObj = loadXMIResource(xmiResource);
	}

	public static void main(String[] args) throws Exception {
		SaveConsistentSubSet scss = new SaveConsistentSubSet("/model/ISO20022.ecore",
				"/model/20170516_ISO20022_2013_eRepository.iso20022");

		// "MessageDefinition", "MandateInitiationRequestV05"
		scss.saveTestFile("./test.iso20022");
	}

	EClass getEClassByName(String eClassName) {
		return (EClass) ecorePackage.getEClassifier(eClassName);
	}

	public void saveTestFile(String outFile) throws Exception {

		EClass eClassMsgDef = (EClass) ecorePackage.getEClassifier("MessageDefinition");
		EAttribute eAttrName = (EAttribute) eClassMsgDef.getEStructuralFeature("name");

		/*** Phase 1: collect reatined object ***/

		long now = System.currentTimeMillis();
		xmiRootEObj.eAllContents().forEachRemaining(eObj -> {
			if (eClassMsgDef.equals(eObj.eClass())) {
				String name = (String) eObj.eGet(eAttrName);
				if ("MandateInitiationRequestV05".equals(name)) {
					markedForRetain.add(eObj);
					eObj.eAllContents().forEachRemaining(c -> {
						markedForRetain.add(c);
					});
					;
				}
			}
		});
		System.out.println(System.currentTimeMillis() - now);
		System.out.println();
		/*
		 * Map<EClass, AtomicInteger> retainedObjectsCount = new HashMap<>();
		 * for (EObject level1Obj : xmiRootEObj.eContents()) { List<EObject>
		 * contents = new ArrayList<>(level1Obj.eContents()); for (EObject
		 * level2Obj : contents) { EClass eClass = level2Obj.eClass();
		 * 
		 * AtomicInteger cnt =
		 * retainedObjectsCount.computeIfAbsent(level2Obj.eClass(), x -> new
		 * AtomicInteger()); if (cnt.get() >= 5) { continue; }
		 * cnt.incrementAndGet(); addAllContents(level2Obj,markedForRetain); } }
		 */

		/*** Phase 2: extend retainSet ***/
		for (int round = 1;; round++) {
			int addedObjects = extendRetainSet(markedForRetain);
			System.out.println("" + addedObjects + " objects added in " + round + ". round. All objects: "
					+ markedForRetain.size());
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

		save(outFile, xmiRootEObj, false);
	}

	int extendRetainSet(Set<EObject> markedForRetain) {
		int startCount = markedForRetain.size();

		HashMap<EReference, Set<EObject>> newMarks = new HashMap<>();
		for (EObject eObj : new HashSet<EObject>(markedForRetain)) {
			if (eObj.eContainer() != null)
				markedForRetain.add(eObj.eContainer());

			EList<EStructuralFeature> eSFList = eObj.eClass().getEAllStructuralFeatures();
			for (EStructuralFeature eSF : eSFList) {
				if (!(eSF instanceof EReference))
					continue;
				EReference eRef = (EReference) eSF;
				if (eRef.isContainer())
					continue;
				Object value = eObj.eGet(eRef);
				if (value == null)
					continue;

				boolean isProtectedRef = keepRefs.contains(eRef.getName());

				if (eRef.isMany()) {
					if (eRef.getLowerBound() > 0) {
						EList<EObject> list = (EList<EObject>) value;
						for (EObject refObj : list) {
							addObject(eRef, refObj, newMarks);
							// newMarks.computeIfAbsent(eRef, x -> new
							// HashSet<>()).add(refObj);
						}
					}
				} else {
					if (!eRef.isChangeable() || eRef.isRequired() || isProtectedRef) {
						EObject refObj = (EObject) value;
						addObject(eRef, refObj, newMarks);
						// newMarks.computeIfAbsent(eRef, x -> new
						// HashSet<>()).add(refObj);
					}
				}
			}
		}

		// Return delta
		markedForRetain.addAll(newMarks.values().stream().flatMap(s -> s.stream()).collect(Collectors.toSet()));
		return markedForRetain.size() - startCount;
	}

	void addObject(EReference eRef, EObject refObj, HashMap<EReference, Set<EObject>> newMarks) {
		// newMarks.computeIfAbsent(eRef, x -> new HashSet<>()).add(refObj);

		Set<EObject> set = newMarks.computeIfAbsent(eRef, x -> new HashSet<>());
		set.add(refObj);

		if (dontAddContents.contains(refObj.eClass().getName()))
			return;
		TreeIterator<EObject> contentIterator = refObj.eAllContents();
		for (; contentIterator.hasNext();) {
			EObject eChild = contentIterator.next();
			if ("BusinessAssociationEnd".equals(eChild.eClass().getName())) {
				EStructuralFeature eSF = eChild.eClass().getEStructuralFeature("minOccurs");
				Object minOccursValue = eChild.eGet(eSF);
				if (minOccursValue == null)
					continue;
				if (((Integer) minOccursValue).intValue() == 0)
					continue;
				if( ! keepRequiredBusinessAssociationEnds )
					continue;
			}

			set.add(eChild);
		}
	}

	private void save(String fileUri, EObject rootObj, boolean isSchemaLocationPresent) {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML Factory implementation to handle .xml files
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("iso20022",
				new PerformantXMIResourceFactoryImpl());

		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI(fileUri));

		// Add bookStoreObject to contents list of the resource
		resource.getContents().add(rootObj);
		Map options = new HashMap();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		try {
			// Save the resource
			if (isSchemaLocationPresent == true)
				resource.save(options);
			else
				resource.save(null);
		} catch (IOWrappedException iowe) {
			if (iowe.getCause() instanceof DanglingHREFException) {
				String msg = ((DanglingHREFException) (iowe.getCause())).getMessage();
				// The object
				// 'org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1e57d13c
				// (eClass: org.eclipse.emf.ecore.impl.EClassImpl@530cd67e
				// (name: MessageBuildingBlock) (instanceClassName: null)
				// (abstract: false, interface: false))' is not contained in a
				// resource.
				String hcodeStr = msg.substring(msg.indexOf("@") + 1, msg.indexOf(" (eClass:"));
				int hcode = Integer.parseInt(hcodeStr, 16);

				xmiRootEObj.eAllContents().forEachRemaining(eObj -> {
					if (eObj.hashCode() == hcode) {
						System.out.println(eObj.eClass().getName());
					}
					;
				});
				iowe.printStackTrace();

			} else {
				iowe.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private EPackage loadECorePackage(String ecoreResource) {
		try {
			ResourceSet load_resourceSet = new ResourceSetImpl();
			load_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
					new PerformantXMIResourceFactoryImpl());

			URL url = getClass().getResource(ecoreResource);

			// Create empty resource with the given URI
			Resource load_resource = load_resourceSet.getResource(URI.createURI(url.toString()), true);
			if (load_resource.getContents().size() != 1)
				throw new RuntimeException("Exactly one root object allowed");

			EPackage ecorePkg = (EPackage) load_resource.getContents().get(0);
			ecorePkg.setName("iso20022");
			ecorePkg.setNsPrefix("iso20022");
			EPackage.Registry.INSTANCE.put(ecorePkg.getNsURI(), ecorePkg);
			return ecorePkg;
		} catch (Exception e) {
			throw new RuntimeException("Can't load ECore resource: " + ecoreResource, e);
		}
	}

	private EObject loadXMIResource(String xmiResource) {
		try {
			ResourceSet load_resourceSet = new ResourceSetImpl();

			load_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
					new PerformantXMIResourceFactoryImpl());
			// TODO: use internal PerformantXMIResourceFactoryImpl class

			URL url = getClass().getResource(xmiResource);

			Resource load_resource = load_resourceSet.getResource(URI.createURI(url.toString()), true);
			if (load_resource.getContents().size() != 1)
				throw new RuntimeException("Exactly one root object allowed");
			return load_resource.getContents().get(0);
		} catch (Exception e) {
			throw new RuntimeException("Can't load XMI resource: " + xmiResource, e);
		}
	}

}
