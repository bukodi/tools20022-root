package com.tools20022.repogenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.PropertySource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.ProgressMonitor;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.repogenerator.BaseRepoGenerator.AttrValue;
import com.tools20022.repogenerator.resulttypes.AttrResult;
import com.tools20022.repogenerator.resulttypes.DataTypeResult;
import com.tools20022.repogenerator.resulttypes.EnumTypeResult;
import com.tools20022.repogenerator.resulttypes.JaxbMainTypeResult;
import com.tools20022.repogenerator.resulttypes.JaxbPropertyResult;
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

	@Override
	public void generate(RawRepository repo, ProgressMonitor monitor) {
		this.repo = repo;

		repo.getMetamodel().listEnums().forEach(mmEnum -> {
			this.ctx.addKnownTypeNames(mmEnum.getEnumJavaClass().getName());
		});
		repo.getMetamodel().listTypes().forEach(mmType -> {
			this.ctx.addKnownTypeNames(mmType.getBeanClass().getName());
		});

		// Count main types to generate
		{
			long start = System.currentTimeMillis();
			AtomicInteger totalNumberOfMainTypesToGenerate = new AtomicInteger();
			repo.listContent(repo.getRootObject(), true, true).forEach(repoObj -> {
				StructuredName javaName = getStructuredName(repoObj);
				if (javaName != null && javaName.getMemberName() == null && javaName.getNestedTypeName() == null) {
					totalNumberOfMainTypesToGenerate.incrementAndGet();
					this.ctx.addKnownTypeNames(javaName.getFullName());
				}
			});
			ctx.setTotalNumberOfMainTypesToGenerate(totalNumberOfMainTypesToGenerate.get());
			System.out.println("Found " + totalNumberOfMainTypesToGenerate
					+ " java sources to generate. ( Calculated in " + (System.currentTimeMillis() - start) + " msec )");
		}

		// Create repo

		MainTypeResult repoGen = generateMMRepository(repo.getRootObject());

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
	protected EnumTypeResult generateMMCodeSet(StaticFieldResult containerGen, MMCodeSet mmBean) {
		return super.generateMMCodeSet(containerGen, mmBean);
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
	protected MainTypeResult generateMMBusinessComponent(StaticFieldResult containerGen, MMBusinessComponent mmBean) {
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
	protected JaxbMainTypeResult generateMMMessageDefinition(MainTypeResult containerGen, MMMessageDefinition mmBean) {
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
			docSrc.addAnnotation(XmlRootElement.class).setStringValue("namespace", ns);
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
					System.out.println( "Semantic markup on [" + mmBean.getClass().getSimpleName() + "]" + mmBean.getName());
					
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
	protected void implementMMMessageConstruct(TypeResult gen, MMMessageConstruct mmBean) {
		super.implementMMMessageConstruct(gen, mmBean);
		// TDOD: XMLElement annot
	}

	protected void _implementMMModelEntity(MainTypeResult gen, MMModelEntity me) {
		/*** MMModelEntity.Members.previousVersion ***/
		if (me.getPreviousVersion().isPresent()) {
			StructuredName prevVer = getStructuredName(me.getPreviousVersion().get());
			gen.src.addImport(prevVer.getFullName());
			gen.src.addAnnotation(PreviousVersion.class).setLiteralValue(prevVer.getSimpleName() + ".class");
		}

		/*** MMModelEntity.Members.nextVersions ***/
		if (!me.getNextVersions().isEmpty()) {
			for (MMModelEntity nv : me.getNextVersions()) {
				StructuredName nextVer = getStructuredName(nv);
				gen.src.addImport(nextVer.getFullName());
				AnnotationSource<JavaClassSource> annot = gen.src.addAnnotation(NextVersion.class);
				annot.setLiteralValue(nextVer.getSimpleName() + ".class");
			}
		}

	}

	protected void _implementMMRepositoryConcept(MainTypeResult gen, MMRepositoryConcept rc) {
		_implementMMModelEntity(gen, rc);

		/*** MMRepositoryConcept.Members.definition ***/
		if (rc.getDefinition().isPresent()) {
			String doc = rc.getDefinition().get();
			// Replace <, >, & chars
			doc = doc.replaceAll("&", "	&amp;").replaceAll(">", "&gt;").replaceAll("<", "&lt;");
			gen.src.getJavaDoc().setText(doc);
		}
	}

	protected GenerationResult _generateMMBusinessComponent(GenerationResult container, MMBusinessComponent bc) {
		MainTypeResult gen = _generateDefaultClass(bc);
		_implementMMRepositoryConcept(gen, bc);

		/*** MMBusinessComponent.superType ***/
		if (bc.getSuperType().isPresent()) {
			StructuredName superTypename = getStructuredName(bc.getSuperType().get());
			gen.src.addImport(superTypename.getFullName());
			gen.src.setSuperType(superTypename.getSimpleName());
		} else {
			gen.src.addImport(AbstractBusinessComponent.class);
			gen.src.setSuperType(AbstractBusinessComponent.class);
		}

		/*** MMBusinessComponent.Members.element ***/
		for (MMBusinessElement elem : bc.getElement()) {
			try {
				_generateMMBusinessElements(gen, elem);
			} catch (Exception e) {
				System.err.println(bc);
				e.printStackTrace();
				System.err.println();
			}
		}
		return gen;
	}

	protected GenerationResult _generateMMBusinessArea(GenerationResult container, MMBusinessArea ba) {
		MainTypeResult gen = _generateDefaultClass(ba);
		_implementMMRepositoryConcept(gen, ba);

		/*** MMBusinessArea.Members.messageDefinition ***/
		for (MMMessageDefinition md : ba.getMessageDefinition()) {
			try {
				_generateMMMessageDefinition(gen, md);
			} catch (Exception e) {
				System.err.println(md);
				e.printStackTrace();
				System.err.println();
			}
		}
		return gen;
	}

	protected GenerationResult _generateMMMessageDefinition(GenerationResult container, MMMessageDefinition md) {
		MainTypeResult gen = _generateDefaultClass(md);
		_implementMMRepositoryConcept(gen, md);

		/*** MMBusinessArea.Members.messageDefinition ***/
		for (MMMessageBuildingBlock mbb : md.getMessageBuildingBlock()) {
			/** MMMessageBuildingBlock.Members.minOccurs **/
			StructuredName typeName;
			if (mbb.getComplexType().isPresent()) {
				MMMessageComponentType ct = mbb.getComplexType().get();
				typeName = getStructuredName(ct);
			} else if (mbb.getSimpleType().isPresent()) {
				MMDataType dt = mbb.getSimpleType().get();
				typeName = getStructuredName(dt);
			} else {
				throw new RuntimeException("Constraint violated:"
						+ MMMessageBuildingBlock.checkMessageBuildingBlockHasExactlyOneType.getName());
			}

			gen.src.addImport(typeName.getFullName());
			String wrappedSimpleTypeName = typeName.getSimpleName();
			if (mbb.getMaxOccurs().isPresent() && mbb.getMaxOccurs().get() > 1) {
				gen.src.addImport(List.class);
				wrappedSimpleTypeName = List.class.getSimpleName() + "<" + wrappedSimpleTypeName + ">";
			} else if (mbb.getMinOccurs().isPresent() && mbb.getMinOccurs().get() == 0) {
				gen.src.addImport(Optional.class);
				wrappedSimpleTypeName = Optional.class.getSimpleName() + "<" + wrappedSimpleTypeName + ">";
			}

			// TODO: use getJavaName instead of mbb.getName()
			gen.src.addProperty(wrappedSimpleTypeName, mbb.getName());

		}

		return gen;
	}

	// TODO: return with property as composite GenerationResult
	protected GenerationResult _generateMMBusinessElements(MainTypeResult container, MMBusinessElement elem) {
		StructuredName typeName;
		if (elem instanceof MMBusinessAttribute) {
			MMBusinessAttribute attr = (MMBusinessAttribute) elem;
			if (attr.getSimpleType().isPresent()) {
				MMDataType st = attr.getSimpleType().get();
				typeName = getStructuredName(st);
			} else if (attr.getComplexType().isPresent()) {
				MMBusinessComponent ct = attr.getComplexType().get();
				typeName = getStructuredName(ct);
			} else {
				throw new RuntimeException(
						"Constraint violated:" + MMBusinessAttribute.checkBusinessAttributeHasExactlyOneType);
			}
		} else if (elem instanceof MMBusinessAssociationEnd) {
			MMBusinessAssociationEnd assoc = (MMBusinessAssociationEnd) elem;
			MMBusinessComponent ct = assoc.getType();
			typeName = getStructuredName(ct);
		} else {
			throw new RuntimeException("Invalid type hierarchy :" + elem);
		}

		// TODO: use getJavaName instead of elem.getName()
		PropertySource<JavaClassSource> prop = container.src.addProperty(typeName.getFullName(),
				elem.getName().toString());
		return null;
	}

	protected MainTypeResult _generateDefaultClass(GeneratedMetamodelBean mmElem) {
		StructuredName javaName = null;
		try {
			javaName = getStructuredName(mmElem);
			if (javaName == null)
				return null;

			Optional<String> doc = Optional.empty();
			if (mmElem instanceof MMRepositoryConcept)
				doc = ((MMRepositoryConcept) mmElem).getDefinition();

			MainTypeResult gen = new MainTypeResult(ctx, mmElem, getStructuredName(mmElem));
			gen.src.addImport(GeneratedRepoBean.class);
			gen.src.addImport(mmElem.getClass());
			gen.src.addInterface(
					GeneratedRepoBean.class.getSimpleName() + "<" + mmElem.getClass().getSimpleName() + ">");

			return gen;
		} catch (Exception e) {
			System.err.println("--- " + mmElem.toString() + " ---");
			System.err.println("Name:" + javaName);
			e.printStackTrace();
			System.err.println();
			return null;
		}
	}

}
