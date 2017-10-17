package com.tools20022.repogenerator;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.GenerationResult;
import com.tools20022.metamodel.StandardMetamodel2013;

public class GenerateRepoGenerator {

	private JavaClassSource mainSrc;

	public static void main(String[] args) throws Exception {
		GenerateRepoGenerator grg = new GenerateRepoGenerator();
		grg.generate();
		String src = grg.mainSrc.toString();
		Path destPath = Paths.get("src/main/java/com/tools20022/repogenerator/GeneratedRepoGenerator.java"); 
		Files.write(destPath, src.getBytes(StandardCharsets.UTF_8));
		System.out.println("saved to: " + destPath.toString());
	}

	GenerateRepoGenerator() {

	}
	
	void generate() throws Exception {
		mainSrc = Roaster.create(JavaClassSource.class);
		mainSrc.setName("GeneratedRepoGenerator").setPackage("com.tools20022.repogenerator");
		mainSrc.addImport(BaseRepoGenerator.class);
		mainSrc.extendSuperType(BaseRepoGenerator.class);
		mainSrc.addImport(GenerationResult.class);
		mainSrc.addImport(MetamodelAttribute.class);
		mainSrc.addImport(List.class);
		mainSrc.addImport(Optional.class);
		mainSrc.addImport(GeneratedMetamodelBean.class);

		// List non-abstract types organized by containment hierarchy.
		StandardMetamodel2013.metamodel().listTypes().filter(t -> !t.isAbstract()).forEachOrdered(t -> {
			generateNonAbstractType(t);
		});
		StandardMetamodel2013.metamodel().listTypes().filter(t -> t.isAbstract()).forEachOrdered(t -> {
			implementAbstractType(t);
		});
		// generateNonAbstractType(MMRepository.metaType());

	}

	void generateNonAbstractType(MetamodelType<?> mmType) {
		MethodSource<JavaClassSource> method = mainSrc.addMethod().setProtected();
		mainSrc.addImport(mmType.getBeanClass().getName());
		mainSrc.addImport(mmType.getBeanClass().getPackage().getName() + ".struct." + mmType.getBeanClass().getSimpleName() + "_");
		method.setName("generate" + mmType.getBeanClass().getSimpleName());
		method.setReturnType(GenerationResult.class);
		method.addParameter(GenerationResult.class.getSimpleName(), "containerGen");
		method.addParameter(mmType.getBeanClass().getSimpleName(), "mmBean");

		StringBuilder bodySb = new StringBuilder();
		bodySb.append(GenerationResult.class.getSimpleName() + " gen = null; //TODO\n");

		for (MetamodelType<?> st : mmType.getSuperTypes(false, false)) {
			if (!st.isAbstract()) {
				System.err.println("Unsupported case. This type:" + mmType.getName() + " superType: " + st.getName());
				continue;
			}

			bodySb.append("implement" + st.getBeanClass().getSimpleName() + "( gen, mmBean );\n");
		}

		bodySb.append("\n");

		for (MetamodelAttribute<?, ?> attr : mmType.getDeclaredAttributes()) {
			String mmAttrAsSrc = mmType.getBeanClass().getSimpleName() + "_." + attr.getName();
			String attrValueAsSrc = "mmBean." + attr.getGetterMethod().getName() + "()";
			if (attr.isMultiple()) {
				bodySb.append("defaultMultivalueAttribute( gen, " + mmAttrAsSrc + ", " + attrValueAsSrc + " );\n");
			} else if (attr.isOptional()) {
				bodySb.append("defaultOptionalAttribute( gen, " + mmAttrAsSrc + ", " + attrValueAsSrc + " );\n");
			} else {
				bodySb.append("defaultMandatoryAttribute( gen, " + mmAttrAsSrc + ", " + attrValueAsSrc + " );\n");
			}
		}

		bodySb.append("return gen;");
		method.setBody(bodySb.toString());
	}

	void implementAbstractType(MetamodelType<?> mmType) {
		MethodSource<JavaClassSource> method = mainSrc.addMethod().setProtected();
		mainSrc.addImport(mmType.getBeanClass().getName());
		mainSrc.addImport(mmType.getBeanClass().getPackage().getName() + ".struct." + mmType.getBeanClass().getSimpleName() + "_");
		method.setName("implement" + mmType.getBeanClass().getSimpleName());		
		method.addParameter(GenerationResult.class.getSimpleName(), "gen");
		method.addParameter(mmType.getBeanClass().getSimpleName(), "mmBean");

		StringBuilder bodySb = new StringBuilder();

		for (MetamodelType<?> st : mmType.getSuperTypes(false, false)) {
			if (!st.isAbstract())
				throw new RuntimeException("Unsupported case");
			bodySb.append("implement" + st.getBeanClass().getSimpleName() + "( gen, mmBean );\n");
		}

		for (MetamodelAttribute<?, ?> attr : mmType.getDeclaredAttributes()) {
			String mmAttrAsSrc = mmType.getBeanClass().getSimpleName() + "_." + attr.getName();
			String attrValueAsSrc = "mmBean." + attr.getGetterMethod().getName() + "()";
			if (attr.isMultiple()) {
				bodySb.append("defaultMultivalueAttribute( gen, " + mmAttrAsSrc + ", " + attrValueAsSrc + " );\n");
			} else if (attr.isOptional()) {
				bodySb.append("defaultOptionalAttribute( gen, " + mmAttrAsSrc + ", " + attrValueAsSrc + " );\n");
			} else {
				bodySb.append("defaultMandatoryAttribute( gen, " + mmAttrAsSrc + ", " + attrValueAsSrc + " );\n");
			}
		}

		method.setBody(bodySb.toString());
	}

	private String generateVarNameFormMMType(MetamodelType<?> mmType) {
		// TODO
		return mmType.getName();
	}

}
