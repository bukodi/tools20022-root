package com.tools20022.repogenerator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import com.tools20022.core.metamodel.Metamodel.MetamodelEnum;
import com.tools20022.core.metamodel.Metamodel.MetamodelEnumLiteral;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;

public class XMILoader {

	private final Metamodel metamodel;

	public XMILoader(Metamodel metamodel) {
		this.metamodel = metamodel;

	}

	final LinkedHashSet<MMModelEntity> loadedObjects = new LinkedHashSet();

	private class ECoreToMetamodelMapping {
		final Map<EClass, MetamodelType<?>> mmTypesByEClass = new HashMap<>();
		final Map<EEnum, MetamodelEnum<?>> mmEnumsByEEnum = new HashMap<>();
		final Map<MetamodelAttribute<?, ?>, EStructuralFeature> eSFsBymmAttr = new HashMap<>();
		final Map<MetamodelConstraint<?>, EOperation> eOpsBymmConstr = new HashMap<>();
	}

	private ECoreToMetamodelMapping createECoreToMetamodelMapping(EPackage ecorePkg) {
		ECoreToMetamodelMapping mapping = new ECoreToMetamodelMapping();
		try {
			for (EClassifier e : ecorePkg.getEClassifiers()) {
				if (e instanceof EClass) {
					EClass eClass = (EClass) e;
					MetamodelType<? extends MMModelEntity> mmType = metamodel.getTypeByName(eClass.getName());
					mapping.mmTypesByEClass.put(eClass, mmType);
					for (MetamodelAttribute<? extends MMModelEntity, ?> mmAttr : mmType
							.getDeclaredAttributes()) {
						EStructuralFeature eSF = eClass.getEStructuralFeature(mmAttr.getName());
						mapping.eSFsBymmAttr.put(mmAttr, eSF);
					}
					Map<String, EOperation> eOpsByName = new HashMap<>();
					eClass.getEOperations().forEach(eOp -> {
						eOpsByName.put(eOp.getName(), eOp);
					});
					for (MetamodelConstraint<? extends MMModelEntity> mmConstr : mmType
							.getDeclaredConstraints()) {
						EOperation eOp = eOpsByName.get(mmConstr.getName());
						mapping.eOpsBymmConstr.put(mmConstr, eOp);
					}
				} else if (e instanceof EEnum) {
					EEnum eEnum = (EEnum) e;
					MetamodelEnum mmEnum = metamodel.getEnumByName(eEnum.getName());
					mapping.mmEnumsByEEnum.put(eEnum, mmEnum);
				} else {
					throw new RuntimeException("Invalid type hierarchy");
				}
			}
			return mapping;
		} catch (Exception e) {
			throw new RuntimeException(
					"Can't map ECore resource to " + metamodel.getClass().getName() + " metamodel instance.", e);
		}

	}

	private void loadWithContents(EObject eObj, MMModelEntity container, ECoreToMetamodelMapping mapping,
			Map<EObject, MMModelEntity> repoObjectsByEObj) {
		MMModelEntity repoObj;
		try {
			EClass eClass = eObj.eClass();
			MetamodelType<?> mmType = mapping.mmTypesByEClass.get(eClass);
			repoObj = mmType.newInstance();
			objectCount.incrementAndGet();
			loadedObjects.add(repoObj);
			repoObjectsByEObj.put(eObj, repoObj);
			if (container != null) {
				try {
					Field f = repoObj.getClass().getDeclaredField("container");
					f.setAccessible(true);
					f.set(repoObj, container);
				} catch (NoSuchFieldException nsfe) {
					// Intentionally ignored, because the type has a dedicated reference to the
					// container.
				}
			}
			
			Resource res = eObj.eResource();
			if( res instanceof XMIResource ) {
				XMIResource xmires = (XMIResource)res;
				String id = xmires.getID(eObj);
				if( id == null ) {
//					System.out.println( "no id:" + ECoreIOHelper.toStringWithPath(eObj) );
				}
			}
		} catch (Exception e) {
			System.err.println("Can't process eObject: " + eObj);
			e.printStackTrace();
			return;
		}

		for (EObject child : eObj.eContents()) {
			loadWithContents(child, repoObj, mapping, repoObjectsByEObj);
		}
	}

	private void setAttributeValue(MetamodelAttribute mmAttr, MMModelEntity repoObj, Object value,
			Map<EObject, MMModelEntity> repoObjsByEObj) {
		if (value == null)
			return;
		if (value instanceof EList<?> && ((EList<?>) value).isEmpty())
			return;
		try {
			if (mmAttr.getValueJavaClass() != null && !mmAttr.isMultiple()) {
				/*** Singular basic value ***/
				mmAttr.set(repoObj, value);

			} else if (mmAttr.getValueJavaClass() != null && mmAttr.isMultiple()) {
				/*** Multiple basic value ***/
				mmAttr.set(repoObj, new ArrayList<>((EList) value));
			} else if (mmAttr.getReferencedType() != null && !mmAttr.isMultiple()) {
				/*** Singular reference ***/
				EObject refObj = (EObject) value;
				MMModelEntity refIsoObj = repoObjsByEObj.get(refObj);
				boolean isLazyReference = mmAttr.getReferencedType() != null && !mmAttr.isDerived();
				if (!isLazyReference) {
					mmAttr.set(repoObj, refIsoObj);
				} else {
					Supplier<?> supplier = () -> refIsoObj;
					mmAttr.set(repoObj, supplier);
				}
			} else if (mmAttr.getReferencedType() != null && mmAttr.isMultiple()) {
				/*** Multiple reference ***/
				List<MMModelEntity> isoList = new ArrayList<>();
				for (Object x : (EList) value) {
					MMModelEntity refIsoObj = repoObjsByEObj.get(x);
					isoList.add(refIsoObj);
				}
				boolean isLazyReference = mmAttr.getReferencedType() != null && !mmAttr.isDerived();
				if (!isLazyReference) {
					mmAttr.set(repoObj, isoList);
				} else {
					Supplier<?> supplier = () -> isoList;
					mmAttr.set(repoObj, supplier);
				}
			} else if (mmAttr.getEnumType() != null) {
				/*** Enum literal ***/
				String enumName = ((EEnumLiteral) value).getName();
				MetamodelEnumLiteral<?> mmEnumLit = mmAttr.getEnumType().getEnumLiteral(enumName);
				if (mmEnumLit == null) {
					// For java reserved words the enum const suffixed by an
					// underscore
					mmEnumLit = mmAttr.getEnumType().getEnumLiteral(enumName + "_");
				}
				mmAttr.set(repoObj, mmEnumLit.getValue());
			} else {
				throw new RuntimeException("Invalid MetamodelAttribute: " + mmAttr);
			}
			attributeCount.incrementAndGet();
		} catch (Exception e) {
			System.err.println("Can't set value: " + mmAttr + " := " + value);
			e.printStackTrace();
		}
	}
	
	private AtomicInteger objectCount = new AtomicInteger();
	private AtomicInteger attributeCount = new AtomicInteger();

	public RawRepository load(EPackage ecorePkg, EObject rootEObj) {
		// Map loaded eCore model to generated metamodel
		final ECoreToMetamodelMapping mapping = createECoreToMetamodelMapping(ecorePkg);

		// Load XMI objects
		Map<EObject, MMModelEntity> repoObjsByEObj = new HashMap<>();
		loadWithContents(rootEObj, null, mapping, repoObjsByEObj);

		// Set values
		for (Entry<EObject, MMModelEntity> entry : repoObjsByEObj.entrySet()) {
			MMModelEntity repoObj = entry.getValue();
			EObject eObj = entry.getKey();

			MetamodelType<?> mmType = repoObj.getMetamodel();
			for (MetamodelAttribute mmAttr : mmType.getAllAttributes()) {
				if (mmAttr.isDerived())
					continue;
				EStructuralFeature eSF = mapping.eSFsBymmAttr.get(mmAttr);
				Object value = eObj.eGet(eSF);

				// This is bug workaround
				if( value!= null && "name".equals(mmAttr.getName()) && value instanceof String && ((String)value).endsWith(".")) {
					String name = (String) value;
					value = name.substring(0, name.length()-1);
					System.out.println("XMI model bug wokaround: name '" + name +"' trailing dot eliminated:"  + ECoreIOHelper.toStringWithPath(eObj));
				}
				
				setAttributeValue(mmAttr, repoObj, value, repoObjsByEObj);
			}
		}
		MMModelEntity rootRepoObj = repoObjsByEObj.get(rootEObj);
		RawRepository rawRepo = new RawRepository(metamodel, (MMRepository) rootRepoObj);
		rawRepo.addObjects(loadedObjects);
		System.out.println("" + objectCount.get() + " objects with " + attributeCount.get() + " attributes loaded.");
		return rawRepo;
	}

}
