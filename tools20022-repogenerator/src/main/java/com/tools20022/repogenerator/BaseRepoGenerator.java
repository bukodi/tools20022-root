package com.tools20022.repogenerator;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.jboss.forge.roaster.model.Visibility;
import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaDocCapableSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.generators.AbstractGenerator;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMDecimal;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMString;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repogenerator.resulttypes.AttrResult;
import com.tools20022.repogenerator.resulttypes.DataTypeResult;
import com.tools20022.repogenerator.resulttypes.EnumConstantResult;
import com.tools20022.repogenerator.resulttypes.EnumTypeResult;
import com.tools20022.repogenerator.resulttypes.JaxbMainTypeResult;
import com.tools20022.repogenerator.resulttypes.JaxbPropertyResult;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;
import com.tools20022.repogenerator.resulttypes.PropertyResult;
import com.tools20022.repogenerator.resulttypes.StaticFieldResult;
import com.tools20022.repogenerator.resulttypes.TypeResult;

public abstract class BaseRepoGenerator extends AbstractGenerator<RawRepository,GeneratedMetamodelBean> {

	int USE_LIST_BUILDER_ABOVE = 500;

	/*** Customizable options ***/
	protected String basePackageName = "com.tools20022.repository";
	protected String mainClassSimpleName = "GeneratedRepository";

	/*** Set in {@link #accept(RawRepository, GenerationContext)} ***/
	protected RawRepository repo;

	public BaseRepoGenerator(GenerationContext<RawRepository,GeneratedMetamodelBean> ctx) {
		 super( ctx );
	}
	
	@Override
	public StructuredName getStructuredName(GeneratedMetamodelBean mmElem) {
		StructuredName name = _getStructuredName(mmElem);
		return name;
	}
	
	private StructuredName _getStructuredName(GeneratedMetamodelBean mmElem) {

		BiFunction<GeneratedMetamodelBean, String, StructuredName> createJavaNameAsMemeber = (parentElem,
				memberName) -> {
			StructuredName parentStructName = getStructuredName(parentElem.getContainer());
			memberName = RoasterHelper.convertToJavaName(memberName);
			return StructuredName.member(parentStructName, memberName);
		};

		if (mmElem instanceof MMRepository) {
			return StructuredName.primaryType(basePackageName, mainClassSimpleName);
		} else if (mmElem instanceof MMDataDictionary) {
			return createJavaNameAsMemeber.apply(mmElem, "dataDict");
		} else if (mmElem instanceof MMBusinessProcessCatalogue) {
			return createJavaNameAsMemeber.apply(mmElem, "catalogue");
		} else if (mmElem instanceof MMBusinessAssociationEnd) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessAssociationEnd) mmElem).getName());
		} else if (mmElem instanceof MMBusinessAttribute) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessAttribute) mmElem).getName());
		} else if (mmElem instanceof MMMessageAssociationEnd) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageAssociationEnd) mmElem).getName());
		} else if (mmElem instanceof MMMessageAttribute) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageAttribute) mmElem).getName());
		} else if (mmElem instanceof MMMessageBuildingBlock) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageBuildingBlock) mmElem).getName());
		} else if (mmElem instanceof MMMessageDefinitionIdentifier) {
			return createJavaNameAsMemeber.apply(mmElem, "identifier");
		} else if (mmElem instanceof MMXor) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMXor) mmElem).getName());
		} else if (mmElem instanceof MMBusinessRole) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessRole) mmElem).getName());
		} else if (mmElem instanceof MMCode) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMCode) mmElem).getName());
		} else if (mmElem instanceof MMConstraint ) {
			
		}

		String pkg;
		String cuName;

		// CU name
		if (mmElem instanceof MMRepositoryConcept) {
			cuName = (((MMRepositoryConcept) mmElem).getName()).toString();
		} else {
			cuName = null;
		}

		// Package
		if( mmElem instanceof MMConstraint ) {
			MMConstraint mmConstr = (MMConstraint) mmElem;
			StructuredName mainTypeName = StructuredName.primaryType(basePackageName + ".constraints", RoasterHelper.convertToJavaName("Constraint" + mmConstr.getName()));
			StructuredName containername = getStructuredName( mmElem.getContainer() );			
			StructuredName memberName = StructuredName.member(mainTypeName, "for" + containername.getSimpleName());
			return memberName;
		} else if (mmElem instanceof MMMessageDefinition) {
			MMMessageDefinition msgDef = (MMMessageDefinition) mmElem;
			String areaCode = msgDef.getBusinessArea() == null ? "other"
					: msgDef.getBusinessArea().getCode() == null ? "other" : msgDef.getBusinessArea().getCode();
			pkg = "area." + areaCode;
		} else if (mmElem instanceof MMTopLevelCatalogueEntry) {
			if (mmElem instanceof MMMessageSet) {
				pkg = "msgset";
			} else if (mmElem instanceof MMBusinessArea) {
				pkg = "area";
			} else {
				pkg = "other";
			}
		} else if (mmElem instanceof MMTopLevelDictionaryEntry) {
			if (mmElem instanceof MMCodeSet) {
				pkg = "codeset";
			} else if (mmElem instanceof MMDataType) {
				pkg = "datatype";
			} else if (mmElem instanceof MMBusinessComponent) {
				pkg = "entity";
			} else if (mmElem instanceof MMMessageComponent) {
				pkg = "msg";
			} else if (mmElem instanceof MMChoiceComponent) {
				pkg = "choice";
			} else {
				pkg = "other";
			}
		} else {
			return null;
		}
		pkg = basePackageName + "." + pkg;

		if (cuName == null) {
			return null;
		}

		cuName = RoasterHelper.convertToJavaName(cuName);

		if (mmElem instanceof MMBusinessArea) {
			if (cuName.endsWith("master"))
				cuName = cuName.substring(0, cuName.length() - "master".length());
			if (cuName.endsWith("version"))
				cuName = cuName.substring(0, cuName.length() - "version".length()) + "Version";
		}

		return StructuredName.primaryType(pkg, cuName);
	}

	protected AttrResult defaultAttribute(TypeResult gen, MetamodelAttribute<?, ?> mmAttr, Object value) {
		if (value == null)
			return null;

		AttrValue attrValue;
		if (value instanceof List && mmAttr.isMultiple()) {
			List<?> listValue = (List<?>) value;
			if (listValue.isEmpty())
				return null;
			attrValue = basicValueAsString(gen, listValue);
		} else if (value instanceof Optional && mmAttr.isOptional()) {
			Optional<?> optValue = (Optional<?>) value;
			if (!optValue.isPresent())
				return null;
			attrValue = basicValueAsString(gen, optValue.get());
		} else if (!(mmAttr.isMultiple() || mmAttr.isOptional())) {
			attrValue = basicValueAsString(gen, value);
		} else {
			throw new IllegalArgumentException("Invalid attr with value. " + mmAttr + " = " + value);
		}

		// TODO: remove this
		if (attrValue == null)
			return null;

		AttrResult attrGen = gen.createAttrResult(mmAttr);
		if (mmAttr.getReferencedType() != null) {
			attrGen.initializationSource = mmAttr.getName() + "_lazy = () -> " + attrValue.valueAsSource + ";";
		} else {
			attrGen.initializationSource = mmAttr.getName() + " = " + attrValue.valueAsSource + ";";
		}
		attrGen.valueAsJavaDoc = attrValue.valueAsJavaDoc;
		return attrGen;
	}

	protected <T> AttrValue basicValueAsString(TypeResult containerGen, Object attrValue) {
		AttrValue ret = new AttrValue();

		if (attrValue instanceof Number || attrValue instanceof Boolean) {
			ret.valueAsSource = attrValue.toString();
			ret.valueAsSource = attrValue.toString();
		} else if (attrValue instanceof Date) {
			String dateAsString = DateFormat.getDateInstance(DateFormat.LONG).format((Date) attrValue);
			ret.valueAsSource = "((" + Supplier.class.getName() + "<" + Date.class.getName()
					+ ">) ( () -> { try {\n return ";
			ret.valueAsSource += DateFormat.class.getName() + ".getDateInstance(" + DateFormat.class.getName()
					+ ".LONG).parse(\"" + dateAsString + "\");";
			ret.valueAsSource += "\n} catch ( Exception e ) { throw new RuntimeException( e) ; }})).get()";
			ret.valueAsJavaDoc = dateAsString;
		} else if (attrValue instanceof CharSequence) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < ((CharSequence) attrValue).length(); i++) {
				char ch = ((CharSequence) attrValue).charAt(i);
				if (ch == '"' || ch == '\\')
					sb.append('\\').append(ch);
				else if (ch == '\n')
					sb.append('\\').append('n');
				else if (ch == '\r')
					sb.append('\\').append('r');
				else if (ch == '\t')
					sb.append('\\').append('t');
				else
					sb.append(ch);
			}
			ret.valueAsSource = "\"" + sb.toString() + "\"";
			// Replace <, >, & chars
			ret.valueAsJavaDoc = RoasterHelper.escapeJavaDoc( ret.valueAsSource );
		} else if (attrValue instanceof Enum) {
			ret.valueAsSource = attrValue.getClass().getName() + "." + attrValue.toString();
			ret.valueAsJavaDoc = attrValue.getClass().getName() + "." + attrValue.toString();
		} else if (attrValue instanceof MMCode ) {
			GeneratedMetamodelBean refmmBean = (GeneratedMetamodelBean) attrValue;
			StructuredName refName = getStructuredName(refmmBean);
			ret.valueAsSource = refName.getPackage() + "." + refName.getCompilationUnit() + "."
					+ refName.getMemberName();
			ret.valueAsJavaDoc = "{@linkplain ";
			ret.valueAsJavaDoc += refName.getPackage() + "." + refName.getCompilationUnit() + "#"
					+ refName.getMemberName();
			ret.valueAsJavaDoc += " " + refName.getCompilationUnit() + "." + refName.getMemberName() + "}";
		} else if (attrValue instanceof GeneratedMetamodelBean ) {
			GeneratedMetamodelBean refmmBean = (GeneratedMetamodelBean) attrValue;					
			StructuredName refName = getStructuredName(refmmBean);
			if (refName.isCompilationUnit()) {
				ret.valueAsSource = refName.getFullName() + ".mmObject()";
				ret.valueAsJavaDoc = "{@linkplain " + refName.getFullName() + " " + refName.getCompilationUnit() + "}";
			} else if (refName.isMember() ) {
				String memberName;
				if( refmmBean instanceof MMBusinessAssociationEnd 
						|| refmmBean instanceof MMBusinessAttribute 
						|| refmmBean instanceof MMMessageBuildingBlock 
						|| refmmBean instanceof MMMessageAssociationEnd 
						|| refmmBean instanceof MMMessageAttribute 
				) {
					memberName = "mm" + refName.getMemberName();
				} else {
					memberName = refName.getMemberName();
				}
				
				ret.valueAsSource = refName.getPackage() + "." + refName.getCompilationUnit() + "." + memberName;
				ret.valueAsJavaDoc = "{@linkplain ";
				ret.valueAsJavaDoc += refName.getPackage() + "." + refName.getCompilationUnit() + "#" + memberName;
				ret.valueAsJavaDoc += " " + refName.getCompilationUnit() + "." + memberName + "}";
			} else {
				throw new IllegalArgumentException("Invalid refName: " + refName);
			}
		} else if (attrValue instanceof List && ((List<?>) attrValue).size() <= USE_LIST_BUILDER_ABOVE) {
			StringJoiner srcJoin = new StringJoiner(",\n", Arrays.class.getName() + ".asList(", ")");
			StringJoiner docJoin = new StringJoiner("\r\n", "<ul>\r\n", "</ul>\r\n");
			for (Object elem : (List<?>) attrValue) {
				AttrValue elemRet = basicValueAsString(containerGen, elem);
				srcJoin.add(elemRet.valueAsSource);
				docJoin.add("<li>" + elemRet.valueAsJavaDoc + "</li>");
			}
			ret.valueAsSource = srcJoin.toString();
			ret.valueAsJavaDoc = docJoin.toString();
		} else if (attrValue instanceof List && ((List<?>) attrValue).size() > USE_LIST_BUILDER_ABOVE) {
			StructuredName listBuilderName = createLongListBuilder(containerGen, (List<?>) attrValue);
			ret.valueAsSource = listBuilderName.getFullName() + ".addElems(new " + ArrayList.class.getName() + "<>())";
			ret.valueAsJavaDoc = "List of " + ((List<?>) attrValue).size() + " elements";
		} else {
			throw new IllegalArgumentException("Unsupported value type: " + attrValue.getClass());
		}

		return ret;
	}

	protected static class AttrValue {
		public String valueAsSource;
		public String valueAsJavaDoc;
	}

	protected MainTypeResult defaultMainType(GeneratedMetamodelBean mmBean) {
		StructuredName name = getStructuredName(mmBean);
		MainTypeResult gen = new MainTypeResult(ctx, mmBean, name);
		gen.src = ctx.createSourceFile(JavaClassSource.class, name);
		createJavaDoc(gen.src, mmBean);

		// private final static AtomicReference<MMBusinessComponent> mmObject_lazy = new
		// AtomicReference<>();
		{
			FieldSource<JavaClassSource> field = gen.src.addField().setName("mmObject_lazy");
			field.setFinal(true).setStatic(true).setPrivate();
			field.setType(AtomicReference.class.getName() + "<" + mmBean.getMetamodel().getBeanClass().getName() + ">");
			field.setLiteralInitializer(" new " + AtomicReference.class.getName() + "<>();");
		}

		{
			gen.mmObjectMethod = gen.src.addMethod().setName("mmObject");
			gen.mmObjectMethod.setFinal(true).setStatic(true).setPublic();
			gen.mmObjectMethod.setReturnType(mmBean.getMetamodel().getBeanClass().getName());
		}
		
		return gen;
	}

	protected JaxbMainTypeResult defaultJaxbMainType(MMRepositoryConcept mmBean) {
		StructuredName name = getStructuredName(mmBean);
		JaxbMainTypeResult gen = new JaxbMainTypeResult(ctx, mmBean, name);
		gen.src = ctx.createSourceFile(JavaClassSource.class, name);
		createJavaDoc(gen.src, mmBean);

		// private final static AtomicReference<MMBusinessComponent> mmObject_lazy = new
		// AtomicReference<>();
		{
			FieldSource<JavaClassSource> field = gen.src.addField().setName("mmObject_lazy");
			field.setFinal(true).setStatic(true).setPrivate();
			field.setType(AtomicReference.class.getName() + "<" + mmBean.getMetamodel().getBeanClass().getName() + ">");
			field.setLiteralInitializer(" new " + AtomicReference.class.getName() + "<>();");
		}

		{
			gen.mmObjectMethod = gen.src.addMethod().setName("mmObject");
			gen.mmObjectMethod.setFinal(true).setStatic(true).setPublic();
			gen.mmObjectMethod.setReturnType(mmBean.getMetamodel().getBeanClass().getName());
		}
		
		return gen;
	}

	protected DataTypeResult defaultDataType(MMDataType mmBean) {
		StructuredName name = getStructuredName(mmBean);
		DataTypeResult gen = new DataTypeResult(ctx, mmBean, name);
		gen.src = ctx.createSourceFile(JavaClassSource.class, name);
		createJavaDoc(gen.src, mmBean);

		// private final static AtomicReference<MMBusinessComponent> mmObject_lazy = new
		// AtomicReference<>();
		{
			FieldSource<JavaClassSource> field = gen.src.addField().setName("mmObject_lazy");
			field.setFinal(true).setStatic(true).setPrivate();
			field.setType(AtomicReference.class.getName() + "<" + mmBean.getMetamodel().getBeanClass().getName() + ">");
			field.setLiteralInitializer(" new " + AtomicReference.class.getName() + "<>();");
		}

		{
			gen.mmObjectMethod = gen.src.addMethod().setName("mmObject");
			gen.mmObjectMethod.setFinal(true).setStatic(true).setPublic();
			gen.mmObjectMethod.setReturnType(mmBean.getMetamodel().getBeanClass().getName());
		}
		
		Class<?> javaType = getMMDataTypeBaseType(mmBean);
		if( javaType != null ) {
			FieldSource<JavaClassSource> valueField = gen.src.addField();
			valueField.setName("value").setProtected();
			valueField.setType(javaType);
			
			MethodSource<JavaClassSource> constr = gen.src.addMethod();
			constr.setConstructor(true).setPublic();
			constr.addParameter(javaType, "value");
			constr.setBody("this.value = value;");
			
			MethodSource<JavaClassSource> getter = gen.src.addMethod().setPublic();
			getter.setName("to" + javaType.getSimpleName() );
			getter.setReturnType(javaType);
			getter.setBody("return value;");
			if( "toString".equals( getter.getName()) ) {
				getter.addAnnotation(Override.class);
			}
			
			JavaClassSource xmlAdapter = gen.src.addNestedType(JavaClassSource.class);
			xmlAdapter.setName("InternalXmlAdapter");
			xmlAdapter.setProtected().setStatic(true);
			xmlAdapter.setSuperType(XmlAdapter.class.getName() + "<" + javaType.getName() + ", " + gen.src.getName() + ">");
			
			MethodSource<JavaClassSource> unmarshal = xmlAdapter.addMethod().setName("unmarshal");
			unmarshal.setPublic().addAnnotation(Override.class);
			unmarshal.setReturnType(gen.src);
			//unmarshall.addParameter(gen.src, "value");
			unmarshal.addParameter(javaType, "value");
			unmarshal.setBody("return new " + gen.src.getName() + "( value );");

			MethodSource<JavaClassSource> marshal = xmlAdapter.addMethod().setName("marshal");
			marshal.setPublic().addAnnotation(Override.class);
			marshal.setReturnType(javaType);
			marshal.addParameter(gen.src.getName(), "typedData");
			marshal.setBody("return typedData.value;");
			
			AnnotationSource<JavaClassSource> jaxbAnnot = gen.src.addAnnotation(XmlJavaTypeAdapter.class);
			jaxbAnnot.setLiteralValue("value", gen.src.getQualifiedName() + ".InternalXmlAdapter.class");
		}
		
		return gen;
	}

	protected EnumTypeResult defaultEnumType(MMCodeSet mmBean) {
		StructuredName name = getStructuredName(mmBean);
		EnumTypeResult gen = new EnumTypeResult(ctx, mmBean, name);
		
		gen.src = ctx.createSourceFile(JavaClassSource.class, name);
		createJavaDoc(gen.src, mmBean);
		
		gen.src.extendSuperType(MMCode.class);
		MethodSource<JavaClassSource> privConstructor = gen.src.addMethod();
		privConstructor.setConstructor(true);
		privConstructor.setProtected();
		privConstructor.setBody("");

		// private final static AtomicReference<MMBusinessComponent> mmObject_lazy = new
		// AtomicReference<>();
		{
			FieldSource<JavaClassSource> field = gen.src.addField().setName("mmObject_lazy");
			field.setFinal(true).setStatic(true).setPrivate();
			field.setType(AtomicReference.class.getName() + "<" + mmBean.getMetamodel().getBeanClass().getName() + ">");
			field.setLiteralInitializer(" new " + AtomicReference.class.getName() + "<>();");
		}

		{
			gen.mmObjectMethod = gen.src.addMethod().setName("mmObject");
			gen.mmObjectMethod.setFinal(true).setStatic(true).setPublic();
			gen.mmObjectMethod.setReturnType(mmBean.getMetamodel().getBeanClass().getName());
		}
		
		return gen;
	}

	protected EnumConstantResult defaultEnumConstant(MMCode mmBean, EnumTypeResult containerGen) {
		StructuredName name = getStructuredName(mmBean);
		EnumConstantResult gen = containerGen.addConstant(mmBean, name);
		
		{
			gen.staticFieldSrc = containerGen.src.addField().setName( name.getMemberName());
			gen.staticFieldSrc.setPublic().setStatic(true).setFinal(true);
			gen.staticFieldSrc.setType( containerGen.src);
			createJavaDoc(gen.staticFieldSrc, mmBean);
		}
		return gen;
	}

	protected StaticFieldResult defaultStaticFieldResult(GeneratedMetamodelBean mmBean, MainTypeResult containerGen) {
		StructuredName name = getStructuredName(mmBean);
		StaticFieldResult gen = new StaticFieldResult(containerGen, mmBean, name);
		{
			gen.staticFieldSrc = containerGen.src.addField().setName( name.getMemberName());
			gen.staticFieldSrc.setPublic().setStatic(true).setFinal(true);
			gen.staticFieldSrc.setType(mmBean.getMetamodel().getBeanClass());
			createJavaDoc(gen.staticFieldSrc, mmBean);
		}
		return gen;
	}

	protected MMRepositoryConcept getPropertyType(MMConstruct mmBean) {
		if (mmBean instanceof MMMessageBuildingBlock) {
			return ((MMMessageBuildingBlock<?,?>) mmBean).getXmlMemberType();
		} else if (mmBean instanceof MMBusinessAttribute) {
			if (((MMBusinessAttribute<?,?>) mmBean).getSimpleType().isPresent()) {
				return ((MMBusinessAttribute<?,?>) mmBean).getSimpleType().get();
			} else if (((MMBusinessAttribute<?,?>) mmBean).getComplexType().isPresent()) {
				return ((MMBusinessAttribute<?,?>) mmBean).getComplexType().get();
			} else {
				throw new IllegalArgumentException("Unsupported bean instance : " + mmBean);
			}
		} else if (mmBean instanceof MMMessageAttribute) {
			if (((MMMessageAttribute<?,?>) mmBean).getSimpleType().isPresent()) {
				return ((MMMessageAttribute<?,?>) mmBean).getSimpleType().get();
			} else if (((MMMessageAttribute<?,?>) mmBean).getComplexType().isPresent()) {
				return ((MMMessageAttribute<?,?>) mmBean).getComplexType().get();
			} else {
				throw new IllegalArgumentException("Unsupported bean instance : " + mmBean);
			}
		} else if (mmBean instanceof MMBusinessAssociationEnd) {
			return ((MMBusinessAssociationEnd<?,?>) mmBean).getType();
		} else if (mmBean instanceof MMMessageAssociationEnd) {
			return ((MMMessageAssociationEnd<?,?>) mmBean).getType();
		} else {
			throw new IllegalArgumentException("Unsupported bean type: " + mmBean.getClass());
		}
	}
	
	
	protected PropertyResult defaultPropertyResult(MMConstruct mmBean, MainTypeResult containerGen) {
		StructuredName name = getStructuredName(mmBean);

		// TODO: support optionals 
		PropertyResult gen = containerGen.addProperty( mmBean, name);
		return gen;
	}

	protected JaxbPropertyResult defaultJaxbPropertyResult(MMMessageConstruct mmBean, JaxbMainTypeResult containerGen) {
		StructuredName name = getStructuredName(mmBean);
		JaxbPropertyResult gen = containerGen.addProperty( mmBean, name);
		return gen;
	}

	protected void createJavaDoc(JavaDocCapableSource<?> javaDocHolder, GeneratedMetamodelBean repoObj) {
		if (ctx.isSkipDocGeneration())
			return;
		String docTxt;
		if (repoObj instanceof MMRepositoryConcept) {
			MMRepositoryConcept mmRC = (MMRepositoryConcept) repoObj;
			docTxt = mmRC.getDefinition().orElse("(No doc)");
		} else {
			docTxt = "An instance of " + repoObj.getMetamodel().getName() + ".";
		}
		// Replace <, >, & chars
		docTxt = RoasterHelper.escapeJavaDoc(docTxt);
		docTxt = docTxt.replaceAll("Scope<br>", "<b>Scope</b><br>");
		docTxt = docTxt.replaceAll("Usage<br>", "<b>Usage</b><br>");
		javaDocHolder.getJavaDoc().setText(docTxt);
	}

	protected StructuredName createLongListBuilder(TypeResult gen, List<?> elems) {

		StructuredName firstBuilderName = null;

		for (int seq = 0; seq * USE_LIST_BUILDER_ABOVE < elems.size(); seq++) {
			StructuredName javaName = StructuredName.primaryType(gen.baseName.getPackage(),
					"ListBuilderFor" + gen.baseName.getCompilationUnit() + "_" + (seq < 10 ? "0" : "") + seq);
			JavaClassSource src = ctx.createSourceFile(JavaClassSource.class, javaName);
			src.setVisibility(Visibility.PACKAGE_PRIVATE);
			src.addImport(List.class);

			StringBuilder sb = new StringBuilder();
			sb.append("  @SuppressWarnings(\"unchecked\")\n");
			sb.append("  static <T> List<T> addElems(List<T> list) {\n");
			for (int i = 0; i < USE_LIST_BUILDER_ABOVE; i++) {
				if ((seq * USE_LIST_BUILDER_ABOVE) + i >= elems.size())
					break;
				Object elem = elems.get((seq * USE_LIST_BUILDER_ABOVE) + i);
				AttrValue valueAsSrc = basicValueAsString(gen, elem);
				sb.append("    list.add( (T) " + valueAsSrc.valueAsSource + ");\n");
			}

			if ((seq + 1) * USE_LIST_BUILDER_ABOVE < elems.size()) {
				// Add next ListBuilder
				sb.append("    ListBuilderFor" + gen.baseName.getCompilationUnit() + "_" + ((seq + 1) < 10 ? "0" : "")
						+ (seq + 1) + ".addElems(list);\n");
			}
			sb.append("    return list;\n");
			sb.append("  }\n");

			src.addMethod(sb.toString());
			ctx.saveSourceFile(src);
			if (firstBuilderName == null)
				firstBuilderName = javaName;
		}

		return firstBuilderName;
	}
	
	Class<?> getMMDataTypeBaseType(MMDataType mmDt ) {
		Set<?> st = mmDt.getMetamodel().getSuperTypes(true, true);
		if( st.contains(MMString.metaType()) ) {
			return String.class;
		} else if ( st.contains(MMDecimal.metaType() ) ) {
			return BigDecimal.class;
		} else {
			return null;
		}
	}

}
