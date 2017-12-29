package com.tools20022.repogenerator;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.CompilationUnit;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repogenerator.resulttypes.DataTypeResult;
import com.tools20022.repogenerator.resulttypes.EnumConstantResult;
import com.tools20022.repogenerator.resulttypes.EnumTypeResult;
import com.tools20022.repogenerator.resulttypes.JaxbMainTypeResult;
import com.tools20022.repogenerator.resulttypes.JaxbPropertyResult;
import com.tools20022.repogenerator.resulttypes.MainTypeResult;
import com.tools20022.repogenerator.resulttypes.PropertyResult;
import com.tools20022.repogenerator.resulttypes.StaticFieldResult;
import com.tools20022.repogenerator.resulttypes.TypeResult;

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
		mainSrc.setName("GeneratedRepoGenerator").setPackage("com.tools20022.repogenerator").setAbstract(true);
		mainSrc.setSuperType(BaseRepoGenerator.class);
		
		MethodSource<JavaClassSource> constr = mainSrc.addMethod();
		constr.setConstructor(true).setProtected();
		constr.addParameter( GenerationContext.class.getName() + "<" + RawRepository.class.getName() + ", " + GeneratedMetamodelBean.class.getName() + ">", "ctx");
		constr.setBody("super( ctx );");
		
		// List non-abstract types organized by containment hierarchy.
		StandardMetamodel2013.metamodel().getAllTypes().stream().filter(t -> !t.isAbstract()).forEachOrdered(mmType -> {
			if( MMXor.metaType().equals(mmType) ) {
				generateNonAbstractType(mmType, MMMessageDefinition.metaType());
				generateNonAbstractType(mmType, MMMessageComponent.metaType());
			} else {
				MetamodelType<?> containerType = mmType.getPossibleContainers().stream().findFirst().orElse(null);			
				generateNonAbstractType(mmType, containerType);
			}
		});
		StandardMetamodel2013.metamodel().getAllTypes().stream().filter(t -> t.isAbstract()).forEachOrdered(t -> {
			implementAbstractType(t);
		});
		// generateNonAbstractType(MMRepository.metaType());
		
		addSwitchGenerators(MMTopLevelCatalogueEntry.metaType(), StaticFieldResult.class);
		addSwitchGenerators(MMTopLevelDictionaryEntry.metaType(), StaticFieldResult.class);
		addSwitchGenerators(MMBusinessElement.metaType(), MainTypeResult.class);
		addSwitchGenerators(MMMessageElement.metaType(), JaxbMainTypeResult.class);
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
		method.setName("generate" + mmType.getBeanClass().getSimpleName() + ( MMXor.class.equals(mmType.getBeanClass()) ? "In" + mmContainerType.getName() : ""));
		method.setReturnType(getResultType(mmType));
		if( mmContainerType != null ) {
			//essageAssociationEnd
			Class<? extends GenerationResult> containerResultType = getResultType(mmContainerType);
			method.addParameter(containerResultType, "containerGen");			
		}
		method.addParameter(mmType.getBeanClass(), "mmBean");
		
		StringBuilder bodySb = new StringBuilder();
		/*** Create generationResult ***/

		Class<? extends GenerationResult> rt = getResultType(mmType);
		if( MainTypeResult.class.equals(rt)) {
			bodySb.append( MainTypeResult.class.getName() + " gen = defaultMainType(mmBean);\n");			
		} else if( JaxbMainTypeResult.class.equals(rt)) {
			bodySb.append( JaxbMainTypeResult.class.getName() + " gen = defaultJaxbMainType(mmBean);\n");			
		} else if( EnumTypeResult.class.equals(rt)) {
			bodySb.append( EnumTypeResult.class.getName() + " gen = defaultEnumType(mmBean);\n");			
		} else if( StaticFieldResult.class.equals(rt)) {
			bodySb.append( StaticFieldResult.class.getName() + " gen = defaultStaticFieldResult(mmBean, containerGen);\n");			
		} else if( PropertyResult.class.equals(rt)) {
			bodySb.append( PropertyResult.class.getName() + " gen = defaultPropertyResult(mmBean, containerGen);\n");			
		} else if( JaxbPropertyResult.class.equals(rt)) {
			bodySb.append( JaxbPropertyResult.class.getName() + " gen = defaultJaxbPropertyResult(mmBean, containerGen);\n");			
		} else if( EnumConstantResult.class.equals(rt)) {
			bodySb.append( EnumConstantResult.class.getName() + " gen = defaultEnumConstant(mmBean, containerGen);\n");			
		} else if( DataTypeResult.class.equals(rt)) {
			bodySb.append( DataTypeResult.class.getName() + " gen = defaultDataType(mmBean);\n");			
		} else {
			throw new IllegalArgumentException("Invalid type hierarchy: " + rt);
		}
		bodySb.append("\n");

		/*** Call implementXXX ***/
		for (MetamodelType<?> st : mmType.getSuperTypes(false, true)) {
			if (!st.isAbstract()) {
				//System.err.println("Unsupported case. This type:" + mmType.getName() + " superType: " + st.getName());
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
		List<MetamodelAttribute<?, ?>> attrList = new ArrayList<>();
		mmType.listSuperTypes(true, true).filter(t->!t.isAbstract()).forEach(t-> attrList.addAll( t.getDeclaredAttributes()));
		
		for (MetamodelAttribute<?, ?> attr : attrList) {
			if( attr.isDerived() )
				continue;
			String coreAttrAsSrc = mmType.getBeanClass().getSimpleName() + "." + attr.getName() + "Attribute";
			String attrValueAsSrc = "mmBean." + attr.getGetterMethod().getName() + "()";
			bodySb.append("defaultAttribute( gen, " + coreAttrAsSrc + ", " + attrValueAsSrc + " );\n");
		}

		bodySb.append("gen.flush();");
		bodySb.append("return gen;");
		method.setBody(bodySb.toString());
	}

	void implementAbstractType(MetamodelType<?> mmType) {
		MethodSource<JavaClassSource> method = mainSrc.addMethod().setProtected();
		method.setName("implement" + mmType.getBeanClass().getSimpleName());
		
		if( "implementMMMessageElementContainer".equals( method.getName()) ) {			
			method.addParameter(JaxbMainTypeResult.class, "gen");
		} else {
			method.addParameter(TypeResult.class, "gen");			
		}		
		method.addParameter(mmType.getBeanClass(), "mmBean");

		StringBuilder bodySb = new StringBuilder();
		
		/*** Create contained types ***/
		for( MetamodelAttribute<?, ?> attr : mmType.listDeclaredAttributes().filter(a->a.isContainment()).collect(Collectors.toList()) ) {
			Class<?> refClass = attr.getReferencedType().getBeanClass();
			if( MMDoclet.class.equals(refClass) || MMSemanticMarkup.class.equals(refClass) || MMConstraint.class.equals(refClass))
				continue;
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


		for (MetamodelAttribute<?, ?> attr : mmType.getDeclaredAttributes()) {
			if( attr.isDerived() )
				continue;
			String coreAttrAsSrc = mmType.getBeanClass().getSimpleName() + "." + attr.getName() + "Attribute";
			String attrValueAsSrc = "mmBean." + attr.getGetterMethod().getName() + "()";
			bodySb.append("defaultAttribute( gen, " + coreAttrAsSrc + ", " + attrValueAsSrc + " );\n");
		}

		method.setBody(bodySb.toString());
	}

	final static Set<MetamodelType<?>> JAXB_MAIN_TYPE_RESULT = new HashSet<>( Arrays.asList(MMMessageDefinition.metaType(), 
			MMMessageComponent.metaType(), 
			MMChoiceComponent.metaType(),
			MMMessageElementContainer.metaType())); 

	final static Set<MetamodelType<?>> STATIC_FIELD = new HashSet<>( Arrays.asList(MMXor.metaType(),
			MMBusinessRole.metaType(),
			MMMessageDefinitionIdentifier.metaType(), 
			MMBusinessProcessCatalogue.metaType(),
			MMDataDictionary.metaType())); 

	final static Set<MetamodelType<?>> PROPERTY_RESULT = new HashSet<>( Arrays.asList( 
			MMBusinessAssociationEnd.metaType(),
			MMBusinessAttribute.metaType())); 
	
	final static Set<MetamodelType<?>> JAXB_PROPERTY_RESULT = new HashSet<>( Arrays.asList(MMMessageBuildingBlock.metaType(),
			MMMessageAssociationEnd.metaType(), 
			MMMessageAttribute.metaType())); 

	final static Set<MetamodelType<?>> DONT_GENERATE_BEANS = new HashSet<>( Arrays.asList( 
			MMRepository.metaType(), 
			MMBusinessProcessCatalogue.metaType(), 
			MMDataDictionary.metaType())); 
	
	protected Class<? extends GenerationResult> getResultType( MetamodelType<?> mmtype ) {
		if( STATIC_FIELD.contains(mmtype) )
			return StaticFieldResult.class;
		if( PROPERTY_RESULT.contains(mmtype) )
			return PropertyResult.class;
		if( JAXB_PROPERTY_RESULT.contains(mmtype) )
			return JaxbPropertyResult.class;
		if( JAXB_MAIN_TYPE_RESULT.contains(mmtype) )
			return JaxbMainTypeResult.class;
		if( MMCodeSet.metaType().equals(mmtype) )
			return EnumTypeResult.class;
		if( MMCode.metaType().equals(mmtype) )
			return EnumConstantResult.class;
		if( MMDataType.class.isAssignableFrom( mmtype.getBeanClass() ) ) 
				return DataTypeResult.class;
		else
			return MainTypeResult.class;
	}
	
}
