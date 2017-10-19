package com.tools20022.repogenerator;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.CompilationUnit;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.GenerationResult;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repogenerator.resulttypes.EnumConstantResult;
import com.tools20022.repogenerator.resulttypes.EnumTypeResult;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;
import com.tools20022.repogenerator.resulttypes.SubTypeResult;

import de.dainel.cleanqualifiedtypes.CleanQualifiedTypes;

public class GenerateRepoGenerator {

	private JavaClassSource mainSrc;

	public static void main(String[] args) throws Exception {
		GenerateRepoGenerator grg = new GenerateRepoGenerator();
		grg.generate();
		
		CleanQualifiedTypes.cleanAst((CompilationUnit) grg.mainSrc.getInternal());
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
		mainSrc.extendSuperType(BaseRepoGenerator.class);

		// List non-abstract types organized by containment hierarchy.
		StandardMetamodel2013.metamodel().listTypes().filter(t -> !t.isAbstract()).forEachOrdered(mmType -> {
			if( MMXor.metaType().equals(mmType) ) {
				generateNonAbstractType(mmType, MMMessageDefinition.metaType());
				generateNonAbstractType(mmType, MMMessageComponent.metaType());
			} else {
				MetamodelType<?> containerType = mmType.getPossibleContainers().stream().findFirst().orElse(null);			
				generateNonAbstractType(mmType, containerType);
			}
		});
		StandardMetamodel2013.metamodel().listTypes().filter(t -> t.isAbstract()).forEachOrdered(t -> {
			implementAbstractType(t);
		});
		// generateNonAbstractType(MMRepository.metaType());
		
		addSwitchGenerators(MMTopLevelCatalogueEntry.metaType(), SubTypeResult.class);
		addSwitchGenerators(MMTopLevelDictionaryEntry.metaType(), SubTypeResult.class);
		addSwitchGenerators(MMBusinessElement.metaType(), MainTypeResult.class);
	}
	
	void addSwitchGenerators(MetamodelType<?> switchOntype, Class<? extends GenerationResult> typeOfGenArg ) {
		MethodSource<JavaClassSource> method = mainSrc.addMethod().setName("generate" + switchOntype.getBeanClass().getSimpleName());
		method.setProtected();
		method.addParameter( typeOfGenArg, "gen");
		method.addParameter(switchOntype.getBeanClass(), "mmBean");
		method.setReturnType(GenerationResult.class);
		StringJoiner sj = new StringJoiner(" else ");
		for( MetamodelType<?> mmSubType : switchOntype.getSubTypes(false, true) ) {
			if( mmSubType.isAbstract() )
				continue;
			sj.add( "if( " + mmSubType.getBeanClass().getName() + ".class.equals( mmBean.getClass() ) ) {\n"
					+ "  return generate" + mmSubType.getBeanClass().getSimpleName() + "( gen, (" + mmSubType.getBeanClass().getName() + ")mmBean );\n"
					+ "}" );
		}
		
		method.setBody(sj.toString() + " else {\n"
				+ "  throw new IllegalArgumentException( \"Invalid type hierarchy: \" + mmBean.getClass() );\n"
				+ "}");
	}
	
	void generateNonAbstractType(MetamodelType<?> mmType, MetamodelType<?> mmContainerType) {		
		
		MethodSource<JavaClassSource> method = mainSrc.addMethod().setProtected();
		mainSrc.addImport(mmType.getBeanClass().getPackage().getName() + ".struct." + mmType.getBeanClass().getSimpleName() + "_");
		method.setName("generate" + mmType.getBeanClass().getSimpleName() + ( MMXor.class.equals(mmType.getBeanClass()) ? "In" + mmContainerType.getName() : ""));
		method.setReturnType(getResultType(mmType));
		if( mmContainerType != null ) {
			method.addParameter(getResultType(mmContainerType), "containerGen");			
		}
		method.addParameter(mmType.getBeanClass(), "mmBean");

		StringBuilder bodySb = new StringBuilder();
		/*** Create generationResult ***/

		Class<? extends GenerationResult> rt = getResultType(mmType);
		if( MainTypeResult.class.equals(rt)) {
			bodySb.append( MainTypeResult.class.getName() + " gen = defaultMainType(mmBean);\n");			
		} else if( SubTypeResult.class.equals(rt)) {
			bodySb.append( SubTypeResult.class.getName() + " gen = defaultSubType(mmBean, containerGen);\n");			
		} else {
			bodySb.append( rt.getName() + " gen = null;\n");
		}
		bodySb.append("\n");

		/*** Call implementXXX ***/
		for (MetamodelType<?> st : mmType.getSuperTypes(false, false)) {
			if (!st.isAbstract()) {
				System.err.println("Unsupported case. This type:" + mmType.getName() + " superType: " + st.getName());
				continue;
			}

			bodySb.append("implement" + st.getBeanClass().getSimpleName() + "( gen, mmBean );\n");
		}

		bodySb.append("\n");

		/*** Create contained types ***/
		for( MetamodelAttribute<?, ?> attr : mmType.listDeclaredAttributes().filter(a->a.isContainment()).collect(Collectors.toList()) ) {
			Class<?> refClass = attr.getReferencedType().getBeanClass();
			String genmethodName = "generate" + refClass.getSimpleName() + ( MMXor.class.equals(refClass) ? "In" + mmType.getName() : "");
			if (attr.isMultiple()) {
//				for( MMMessageDefinition mmChild : mmBean.getMessageDefinition() ) {
//					generateMMMessageDefinition(gen, mmChild);
//				}
				bodySb.append("for( " + refClass.getName() + " mmChild : mmBean." + attr.getGetterMethod().getName() + "() ) {" );
				bodySb.append("  " + genmethodName + "( gen, mmChild );");
				bodySb.append("}" );
			} else if (attr.isOptional()) {
				//bodySb.append("defaultOptionalAttribute( gen, " + mmAttrAsSrc + ", " + attrValueAsSrc + " );\n");
			} else {
				bodySb.append("  " + genmethodName + "( gen, mmBean." +attr.getGetterMethod().getName()+ "());");
			}			
		}
		
		
		/*** Init attribute values ***/
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
		mainSrc.addImport(mmType.getBeanClass().getPackage().getName() + ".struct." + mmType.getBeanClass().getSimpleName() + "_");
		method.setName("implement" + mmType.getBeanClass().getSimpleName());		
		method.addParameter(GenerationResult.class, "gen");
		method.addParameter(mmType.getBeanClass(), "mmBean");

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

	final static Set<MetamodelType<?>> SUBTYPES = new HashSet<>( Arrays.asList(MMXor.metaType(), MMMessageBuildingBlock.metaType(), 
			MMBusinessAssociationEnd.metaType(), 
			MMMessageDefinitionIdentifier.metaType(), 
			MMMessageAssociationEnd.metaType(), 
			MMMessageAttribute.metaType(), 
			MMBusinessAttribute.metaType(),
			MMBusinessProcessCatalogue.metaType(),
			MMDataDictionary.metaType())); 
	
	final static Set<MetamodelType<?>> DONT_GENERATE_BEANS = new HashSet<>( Arrays.asList( 
			MMRepository.metaType(), 
			MMBusinessProcessCatalogue.metaType(), 
			MMDataDictionary.metaType())); 
	
	protected Class<? extends GenerationResult> getResultType( MetamodelType<?> mmtype ) {
		if( SUBTYPES.contains(mmtype) )
			return SubTypeResult.class;
		else if( MMCodeSet.metaType().equals(mmtype) || MMBusinessProcess.metaType().equals(mmtype))
			return EnumTypeResult.class;
		else if( MMCode.metaType().equals(mmtype) || MMBusinessRole.metaType().equals(mmtype))
			return EnumConstantResult.class;
		else
			return MainTypeResult.class;
	}
	
}
