package com.tools20022.repogenerator;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.jboss.forge.roaster.model.source.AnnotationSource;
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
import com.tools20022.metamodel.struct.MMMessageBuildingBlock_;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;

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

		// Create repo skeleton
		{
			StructuredName repoName = StructuredName.primaryType(basePackageName, mainClassSimpleName);
			JavaClassSource srcRepoMain = ctx.createSourceFile(JavaClassSource.class, repoName);
			srcRepoMain.setSuperType(ReflectionBasedRepository.class);

			// Add constructor
			srcRepoMain.addImport(StandardMetamodel2013.class);
		}

		MMRepository root = repo.getRootObject();
		MainTypeResult repoGen = generateMMRepository(root);
		repoGen.structSrc.setSuperType(ReflectionBasedRepository.class);
		repoGen.structSrc.addMethod().setConstructor(true).setPrivate()
				.setBody("super( " + StandardMetamodel2013.class.getName() + ".metamodel());");

	}

	protected void _implementMMModelEntity(MainTypeResult gen, MMModelEntity me) {
		/*** MMModelEntity.Members.previousVersion ***/
		if (me.getPreviousVersion().isPresent()) {
			StructuredName prevVer = getStructuredName(me.getPreviousVersion().get());
			gen.structSrc.addImport(prevVer.getFullName());
			gen.structSrc.addAnnotation(PreviousVersion.class).setLiteralValue(prevVer.getSimpleName() + ".class");
		}

		/*** MMModelEntity.Members.nextVersions ***/
		if (!me.getNextVersions().isEmpty()) {
			for (MMModelEntity nv : me.getNextVersions()) {
				StructuredName nextVer = getStructuredName(nv);
				gen.structSrc.addImport(nextVer.getFullName());
				AnnotationSource<JavaClassSource> annot = gen.structSrc.addAnnotation(NextVersion.class);
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
			gen.structSrc.getJavaDoc().setText(doc);
		}
	}

	protected GenerationResult _generateMMBusinessComponent(GenerationResult container, MMBusinessComponent bc) {
		MainTypeResult gen = _generateDefaultClass(bc);
		_implementMMRepositoryConcept(gen, bc);

		/*** MMBusinessComponent.superType ***/
		if (bc.getSuperType().isPresent()) {
			StructuredName superTypename = getStructuredName(bc.getSuperType().get());
			gen.structSrc.addImport(superTypename.getFullName());
			gen.structSrc.setSuperType(superTypename.getSimpleName());
		} else {
			gen.structSrc.addImport(AbstractBusinessComponent.class);
			gen.structSrc.setSuperType(AbstractBusinessComponent.class);
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

			gen.structSrc.addImport(typeName.getFullName());
			String wrappedSimpleTypeName = typeName.getSimpleName();
			if (mbb.getMaxOccurs().isPresent() && mbb.getMaxOccurs().get() > 1) {
				gen.structSrc.addImport(List.class);
				wrappedSimpleTypeName = List.class.getSimpleName() + "<" + wrappedSimpleTypeName + ">";
			} else if (mbb.getMinOccurs().isPresent() && mbb.getMinOccurs().get() == 0) {
				gen.structSrc.addImport(Optional.class);
				wrappedSimpleTypeName = Optional.class.getSimpleName() + "<" + wrappedSimpleTypeName + ">";
			}

			// TODO: use getJavaName instead of mbb.getName()
			gen.structSrc.addProperty(wrappedSimpleTypeName, mbb.getName());

		}

		return gen;
	}

	// TODO: return with property as composite GenerationResult
	protected GenerationResult _generateMMBusinessElements(MainTypeResult container,
			MMBusinessElement elem) {
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
		PropertySource<JavaClassSource> prop = container.structSrc.addProperty(typeName.getFullName(),
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

			MainTypeResult gen = new MainTypeResult(ctx, getStructuredName(mmElem));
			gen.structSrc.addImport(GeneratedRepoBean.class);
			gen.structSrc.addImport(mmElem.getClass());
			gen.structSrc.addInterface(
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
