package com.tools20022.mmgenerator;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.tools20022.core.metamodel.ISODoc;
import com.tools20022.core.metamodel.MetamodelDocImpl;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelAttribute;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelConstraint;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelElement;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnum;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnumLiteral;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelType;

public class ECoreLoader {

	private abstract class MModelElementImpl implements MetamodelElement {
		final String name;
		final MetamodelDocImpl doc;

		public MModelElementImpl(String name, MetamodelDocImpl doc) {
			super();
			this.name = name;
			this.doc = doc;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return doc;
		}
	}

	private class MMTypeImpl extends MModelElementImpl implements MetamodelType {
		final LinkedHashSet<MMTypeImpl> superTypes = new LinkedHashSet<>();
		final LinkedHashSet<MMTypeImpl> subTypes = new LinkedHashSet<>();
		final boolean isAbstract;
		final LinkedHashSet<MMAttributeImpl> declaredAttributes = new LinkedHashSet<>();
		final LinkedHashSet<MMConstraintImpl> declaredConstraints = new LinkedHashSet<>();

		public MMTypeImpl(String name, MetamodelDocImpl doc, boolean isAbstract) {
			super(name, doc);
			this.isAbstract = isAbstract;
		}

		@Override
		public boolean isAbstract() {
			return isAbstract;
		}

		void addSuperType(MMTypeImpl superType) {
			if (superTypes.contains(superType))
				throw new IllegalArgumentException(this + " already has this super type: " + superType);
			long c = superTypes.stream().filter(mClass -> !mClass.isAbstract).count();
			c += superType.isAbstract ? 0 : 1;
			if (c > 1)
				throw new RuntimeException("The class can't have more than one non-abstract super class: " + this);
			superTypes.add(superType);
			superType.subTypes.add(this);
		}

		void addMember(MMAttributeImpl newAttr) {
			if (declaredAttributes.contains(newAttr))
				throw new IllegalArgumentException(this + " already contains this attribute: " + newAttr);
			declaredAttributes.add(newAttr);
		}

		void addConstraint(MMConstraintImpl newConstraint) {
			if (declaredConstraints.contains(newConstraint))
				throw new IllegalArgumentException(this + " already contains this constraint: " + newConstraint);
			declaredConstraints.add(newConstraint);
		}

		@Override
		public Stream<? extends MMTypeImpl> listSuperTypes( boolean includeThis, boolean recursive ) {
			Stream<? extends MMTypeImpl> superTypeStream; 
			if( recursive ) {
				superTypeStream = listSuperTypes(false, false).flatMap(c -> c.listSuperTypes(true,true));
			} else {
				superTypeStream = superTypes.stream();
			}
			
			if( includeThis ) {
				superTypeStream = Stream.concat(Stream.of(this), superTypeStream);
			}

			return superTypeStream.distinct();
		}

		@Override
		public Stream<? extends MMTypeImpl> listSubTypes( boolean includeThis, boolean recursive ) {
			Stream<? extends MMTypeImpl> subTypeStream; 
			if( recursive ) {
				subTypeStream = listSubTypes(false, false).flatMap(c -> c.listSubTypes(true,true));
			} else {
				subTypeStream = subTypes.stream();
			}
			
			if( includeThis ) {
				subTypeStream = Stream.concat(Stream.of(this), subTypeStream);
			}

			return subTypeStream.distinct();
		}

		@Override
		public Stream<? extends MetamodelAttribute> listDeclaredAttributes() {
			return declaredAttributes.stream();
		}

		@Override
		public Stream<? extends MetamodelConstraint> listDeclaredConstraints() {
			return declaredConstraints.stream();
		}
	}

	private class MMAttributeImpl extends MModelElementImpl implements MetamodelAttribute {
		final MetamodelType declaringType;
		final boolean isOptional;
		final boolean isMultiple;
		final boolean isUnique;
		final boolean isContainer;
		final boolean isContainment;
		final Class<?> valueJavaClass;
		final MMEnumImpl enumType;
		final MMTypeImpl referncedType;
		MMAttributeImpl oppositeAttr;

		public MMAttributeImpl(MetamodelType declaringType, String name, MetamodelDocImpl doc, Class<?> valueJavaClass,
				MMTypeImpl referencedType, MMEnumImpl enumType, boolean isOptional, boolean isMultiple, boolean isUnique, boolean isContainer, boolean isContainment ) {
			super(name, doc);
			this.declaringType = declaringType; 

			int nonNullTypeCount = valueJavaClass == null ? 0 : 1;
			nonNullTypeCount += enumType == null ? 0 : 1; 
			nonNullTypeCount += referencedType == null ? 0 : 1; 
			if ( nonNullTypeCount != 1 ) // == means: !XOR
				throw new IllegalArgumentException("Only one can be non null");
			
			this.isOptional = isOptional;
			this.isMultiple = isMultiple;
			this.isUnique = isUnique;
			this.valueJavaClass = valueJavaClass;
			this.enumType = enumType;
			this.referncedType = referencedType;
			this.isContainer = isContainer;
			this.isContainment = isContainment;
		}
		@Override
		public MetamodelType getDeclaringType() {
			return declaringType;
		}

		@Override
		public boolean isOptional() {
			return isOptional;
		}

		@Override
		public boolean isUnique() {
			return isUnique;
		}

		@Override
		public boolean isMultiple() {
			return isMultiple;
		}

		@Override
		public boolean isContainer() {
			return isContainer;
		}

		@Override
		public boolean isContainment() {
			return isContainment;
		}

		@Override
		public Class<?> getValueJavaClass() {
			return valueJavaClass;
		}

		@Override
		public MMEnumImpl getEnumType() {
			return enumType;
		}

		@Override
		public MMTypeImpl getReferencedType() {
			return referncedType;
		}
		
		@Override
		public MMAttributeImpl getOpposite() {
			return oppositeAttr;
		}

		public void setOpposite(MMAttributeImpl oppositeAttr) {
			this.oppositeAttr = oppositeAttr;
		}

	}

	private class MMConstraintImpl extends MModelElementImpl implements MetamodelConstraint {
		final MetamodelType declaringType;

		public MMConstraintImpl(MetamodelType declaringType, String name, MetamodelDocImpl doc) {
			super(name, doc);
			this.declaringType = declaringType; 
		}

		@Override
		public MetamodelType getDeclaringType() {
			return declaringType;
		}
	}

	private class MMEnumImpl extends MModelElementImpl implements MetamodelEnum {

		final LinkedHashSet<MMEnumLiteralImpl> literals = new LinkedHashSet<>();

		public MMEnumImpl(String name, MetamodelDocImpl doc) {
			super(name, doc);
		}

		void addLiteral(MMEnumLiteralImpl newValue) {
			if (literals.contains(newValue))
				throw new IllegalArgumentException(this + " already contains this literal: " + newValue);
			literals.add(newValue);
		}

		@Override
		public Stream<? extends MetamodelEnumLiteral> listEnumLiterals() {
			return literals.stream();
		}

	}

	private class MMEnumLiteralImpl extends MModelElementImpl implements MetamodelEnumLiteral {

		private final MMEnumImpl mmEnum;

		public MMEnumLiteralImpl(MMEnumImpl mmEnum, String name, MetamodelDocImpl doc) {
			super(name, doc);
			this.mmEnum = mmEnum;
		}

		@Override
		public MetamodelEnum getDeclaringEnum() {
			return mmEnum;
		}
	}

	private final LinkedHashMap<EClass, MMTypeImpl> mmTypesByEClasses = new LinkedHashMap<>();
	private final LinkedHashMap<EStructuralFeature, MMAttributeImpl> mmAttrsByEStucturalFeatures = new LinkedHashMap<>();
	private final LinkedHashMap<EOperation, MMConstraintImpl> mmConstraintsByEOperation = new LinkedHashMap<>();
	private final LinkedHashMap<EEnum, MMEnumImpl> mmEnumsByEEnums = new LinkedHashMap<>();

	private ECoreLoader() {

	}

	public static RawMetamodel load( EPackage ecorePackage ) {
		ECoreLoader mmb = new ECoreLoader();
		mmb.loadFromECore(ecorePackage);
		
		MetamodelType mmTypes[] = mmb.mmTypesByEClasses.entrySet().stream().map(e -> e.getValue())
				.toArray(MetamodelType[]::new);
		MetamodelEnum mmEnums[] = mmb.mmEnumsByEEnums.entrySet().stream().map(e -> e.getValue()).toArray(MetamodelEnum[]::new);

		return new MetamodelImpl(mmTypes, mmEnums);
	}

	private static class MetamodelImpl implements RawMetamodel {
		private final MetamodelType types[];
		private final MetamodelEnum enums[];

		/** Create MObjects from ecore file */
		MetamodelImpl(MetamodelType classes[], MetamodelEnum enums[]) {
			this.types = classes;
			this.enums = enums;
		}

		public Stream<MetamodelType> listTypes() {
			return Stream.of(types);
		}

		public Stream<MetamodelEnum> listEnums() {
			return Stream.of(enums);
		}

		@Override
		public MetamodelType getTypeByName(String name) {
			return Stream.of(types).filter(mmType -> mmType.getName().equals(name)).findFirst()
					.orElseThrow(() -> new NoSuchElementException("Type with name: " + name));
		}

		@Override
		public MetamodelEnum getEnumByName(String name) {
			return Stream.of(enums).filter(mmEnum -> mmEnum.getName().equals(name)).findFirst()
					.orElseThrow(() -> new NoSuchElementException("Enum with name: " + name));
		}

	}

	private void loadFromECore(EPackage rootPkg) {

		/*** First phase: load types and enums with literals ***/
		for (EObject eObj : rootPkg.eContents()) {
			if (eObj instanceof EClass) {
				MMTypeImpl mClass = loadEClass((EClass) eObj);
				mmTypesByEClasses.put((EClass) eObj, mClass);
			} else if (eObj instanceof EEnum) {
				MMEnumImpl mEnum = loadEEnum((EEnum) eObj);
				mmEnumsByEEnums.put((EEnum) eObj, mEnum);

				for (EObject eObj2 : eObj.eContents()) {
					if (eObj2 instanceof EEnumLiteral) {
						MMEnumLiteralImpl mEnumValue = loadEEnum(mEnum, (EEnumLiteral) eObj2);
						mEnum.addLiteral(mEnumValue);
					} else if (eObj2 instanceof EAnnotation) {
						// Processed in phase 1, skip this
					} else {
						ecoreAssert(false, "Unsupported object", eObj2);
					}
				}

			} else if (eObj instanceof EAnnotation) {
				// Skip this
			} else {
				ecoreAssert(false, "Unsupported object", eObj);
			}
		}

		/*** Second phase: add atributes and references ***/
		for (EObject eObj : rootPkg.eContents()) {
			if (!(eObj instanceof EClass))
				continue;
			EClass eClass = (EClass) eObj;
			MMTypeImpl mClass = mmTypesByEClasses.get(eClass);

			for (EObject eObj2 : eClass.eContents()) {
				if (eObj2 instanceof EAttribute) {
					MMAttributeImpl mAttr = loadEAttribute(mClass, (EAttribute) eObj2);
					mClass.addMember(mAttr);
					mmAttrsByEStucturalFeatures.put((EStructuralFeature) eObj2, mAttr);
				} else if (eObj2 instanceof EReference) {
					MMAttributeImpl mRef = loadEReference(mClass, (EReference) eObj2);
					mClass.addMember(mRef);
					mmAttrsByEStucturalFeatures.put((EStructuralFeature) eObj2, mRef);
				} else if (eObj2 instanceof EOperation) {
					MMConstraintImpl mConstr = loadEOperation(mClass, (EOperation) eObj2);
					mClass.addConstraint(mConstr);
					mmConstraintsByEOperation.put((EOperation) eObj2, mConstr);
				} else if (eObj2 instanceof EGenericType) {
					loadEGenericType(mClass, (EGenericType) eObj2);
				} else if (eObj2 instanceof EAnnotation) {
					// Processed in phase 1, skip this
				} else {
					ecoreAssert(false, "Unsupported object", eObj2);
				}

			}
		}

		/*** Third phase: set reference opposites ***/
		for (EObject eObj : rootPkg.eContents()) {
			if (!(eObj instanceof EClass))
				continue;
			EClass eClass = (EClass) eObj;

			for (EObject eObj2 : eClass.eContents()) {
				if (!(eObj2 instanceof EReference))
					continue;
				EReference eRef = (EReference) eObj2;
				MMAttributeImpl mRef = (MMAttributeImpl) mmAttrsByEStucturalFeatures.get(eRef);
				EReference oppositeERef = eRef.getEOpposite();
				if (oppositeERef != null) {
					MMAttributeImpl oppositeMMRef = (MMAttributeImpl) mmAttrsByEStucturalFeatures
							.get(oppositeERef);
					mRef.setOpposite(oppositeMMRef);
				}
			}
		}

	}

	private MMTypeImpl loadEClass(EClass eClass) {
		MetamodelDocImpl docImpl = loadEAnnotDoc(eClass);
		MMTypeImpl mClass = new MMTypeImpl(eClass.getName(), docImpl, eClass.isAbstract());
		return mClass;
	}

	private MMEnumImpl loadEEnum(EEnum eEnum) {
		MetamodelDocImpl docImpl = loadEAnnotDoc(eEnum);
		MMEnumImpl mEnum = new MMEnumImpl(eEnum.getName(), docImpl);
		return mEnum;
	}

	private MMEnumLiteralImpl loadEEnum(MMEnumImpl mEnum, EEnumLiteral eEnumLit) {
		MetamodelDocImpl docImpl = loadEAnnotDoc(eEnumLit);
		MMEnumLiteralImpl mEnumVal = new MMEnumLiteralImpl(mEnum, eEnumLit.getName(), docImpl);
		return mEnumVal;
	}

	private void loadEGenericType(MMTypeImpl declaringClass, EGenericType eSuperType) {
		MMTypeImpl mSuperType = mmTypesByEClasses.get(eSuperType.getEClassifier());
		declaringClass.addSuperType(mSuperType);
	}

	private MMAttributeImpl loadEAttribute(MetamodelType declaringClass, EAttribute eAttr) {
		MetamodelDocImpl docImpl = loadEAnnotDoc(eAttr);

		ecoreAssert(eAttr.getLowerBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY, "Lower bound unspecified", eAttr);
		ecoreAssert(eAttr.getUpperBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY, "Upper bound unspecified", eAttr);

		final boolean isOptional = eAttr.getLowerBound() == 0;
		final boolean isMultiple = eAttr.getUpperBound() == ETypedElement.UNBOUNDED_MULTIPLICITY;
		final boolean isUnique = eAttr.isUnique();
		EDataType eType = eAttr.getEAttributeType();
		if (eType instanceof EEnum) {
			MMEnumImpl enumType = mmEnumsByEEnums.get((EEnum) eType);
			return new MMAttributeImpl(declaringClass, eAttr.getName(), docImpl, null, null, enumType, isOptional, isMultiple, isUnique, false, false );
		} else {
			Class<?> valueType = eType.getInstanceClass();
			return new MMAttributeImpl(declaringClass, eAttr.getName(), docImpl, valueType, null, null, isOptional, isMultiple, isUnique, false, false);
		}
	}

	private MMAttributeImpl loadEReference(MetamodelType declaringClass, EReference eRef) {
		MetamodelDocImpl docImpl = loadEAnnotDoc(eRef);

		ecoreAssert(eRef.getLowerBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY, "Lower bound unspecified", eRef);
		ecoreAssert(eRef.getUpperBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY, "Upper bound unspecified", eRef);

		final boolean isOptional = eRef.getLowerBound() == 0;
		final boolean isMultiple = eRef.getUpperBound() == ETypedElement.UNBOUNDED_MULTIPLICITY;
		EClass eRefClass = eRef.getEReferenceType();
		MMTypeImpl refMClass = mmTypesByEClasses.get(eRefClass);

		//return new MMReferenceImpl(declaringType, eRef.getName(), docImpl, refMClass, isOptional, isMultiple);
		return new MMAttributeImpl(declaringClass, eRef.getName(), docImpl, null, refMClass, null, isOptional, isMultiple, eRef.isUnique(), eRef.isContainer(), eRef.isContainment() );
	}

	private MMConstraintImpl loadEOperation(MetamodelType declaringClass, EOperation eOp) {
		MetamodelDocImpl docImpl = loadEAnnotDoc(eOp);
		MMConstraintImpl mConstr = new MMConstraintImpl(declaringClass, eOp.getName(), docImpl);
		return mConstr;
	}

	private MetamodelDocImpl loadEAnnotDoc(EModelElement eAnnotHolder) {
		EList<EAnnotation> annots = eAnnotHolder.getEAnnotations();
		if (annots.isEmpty())
			return null;
		String docText = null;
		String descText = null;
		ISODoc.Basis basis = null;
		for (EAnnotation a : annots) {
			ecoreAssert(a.getReferences().isEmpty(), "Anotation has reference", eAnnotHolder);
			ecoreAssert(a.getEAnnotations().isEmpty(), "Anotation has another annotation", eAnnotHolder);
			if (a.getSource().equals("http://www.eclipse.org/emf/2002/GenModel")) {
				ecoreAssert(a.getDetails().size() != 0, "GenModel annotation has no detail", eAnnotHolder);
				ecoreAssert(a.getDetails().size() <= 1, "GenModel annotation has more than one detail", eAnnotHolder);
				docText = a.getDetails().get("documentation");
				ecoreAssert(docText != null, "GenModel annotation has no detail with name 'documentation'",
						eAnnotHolder);
			} else if (a.getSource().equals("urn:iso:std:iso:20022:2013:ecore:extension")) {
				basis = ISODoc.Basis.valueOf(a.getDetails().get("basis"));
				descText = a.getDetails().get("description");
				ecoreAssert(a.getDetails().size() <= 2, "More than two details", eAnnotHolder);
			} else {
				ecoreAssert(false, "Unsopported annotation source", eAnnotHolder);
			}
		}
		if (docText != null && docText.trim().isEmpty()) {
			System.out.println(eAnnotHolder);
		}
		return new MetamodelDocImpl(docText, basis, descText);
	}

	private final void ecoreAssert(boolean isOk, String message, EObject eObj) {
		if (!isOk) {
			throw new RuntimeException(message + "\n" + eObj.toString());
		}
	}


}
