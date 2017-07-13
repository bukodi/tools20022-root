package com.tools20022.repogenerator;

import java.util.List;
import java.util.Optional;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.PropertySource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.generators.AbstractGenerator;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.JavaName;
import com.tools20022.generators.GenerationResult.JavaResult;

import test.gen.mm.MMBusinessArea;
import test.gen.mm.MMBusinessAssociationEnd;
import test.gen.mm.MMBusinessAttribute;
import test.gen.mm.MMBusinessComponent;
import test.gen.mm.MMBusinessElement;
import test.gen.mm.MMChoiceComponent;
import test.gen.mm.MMCodeSet;
import test.gen.mm.MMDataType;
import test.gen.mm.MMMessageBuildingBlock;
import test.gen.mm.MMMessageComponent;
import test.gen.mm.MMMessageComponentType;
import test.gen.mm.MMMessageDefinition;
import test.gen.mm.MMMessageSet;
import test.gen.mm.MMModelEntity;
import test.gen.mm.MMRepository;
import test.gen.mm.MMRepositoryConcept;
import test.gen.mm.MMTopLevelCatalogueEntry;
import test.gen.mm.MMTopLevelDictionaryEntry;
import test.gen.mm.StandardMetamodel2013;

public class DefaultRepoGenerator extends AbstractGenerator<GeneratedMetamodelBean> {

	private final static String BASE_PKG_NAME = "test.gen.repo";
	private final static String CLASS_NAME_PREFIX = "";

	boolean generateStaticMetas = true;
	final RawRepository repo;

	public DefaultRepoGenerator(RawRepository repo) {
		this.repo = repo;
	}

	protected void generateMain() {
		// Create repo skeleton
		JavaResult<JavaClassSource> genRepoMain;
		{
			JavaName repoName = JavaName.primaryType(BASE_PKG_NAME, "StandardRepository20170516");
			JavaClassSource srcRepoMain = createSourceFile(JavaClassSource.class, repoName);
			srcRepoMain.addImport(ReflectionBasedRepository.class);
			srcRepoMain.setSuperType(ReflectionBasedRepository.class);
			genRepoMain = GenerationResult.fromJavaSource(srcRepoMain);

			// Add constructor
			srcRepoMain.addImport(StandardMetamodel2013.class);
			srcRepoMain.addMethod().setConstructor(true).setPrivate()
					.setBody("super( " + StandardMetamodel2013.class.getSimpleName() + ".metamodel());");
		}

		MMRepository root = repo.getRootObject();
		for (MMTopLevelDictionaryEntry de : root.getDataDictionary().getTopLevelDictionaryEntry()) {
			if (de instanceof MMBusinessComponent) {
				generateMMBusinessComponent(genRepoMain, (MMBusinessComponent) de);
			} else {
				JavaResult<JavaClassSource> gen = generateDefaultClass(de);
				implementDefaultInterfaces(gen, de);
			}
		}
		for (MMTopLevelCatalogueEntry ce : root.getBusinessProcessCatalogue().getTopLevelCatalogueEntry()) {
			if (ce instanceof MMBusinessArea) {
				generateMMBusinessArea(genRepoMain, (MMBusinessArea) ce);
			} else {
				JavaResult<JavaClassSource> gen = generateDefaultClass(ce);
				implementDefaultInterfaces(gen, ce);
			}
		}

	}

	void implementDefaultInterfaces(JavaResult<JavaClassSource> gen, GeneratedMetamodelBean mmElem) {
		if( mmElem instanceof MMRepositoryConcept ) {
			implementMMRepositoryConcept(gen, (MMRepositoryConcept) mmElem);
		} else if( mmElem instanceof MMModelEntity ){
			implementMMModelEntity(gen, (MMModelEntity)mmElem);
		} else {
			// Nothis special ...				
		}
	}

	void implementMMModelEntity(JavaResult<JavaClassSource> gen, MMModelEntity me) {
		/*** MMModelEntity.Members.previousVersion ***/
		if (me.getPreviousVersion().isPresent()) {
			JavaName prevVer = getJavaName(me.getPreviousVersion().get());
			gen.src.addImport(prevVer.getFullName());
			gen.src.addAnnotation(PreviousVersion.class).setLiteralValue(prevVer.getSimpleName() + ".class");
		}

		/*** MMModelEntity.Members.nextVersions ***/
		if (!me.getNextVersions().isEmpty()) {
			for (MMModelEntity nv : me.getNextVersions()) {
				JavaName nextVer = getJavaName(nv);
				gen.src.addImport(nextVer.getFullName());
				AnnotationSource<JavaClassSource> annot = gen.src.addAnnotation(NextVersion.class);
				annot.setLiteralValue(nextVer.getSimpleName() + ".class");
			}
		}

	}

	void implementMMRepositoryConcept(JavaResult<JavaClassSource> gen, MMRepositoryConcept rc) {
		implementMMModelEntity(gen, rc);

		/*** MMRepositoryConcept.Members.definition ***/
		if (rc.getDefinition().isPresent()) {
			gen.src.getJavaDoc().setText(rc.getDefinition().get());
		}
	}

	JavaResult<JavaClassSource> generateMMBusinessComponent(GenerationResult container, MMBusinessComponent bc) {
		JavaResult<JavaClassSource> gen = generateDefaultClass(bc);
		implementMMRepositoryConcept(gen, bc);

		/*** MMBusinessComponent.superType ***/
		if (bc.getSuperType().isPresent()) {
			JavaName superTypename = getJavaName(bc.getSuperType().get());
			gen.src.addImport(superTypename.getFullName());
			gen.src.setSuperType(superTypename.getSimpleName());
		}

		/*** MMBusinessComponent.Members.element ***/
		for (MMBusinessElement elem : bc.getElement()) {
			try {
				generateMMBusinessElements(gen, elem);
			} catch (Exception e) {
				System.err.println(bc);
				e.printStackTrace();
				System.err.println();
			}
		}
		return gen;
	}

	JavaResult<JavaClassSource> generateMMBusinessArea(GenerationResult container, MMBusinessArea ba) {
		JavaResult<JavaClassSource> gen = generateDefaultClass(ba);
		implementMMRepositoryConcept(gen, ba);

		/*** MMBusinessArea.Members.messageDefinition ***/
		for (MMMessageDefinition md : ba.getMessageDefinition()) {
			try {
				generateMMMessageDefinition(gen, md);
			} catch (Exception e) {
				System.err.println(md);
				e.printStackTrace();
				System.err.println();
			}
		}
		return gen;
	}

	JavaResult<JavaClassSource> generateMMMessageDefinition(GenerationResult container, MMMessageDefinition md) {
		JavaResult<JavaClassSource> gen = generateDefaultClass(md);
		implementMMRepositoryConcept(gen, md);

		
		/*** MMBusinessArea.Members.messageDefinition ***/
		for (MMMessageBuildingBlock mbb : md.getMessageBuildingBlock()) {
			/** MMMessageBuildingBlock.Members.minOccurs **/
			JavaName typeName;
			if( mbb.getComplexType().isPresent() ) {				
				MMMessageComponentType ct = mbb.getComplexType().get();
				typeName = getJavaName(ct);
			} else if( mbb.getSimpleType().isPresent() ) {
				MMDataType dt = mbb.getSimpleType().get();
				typeName = getJavaName(dt);
			} else {
				throw new RuntimeException("Constraint violated:" + MMMessageBuildingBlock.Members.checkMessageBuildingBlockHasExactlyOneType.getName() );
			}
			
			gen.src.addImport(typeName.getFullName());
			String wrappedSimpleTypeName = typeName.getSimpleName();						
			if( mbb.getMaxOccurs().isPresent() && mbb.getMaxOccurs().get() > 1 ) {
				gen.src.addImport(List.class);
				wrappedSimpleTypeName = List.class.getSimpleName() + "<" + wrappedSimpleTypeName + ">";
			} else if( mbb.getMinOccurs().isPresent() && mbb.getMinOccurs().get() == 0 ) {
				gen.src.addImport(Optional.class);
				wrappedSimpleTypeName = Optional.class.getSimpleName() + "<" + wrappedSimpleTypeName + ">";				
			}
			
			// TODO: use getJavaName instead of mbb.getName()
			gen.src.addProperty(wrappedSimpleTypeName, mbb.getName());
			
		}

		return gen;
	}

	// TODO: return with property as composite GenerationResult
	void generateMMBusinessElements(JavaResult<JavaClassSource> container, MMBusinessElement elem) {
		JavaName typeName;
		if (elem instanceof MMBusinessAttribute) {
			MMBusinessAttribute attr = (MMBusinessAttribute) elem;
			if (attr.getSimpleType().isPresent()) {
				MMDataType st = attr.getSimpleType().get();
				typeName = getJavaName(st);
			} else if (attr.getComplexType().isPresent()) {
				MMBusinessComponent ct = attr.getComplexType().get();
				typeName = getJavaName(ct);
			} else {
				throw new RuntimeException(
						"Constraint violated:" + MMBusinessAttribute.Members.checkBusinessAttributeHasExactlyOneType);
			}
		} else if (elem instanceof MMBusinessAssociationEnd) {
			MMBusinessAssociationEnd assoc = (MMBusinessAssociationEnd) elem;
			MMBusinessComponent ct = assoc.getType();
			typeName = getJavaName(ct);
		} else {
			throw new RuntimeException("Invalid type hierarchy :" + elem);
		}

		container.src.addImport(typeName.getFullName());
		// TODO: use getJavaName instead of elem.getName()
		PropertySource<JavaClassSource> prop = container.src.addProperty(typeName.getSimpleName(), elem.getName());
	}

	protected JavaResult<JavaClassSource> generateDefaultClass(GeneratedMetamodelBean mmElem) {
		JavaName javaName = null;
		try {
			javaName = getJavaName(mmElem);
			if (javaName == null)
				return null;

			Optional<String> doc = Optional.empty();
			if (mmElem instanceof MMRepositoryConcept)
				doc = ((MMRepositoryConcept) mmElem).getDefinition();

			JavaResult<JavaClassSource> gen = GenerationResult.fromJavaSource( createSourceFile(JavaClassSource.class, mmElem) );			
			return gen;
		} catch (Exception e) {
			System.err.println("--- " + mmElem.toString() + " ---");
			System.err.println("Name:" + javaName);
			e.printStackTrace();
			System.err.println();
			return null;
		}
	}

	@Override
	protected JavaName getJavaName(GeneratedMetamodelBean mmElem) {
		String pkg;
		String cuName;
		
		// CU name
		if (mmElem instanceof MMRepositoryConcept) {
			cuName = ((MMRepositoryConcept) mmElem).getName();
		} else {
			cuName = null;
		}
		
		// Package
		if (mmElem instanceof MMMessageDefinition) {
			MMMessageDefinition msgDef = (MMMessageDefinition) mmElem;
			String areaCode = msgDef.getBusinessArea() == null ? "other"
					: msgDef.getBusinessArea().getCode() == null ? "other" : msgDef.getBusinessArea().getCode();
			pkg = "catalogue.msgdef." + areaCode;
		} else if (mmElem instanceof MMTopLevelCatalogueEntry) {
			if (mmElem instanceof MMMessageSet) {
				pkg = "catalogue.msgset";
			} else if (mmElem instanceof MMBusinessArea) {				
				pkg = "catalogue.area";
			} else {
				pkg = "catalogue.other";
			}
		} else if (mmElem instanceof MMTopLevelDictionaryEntry) {
			if (mmElem instanceof MMCodeSet) {
				pkg = "dict.codeset";
			} else if (mmElem instanceof MMDataType) {
				pkg = "dict.datatype";
			} else if (mmElem instanceof MMBusinessComponent) {
				pkg = "dict.entity";
			} else if (mmElem instanceof MMMessageComponent) {
				pkg = "dict.msg";
			} else if (mmElem instanceof MMChoiceComponent) {
				pkg = "dict.choice";
			} else {
				pkg = "dict.other";
			}
		} else {
			return null;
		}
		pkg = BASE_PKG_NAME + "." + pkg;

		if ( cuName == null ) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cuName.length(); i++) {
			char ch = cuName.charAt(i);
			if (Character.isJavaIdentifierPart(ch))
				sb.append(ch);
		}
		cuName = sb.toString();
		if (JAVA_RESERVED_WORDS.contains(cuName))
			cuName = cuName + "_";

		if( mmElem instanceof MMBusinessArea ) {
			if( cuName.endsWith("master"))
				cuName = cuName.substring(0, cuName.length() - "master".length());
			if( cuName.endsWith("version") )
				cuName = cuName.substring(0, cuName.length() - "version".length()) + "Version";
		}
		
		return JavaName.primaryType(pkg, cuName);
	}
}
