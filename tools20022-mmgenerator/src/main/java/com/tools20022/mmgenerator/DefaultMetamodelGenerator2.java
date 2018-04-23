package com.tools20022.mmgenerator;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.AnnotationTargetSource;
import org.jboss.forge.roaster.model.source.EnumConstantSource;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.Importer;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaDocCapableSource;
import org.jboss.forge.roaster.model.source.JavaDocSource;
import org.jboss.forge.roaster.model.source.JavaEnumSource;
import org.jboss.forge.roaster.model.source.JavaInterfaceSource;
import org.jboss.forge.roaster.model.source.JavaSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.MetamodelDocImpl;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.OrphanMetamodelType;
import com.tools20022.core.metamodel.ReflectionBasedMetamodel;
import com.tools20022.core.metamodel.RuntimeInstanceAware;
import com.tools20022.core.metamodel.RuntimePropertyAware;
import com.tools20022.core.metamodel.RuntimeValidatorAware;
import com.tools20022.core.metamodel.StaticMemembersBuilder;
import com.tools20022.generators.AbstractGenerator;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.ProgressMonitor;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelAttribute;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelConstraint;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelElement;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnum;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnumLiteral;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelType;

public class DefaultMetamodelGenerator2 extends AbstractGenerator<RawMetamodel, MetamodelElement> {

	private final static String CLASS_NAME_PREFIX = "MM2";

	private final static Set<String> BEAN_AWARE_TYPE_NAMES = new HashSet<>();
	private final static Set<String> PROPRTY_AWARE_TYPE_NAMES = new HashSet<>();
	private final static Set<String> VALIDATOR_AWARE_TYPE_NAMES = new HashSet<>();

	static {
		BEAN_AWARE_TYPE_NAMES.add("MessageDefinition");
		BEAN_AWARE_TYPE_NAMES.add("BusinessComponent");
		PROPRTY_AWARE_TYPE_NAMES.add("MessageAttribute");
		PROPRTY_AWARE_TYPE_NAMES.add("MessageAssociationEnd");
		PROPRTY_AWARE_TYPE_NAMES.add("MessageBuildingBlock");
		PROPRTY_AWARE_TYPE_NAMES.add("BusinessAttribute");
		PROPRTY_AWARE_TYPE_NAMES.add("BusinessAssociationEnd");
		VALIDATOR_AWARE_TYPE_NAMES.add("Constraint");
	}

	protected RawMetamodel metamodel;
	protected String basePackageName = "com.tools20022.metamodel2";
	protected String mainClassSimpleName = "StandardMetamodel2013v2";

	private MetamodelElement mmType_ModelEntity;
	private MetamodelElement mmType_MultiplicityEntity;
	private MetamodelElement mmType_Repository;

	public DefaultMetamodelGenerator2(GenerationContext<RawMetamodel, MetamodelElement> ctx) {
		super(ctx);
	}

	@Override
	public void prepare(RawMetamodel metamodel, ProgressMonitor monitor) {

	}

	@Override
	public void generate(RawMetamodel metamodel, ProgressMonitor monitor) {
		this.metamodel = metamodel;
		// Create metamodel model skeleton
		StructuredName mmName = StructuredName.primaryType(basePackageName, mainClassSimpleName);
		JavaClassSource srcMetamodelMain = ctx.createSourceFile(JavaClassSource.class, mmName);
		srcMetamodelMain.addImport(ReflectionBasedMetamodel.class);
		srcMetamodelMain.setSuperType(ReflectionBasedMetamodel.class);

		mmType_ModelEntity = metamodel.listTypes().filter(mt -> "ModelEntity".equals(mt.getName())).findFirst().get();
		mmType_MultiplicityEntity = metamodel.listTypes().filter(mt -> "MultiplicityEntity".equals(mt.getName()))
				.findFirst().get();
		mmType_Repository = metamodel.listTypes().filter(mt -> "Repository".equals(mt.getName())).findFirst().get();

		// Add domain model classes and enums
		metamodel.listEnums().forEachOrdered(e -> generateMMEnum(srcMetamodelMain, e));

		metamodel.listTypes().forEachOrdered(t -> {
			JavaInterfaceSource srcIf = generateMMInterface(t);
		});

		{
			// Add constructor
			StringJoiner sjEnums = new StringJoiner(",\n", "registerEnumsFromClasses( \n", ");\n");
			metamodel.listEnums().forEachOrdered(mmEnum -> {
				addImport(srcMetamodelMain, mmEnum);
				sjEnums.add(getStructuredName(mmEnum).getSimpleName() + ".class");
			});

			StringJoiner sjTypes = new StringJoiner(",\n", "registerTypesFromClasses( \n", ");\n");
			metamodel.listTypes().forEachOrdered(mmType -> {
				addImport(srcMetamodelMain, mmType);
				sjTypes.add(getStructuredName(mmType).getSimpleName() + ".class");
			});

			MethodSource<JavaClassSource> constructor = srcMetamodelMain.addMethod().setConstructor(true).setPrivate();
			constructor.setBody(sjEnums.toString() + "\n" + sjTypes.toString());
		}

		{
			// Add static metamodel field;
			FieldSource<JavaClassSource> fieldMetamodel = srcMetamodelMain.addField().setName("metamodel");
			fieldMetamodel.setPrivate().setStatic(true).setFinal(true).setType(srcMetamodelMain);
			fieldMetamodel.setLiteralInitializer("new " + srcMetamodelMain.getName() + "()");
		}

		{
			// Create static metaType()
			MethodSource<JavaClassSource> method = srcMetamodelMain.addMethod();
			method.setName("metamodel").setPublic().setStatic(true);
			method.setReturnType(srcMetamodelMain.getName());
			method.setBody("return metamodel;");
		}
	}

	private void addImport(Importer<? extends JavaSource<?>> src, MetamodelElement mmElem) {
		src.addImport(getStructuredName(mmElem).getFullName());
	}

	@Override
	public StructuredName getStructuredName(MetamodelElement mmElem) {
		if (mmElem instanceof MetamodelType || mmElem instanceof MetamodelEnum) {
			return StructuredName.primaryType(basePackageName, CLASS_NAME_PREFIX + mmElem.getName());
		}
		StructuredName parentName;
		String memberName = mmElem.getName();
		if (mmElem instanceof MetamodelAttribute) {
			parentName = getStructuredName(((MetamodelAttribute) mmElem).getDeclaringType());
		} else if (mmElem instanceof MetamodelConstraint) {
			parentName = getStructuredName(((MetamodelConstraint) mmElem).getDeclaringType());
			memberName = "check" + memberName;
		} else if (mmElem instanceof MetamodelEnumLiteral) {
			parentName = getStructuredName(((MetamodelEnumLiteral) mmElem).getDeclaringEnum());
		} else {
			throw new RuntimeException("Invalid type hierarchy:" + mmElem);
		}

		if (RoasterHelper.JAVA_RESERVED_WORDS.contains(memberName))
			memberName = memberName + "_";
		return StructuredName.member(parentName, memberName);

	}

	void generateMMEnum(JavaClassSource srcMetamodelMain, MetamodelEnum mmEnum) {
		JavaEnumSource src = ctx.createSourceFile(JavaEnumSource.class, getStructuredName(mmEnum));
		setMMDoc(src, mmEnum);

		mmEnum.listEnumLiterals().forEachOrdered(l -> generateMMEnumLiteral(src, l));
	};

	void generateMMEnumLiteral(JavaEnumSource srcMMEnum, MetamodelEnumLiteral mmEnumLit) {
		EnumConstantSource srcConst = srcMMEnum.addEnumConstant();
		srcConst.setName(getStructuredName(mmEnumLit).getSimpleName());
		setMMDoc(srcConst, mmEnumLit);

	};

	void addGetContainer(JavaClassSource srcImpl, MetamodelType mmType) {
		MethodSource<JavaClassSource> srcGetContainer = srcImpl.addMethod();
		srcGetContainer.setName("getContainer").setPublic();
		srcGetContainer.addAnnotation(Override.class);

		Set<? extends MetamodelAttribute> containingRefs = mmType.getIncomingAttributes().stream()
				.filter(mmAttr -> mmAttr.isContainment()).collect(Collectors.toSet());
		if (containingRefs.size() > 1) {
			// This should be the Xor type
			if (!"Xor".equals(mmType.getName()))
				throw new RuntimeException("The '" + mmType.getName()
						+ "' has more than one possible container, and this case isn't handeled in this generator.");
			// Custom implementation for Xor type
			StructuredName javaNameRepoType = getStructuredName(metamodel.getTypeByName("RepositoryType"));
			srcImpl.addImport(javaNameRepoType.getFullName());
			srcGetContainer.setReturnType(javaNameRepoType.getSimpleName());
			srcGetContainer.setBody("		if( getMessageComponent().isPresent() )\n"
					+ "			return getMessageComponent().get();\n"
					+ "		if( getMessageDefinition().isPresent())\n"
					+ "			return getMessageDefinition().get();\n"
					+ "		throw new IllegalStateException(\"The \" + toString() + \" hasn't container!\");\n" + "");
		} else if (containingRefs.isEmpty()) {
			srcGetContainer.setReturnType(getStructuredName(mmType_ModelEntity).getFullName());
			srcGetContainer.setBody("return null;");
		} else {
			// Exactly one containing ref
			MetamodelAttribute containingRef = containingRefs.iterator().next();
			StructuredName containerTypeJavaName = getStructuredName(containingRef.getDeclaringType());
			srcImpl.addImport(containerTypeJavaName.getFullName());
			srcGetContainer.setReturnType(containerTypeJavaName.getSimpleName());
			if (containingRef.getOpposite() != null) {
				// Has an opposite ref
				String getterName = getterName(containingRef.getOpposite());
				srcGetContainer.setBody("return " + getterName + "();");
			} else {
				// Hasn't opposite container ref, container field added
				srcImpl.addField().setProtected().setName("container").setType(containerTypeJavaName.getSimpleName());
				srcGetContainer.setBody("return container;");
			}
		}

	}

	protected void annotateProperty(MethodSource<JavaInterfaceSource> srcGetter, MetamodelAttribute mmAttr) {
		if (mmAttr.isDerived()) {
			srcGetter.addAnnotation(Derived.class);
			srcGetter.setDefault(true);
			
			JavaClassSource srcDerive = generateDerivedAttributeCalulatorClass(mmAttr, srcGetter.getOrigin());

			String body = "return (new " + srcDerive.getCanonicalName() + "()).apply(this);";
			srcGetter.setBody(body);

			String javaDocText = "Calculate derived attribute ";
			javaDocText += "{@link " + srcGetter.getOrigin().getCanonicalName() + "#" + srcGetter.getName() + "()}";
			srcDerive.getJavaDoc().setText(javaDocText);
		}

		if (!srcGetter.getOrigin().getQualifiedName()
				.equals(getStructuredName(mmAttr.getDeclaringType()).getFullName())) {
			throw new RuntimeException(
					mmAttr.toString() + " declared in " + srcGetter.getOrigin().getQualifiedName() + ".");
		}
		// Declared in this type
		setMMDoc(srcGetter, mmAttr);

		// Add opposite, container and containment anots
		if (mmAttr.getOpposite() != null) {
			AnnotationSource<JavaInterfaceSource> annotOpp = srcGetter.addAnnotation(Opposite.class);
			String opBeanName = getStructuredName(mmAttr.getOpposite().getDeclaringType()).getSimpleName();
			String opAttrName = mmAttr.getOpposite().getName();
			annotOpp.setLiteralValue("bean", opBeanName + ".class");
			annotOpp.setStringValue("attribute", opAttrName);
			String opGetterName = "get" + opAttrName.substring(0, 1).toUpperCase() + opAttrName.substring(1);
			srcGetter.getJavaDoc().addTagValue("@see", opBeanName + "#" + opGetterName + "()");
		}
		if (mmAttr.isContainer()) {
			srcGetter.addAnnotation(Container.class);
		}
		if (mmAttr.isContainment()) {
			srcGetter.addAnnotation(Containment.class);
		}
	}

	JavaInterfaceSource generateMMInterface(MetamodelType mmType) {
		JavaInterfaceSource srcIf = ctx.createSourceFile(JavaInterfaceSource.class, getStructuredName(mmType));		

		setMMDoc(srcIf, mmType);


		List<? extends MetamodelType> superTypes = mmType.listSuperTypes(false, false).collect(Collectors.toList());
		for (MetamodelType sc : superTypes) {
			srcIf.addInterface(getStructuredName(sc).getFullName());
		}

		if (mmType_ModelEntity.equals(mmType)) {
			// Add getContainer()
			MethodSource<JavaInterfaceSource> srcIfGetContainer = srcIf.addMethod().setName("getContainer");
			srcIfGetContainer.setReturnType(getStructuredName(mmType_ModelEntity).getFullName());
			srcIfGetContainer.setPublic();
			
			// TODO: should remove this
			srcIf.addInterface(MMModelEntity.class);
		}
		
		// If no container ref, mark as an OrphanType, except the Repository
		if( mmType.getIncomingAttributes().stream().filter(mmAttr -> mmAttr.isContainment()).count() == 0 ) {
			if (!mmType_Repository.equals(mmType)) {
				srcIf.addInterface(OrphanMetamodelType.class);
			}
		}


		if (mmType_MultiplicityEntity.equals(mmType)) {
			srcIf.addInterface(getStructuredName(mmType_ModelEntity).getFullName());
		}

		{
			// Implement XXXAware interfaces
			if (BEAN_AWARE_TYPE_NAMES.contains(mmType.getName())) {
				srcIf.addInterface(RuntimeInstanceAware.class);
			}
			// Implement XXXAware interfaces
			if (PROPRTY_AWARE_TYPE_NAMES.contains(mmType.getName())) {
				srcIf.addTypeVariable().setName("T");
				srcIf.addTypeVariable().setName("V");
				srcIf.addInterface(RuntimePropertyAware.class.getName() + "<T,V>");
			}
			// Implement XXXAware interfaces
			if (VALIDATOR_AWARE_TYPE_NAMES.contains(mmType.getName())) {
				srcIf.addTypeVariable().setName("T");
				srcIf.addInterface(RuntimeValidatorAware.class.getName() + "<T>");
			}
		}

		// Add declared attributes
		for (MetamodelAttribute mmAttr : mmType.getDeclaredAttributes()) {
			generateIfAttribute(srcIf, mmAttr);

			String fieldtype = generateSourceType(mmAttr, false, true);
			fieldtype = "<" + srcIf.getName() + ", " + fieldtype + ">";
			fieldtype = Metamodel.MetamodelAttribute.class.getCanonicalName() + fieldtype;

			FieldSource<JavaInterfaceSource> metaField = srcIf.addField()
					.setName(getStructuredName(mmAttr).getSimpleName() + "Attribute");
			metaField.setPublic().setFinal(true).setStatic(true);
			metaField.setType(fieldtype);
			srcIf.addImport(StaticMemembersBuilder.class.getName() + ".newAttribute").setStatic(true);
			metaField.setLiteralInitializer("newAttribute()");
			setMMDoc(metaField, mmAttr);
		}

		// Add declared constraints
		for (MetamodelConstraint mmConstr : mmType.getDeclaredConstraints()) {
			JavaClassSource srcConstr = generateConstraintValidator(mmConstr);
			srcIf.addImport(Metamodel.MetamodelConstraint.class);
			FieldSource<JavaInterfaceSource> metaField = srcIf.addField()
					.setName(getStructuredName(mmConstr).getSimpleName());
			metaField.setType(Metamodel.MetamodelConstraint.class.getSimpleName() + "<" + srcIf.getName() + ">");
			metaField.setPublic().setFinal(true).setStatic(true);
			srcIf.addImport(StaticMemembersBuilder.class.getName() + ".newConstraint").setStatic(true);
			setMMDoc(metaField, mmConstr);
			// TODO: check class with name ConstraintExists
			// src.addImport(RuntimeException.class);
			metaField.setLiteralInitializer(
					"newConstraint( b->{ new " + srcConstr.getQualifiedName() + "().accept(b);})");

			String javaDocText = "Implementation of constraint ";
			javaDocText += "{@link " + srcIf.getQualifiedName() + "#" + metaField.getName() + "}";
			srcConstr.getJavaDoc().setText(javaDocText);
		}
		
		if( ! mmType.isAbstract() ) {
			generateMMImpl(srcIf, mmType);
		}

		return srcIf;
	};

	JavaClassSource generateMMImpl(JavaInterfaceSource srcIf, MetamodelType mmType) {
		StructuredName implName = StructuredName.primaryType(srcIf.getPackage() + ".impl", srcIf.getName() + "Impl");
		JavaClassSource srcImpl = ctx.createSourceFile(JavaClassSource.class, implName);

		addGetContainer( srcImpl, mmType);

		srcImpl.addInterface(srcIf);

		// Add delegated attributes
		for (MetamodelType superType : mmType.getSuperTypes(true, true)) {
			for (MetamodelAttribute mmAttr : superType.getDeclaredAttributes()) {
				generateImplAttribute(srcImpl, mmAttr);
			}
		}

		return srcImpl;
	};

	void generateImplAttribute( JavaClassSource srcImpl, MetamodelAttribute mmAttr) {
		if( mmAttr.isDerived() )
			return;
		
		String fieldValueType = generateSourceType(mmAttr, true, false);

		boolean isLazyReference = mmAttr.getReferencedType() != null && !mmAttr.isDerived(); // &&
																								// !mmAttr.isContainment();
		if (mmAttr.getReferencedType() != null) {
			fieldValueType = Supplier.class.getName() + "<" + fieldValueType + ">";
		}
		StructuredName attrName = getStructuredName(mmAttr);

		// Create getter
		String getterReturnType = generateSourceType(mmAttr, true, true);
		MethodSource<JavaClassSource> srcImplGetter;
		{
			String getterName = getterName(mmAttr);
			srcImplGetter = srcImpl.addMethod().setName(getterName).setPublic().setReturnType(getterReturnType);
		}

		// Create field
		FieldSource<JavaClassSource> srcField;
		if (!mmAttr.isDerived()) {
			// Normal attribute
			srcField = srcImpl.addField();
			srcField.setName(attrName.getSimpleName() + (isLazyReference ? "_lazy" : ""));
			srcField.setType(fieldValueType);
			srcField.setProtected();

			if (getterReturnType.startsWith(Optional.class.getName() + "<")) {
				if (!isLazyReference) {
					srcImplGetter.setBody("return " + srcField.getName() + "== null ? " + Optional.class.getName()
							+ ".empty() : " + Optional.class.getName() + ".of(" + srcField.getName() + ");");
				} else {
					srcImplGetter.setBody("return " + srcField.getName() + "== null ? " + Optional.class.getName()
							+ ".empty() : " + Optional.class.getName() + ".of(" + srcField.getName() + ".get());");
				}
			} else if (getterReturnType.startsWith(List.class.getName() + "<")) {
				srcImpl.addImport(Collections.class);
				if (!isLazyReference) {
					srcImplGetter.setBody("return " + srcField.getName() + "== null ? " + Collections.class.getName()
							+ ".emptyList() : " + srcField.getName() + ";");
				} else {
					srcImplGetter.setBody("return " + srcField.getName() + "== null ? " + Collections.class.getName()
							+ ".emptyList() : " + srcField.getName() + ".get();");
				}
			} else {
				if (!isLazyReference) {
					srcImplGetter.setBody("return " + srcField.getName() + ";");
				} else {
					srcImplGetter.setBody("return " + srcField.getName() + ".get();");
				}
			}
		} 

	};

	void generateIfAttribute(JavaInterfaceSource srcIf, MetamodelAttribute mmAttr) {
		String fieldValueType = generateSourceType(mmAttr, true, false);

		boolean isLazyReference = mmAttr.getReferencedType() != null && !mmAttr.isDerived(); // &&
																								// !mmAttr.isContainment();
		if (mmAttr.getReferencedType() != null) {
			fieldValueType = Supplier.class.getName() + "<" + fieldValueType + ">";
		}
		StructuredName attrName = getStructuredName(mmAttr);

		// Create getter
		String getterReturnType = generateSourceType(mmAttr, true, true);
		MethodSource<JavaInterfaceSource> srcIfGetter;
		{
			String getterName = getterName(mmAttr);
			srcIfGetter = srcIf.addMethod().setName(getterName).setPublic().setReturnType(getterReturnType);
		}


		annotateProperty( srcIfGetter, mmAttr);

	};

	protected JavaClassSource generateDerivedAttributeCalulatorClass(MetamodelAttribute mmAttr,
			JavaInterfaceSource srcIf) {
		StructuredName javaName = StructuredName.primaryType(basePackageName + ".derived",
				"Derive" + srcIf.getName() + "_" + mmAttr.getName());
		JavaClassSource srcDerive = ctx.createSourceFile(JavaClassSource.class, javaName);
		srcDerive.addImport(srcIf);
		String valueType2 = generateSourceType(mmAttr, false, true);
		String ifName = Function.class.getName() + "<" + srcIf.getName() + "," + valueType2 + ">";
		srcDerive.addInterface(ifName);
		MethodSource<JavaClassSource> methodApply = srcDerive.addMethod().setName("apply").setPublic();
		methodApply.addParameter(srcIf.getName(), "mmBean");
		methodApply.setReturnType(valueType2);
		methodApply.setBody( "throw new RuntimeException(\"Not implemented!\");");
		methodApply.addAnnotation(Override.class);
		setMMDoc(methodApply, mmAttr);
		return srcDerive;
	}

	protected JavaClassSource generateConstraintValidator(MetamodelConstraint mmConstr) {
		StructuredName beanTypeName = getStructuredName(mmConstr.getDeclaringType());
		final String simpleName;
		if ("EntriesHaveUniqueName".equals(mmConstr.getName())) {
			// This is the only constraint with same name in two different types!
			if ("DataDictionary".equals(mmConstr.getDeclaringType().getName())) {
				simpleName = "DataDictionaryEntriesHaveUniqueName";
			} else if ("BusinessProcessCatalogue".equals(mmConstr.getDeclaringType().getName())) {
				simpleName = "BusinessProcessCatalogueEntriesHaveUniqueName";
			} else {
				throw new RuntimeException("Unsupported case!");
			}
		} else {
			simpleName = mmConstr.getName().substring(0, 1).toUpperCase() + mmConstr.getName().substring(1);
		}
		StructuredName javaName = StructuredName.primaryType(basePackageName + ".constraints", simpleName);

		JavaClassSource srcDerive = ctx.createSourceFile(JavaClassSource.class, javaName);
		srcDerive.addImport(beanTypeName.getFullName());
		String ifName = Consumer.class.getName() + "<" + beanTypeName.getSimpleName() + ">";
		srcDerive.addInterface(ifName);
		MethodSource<JavaClassSource> methodAccept = srcDerive
				.addMethod("public void accept(" + beanTypeName.getSimpleName() + " mmBean ) {\n"
						+ "			throw new RuntimeException(\"Not implemented!\");\n" + "		}");
		methodAccept.addAnnotation(Override.class);
		setMMDoc(methodAccept, mmConstr);
		return srcDerive;
	}

	private String generateSourceType(MetamodelAttribute mmAttr, boolean allowPrimitiveTypes, boolean allowOptional) {
		String simplifiedTypeName;
		if (mmAttr.getEnumType() != null) {
			simplifiedTypeName = getStructuredName(mmAttr.getEnumType()).getFullName();
		} else if (mmAttr.getValueJavaClass() != null) {
			if (mmAttr.getValueJavaClass().isPrimitive()
					&& (!allowPrimitiveTypes || mmAttr.isMultiple() || mmAttr.isOptional())) {
				Class<?> wrapper = RoasterHelper.JAVA_PRIMITIVE_TYPE_WRAPPERS
						.get(mmAttr.getValueJavaClass().getSimpleName());
				simplifiedTypeName = wrapper.getName();
			} else {
				simplifiedTypeName = mmAttr.getValueJavaClass().getName();
			}
		} else if (mmAttr.getReferencedType() != null) {
			simplifiedTypeName = getStructuredName(mmAttr.getReferencedType()).getFullName();
		} else {
			throw new RuntimeException("Invalid metamodell: " + mmAttr);
		}
		if (mmAttr.isMultiple()) {
			simplifiedTypeName = List.class.getName() + "<" + simplifiedTypeName + ">";
		} else if (mmAttr.isOptional() && allowOptional) {
			simplifiedTypeName = Optional.class.getName() + "<" + simplifiedTypeName + ">";
		}
		return simplifiedTypeName;
	}

	protected <T extends AnnotationTargetSource<?, ?> & JavaDocCapableSource<?>> void setMMDoc(T srcPart,
			MetamodelElement mmElem) {
		MetamodelDocImpl mmDoc = mmElem.getDocumentation();
		if (mmDoc != null) {
			if (mmDoc.getDocumentation() != null) {
				JavaDocSource<?> srcJavaDoc = srcPart.getJavaDoc();
				String javaDocText = escapeJavaDocText(mmDoc.getDocumentation());
				srcJavaDoc.setText(javaDocText);
			}
		}
	}

	private static String escapeJavaDocText(String originalDoc) {
		String javaDoc = originalDoc.replaceAll("&", "	&amp;").replaceAll(">", "&gt;").replaceAll("<", "&lt;");
		return javaDoc;
	}

	protected static String getterName(MetamodelAttribute mmAttr) {
		boolean isBool = mmAttr.getValueJavaClass() != null && (mmAttr.getValueJavaClass().equals(Boolean.TYPE)
				|| mmAttr.getValueJavaClass().equals(Boolean.class));

		return (isBool ? "is" : "get") + mmAttr.getName().substring(0, 1).toUpperCase() + mmAttr.getName().substring(1);
	}

}
