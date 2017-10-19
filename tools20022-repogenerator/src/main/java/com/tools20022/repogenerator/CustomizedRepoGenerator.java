package com.tools20022.repogenerator;

import java.util.List;
import java.util.Optional;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.PropertySource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.GenerationResult.JavaResult;
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
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.struct.MMBusinessAttribute_;
import com.tools20022.metamodel.struct.MMMessageBuildingBlock_;

public class CustomizedRepoGenerator extends GeneratedRepoGenerator {

	protected void _implementMMModelEntity(JavaResult<JavaClassSource> gen, MMModelEntity me) {
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

	protected void _implementMMRepositoryConcept(JavaResult<JavaClassSource> gen, MMRepositoryConcept rc) {
		_implementMMModelEntity(gen, rc);

		/*** MMRepositoryConcept.Members.definition ***/
		if (rc.getDefinition().isPresent()) {
			String doc = rc.getDefinition().get();
			// Replace <, >, &  chars
			doc = doc.replaceAll("&", "	&amp;").replaceAll(">", "&gt;").replaceAll("<", "&lt;");
			gen.src.getJavaDoc().setText(doc);
		}
	}

	protected GenerationResult _generateMMBusinessComponent(GenerationResult container, MMBusinessComponent bc) {
		JavaResult<JavaClassSource> gen = _generateDefaultClass(bc);
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
		JavaResult<JavaClassSource> gen = _generateDefaultClass(ba);
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
		JavaResult<JavaClassSource> gen = _generateDefaultClass(md);
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
	protected GenerationResult _generateMMBusinessElements(JavaResult<JavaClassSource> container, MMBusinessElement elem) {
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

		container.src.addImport(typeName.getFullName());
		// TODO: use getJavaName instead of elem.getName()
		PropertySource<JavaClassSource> prop = container.src.addProperty(typeName.getSimpleName(), elem.getName().toString());
		return null;
	}

	protected JavaResult<JavaClassSource> _generateDefaultClass(GeneratedMetamodelBean mmElem) {
		StructuredName javaName = null;
		try {
			javaName = getStructuredName(mmElem);
			if (javaName == null)
				return null;

			Optional<String> doc = Optional.empty();
			if (mmElem instanceof MMRepositoryConcept)
				doc = ((MMRepositoryConcept) mmElem).getDefinition();

			JavaResult<JavaClassSource> gen = GenerationResult
					.fromJavaSource(ctx.createSourceFile(JavaClassSource.class, getStructuredName(mmElem)));
			gen.src.addImport(GeneratedRepoBean.class);
			gen.src.addImport(mmElem.getClass());
			gen.src.addInterface(GeneratedRepoBean.class.getSimpleName() + "<" + mmElem.getClass().getSimpleName() + ">");
			
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
