package com.tools20022.repogenerator;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.GenerationResult;

import test.gen.mm.MMRepository;
import test.gen.mm.StandardMetamodel2013;

public class GenerateRepoGenerator {

	private JavaClassSource mainSrc;

	public static void main(String[] args) throws Exception {
		GenerateRepoGenerator grg = new GenerateRepoGenerator();
		grg.generate();
		System.out.println(grg.mainSrc.toString());
	}

	GenerateRepoGenerator() {

	}

	void generate() throws Exception {
		mainSrc = Roaster.create(JavaClassSource.class);
		mainSrc.setName("GeneratorSkeleton").setPackage("test.generators");
		mainSrc.addImport(GenerationResult.class);

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
		MethodSource<JavaClassSource> method = mainSrc.addMethod();
		mainSrc.addImport(mmType.getBeanClass().getName());
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

		for (MetamodelAttribute<?, ?> attr : mmType.getDeclaredAttributes()) {
			if (attr.isOptional()) {
				bodySb.append("if( mmBean." + getGetterName(attr) + "().isPresent() ) {\n");
				bodySb.append("}\n");
				bodySb.append("\n");
			} else if (attr.isMultiple()) {
				bodySb.append("for( Object value: mmBean." + getGetterName(attr) + "() ) {\n");
				bodySb.append("}\n");
				bodySb.append("\n");
			} else {
				
			}

		}

		bodySb.append("return gen;");
		method.setBody(bodySb.toString());
	}

	String getGetterName(MetamodelAttribute<?, ?> attr) {
		String x = attr.getName();
		x = Character.toUpperCase(x.charAt(0)) + x.substring(1);
		if (attr.getValueJavaClass() != null
				&& (boolean.class.equals(attr.getValueJavaClass()) || Boolean.class.equals(attr.getValueJavaClass()))) {
			x = "is" + x;
		} else {
			x = "get" + x;
		}
		return x;
	}

	void implementAbstractType(MetamodelType<?> mmType) {
		MethodSource<JavaClassSource> method = mainSrc.addMethod();
		mainSrc.addImport(mmType.getBeanClass().getName());
		method.setName("implement" + mmType.getBeanClass().getSimpleName());
		method.addParameter(GenerationResult.class.getSimpleName(), "gen");
		method.addParameter(mmType.getBeanClass().getSimpleName(), "mmBean");

		StringBuilder bodySb = new StringBuilder();

		for (MetamodelType<?> st : mmType.getSuperTypes(false, false)) {
			if (!st.isAbstract())
				throw new RuntimeException("Unsupported case");
			bodySb.append("implement" + st.getBeanClass().getSimpleName() + "( gen, mmBean );\n");
		}

		method.setBody(bodySb.toString());
	}

	private String generateVarNameFormMMType(MetamodelType<?> mmType) {
		// TODO
		return mmType.getName();
	}

}
