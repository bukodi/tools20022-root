package com.tools20022.mmgenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;

import com.tools20022.core.metamodel.ISODoc;
import com.tools20022.core.metamodel.MetamodelDocImpl;

public class ECoreBackedMetamodel implements RawMetamodel {

	private final EPackage rootPkg;

	private final Map<EClass, List<EClass>> subTypesCache;

	public ECoreBackedMetamodel(EPackage rootPkg) {
		this.rootPkg = rootPkg;
		subTypesCache = builSubTypesCache(rootPkg);
		validateAddtitionalConstraints();
	}

	private final static Map<EClass, List<EClass>> builSubTypesCache(EPackage rootPkg) {
		LinkedHashMap<EClass, List<EClass>> subTypesCache = new LinkedHashMap<>();
		for (EClassifier x : rootPkg.getEClassifiers()) {
			if (!(x instanceof EClass))
				continue;
			EClass eClass = (EClass) x;
			for (EClass eST : eClass.getESuperTypes()) {
				subTypesCache.computeIfAbsent(eST, y -> new ArrayList<>()).add(eClass);
			}
		}
		return Collections.unmodifiableMap(subTypesCache);
	}

	private void validateAddtitionalConstraints() {
		{ /*** for all EStructuralFeature ***/

			// ecoreAssert(eAttr.getLowerBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY,
			// "Lower bound unspecified", eAttr);
			// ecoreAssert(eAttr.getUpperBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY,
			// "Upper bound unspecified", eAttr);
			//
			// ecoreAssert(eRef.getLowerBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY,
			// "Lower bound unspecified", eRef);
			// ecoreAssert(eRef.getUpperBound() != ETypedElement.UNSPECIFIED_MULTIPLICITY,
			// "Upper bound unspecified", eRef);
		}

		{ /*** for all MMAtribute-s ***/
			// int nonNullTypeCount = valueJavaClass == null ? 0 : 1;
			// nonNullTypeCount += enumType == null ? 0 : 1;
			// nonNullTypeCount += referencedType == null ? 0 : 1;
			// if ( nonNullTypeCount != 1 ) // == means: !XOR
			// throw new IllegalArgumentException("Only one can be non null");

		}
	}

	public Stream<MetamodelType> listTypes() {
		return rootPkg.getEClassifiers().stream().filter(ec -> ec instanceof EClass)
				.map(ec -> new MMTypeImpl((EClass) ec));
	}

	public Stream<MetamodelEnum> listEnums() {
		return rootPkg.getEClassifiers().stream().filter(ec -> ec instanceof EEnum)
				.map(ec -> new MMEnumImpl((EEnum) ec));
	}

	@Override
	public MetamodelType getTypeByName(String name) {
		return new MMTypeImpl((EClass) (rootPkg.getEClassifier(name)));
	}

	@Override
	public MetamodelEnum getEnumByName(String name) {
		return new MMEnumImpl((EEnum) (rootPkg.getEClassifier(name)));
	}

	private abstract class MModelElementImpl implements MetamodelElement {
		private final Supplier<ENamedElement> eModelElementRef;

		protected MModelElementImpl(Supplier<ENamedElement> eModelElementRef) {
			if( eModelElementRef == null || eModelElementRef.get() == null )
				throw new NullPointerException("eModelElementRef"); 
			this.eModelElementRef = eModelElementRef;
		}

		@Override
		public String getName() {
			return eModelElementRef.get().getName();
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return loadEAnnotDoc(eModelElementRef.get());
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null || !(obj instanceof MModelElementImpl))
				return false;
			return eModelElementRef.get().equals(((MModelElementImpl) obj).eModelElementRef.get());
		}

		@Override
		public int hashCode() {
			return eModelElementRef.get().hashCode();
		}

		@Override
		public String toString() {
			return eModelElementRef.get().toString();
		}

	}

	private class MMTypeImpl extends MModelElementImpl implements MetamodelType {
		// final LinkedHashSet<MMTypeImpl> superTypes = new LinkedHashSet<>();
		// final LinkedHashSet<MMTypeImpl> subTypes = new LinkedHashSet<>();
		// final boolean isAbstract;
		// final LinkedHashSet<MMAttributeImpl> declaredAttributes = new
		// LinkedHashSet<>();
		// final LinkedHashSet<MMConstraintImpl> declaredConstraints = new
		// LinkedHashSet<>();

		private final EClass eClass;

		public MMTypeImpl(EClass eClass) {
			super(() -> eClass);
			this.eClass = eClass;
		}

		@Override
		public boolean isAbstract() {
			return eClass.isAbstract();
		}

		@Override
		public Stream<? extends MMTypeImpl> listSuperTypes(boolean includeThis, boolean recursive) {
			Stream<? extends MMTypeImpl> superTypeStream;
			if (recursive) {
				superTypeStream = listSuperTypes(false, false).flatMap(c -> c.listSuperTypes(true, true));
			} else {
				Stream<? extends EClass> genericSuperStream = eClass.getEGenericSuperTypes().stream()
						.map(eGST -> (EClass) eGST.getEClassifier());
				Stream<? extends EClass> normalSuperStream = eClass.getESuperTypes().stream();
				superTypeStream = Stream.concat(normalSuperStream, genericSuperStream).map(eC -> new MMTypeImpl(eC));
			}

			if (includeThis) {
				superTypeStream = Stream.concat(Stream.of(this), superTypeStream);
			}

			return superTypeStream.distinct();
		}

		@Override
		public Stream<? extends MMTypeImpl> listSubTypes(boolean includeThis, boolean recursive) {
			Stream<? extends MMTypeImpl> subTypeStream;
			if (recursive) {
				subTypeStream = listSubTypes(false, false).flatMap(c -> c.listSubTypes(true, true));
			} else {
				subTypeStream = subTypesCache.get(eClass).stream().map(eC -> new MMTypeImpl(eC));
			}

			if (includeThis) {
				subTypeStream = Stream.concat(Stream.of(this), subTypeStream);
			}

			return subTypeStream.distinct();
		}

		@Override
		public Stream<? extends MetamodelAttribute> listDeclaredAttributes() {
			return eClass.getEStructuralFeatures().stream().map(eSF -> {
				if (eSF instanceof EAttribute) {
					return new MMAttributeImpl((EAttribute) eSF);
				} else if (eSF instanceof EReference) {
					return new MMAttributeImpl((EReference) eSF);
				} else {
					throw new RuntimeException("Invalid class hierarchy: " + eSF.getClass());
				}
			});
		}

		@Override
		public Stream<? extends MetamodelConstraint> listDeclaredConstraints() {
			return eClass.getEOperations().stream().map(eOp -> new MMConstraintImpl(eOp));
		}
	}

	private class MMAttributeImpl extends MModelElementImpl implements MetamodelAttribute {
		private final EAttribute eAttr;
		private final EReference eRef;

		private MMAttributeImpl(EAttribute eAttr) {
			super(() -> eAttr);
			this.eAttr = eAttr;
			this.eRef = null;
		}

		private MMAttributeImpl(EReference eRef) {
			super(() -> eRef);
			this.eRef = eRef;
			this.eAttr = null;
		}

		private EStructuralFeature eSF() {
			return eAttr != null ? eAttr : eRef;
		}

		@Override
		public MetamodelType getDeclaringType() {
			return new MMTypeImpl(eSF().getEContainingClass());
		}

		@Override
		public boolean isOptional() {
			return eSF().getLowerBound() == 0;
		}

		@Override
		public boolean isUnique() {
			return eSF().isUnique();
		}

		@Override
		public boolean isMultiple() {
			return eSF().getUpperBound() == ETypedElement.UNBOUNDED_MULTIPLICITY;
		}

		@Override
		public boolean isContainer() {
			return eRef != null ? eRef.isContainer() : false;
		}

		@Override
		public boolean isContainment() {
			return eRef != null ? eRef.isContainment() : false;
		}

		@Override
		public Class<?> getValueJavaClass() {
			if (eAttr == null)
				return null;
			EDataType eDT = eAttr.getEAttributeType();
			return eDT instanceof EEnum ? null : eDT.getInstanceClass();
		}

		@Override
		public MMEnumImpl getEnumType() {
			if (eAttr == null)
				return null;
			EDataType eDT = eAttr.getEAttributeType();
			return eDT instanceof EEnum ? new MMEnumImpl((EEnum) eDT) : null;
		}

		@Override
		public MMTypeImpl getReferencedType() {
			return eRef != null ? new MMTypeImpl(eRef.getEReferenceType()) : null;
		}

		@Override
		public MMAttributeImpl getOpposite() {
			return eRef != null && eRef.getEOpposite() != null ? new MMAttributeImpl(eRef.getEOpposite()) : null;
		}

	}

	private class MMConstraintImpl extends MModelElementImpl implements MetamodelConstraint {
		final EOperation eOp;

		public MMConstraintImpl(EOperation eOp) {
			super(() -> eOp);
			this.eOp = eOp;
		}

		@Override
		public MetamodelType getDeclaringType() {
			return new MMTypeImpl(eOp.getEContainingClass());
		}
	}

	private class MMEnumImpl extends MModelElementImpl implements MetamodelEnum {

		private final EEnum eEnum;

		public MMEnumImpl(EEnum eEnum) {
			super(() -> eEnum);
			this.eEnum = eEnum;
		}

		@Override
		public Stream<? extends MetamodelEnumLiteral> listEnumLiterals() {
			return eEnum.getELiterals().stream().map(eEnumLit -> new MMEnumLiteralImpl(eEnumLit));
		}

	}

	private class MMEnumLiteralImpl extends MModelElementImpl implements MetamodelEnumLiteral {

		private final EEnumLiteral eEnumLit;

		public MMEnumLiteralImpl(EEnumLiteral eEnumLit) {
			super(() -> eEnumLit);
			this.eEnumLit = eEnumLit;
		}

		@Override
		public MetamodelEnum getDeclaringEnum() {
			return new MMEnumImpl(eEnumLit.getEEnum());
		}
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
				ecoreAssert(false, "Unsupported annotation source", eAnnotHolder);
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
