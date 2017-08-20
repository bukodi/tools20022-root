package com.tools20022.mmgenerator;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
import org.jboss.forge.roaster.model.source.PropertyHolderSource;
import org.jboss.forge.roaster.model.source.PropertySource;

import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.MetamodelDocImpl;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.ReflectionBasedMetamodel;
import com.tools20022.core.metamodel.StaticMemembersBuilder;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.JavaName;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelAttribute;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelConstraint;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelElement;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnum;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnumLiteral;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelType;

public class DefaultMetamodelGenerator implements BiConsumer<RawMetamodel, GenerationContext<RawMetamodel>> {

	private final static String CLASS_NAME_PREFIX = "MM";

	protected boolean generateStaticStructs = true;

	protected RawMetamodel metamodel;
	protected String basePackageName = "com.tools20022.metamodel";
	protected String mainClassSimpleName = "StandardMetamodel2013";

	protected GenerationContext<RawMetamodel> ctx;

	@Override
	public void accept(RawMetamodel metamodel, GenerationContext<RawMetamodel> ctx) {
		ctx.dontChangeIfExists(p -> p.toString().contains("/constraints/"));

		this.metamodel = metamodel;
		this.ctx = ctx;
		// Create metamodel model skeleton
		JavaName mmName = JavaName.primaryType(basePackageName, mainClassSimpleName);
		JavaClassSource srcMetamodelMain = ctx.createSourceFile(JavaClassSource.class, mmName);
		srcMetamodelMain.addImport(ReflectionBasedMetamodel.class);
		srcMetamodelMain.setSuperType(ReflectionBasedMetamodel.class);

		// Add domain model classes and enums
		metamodel.listEnums().forEachOrdered(e -> generateMMEnum(srcMetamodelMain, e));

		metamodel.listTypes().filter(c -> !c.isAbstract()).forEachOrdered(t -> generateMMClass(srcMetamodelMain, t));
		metamodel.listTypes().filter(c -> c.isAbstract()).forEachOrdered(t -> generateMMInterface(srcMetamodelMain, t));

		{
			// Add constructor
			StringJoiner sjEnums = new StringJoiner(",\n", "registerEnumsFromClasses( \n", ");\n");
			metamodel.listEnums().forEachOrdered(mmEnum -> {
				addImport(srcMetamodelMain, mmEnum);
				sjEnums.add(getJavaName(mmEnum).getSimpleName() + ".class");
			});

			StringJoiner sjTypes = new StringJoiner(",\n", "registerTypesFromClasses( \n", ");\n");
			metamodel.listTypes().forEachOrdered(mmType -> {
				addImport(srcMetamodelMain, mmType);
				sjTypes.add(getJavaName(mmType).getSimpleName() + ".class");
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
		src.addImport(getJavaName(mmElem).getFullName());
	}

	protected JavaName getStructJavaName(MetamodelType mmType) {
		return JavaName.primaryType(getJavaName(mmType).getPackage() + ".struct",
				getJavaName(mmType).getSimpleName() + "_");
	}

	protected JavaName getJavaName(MetamodelElement mmElem) {
		if (mmElem instanceof MetamodelType || mmElem instanceof MetamodelEnum) {
			return JavaName.primaryType(basePackageName, CLASS_NAME_PREFIX + mmElem.getName());
		}
		JavaName parentName;
		String memberName = mmElem.getName();
		if (mmElem instanceof MetamodelAttribute) {
			parentName = getJavaName(((MetamodelAttribute) mmElem).getDeclaringType());
		} else if (mmElem instanceof MetamodelConstraint) {
			parentName = getJavaName(((MetamodelConstraint) mmElem).getDeclaringType());
			memberName = "check" + memberName;
		} else if (mmElem instanceof MetamodelEnumLiteral) {
			parentName = getJavaName(((MetamodelEnumLiteral) mmElem).getDeclaringEnum());
		} else {
			throw new RuntimeException("Invalid type hierarchy:" + mmElem);
		}

		if (RoasterHelper.JAVA_RESERVED_WORDS.contains(memberName))
			memberName = memberName + "_";
		return JavaName.member(parentName, memberName);

	}

	void generateMMEnum(JavaClassSource srcMetamodelMain, MetamodelEnum mmEnum) {
		JavaEnumSource src = ctx.createSourceFile(JavaEnumSource.class, getJavaName(mmEnum));
		setMMDoc(src, mmEnum);

		mmEnum.listEnumLiterals().forEachOrdered(l -> generateMMEnumLiteral(src, l));
	};

	void generateMMEnumLiteral(JavaEnumSource srcMMEnum, MetamodelEnumLiteral mmEnumLit) {
		EnumConstantSource srcConst = srcMMEnum.addEnumConstant();
		srcConst.setName(getJavaName(mmEnumLit).getSimpleName());
		setMMDoc(srcConst, mmEnumLit);

	};

	void generateMMClass(JavaClassSource srcMetamodelMain, MetamodelType mmType) {
		JavaClassSource src = ctx.createSourceFile(JavaClassSource.class, getJavaName(mmType));
		setMMDoc(src, mmType);

		if (generateStaticStructs) {
			generateStaticStructInterface(srcMetamodelMain, src, mmType);
		}

		{ // Implement getContainer();
			src.addImport(GeneratedMetamodelBean.class);
			src.addField().setPrivate().setName("container").setType(GeneratedMetamodelBean.class);

			src.addImport(srcMetamodelMain);
			MethodSource<JavaClassSource> method = src.addMethod();
			method.setName("getContainer").setPublic();
			method.setReturnType(GeneratedMetamodelBean.class);
			method.addAnnotation(Override.class);
			method.setBody("return container;");
		}
		{ // Implement getMetamodel();
			src.addImport(srcMetamodelMain);
			MethodSource<JavaClassSource> method = src.addMethod();
			method.setName("getMetamodel").setPublic();
			src.addImport(Metamodel.MetamodelType.class);
			method.setReturnType(Metamodel.MetamodelType.class.getSimpleName() + "<? extends " + src.getName() + ">");
			method.addAnnotation(Override.class);
			method.setBody("return " + srcMetamodelMain.getName() + ".metamodel().getTypeByClass( getClass() );");
		}
		{
			// Create static metaType()
			MethodSource<JavaClassSource> method = src.addMethod();
			method.setName("metaType").setPublic().setStatic(true);
			method.setReturnType(Metamodel.MetamodelType.class.getSimpleName() + "<? extends " + src.getName() + ">");
			method.setBody("return " + srcMetamodelMain.getName() + ".metamodel().getTypeByClass(" + src.getName()
					+ ".class);");
		}

		// TODO: optimize this block
		List<? extends MetamodelType> superTypes = mmType.listSuperTypes(false, false).collect(Collectors.toList());
		if (superTypes.isEmpty()) {
			src.addImport(GeneratedMetamodelBean.class);
			src.addInterface(GeneratedMetamodelBean.class.getSimpleName());
		} else {
			for (MetamodelType sc : superTypes) {
				src.addImport(getJavaName(sc).getFullName());
				if (sc.isAbstract()) {
					src.addInterface(getJavaName(sc).getSimpleName());
				} else {
					src.setSuperType(getJavaName(sc).getSimpleName());
				}
			}
		}

		mmType.listAllAttributes().forEachOrdered(mmAttr -> {
			generateMMAttribute(src, mmAttr);
		});

	};

	<T extends JavaSource<?>> void generateStaticStructInterface(JavaClassSource srcMetamodelMain, T mmTypeSrc,
			MetamodelType mmType) {
		JavaName structJavaName = getStructJavaName(mmType);
		JavaInterfaceSource src = ctx.createSourceFile(JavaInterfaceSource.class, structJavaName);
		for (MetamodelType superType : mmType.getSuperTypes(false, false)) {
			JavaName superStructName = getStructJavaName(superType);
			src.addImport(superStructName.getFullName());
			src.addInterface(superStructName.getSimpleName());
		}
		src.addImport(mmTypeSrc);

		// Add declared attributes
		for (MetamodelAttribute mmAttr : mmType.getDeclaredAttributes()) {
			src.addImport(Metamodel.MetamodelAttribute.class);
			String fieldtype = generateSourceType(mmAttr, src, false, true);
			fieldtype = "<" + mmTypeSrc.getName() + ", " + fieldtype + ">";
			fieldtype = Metamodel.MetamodelAttribute.class.getSimpleName() + fieldtype;

			FieldSource<JavaInterfaceSource> metaField = src.addField().setName(getJavaName(mmAttr).getSimpleName());
			metaField.setType(fieldtype);
			src.addImport(StaticMemembersBuilder.class.getName() + ".newAttribute").setStatic(true);
			metaField.setLiteralInitializer("newAttribute()");
			setMMDoc(metaField, mmAttr);
		}

		// Add declared constraints
		for (MetamodelConstraint mmConstr : mmType.getDeclaredConstraints()) {
			src.addImport(Metamodel.MetamodelConstraint.class);
			FieldSource<JavaInterfaceSource> metaField = src.addField().setName(getJavaName(mmConstr).getSimpleName());
			metaField.setType(Metamodel.MetamodelConstraint.class.getSimpleName() + "<" + mmTypeSrc.getName() + ">");
			src.addImport(StaticMemembersBuilder.class.getName() + ".newConstraint").setStatic(true);
			setMMDoc(metaField, mmConstr);
			// TODO: check class with name ConstraintExists
			// src.addImport(RuntimeException.class);
			metaField.setLiteralInitializer("newConstraint( b->{ throw new RuntimeException(\"Not implemented!\");})");
		}

	}

	protected <O extends JavaSource<O>> void annotateProperty(O srcType, MethodSource<O> srcGetter,
			MetamodelAttribute mmMember) {
		if (mmMember.isDerived()) {
			srcType.addImport(Derived.class);
			srcGetter.addAnnotation(Derived.class);
		}

		if (srcType.getQualifiedName().equals(getJavaName(mmMember.getDeclaringType()).getFullName())) {
			// Declared in this type
			setMMDoc(srcGetter, mmMember);

			// Add opposite, container and containment anots
			if (mmMember.getOpposite() != null) {
				srcType.addImport(Opposite.class);
				AnnotationSource<O> annotOpp = srcGetter.addAnnotation(Opposite.class);
				String opBeanName = getJavaName(mmMember.getOpposite().getDeclaringType()).getSimpleName();
				String opAttrName = mmMember.getOpposite().getName();
				annotOpp.setLiteralValue("bean", opBeanName + ".class");
				annotOpp.setStringValue("attribute", opAttrName);
				String opGetterName = "get" + opAttrName.substring(0, 1).toUpperCase() + opAttrName.substring(1);
				srcGetter.getJavaDoc().addTagValue("@see", opBeanName + "#" + opGetterName + "()");
			}
			if (mmMember.isContainer()) {
				srcType.addImport(Container.class);
				srcGetter.addAnnotation(Container.class);
			}
			if (mmMember.isContainment()) {
				srcType.addImport(Containment.class);
				srcGetter.addAnnotation(Containment.class);
			}
		} else {
			// Inherited property
			srcGetter.addAnnotation(Override.class);
		}
	}

	void generateMMInterface(JavaClassSource srcMetamodelMain, MetamodelType mmType) {
		JavaInterfaceSource src = ctx.createSourceFile(JavaInterfaceSource.class, getJavaName(mmType));
		setMMDoc(src, mmType);

		if (generateStaticStructs) {
			generateStaticStructInterface(srcMetamodelMain, src, mmType);
		}

		{
			// Create static metaType()
			src.addImport(Metamodel.MetamodelType.class);
			MethodSource<JavaInterfaceSource> method = src.addMethod();
			method.setName("metaType").setPublic().setStatic(true);
			method.setReturnType(Metamodel.MetamodelType.class.getSimpleName() + "<" + src.getName() + ">");
			method.setBody("return " + srcMetamodelMain.getName() + ".metamodel().getTypeByClass(" + src.getName()
					+ ".class);");
		}

		List<? extends MetamodelType> superTypes = mmType.listSuperTypes(false, false).collect(Collectors.toList());
		if (superTypes.isEmpty()) {
			src.addImport(GeneratedMetamodelBean.class);
			src.addInterface(GeneratedMetamodelBean.class.getSimpleName());
		} else {
			for (MetamodelType sc : superTypes) {
				addImport(src, sc);
				src.addInterface(getJavaName(sc).getSimpleName());
			}
		}

		Stream<MetamodelAttribute> attrStream = mmType.listDeclaredAttributes()
				.filter(dm -> (dm instanceof MetamodelAttribute)).map(dm -> ((MetamodelAttribute) dm));
		attrStream.forEachOrdered(mmAttr -> {
			generateMMAttribute(src, mmAttr);
		});

	};

	<T extends JavaSource<T> & PropertyHolderSource<T>> void generateMMAttribute(T srcMMType,
			MetamodelAttribute mmAttr) {
		String getterReturnType = generateSourceType(mmAttr, srcMMType, true, true);
		String fieldValueType = generateSourceType(mmAttr, srcMMType, true, false);

		boolean isLazyReference = mmAttr.getReferencedType() != null && !mmAttr.isDerived() && !mmAttr.isContainment();
		if (isLazyReference) {
			srcMMType.addImport(Supplier.class);
			fieldValueType = Supplier.class.getSimpleName() + "<" + fieldValueType + ">";
		}
		JavaName attrName = getJavaName(mmAttr);

		// Create getter
		MethodSource<T> srcGetter;
		{
			boolean isBool = mmAttr.getValueJavaClass() != null && (mmAttr.getValueJavaClass().equals(Boolean.TYPE)
					|| mmAttr.getValueJavaClass().equals(Boolean.class));
			String getterName = (isBool ? "is" : "get") + mmAttr.getName().substring(0, 1).toUpperCase()
					+ mmAttr.getName().substring(1);
			srcGetter = srcMMType.addMethod().setName(getterName);
			srcGetter.setReturnType(getterReturnType);
			srcGetter.setPublic();
		}

		// Create field
		FieldSource<T> srcField;
		if ((srcMMType instanceof JavaClassSource) && !mmAttr.isDerived()) {
			// Normal attribute
			srcField = srcMMType.addField();
			srcField.setName(attrName.getSimpleName() + (isLazyReference ? "_lazy" : ""));
			srcField.setType(fieldValueType);
			srcField.setProtected();

			if (getterReturnType.startsWith(Optional.class.getSimpleName() + "<")) {
				if (!isLazyReference) {
					srcGetter.setBody("return " + srcField.getName() + "== null ? " + Optional.class.getSimpleName()
							+ ".empty() : " + Optional.class.getSimpleName() + ".of(" + srcField.getName() + ");");
				} else {
					srcGetter.setBody("return " + srcField.getName() + "== null ? " + Optional.class.getSimpleName()
							+ ".empty() : " + Optional.class.getSimpleName() + ".of(" + srcField.getName()
							+ ".get());");
				}
			} else if (getterReturnType.startsWith(List.class.getSimpleName() + "<")) {
				srcMMType.addImport(Collections.class);
				if (!isLazyReference) {
					srcGetter.setBody("return " + srcField.getName() + "== null ? " + Collections.class.getSimpleName()
							+ ".emptyList() : " + srcField.getName() + ";");
				} else {
					srcGetter.setBody("return " + srcField.getName() + "== null ? " + Collections.class.getSimpleName()
							+ ".emptyList() : " + srcField.getName() + ".get();");
				}
			} else {
				if (!isLazyReference) {
					srcGetter.setBody("return " + srcField.getName() + ";");
				} else {
					srcGetter.setBody("return " + srcField.getName() + ".get();");
				}
			}
		} else if ((srcMMType instanceof JavaClassSource) && mmAttr.isDerived()) {
			// Derived attribute
			JavaClassSource srcDerive = generateDerivedAttributeCalulatorClass(mmAttr, (JavaClassSource) srcMMType);

			srcMMType.addImport(srcDerive);
			String body = "return (new " + srcDerive.getName() + "()).apply(this);";
			srcGetter.setBody(body);

			String javaDocText = "Calculate derived attribute ";
			javaDocText += "{@link " + srcMMType.getName() + "#" + srcGetter.getName() + "()}";
			srcDerive.getJavaDoc().setText(javaDocText);
		} else {
			// Interface
			srcField = null;
		}

		annotateProperty(srcMMType, srcGetter, mmAttr);

	};

	protected JavaClassSource generateDerivedAttributeCalulatorClass(MetamodelAttribute mmAttr,
			JavaClassSource srcMMType) {
		JavaName javaName = JavaName.primaryType(basePackageName + ".constraints",
				"Derive" + srcMMType.getName() + "_" + mmAttr.getName());
		JavaClassSource srcDerive = ctx.createSourceFile(JavaClassSource.class, javaName);
		srcDerive.addImport(srcMMType);
		srcDerive.addImport(Function.class);
		String valueType2 = generateSourceType(mmAttr, srcDerive, false, true);
		String ifName = Function.class.getSimpleName() + "<" + srcMMType.getName() + "," + valueType2 + ">";
		srcDerive.addInterface(ifName);
		MethodSource<JavaClassSource> methodApply = srcDerive
				.addMethod("public " + valueType2 + " apply(" + srcMMType.getName() + " mmBean ) {\n"
						+ "			throw new RuntimeException(\"Not implemented!\");\n" + "		}");
		methodApply.addAnnotation(Override.class);
		setMMDoc(methodApply, mmAttr);
		return srcDerive;
	}

	private String generateSourceType(MetamodelAttribute mmAttr, Importer<? extends JavaSource<?>> src,
			boolean allowPrimitiveTypes, boolean allowOptional) {
		String simplifiedTypeName;
		if (mmAttr.getEnumType() != null) {
			addImport(src, mmAttr.getEnumType());
			simplifiedTypeName = getJavaName(mmAttr.getEnumType()).getSimpleName();
		} else if (mmAttr.getValueJavaClass() != null) {
			if (!(mmAttr.getValueJavaClass().isPrimitive()
					|| mmAttr.getValueJavaClass().getName().startsWith("java.lang.")))
				src.addImport(mmAttr.getValueJavaClass());

			if (mmAttr.getValueJavaClass().isPrimitive()
					&& (!allowPrimitiveTypes || mmAttr.isMultiple() || mmAttr.isOptional())) {
				Class<?> wrapper = RoasterHelper.JAVA_PRIMITIVE_TYPE_WRAPPERS
						.get(mmAttr.getValueJavaClass().getSimpleName());
				simplifiedTypeName = wrapper.getSimpleName();
			} else {
				simplifiedTypeName = mmAttr.getValueJavaClass().getSimpleName();
			}
		} else if (mmAttr.getReferencedType() != null) {
			addImport(src, mmAttr.getReferencedType());
			simplifiedTypeName = getJavaName(mmAttr.getReferencedType()).getSimpleName();
		} else {
			throw new RuntimeException("Invalid metamodell: " + mmAttr);
		}
		if (mmAttr.isMultiple()) {
			src.addImport(List.class);
			simplifiedTypeName = "List<" + simplifiedTypeName + ">";
		} else if (mmAttr.isOptional() && allowOptional) {
			src.addImport(Optional.class);
			simplifiedTypeName = "Optional<" + simplifiedTypeName + ">";
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

}
