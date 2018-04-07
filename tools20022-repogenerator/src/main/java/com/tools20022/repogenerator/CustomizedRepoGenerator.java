package com.tools20022.repogenerator;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelEnum;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.ProgressMonitor;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMAmount;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.repogenerator.resulttypes.AttrResult;
import com.tools20022.repogenerator.resulttypes.DataTypeResult;
import com.tools20022.repogenerator.resulttypes.EnumTypeResult;
import com.tools20022.repogenerator.resulttypes.JaxbMainTypeResult;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;
import com.tools20022.repogenerator.resulttypes.StaticFieldResult;
import com.tools20022.repogenerator.resulttypes.TypeResult;

public class CustomizedRepoGenerator extends GeneratedRepoGenerator {
	
	public CustomizedRepoGenerator(GenerationContext<RawRepository, GeneratedMetamodelBean> ctx) {
		super(ctx);
	}

	@Override
	public void prepare(RawRepository repo, ProgressMonitor monitor) {
		
	}
	
	private Map<String,List<MMConstraint<?>>> constraintsByName = new LinkedHashMap<>();

	@Override
	public void generate(RawRepository repo, ProgressMonitor monitor) {
		this.repo = repo;

		for( MetamodelEnum<?> mmEnum : repo.getMetamodel().getAllEnums() ) {
			this.ctx.addKnownTypeNames(mmEnum.getEnumJavaClass().getName());
		}
		for( MetamodelType<? extends GeneratedMetamodelBean> mmType : repo.getMetamodel().getAllTypes() ) {
			this.ctx.addKnownTypeNames(mmType.getBeanClass().getName());
		}

		// Count main types to generate
		Map<StructuredName,GeneratedMetamodelBean> mainTypes = new HashMap<>();
		{
			long start = System.currentTimeMillis();
			//AtomicInteger totalNumberOfMainTypesToGenerate = new AtomicInteger();
			repo.listContent(repo.getRootObject(), true, true).forEach(repoObj -> {
				StructuredName javaName = getStructuredName(repoObj);
				if (javaName != null && javaName.getMemberName() == null && javaName.getNestedTypeName() == null) {
					GeneratedMetamodelBean prevBean = mainTypes.put(javaName, repoObj);
					if( prevBean != null )
						throw new RuntimeException();
					this.ctx.addKnownTypeNames(javaName.getFullName());
				}
			});
			ctx.setTotalNumberOfMainTypesToGenerate(mainTypes.size());
			System.out.println("Found " + mainTypes.size()
					+ " java sources to generate. ( Calculated in " + (System.currentTimeMillis() - start) + " msec )");
		}

		// Create repo
		Map<GeneratedMetamodelBean,MainTypeResult> mainResults = new HashMap<>();
		for( GeneratedMetamodelBean mmBean : mainTypes.values() ) {
			MainTypeResult genResult = generateMainResultType(mmBean);
			mainResults.put(mmBean, genResult);
		}
		//MainTypeResult repoGen = generateMMRepository(repo.getRootObject());
		
		for( Entry<String, List<MMConstraint<?>>> e: constraintsByName.entrySet() ) {
			generateConstraintGroup(e.getValue());			
		}
	}
	
	protected void generateConstraintGroup( List<MMConstraint<?>> constraintsWithSameName ) {
		
		MMConstraint<?> first = constraintsWithSameName.get(0);
		StructuredName nameOfFirst = getStructuredName(first);
		StructuredName maintypeName = StructuredName.primaryType(nameOfFirst.getPackage(), nameOfFirst.getCompilationUnit());
		MainTypeResult genMain = new MainTypeResult(ctx, null, maintypeName) {
			{
				src = ctx.createSourceFile(JavaClassSource.class, maintypeName);
			}
			@Override
			public void flush() {
				if( ! ctx.isSkipDocGeneration()) {
					String docTxt = RoasterHelper.escapeJavaDoc(first.getDefinition().orElse("-no doc-"));
					src.getJavaDoc().setText(docTxt);
				}

				ctx.saveSourceFile(src);
			}			
		};
		
		for( MMConstraint<?> constr : constraintsWithSameName) {
			String validatorParamType;
			{
				StructuredName containerName = getStructuredName(constr.getContainer());
				if( constr.getContainer() instanceof MMConstruct ) {
					MMRepositoryType mmType = ((MMConstruct)constr.getContainer()).getMemberType();
					validatorParamType = getStructuredName(mmType).getFullName();
				} else {
					validatorParamType = containerName.getFullName();
				}				
			}

			// Generate constraint meta class		
			StaticFieldResult staticField = generateMMConstraint(genMain, constr, validatorParamType);

			{
				// Generate validator function
				String validatorBaseName = "check" + staticField.staticFieldSrc.getName().substring("for".length()); 
				MethodSource<JavaClassSource> validatorMethod = genMain.src.addMethod().setName(validatorBaseName);
				validatorMethod.setPublic().setStatic(true);
				validatorMethod.addThrows(Exception.class);
				validatorMethod.addParameter(validatorParamType, "obj");
				validatorMethod.setBody("throw new " + NotImplementedConstraintException.class.getName() + "();");
				RoasterHelper.addToJavaDoc(validatorMethod, RoasterHelper.escapeJavaDoc(constr.getDefinition().orElse("- no definition -")));				
			}
			// This is a workaround, while FieldSourceImpl.setType() automatically add an import
			genMain.src.removeImport(validatorParamType);
		}
		genMain.flush();
	}
	
	protected StaticFieldResult generateMMConstraint(MainTypeResult containerGen, MMConstraint<?> mmBean, String validatorParamType ) {
		StructuredName staticFieldName = getStructuredName(mmBean);
		StaticFieldResult gen = new StaticFieldResult(containerGen, mmBean, staticFieldName);
		gen.staticFieldSrc = containerGen.src.addField().setName( staticFieldName.getMemberName());
		gen.staticFieldSrc.setPublic().setStatic(true).setFinal(true);
		gen.staticFieldSrc.setType( MMConstraint.class.getName() + "<" + validatorParamType + ">" );
		
		String getValidatorMethodSrc = "@Override\n";
		getValidatorMethodSrc += "public void executeValidator(" +validatorParamType + " obj ) throws Exception {\n"; 
		getValidatorMethodSrc += "  check" + staticFieldName.getMemberName().substring("for".length()) + "( obj );\n"; 
		getValidatorMethodSrc += "}\n";
		
		gen.staticFieldInitializerBody = new StringJoiner("\n", "new " + MMConstraint.class.getName() + "<" + validatorParamType + ">" + "(){{", "}\n" + getValidatorMethodSrc + "};");

		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		defaultAttribute(gen, MMConstraint.ownerAttribute, mmBean.getOwner());
		defaultAttribute(gen, MMConstraint.expressionAttribute,
				mmBean.getExpression());
		defaultAttribute(gen, MMConstraint.expressionLanguageAttribute,
				mmBean.getExpressionLanguage());		
		
		gen.flush();
		return gen;
	}

	@Override
	protected MainTypeResult generateMMRepository(MMRepository mmBean) {
		StructuredName repoName = StructuredName.primaryType(basePackageName, mainClassSimpleName);
		MainTypeResult mtr = new MainTypeResult(ctx, mmBean, repoName);
		mtr.src = ctx.createSourceFile(JavaClassSource.class, repoName);
		mtr.src.setSuperType(ReflectionBasedRepository.class);
		mtr.src.addMethod().setConstructor(true).setPrivate()
				.setBody("super( " + StandardMetamodel2013.class.getName() + ".metamodel());");

		{
			FieldSource<JavaClassSource> field = mtr.src.addField().setName("mmObject_lazy");
			field.setFinal(true).setStatic(true).setPrivate();
			field.setType(AtomicReference.class.getName() + "<" + mmBean.getMetamodel().getBeanClass().getName() + ">");
			field.setLiteralInitializer(" new " + AtomicReference.class.getName() + "<>();");
		}

		{
			mtr.mmObjectMethod = mtr.src.addMethod().setName("mmObject");
			mtr.mmObjectMethod.setFinal(true).setStatic(true).setPublic();
			mtr.mmObjectMethod.setReturnType(mmBean.getMetamodel().getBeanClass().getName());
		}

		// implementMMModelEntity(gen, mmBean);
		generateMMBusinessProcessCatalogue(mtr, mmBean.getBusinessProcessCatalogue());
		generateMMDataDictionary(mtr, mmBean.getDataDictionary());
		defaultAttribute(mtr, MMRepository.businessProcessCatalogueAttribute, mmBean.getBusinessProcessCatalogue());
		defaultAttribute(mtr, MMRepository.dataDictionaryAttribute, mmBean.getDataDictionary());
		mtr.flush();
		return mtr;
	}

	@Override
	protected EnumTypeResult generateMMCodeSet(MMCodeSet mmBean) {
		return super.generateMMCodeSet(mmBean);
	}

	private void collectDontModifyImports(MMCodeSet mmBean, List<String> dontModifyImports) {
		List<MMCode> mmFields = mmBean.getCode();
		for (MMCode mmField : mmFields) {
			StructuredName fieldName = getStructuredName(mmField);
			if (fieldName == null || fieldName.getMemberName() == null)
				continue;
			dontModifyImports.add("*." + fieldName.getMemberName());
		}
		mmBean.getTrace().ifPresent(mmST -> {
			collectDontModifyImports(mmST, dontModifyImports);
		});
	}

	
	
	@Override
	protected MainTypeResult generateMMBusinessComponent(MMBusinessComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		gen.mmObjectMethod.setFinal(false);
		mmBean.getSuperType().ifPresent(mmST -> {
			StructuredName stName = getStructuredName(mmST);
			gen.src.setSuperType(stName.getFullName());
			collectDontModifyImports(mmBean, gen.dontModifyImports);
		});

		if (!ctx.isSkipDocGeneration()) {
			String plantUmlSource = (new ClassDiagramGenerator(mmBean, false)).getPlantUmlSource();
			ctx.createPlantUmlImage(gen.baseName, plantUmlSource);

			String diagramJavaDoc = "<p>\r\n";
			diagramJavaDoc += "<strong>Class diagram</strong>\r\n";
			diagramJavaDoc += "<p>\r\n";
			diagramJavaDoc += "<embed name=\"" + mmBean.getName() + "\" src=\"doc-files/"
					+ gen.baseName.getCompilationUnit() + ".svg\">\r\n";
			RoasterHelper.addToJavaDoc(gen.src, diagramJavaDoc);
		}

		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		for (MMBusinessElement mmChild : mmBean.getElement()) {
			generateMMBusinessElement(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessComponent.associationDomainAttribute, mmBean.getAssociationDomain());
		defaultAttribute(gen, MMBusinessComponent.derivationElementAttribute, mmBean.getDerivationElement());
		defaultAttribute(gen, MMBusinessComponent.subTypeAttribute, mmBean.getSubType());
		defaultAttribute(gen, MMBusinessComponent.superTypeAttribute, mmBean.getSuperType());
		defaultAttribute(gen, MMBusinessComponent.elementAttribute, mmBean.getElement());
		defaultAttribute(gen, MMBusinessComponent.derivationComponentAttribute, mmBean.getDerivationComponent());
		gen.flush();
		return gen;
	}

	private void collectDontModifyImports(MMBusinessComponent mmBean, List<String> dontModifyImports) {
		List<MMBusinessElement> mmFields = mmBean.getElement();
		for (MMBusinessElement mmField : mmFields) {
			StructuredName fieldName = getStructuredName(mmField);
			if (fieldName == null || fieldName.getMemberName() == null)
				continue;
			dontModifyImports.add("*." + fieldName.getMemberName());
		}
		mmBean.getSuperType().ifPresent(mmST -> {
			collectDontModifyImports(mmST, dontModifyImports);
		});
	}

	
	@Override
	protected JaxbMainTypeResult generateMMMessageDefinition(MMMessageDefinition mmBean) {
		JaxbMainTypeResult gen = defaultJaxbMainType(mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		
		for (MMXor mmChild : mmBean.getXors()) {
			generateMMXorInMessageDefinition(gen, mmChild);
		}
		for (MMMessageBuildingBlock mmChild : mmBean.getMessageBuildingBlock()) {
			generateMMMessageBuildingBlock(gen, mmChild);
		}
		defaultAttribute(gen, MMMessageDefinition.messageSetAttribute,
				mmBean.getMessageSet());
		defaultAttribute(gen, MMMessageDefinition.xorsAttribute, mmBean.getXors());
		defaultAttribute(gen, MMMessageDefinition.rootElementAttribute,
				mmBean.getRootElement());
		defaultAttribute(gen, MMMessageDefinition.choreographyAttribute,
				mmBean.getChoreography());
		defaultAttribute(gen, MMMessageDefinition.xmlTagAttribute, mmBean.getXmlTag());
		defaultAttribute(gen, MMMessageDefinition.traceAttribute, mmBean.getTrace());
		defaultAttribute(gen, MMMessageDefinition.derivationAttribute,
				mmBean.getDerivation());
		defaultAttribute(gen, MMMessageDefinition.businessAreaAttribute,
				mmBean.getBusinessArea());
		defaultAttribute(gen, MMMessageDefinition.xmlNameAttribute, mmBean.getXmlName());
		defaultAttribute(gen, MMMessageDefinition.messageBuildingBlockAttribute,
				mmBean.getMessageBuildingBlock());

		{
			
			// Create this block:
			
//			messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
//				{
//					businessArea = "camt";
//					messageFunctionality = "030";
//					version = "04";
//					flavour = "001";
//				}
//			};

			MMMessageDefinitionIdentifier mmMsgId = mmBean.getMessageDefinitionIdentifier();
			AttrResult attrGen = gen.createAttrResult(MMMessageDefinition.messageDefinitionIdentifierAttribute);
			attrGen.initializationSource = "messageDefinitionIdentifier_lazy = () -> new " + MMMessageDefinitionIdentifier.class.getName() + "() {{";			
			attrGen.initializationSource += "businessArea = \""+ mmMsgId.getBusinessArea()+"\";"; 
			attrGen.initializationSource += "messageFunctionality = \""+ mmMsgId.getMessageFunctionality()+"\";"; 
			attrGen.initializationSource += "version = \""+ mmMsgId.getVersion()+"\";"; 
			attrGen.initializationSource += "flavour = \""+ mmMsgId.getFlavour()+"\";"; 
			attrGen.initializationSource += "}};"; 
			attrGen.valueAsJavaDoc = mmMsgId.getBusinessArea() + "." + mmMsgId.getMessageFunctionality()+ "." + mmMsgId.getFlavour() + "." + mmMsgId.getVersion() ;
			attrGen.valueAsJavaDoc = "{@code " + attrGen.valueAsJavaDoc + "}";
		}
		
		{ // Add Document inner class
			JavaClassSource docSrc = gen.src.addNestedType(JavaClassSource.class);
			docSrc.setName("Document");
			docSrc.setPublic().setStatic(true);
			MMMessageDefinitionIdentifier mmMsgId = mmBean.getMessageDefinitionIdentifier();
			String ns = "urn:iso:std:iso:20022:tech:xsd:";
			ns+= mmMsgId.getBusinessArea() + "." + mmMsgId.getMessageFunctionality();
			ns+= "." + mmMsgId.getFlavour() + "." + mmMsgId.getVersion();
			AnnotationSource<JavaClassSource> jaxbAnnot = docSrc.addAnnotation(XmlRootElement.class);
			jaxbAnnot.setStringValue("name", mmBean.getRootElement());
			jaxbAnnot.setStringValue("namespace", ns);			
			
			docSrc.setPublic().setStatic(true);
			
			FieldSource<JavaClassSource> msgField = docSrc.addField();
			msgField.setName("messageBody");
			msgField.addAnnotation(XmlElement.class).setStringValue("name", mmBean.getXmlTag().get()).setLiteralValue("required", "true");
			msgField.setType(gen.src);
			msgField.setPublic();
		}
		
		gen.flush();
		return gen;
	}
	
	@Override
	protected void implementMMRepositoryConcept(TypeResult gen, MMRepositoryConcept mmBean) {
		// defaultMultivalueAttribute(gen, MMRepositoryConcept_.semanticMarkup,
		
		for( MMConstraint mmConstr: mmBean.getConstraint() ) {
			constraintsByName.computeIfAbsent(mmConstr.getName(), x->new ArrayList<>()).add(mmConstr);
		}
		
		defaultAttribute(gen, MMRepositoryConcept.constraintAttribute,
				mmBean.getConstraint());

		List<MMSemanticMarkup> validMarkups = new ArrayList<>();
		for(MMSemanticMarkup sm :  mmBean.getSemanticMarkup() ) {
			if( ! sm.getElements().isEmpty() )
				validMarkups.add(sm);
		}
		
		if( ! validMarkups.isEmpty() ) {
			AttrResult attrGen = gen.createAttrResult( MMRepositoryConcept.semanticMarkupAttribute );
			StringJoiner sjInit = new StringJoiner(", ");
			StringJoiner sjJavadoc = new StringJoiner(", ");
			loop_on_markups: for( MMSemanticMarkup sm: validMarkups ) {
				if( "Synonym".equals( sm.getType().orElse("") ) ) {
					String context = null;
					String value = null;
					for( MMSemanticMarkupElement elem : sm.getElements() ) {
						if( "context".equals( elem.getName().orElse("") ) )
							context = elem.getValue().orElse(null);
						if( "value".equals( elem.getName().orElse("") ) || "name".equals( elem.getName().orElse("") ) )
							value = elem.getValue().orElse(null);
					}
					if( context != null && context.contains("150") ) {
						sjInit.add( "new " + ISO15022Synonym.class.getName() + "( this, \"" + value.replace("\"", "\\\"") + "\")");
						sjJavadoc.add( ISO15022Synonym.class.getSimpleName()+ ": " + value );
						continue loop_on_markups;
					} 
					if( context != null && context.toUpperCase().contains("FIX") ) {
						sjInit.add( "new " + FIXSynonym.class.getName() + "( this, \"" + value.replace("\"", "\\\"") + "\")");
						sjJavadoc.add( FIXSynonym.class.getSimpleName()+ ": " + value );
						continue loop_on_markups;
					} 
					if( context != null && context.contains("DTCC") ) {
						sjInit.add( "new " + DTCCSynonym.class.getName() + "( this, \"" + value.replace("\"", "\\\"") + "\")");
						sjJavadoc.add( DTCCSynonym.class.getSimpleName()+ ": " + value );
						continue loop_on_markups;
					} 
				}
				
				{ // Create OtherSemanticMarkup
					String javadoc  = "type=" + sm.getType().orElse("") + ", ";
					String init = "new " + OtherSemanticMarkup.class.getName() + "( this, ";
					init += "\"" + sm.getType().orElse("") + "\", ";
					StringJoiner sji = new StringJoiner(", ");
					StringJoiner sjd = new StringJoiner(", ");
					for( MMSemanticMarkupElement elem :  sm.getElements() ) {
						sji.add( "new String[]{\"" + RoasterHelper.escapeSourceString(elem.getName().orElse("")) 
						+ "\", \"" + RoasterHelper.escapeSourceString(elem.getValue().orElse("")) + "\"}");
						sjd.add(elem.getName().orElse("") + "=" + elem.getValue().orElse("") );
					}
					init += sji.toString() + " )";
					sjInit.add(init);
					sjJavadoc.add(javadoc + sjd.toString() );
				}
				
			}
			attrGen.initializationSource = "semanticMarkup_lazy = () -> " + Arrays.class.getName() + ".asList( " + sjInit.toString()+ ");";
			attrGen.valueAsJavaDoc =  sjJavadoc.toString();
		}
		
		// mmBean.getSemanticMarkup());
		// defaultMultivalueAttribute(gen, MMRepositoryConcept_.doclet,
		// mmBean.getDoclet());
		defaultAttribute(gen, MMRepositoryConcept.exampleAttribute, mmBean.getExample());
		// defaultMultivalueAttribute(gen, MMRepositoryConcept_.constraint,
		// mmBean.getConstraint());
		defaultAttribute(gen, MMRepositoryConcept.registrationStatusAttribute, mmBean.getRegistrationStatus());
		defaultAttribute(gen, MMRepositoryConcept.removalDateAttribute, mmBean.getRemovalDate());
		defaultAttribute(gen, MMRepositoryConcept.nameAttribute, mmBean.getName());
		defaultAttribute(gen, MMRepositoryConcept.definitionAttribute, mmBean.getDefinition());
	}

	@Override
	protected DataTypeResult generateMMAmount(MMAmount mmBean) {
		return super.generateMMAmount(mmBean);
	}

	@Override
	protected JaxbMainTypeResult generateMMMessageComponent(MMMessageComponent mmBean) {
		JaxbMainTypeResult ret = super.generateMMMessageComponent(mmBean);
		if( "CreditTransferTransactionInformation11".equals( ret.baseName.getCompilationUnit()) ) {
			System.out.println( ret.baseName );
		}
		return ret;
	}
	
	

}
