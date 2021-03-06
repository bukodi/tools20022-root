package com.tools20022.repogenerator;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.jboss.forge.roaster.model.Visibility;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaDocCapableSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.repo.LazyReference;
import com.tools20022.generators.AbstractGenerator;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMAbstractDateTimeConcept;
import com.tools20022.metamodel.MMAmount;
import com.tools20022.metamodel.MMBoolean;
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
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
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

public abstract class BaseRepoGenerator extends AbstractGenerator<RawRepository, MMModelEntity> {

	int USE_LIST_BUILDER_ABOVE = 500;

	/*** Customizable options ***/
	protected String basePackageName = "com.tools20022.repository";
	protected String mainClassSimpleName = "GeneratedRepository";

	/*** Set in {@link #accept(RawRepository, GenerationContext)} ***/
	protected RawRepository repo;

	public BaseRepoGenerator(GenerationContext<RawRepository, MMModelEntity> ctx) {
		super(ctx);
	}

	@Override
	public StructuredName getStructuredName(MMModelEntity mmElem) {
		StructuredName name = _getStructuredName(mmElem);
		return name;
	}

	private StructuredName _getStructuredName(MMModelEntity mmElem) {

		BiFunction<MMModelEntity, String, StructuredName> createJavaNameAsMemeber = (parentElem,
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
			MMCode mmCode = (MMCode) mmElem;
			String codeName; //
			if( mmCode.getCodeName().isPresent() ) {
				codeName = mmCode.getCodeName().get();
			} else if( mmCode.getOwner().getTrace().isPresent() ){
				// No codename, but trace codeset exists
				// So lookup a code in the trace with same name
				String name = mmCode.getName();
				Stream<MMCode> codesInTrace = mmCode.getOwner().getTrace().get().getCodes().stream();
				Optional<MMCode> optTraceCode = codesInTrace.filter( tc-> name.equals( tc.getName()) ).findAny();
				if( optTraceCode.isPresent() ) {
					codeName = optTraceCode.get().getCodeName().get();
				} else {
					System.err.println( "Trace codeset present, but no matching code with name: " + name );
					codeName = "ZZZZ";
				}
			} else {
				System.err.println( "No codeName and and no trace codeset: " + mmCode );
				codeName = "YYYY";				
			}
			
			if( ! Character.isJavaIdentifierStart( codeName.charAt(0)) ) {
				codeName = "_" + codeName;
			}
			codeName += "_" + mmCode.getName();
			return createJavaNameAsMemeber.apply(mmElem, "" + codeName);
		} else if (mmElem instanceof MMConstraint) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMConstraint) mmElem).getName());
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
//		if (mmElem instanceof MMConstraint) {
//			MMConstraint<?> mmConstr = (MMConstraint<?>) mmElem;
//			StructuredName mainTypeName = StructuredName.primaryType(basePackageName + ".constraint",
//					RoasterHelper.convertToJavaName("Constraint" + mmConstr.getName()));
//			MMRepositoryConcept owner = mmConstr.getOwner();			
//			StructuredName containername = getStructuredName(owner);
//			String membernamebase = containername.getCompilationUnit();
//			if( containername.isMember() ) {
//				membernamebase += "_" + containername.getMemberName();
//			}
//			if(owner instanceof MMMessageDefinition ) {
//				MMBusinessArea area = ((MMMessageDefinition)owner).getBusinessArea();				
//				String areaCode = area.getCode();
//				if( areaCode == null )
//					areaCode = area.getName();
//				membernamebase = "_" + areaCode + "_" + membernamebase;
//			}
//			StructuredName memberFullName = StructuredName.member(mainTypeName, "for" + membernamebase);
//			return memberFullName;
//		}  
		
		if (mmElem instanceof MMMessageDefinition) {
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
				pkg = "msgpart";
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
			attrGen.initializationSource = mmAttr.getName() + "_lazy = " + LazyReference.class.getName() + ".create( () -> " + attrValue.valueAsSource + ");";
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
			ret.valueAsJavaDoc = RoasterHelper.escapeJavaDoc(ret.valueAsSource);
		} else if (attrValue instanceof Enum) {
			ret.valueAsSource = attrValue.getClass().getName() + "." + attrValue.toString();
			ret.valueAsJavaDoc = attrValue.getClass().getName() + "." + attrValue.toString();
		} else if (attrValue instanceof MMCode) {
			MMModelEntity refmmBean = (MMModelEntity) attrValue;
			StructuredName refName = getStructuredName(refmmBean);
			ret.valueAsSource = refName.getPackage() + "." + refName.getCompilationUnit() + "."
					+ refName.getMemberName();
			ret.valueAsJavaDoc = "{@linkplain ";
			ret.valueAsJavaDoc += refName.getPackage() + "." + refName.getCompilationUnit() + "#"
					+ refName.getMemberName();
			ret.valueAsJavaDoc += " " + refName.getCompilationUnit() + "." + refName.getMemberName() + "}";
		} else if (attrValue instanceof MMModelEntity) {
			MMModelEntity refmmBean = (MMModelEntity) attrValue;
			StructuredName refName = getStructuredName(refmmBean);
			if (refName.isCompilationUnit()) {
				ret.valueAsSource = refName.getFullName() + ".mmObject()";
				ret.valueAsJavaDoc = "{@linkplain " + refName.getFullName() + " " + refName.getCompilationUnit() + "}";
			} else if (refName.isMember()) {
				String memberName;
				if (refmmBean instanceof MMBusinessAssociationEnd || refmmBean instanceof MMBusinessAttribute
						|| refmmBean instanceof MMMessageBuildingBlock || refmmBean instanceof MMMessageAssociationEnd
						|| refmmBean instanceof MMMessageAttribute) {
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

	protected MainTypeResult defaultMainType(MMModelEntity mmBean) {
		MainTypeResult gen = new MainTypeResult(ctx, mmBean);

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
		JaxbMainTypeResult gen = new JaxbMainTypeResult(ctx, mmBean);

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
		DataTypeResult gen = new DataTypeResult(ctx, mmBean);

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
		if (javaType != null) {

			String ccyCodesetFQN = null;
			if (mmBean instanceof MMAmount) {
				Optional<MMDataType> optCcySet = ((MMAmount) mmBean).getCurrencyIdentifierSet();
				if (optCcySet.isPresent()) {
					ccyCodesetFQN = getStructuredName(optCcySet.get()).getFullName();
				}
			}

			if (ccyCodesetFQN != null) {
				FieldSource<JavaClassSource> amountField = gen.src.addField();
				amountField.setName("amount").setProtected();
				amountField.setType(javaType);
				amountField.addAnnotation(XmlValue.class);

				FieldSource<JavaClassSource> currencyField = gen.src.addField();
				currencyField.setName("currency").setProtected();
				currencyField.setType(ccyCodesetFQN);
				currencyField.addAnnotation(XmlAttribute.class).setStringValue("name", "ccy")
						.setLiteralValue("required", "true");

			} else {
				FieldSource<JavaClassSource> valueField = gen.src.addField();
				valueField.setName("value").setProtected();
				valueField.setType(javaType);
				valueField.addAnnotation(XmlValue.class);
			}

			// Default constructor
			MethodSource<JavaClassSource> constr = gen.src.addMethod();
			constr.setConstructor(true).setPublic();
			constr.setBody("");

			// Constructor vith value
			if (ccyCodesetFQN != null) {
				MethodSource<JavaClassSource> constr2 = gen.src.addMethod();
				constr2.setConstructor(true).setPublic();
				constr2.addParameter(javaType, "amount");
				constr2.addParameter(ccyCodesetFQN, "currency");
				constr2.setBody("this.amount = amount; this.currency = currency;");
			} else {
				MethodSource<JavaClassSource> constr2 = gen.src.addMethod();
				constr2.setConstructor(true).setPublic();
				constr2.addParameter(javaType, "value");
				constr2.setBody("this.value = value;");
			}

			// Getter
			if (ccyCodesetFQN != null) {
				MethodSource<JavaClassSource> getter = gen.src.addMethod().setPublic();
				getter.setName("getAmount");
				getter.setReturnType(javaType);
				getter.setBody("return amount;");

				MethodSource<JavaClassSource> getterCcy = gen.src.addMethod().setPublic();
				getterCcy.setName("getCurrency");
				getterCcy.setReturnType(ccyCodesetFQN);
				getterCcy.setBody("return currency;");
			} else {
				MethodSource<JavaClassSource> getter = gen.src.addMethod().setPublic();
				getter.setName("getValue");
				getter.setReturnType(javaType);
				getter.setBody("return value;");
			}

			// Setter
			if (ccyCodesetFQN != null) {
				MethodSource<JavaClassSource> setter = gen.src.addMethod().setPublic();
				setter.setName("setAmountAndCurrency");
				setter.addParameter(javaType, "amount");
				setter.addParameter(ccyCodesetFQN, "currency");
				setter.setBody("this.amount = amount; this.currency = currency;");
			} else {
				MethodSource<JavaClassSource> setter = gen.src.addMethod().setPublic();
				setter.setName("setValue");
				setter.addParameter(javaType, "value");
				setter.setBody("this.value = value;");
			}

			// toString
			MethodSource<JavaClassSource> toString = gen.src.addMethod().setPublic();
			toString.setName("toString");
			toString.setReturnType(String.class);
			toString.addAnnotation(Override.class);
			if (ccyCodesetFQN != null) {
				toString.setBody("return amount + \" \" + currency;");				
			} else {
				toString.setBody("return value == null ? null : value.toString();");								
			}


			gen.src.addAnnotation(XmlAccessorType.class).setEnumValue(XmlAccessType.NONE);
			gen.src.addAnnotation(XmlType.class);
		}

		return gen;
	}

	protected EnumTypeResult defaultEnumType(MMCodeSet mmBean) {
		EnumTypeResult gen = new EnumTypeResult(ctx, mmBean);

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
		return containerGen.addConstant(mmBean);
	}

	protected StaticFieldResult defaultStaticFieldResult(MMModelEntity mmBean, MainTypeResult containerGen) {
		return new StaticFieldResult(containerGen, mmBean);
	}

	protected MMRepositoryConcept getPropertyType(MMConstruct mmBean) {
		if (mmBean instanceof MMMessageBuildingBlock) {
			return ((MMMessageBuildingBlock<?, ?>) mmBean).getXmlMemberType();
		} else if (mmBean instanceof MMBusinessAttribute) {
			if (((MMBusinessAttribute<?, ?>) mmBean).getSimpleType().isPresent()) {
				return ((MMBusinessAttribute<?, ?>) mmBean).getSimpleType().get();
			} else if (((MMBusinessAttribute<?, ?>) mmBean).getComplexType().isPresent()) {
				return ((MMBusinessAttribute<?, ?>) mmBean).getComplexType().get();
			} else {
				throw new IllegalArgumentException("Unsupported bean instance : " + mmBean);
			}
		} else if (mmBean instanceof MMMessageAttribute) {
			if (((MMMessageAttribute<?, ?>) mmBean).getSimpleType().isPresent()) {
				return ((MMMessageAttribute<?, ?>) mmBean).getSimpleType().get();
			} else if (((MMMessageAttribute<?, ?>) mmBean).getComplexType().isPresent()) {
				return ((MMMessageAttribute<?, ?>) mmBean).getComplexType().get();
			} else {
				throw new IllegalArgumentException("Unsupported bean instance : " + mmBean);
			}
		} else if (mmBean instanceof MMBusinessAssociationEnd) {
			return ((MMBusinessAssociationEnd<?, ?>) mmBean).getType();
		} else if (mmBean instanceof MMMessageAssociationEnd) {
			return ((MMMessageAssociationEnd<?, ?>) mmBean).getType();
		} else {
			throw new IllegalArgumentException("Unsupported bean type: " + mmBean.getClass());
		}
	}

	protected PropertyResult defaultPropertyResult(MMConstruct mmBean, MainTypeResult containerGen) {
		// TODO: support optionals
		return containerGen.addProperty(mmBean);
	}

	protected JaxbPropertyResult defaultJaxbPropertyResult(MMMessageConstruct mmBean, JaxbMainTypeResult containerGen) {
		return containerGen.addProperty(mmBean);
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

	Class<?> getMMDataTypeBaseType(MMDataType mmDt) {
		Set<?> st = mmDt.getMetamodel().getSuperTypes(true, true);
		if (st.contains(MMString.metaType())) {
			return String.class;
		} else if (st.contains(MMDecimal.metaType())) {
			return BigDecimal.class;
		} else if (st.contains(MMBoolean.metaType())) {
			return Boolean.class;
		} else if (st.contains(MMAbstractDateTimeConcept.metaType())) {
			return Date.class;
		} else {
			System.out.println("" + mmDt.getName() + " base type not supported.");
			return String.class;
		}
	}

}
