package com.tools20022.repogenerator;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

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
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.metamodel.struct.MMBusinessAttribute_;
import com.tools20022.metamodel.struct.MMBusinessComponent_;
import com.tools20022.metamodel.struct.MMMessageBuildingBlock_;
import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import com.tools20022.metamodel.struct.MMRepository_;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;
import com.tools20022.repogenerator.resulttypes.SubTypeResult;

public class CustomizedRepoGenerator extends GeneratedRepoGenerator {

	@Override
	public void accept(RawRepository repo, GenerationContext<RawRepository> ctx) {
		this.repo = repo;
		this.ctx = ctx;

		// Count main types to generate
		{
			long start = System.currentTimeMillis();
			AtomicInteger totalNumberOfMainTypesToGenerate = new AtomicInteger();
			repo.listContent(repo.getRootObject(), true, true).forEach(repoObj -> {
				StructuredName javaName = getStructuredName(repoObj);
				if (javaName != null && javaName.getMemberName() == null && javaName.getNestedTypeName() == null)
					totalNumberOfMainTypesToGenerate.incrementAndGet();
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
		defaultAttribute(mtr, MMRepository_.businessProcessCatalogue, mmBean.getBusinessProcessCatalogue());
		defaultAttribute(mtr, MMRepository_.dataDictionary, mmBean.getDataDictionary());
		mtr.flush();
		return mtr;
	}
	
	

	@Override
	protected MainTypeResult generateMMBusinessComponent(SubTypeResult containerGen, MMBusinessComponent mmBean) {
		MainTypeResult gen = defaultMainType(mmBean);
		gen.mmObjectMethod.setFinal(false);
		mmBean.getSuperType().ifPresent(mmST->{
				StructuredName stName = getStructuredName(mmST);
				gen.src.setSuperType( stName.getFullName());
				collectDontModifyImports(mmBean, gen.dontModifyImports);
		});		
				
		implementMMTopLevelDictionaryEntry(gen, mmBean);
		implementMMRepositoryConcept(gen, mmBean);
		implementMMModelEntity(gen, mmBean);
		implementMMBusinessElementType(gen, mmBean);
		implementMMRepositoryType(gen, mmBean);
		implementMMBusinessConcept(gen, mmBean);
		for (MMBusinessElement mmChild : mmBean.getElement()) {
			generateMMBusinessElement(gen, mmChild);
		}
		defaultAttribute(gen, MMBusinessComponent_.associationDomain,
				mmBean.getAssociationDomain());
		defaultAttribute(gen, MMBusinessComponent_.derivationElement,
				mmBean.getDerivationElement());
		defaultAttribute(gen, MMBusinessComponent_.subType, mmBean.getSubType());
		defaultAttribute(gen, MMBusinessComponent_.superType,
				mmBean.getSuperType());
		defaultAttribute(gen, MMBusinessComponent_.element, mmBean.getElement());
		defaultAttribute(gen, MMBusinessComponent_.derivationComponent,
				mmBean.getDerivationComponent());
		gen.flush();
		return gen;
	}
	
	private void collectDontModifyImports( MMBusinessComponent mmBean, List<String> dontModifyImports ) {
		List<MMBusinessElement> mmFields = mmBean.getElement();
		for( MMBusinessElement mmField : mmFields) {
			StructuredName fieldName = getStructuredName(mmField);
			if( fieldName == null || fieldName.getMemberName() == null)
				continue;
			dontModifyImports.add("*." + fieldName.getMemberName() );
		}
		mmBean.getSuperType().ifPresent(mmST->{
			collectDontModifyImports(mmST, dontModifyImports);
		});
	}

	@Override
	protected void implementMMRepositoryConcept(GenerationResult gen, MMRepositoryConcept mmBean) {
		//defaultMultivalueAttribute(gen, MMRepositoryConcept_.semanticMarkup, mmBean.getSemanticMarkup());
		//defaultMultivalueAttribute(gen, MMRepositoryConcept_.doclet, mmBean.getDoclet());
		defaultAttribute(gen, MMRepositoryConcept_.example, mmBean.getExample());
		//defaultMultivalueAttribute(gen, MMRepositoryConcept_.constraint, mmBean.getConstraint());
		defaultAttribute(gen, MMRepositoryConcept_.registrationStatus, mmBean.getRegistrationStatus());
		defaultAttribute(gen, MMRepositoryConcept_.removalDate, mmBean.getRemovalDate());
		defaultAttribute(gen, MMRepositoryConcept_.name, mmBean.getName());
		defaultAttribute(gen, MMRepositoryConcept_.definition, mmBean.getDefinition());
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
						+ MMMessageBuildingBlock_.checkMessageBuildingBlockHasExactlyOneType.getName());
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
						"Constraint violated:" + MMBusinessAttribute_.checkBusinessAttributeHasExactlyOneType);
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
