package com.tools20022.mmgenerator;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.AnnotationTargetSource;
import org.jboss.forge.roaster.model.source.EnumConstantSource;
import org.jboss.forge.roaster.model.source.FieldHolderSource;
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

import com.tools20022.core.metamodel.RuntimeInstanceAware;
import com.tools20022.core.metamodel.Container;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.MetamodelDocImpl;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.OrphanMetamodelType;
import com.tools20022.core.metamodel.RuntimePropertyAware;
import com.tools20022.core.metamodel.ReflectionBasedMetamodel;
import com.tools20022.core.metamodel.StaticMemembersBuilder;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelAttribute;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelConstraint;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelElement;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnum;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnumLiteral;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelType;

public class DefaultMetamodelGenerator implements BiConsumer<RawMetamodel, GenerationContext<RawMetamodel>> {

	private final static String CLASS_NAME_PREFIX = "MM";
	
	private final static Set<String> BEAN_AWARE_TYPE_NAMES = new HashSet<>();
	private final static Set<String> PROPRTY_AWARE_TYPE_NAMES = new HashSet<>();
	
	static {
		BEAN_AWARE_TYPE_NAMES.add("MessageDefinition");
		BEAN_AWARE_TYPE_NAMES.add("BusinessComponent");
		PROPRTY_AWARE_TYPE_NAMES.add("MessageBuildingBlock");
		PROPRTY_AWARE_TYPE_NAMES.add("BusinessAttribute");
		PROPRTY_AWARE_TYPE_NAMES.add("AssociationEnd");		
	}

	protected boolean generateStaticStructs = true;

	protected RawMetamodel metamodel;
	protected String basePackageName = "com.tools20022.metamodel";
	protected String mainClassSimpleName = "StandardMetamodel2013";

	protected GenerationContext<RawMetamodel> ctx;

	@Override
	public void accept(RawMetamodel metamodel, GenerationContext<RawMetamodel> ctx) {
		this.metamodel = metamodel;
		this.ctx = ctx;
		// Create metamodel model skeleton
		StructuredName mmName = StructuredName.primaryType(basePackageName, mainClassSimpleName);
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

	protected StructuredName getStructJavaName(MetamodelType mmType) {
		return StructuredName.primaryType(getJavaName(mmType).getPackage() + ".struct",
				getJavaName(mmType).getSimpleName() + "_");
	}

	protected StructuredName getJavaName(MetamodelElement mmElem) {
		if (mmElem instanceof MetamodelType || mmElem instanceof MetamodelEnum) {
			return StructuredName.primaryType(basePackageName, CLASS_NAME_PREFIX + mmElem.getName());
		}
		StructuredName parentName;
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
		return StructuredName.member(parentName, memberName);

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
			MethodSource<JavaClassSource> getContainerMethod = src.addMethod();
			getContainerMethod.setName("getContainer").setPublic();
			getContainerMethod.addAnnotation(Override.class);

			Set<? extends MetamodelAttribute> containingRefs = mmType.getIncomingAttributes().stream()
					.filter(mmAttr -> mmAttr.isContainment()).collect(Collectors.toSet());
			if (containingRefs.size() > 1) {
				// This should be the Xor type
				if (!"Xor".equals(mmType.getName()))
					throw new RuntimeException("The '" + mmType.getName()
							+ "' has more than one possible container, and this case isn't handeled in this generator.");
				// Custom implementation for Xor type
				StructuredName javaNameRepoType = getJavaName(metamodel.getTypeByName("RepositoryType"));
				src.addImport(javaNameRepoType.getFullName());
				getContainerMethod.setReturnType(javaNameRepoType.getSimpleName());
				getContainerMethod.setBody("		if( getMessageComponent().isPresent() )\n"
						+ "			return getMessageComponent().get();\n"
						+ "		if( getMessageDefinition().isPresent())\n"
						+ "			return getMessageDefinition().get();\n"
						+ "		throw new IllegalStateException(\"The \" + toString() + \" hasn't container!\");\n"
						+ "");
			} else if (containingRefs.isEmpty()) {
				// No container ref, mark as an OrphanType, except the Repository
				if(! "Repository".equals( mmType.getName() ) ) {
					src.addImport(OrphanMetamodelType.class);
					src.addInterface(OrphanMetamodelType.class.getSimpleName());					
				}
				
				src.addImport(GeneratedMetamodelBean.class);
				getContainerMethod.setReturnType(GeneratedMetamodelBean.class);
				getContainerMethod.setBody("return null;");
			} else {
				// Exactly one containing ref
				MetamodelAttribute containingRef = containingRefs.iterator().next();
				StructuredName containerTypeJavaName = getJavaName( containingRef.getDeclaringType() );
				src.addImport(containerTypeJavaName.getFullName());
				getContainerMethod.setReturnType(containerTypeJavaName.getSimpleName());
				if (containingRef.getOpposite() != null) {
					// Has an opposite ref
					String getterName = getterName ( containingRef.getOpposite() );
					getContainerMethod.setBody("return " + getterName + "();");
				} else {
					// Hasn't opposite container ref, container field added
					src.addField().setProtected().setName("container").setType(containerTypeJavaName.getSimpleName());
					getContainerMethod.setBody("return container;");
				}
			}
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

		{
			// Implement XXXAware interfaces
			if( BEAN_AWARE_TYPE_NAMES.contains(mmType.getName()) ) {
				src.addInterface(RuntimeInstanceAware.class);
			}
			// Implement XXXAware interfaces
			if( PROPRTY_AWARE_TYPE_NAMES.contains(mmType.getName()) ) {
				src.addInterface(RuntimePropertyAware.class);
			}
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

	<T extends JavaSource<T> & FieldHolderSource<T>> void generateStaticStructInterface(JavaClassSource srcMetamodelMain, T src,
			MetamodelType mmType) {
		StructuredName structJavaName = getStructJavaName(mmType);
//		JavaInterfaceSource src = ctx.createSourceFile(JavaInterfaceSource.class, structJavaName);
//		for (MetamodelType superType : mmType.getSuperTypes(false, false)) {
//			StructuredName superStructName = getStructJavaName(superType);
//			src.addImport(superStructName.getFullName());
//			src.addInterface(superStructName.getSimpleName());
//		}
//		src.addImport(mmTypeSrc);

		// Add declared attributes
		for (MetamodelAttribute mmAttr : mmType.getDeclaredAttributes()) {
			src.addImport(Metamodel.MetamodelAttribute.class);
			String fieldtype = generateSourceType(mmAttr, src, false, true);
			fieldtype = "<" + src.getName() + ", " + fieldtype + ">";
			fieldtype = Metamodel.MetamodelAttribute.class.getSimpleName() + fieldtype;

			FieldSource<T> metaField = src.addField().setName(getJavaName(mmAttr).getSimpleName() + "Attribute");
			metaField.setPublic().setFinal(true).setStatic(true);
			metaField.setType(fieldtype);
			src.addImport(StaticMemembersBuilder.class.getName() + ".newAttribute").setStatic(true);
			metaField.setLiteralInitializer("newAttribute()");
			setMMDoc(metaField, mmAttr);
		}

		// Add declared constraints
		for (MetamodelConstraint mmConstr : mmType.getDeclaredConstraints()) {
			JavaClassSource srcConstr = generateConstraintValidator(mmConstr);			
			src.addImport(Metamodel.MetamodelConstraint.class);
			FieldSource<T> metaField = src.addField().setName(getJavaName(mmConstr).getSimpleName());
			metaField.setType(Metamodel.MetamodelConstraint.class.getSimpleName() + "<" + src.getName() + ">");
			metaField.setPublic().setFinal(true).setStatic(true);
			src.addImport(StaticMemembersBuilder.class.getName() + ".newConstraint").setStatic(true);
			setMMDoc(metaField, mmConstr);
			// TODO: check class with name ConstraintExists
			// src.addImport(RuntimeException.class);
			metaField.setLiteralInitializer("newConstraint( b->{ new " + srcConstr.getQualifiedName() + "().accept(b);})");
			
			String javaDocText = "Implementation of constraint ";
			javaDocText += "{@link " + src.getQualifiedName() + "#" + metaField.getName() + "}";
			srcConstr.getJavaDoc().setText(javaDocText);
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

		boolean isLazyReference = mmAttr.getReferencedType() != null && !mmAttr.isDerived(); // && !mmAttr.isContainment();
		if (mmAttr.getReferencedType() != null) {
			srcMMType.addImport(Supplier.class);
			fieldValueType = Supplier.class.getSimpleName() + "<" + fieldValueType + ">";
		}
		StructuredName attrName = getJavaName(mmAttr);

		// Create getter
		MethodSource<T> srcGetter;
		{			
			String getterName = getterName(mmAttr);
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
		StructuredName javaName = StructuredName.primaryType(basePackageName + ".derived",
				"Derive" + srcMMType.getName() + "_" + mmAttr.getName());
		JavaClassSource srcDerive = ctx.createSourceFile(JavaClassSource.class, javaName);
		srcDerive.addImport(srcMMType);
		String valueType2 = generateSourceType(mmAttr, srcDerive, false, true);
		String ifName = Function.class.getName() + "<" + srcMMType.getName() + "," + valueType2 + ">";
		srcDerive.addInterface(ifName);
		MethodSource<JavaClassSource> methodApply = srcDerive
				.addMethod("public " + valueType2 + " apply(" + srcMMType.getName() + " mmBean ) {\n"
						+ "			throw new RuntimeException(\"Not implemented!\");\n" + "		}");
		methodApply.addAnnotation(Override.class);
		setMMDoc(methodApply, mmAttr);
		return srcDerive;
	}

	protected JavaClassSource generateConstraintValidator(MetamodelConstraint mmConstr) {		
		StructuredName beanTypeName = getJavaName(mmConstr.getDeclaringType());
		final String simpleName; 
		if( "EntriesHaveUniqueName".equals(mmConstr.getName() ) ) {
			// This is the only constraint with same name in two different types!
			if( "DataDictionary".equals( mmConstr.getDeclaringType().getName() ) ) {
				simpleName = "DataDictionaryEntriesHaveUniqueName"; 
			} else if( "BusinessProcessCatalogue".equals( mmConstr.getDeclaringType().getName() ) ) {
				simpleName = "BusinessProcessCatalogueEntriesHaveUniqueName"; 				
			} else {
				throw new RuntimeException("Unsupported case!");
			}
		} else {
			simpleName = mmConstr.getName().substring(0, 1).toUpperCase() + mmConstr.getName().substring(1);				
		}
		StructuredName javaName = StructuredName.primaryType(basePackageName + ".constraints",simpleName);
		
		JavaClassSource srcDerive = ctx.createSourceFile(JavaClassSource.class, javaName);
		srcDerive.addImport(beanTypeName.getFullName());
		String ifName = Consumer.class.getName() + "<" + beanTypeName.getSimpleName() + ">";
		srcDerive.addInterface(ifName);
		MethodSource<JavaClassSource> methodAccept= srcDerive
				.addMethod("public void accept(" + beanTypeName.getSimpleName() + " mmBean ) {\n"
						+ "			throw new RuntimeException(\"Not implemented!\");\n" + "		}");
		methodAccept.addAnnotation(Override.class);
		setMMDoc(methodAccept, mmConstr);
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

	protected static String getterName( MetamodelAttribute mmAttr ) {
		boolean isBool = mmAttr.getValueJavaClass() != null && (mmAttr.getValueJavaClass().equals(Boolean.TYPE)
				|| mmAttr.getValueJavaClass().equals(Boolean.class));

		return (isBool ? "is" : "get") + mmAttr.getName().substring(0, 1).toUpperCase()
		+ mmAttr.getName().substring(1);
	}
}
