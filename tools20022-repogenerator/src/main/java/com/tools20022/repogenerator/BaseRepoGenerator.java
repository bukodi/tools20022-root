package com.tools20022.repogenerator;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.PropertySource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.GenerationResult.JavaResult;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.metamodel.struct.MMBusinessAttribute_;
import com.tools20022.metamodel.struct.MMMessageBuildingBlock_;

public abstract class BaseRepoGenerator implements BiConsumer<RawRepository,GenerationContext<RawRepository>> {

	/*** Customizable options ***/
	protected String basePackageName = "com.tools20022.repository";
	protected String mainClassSimpleName = "GeneratedRepository";

	/*** Set in {@link #accept(RawRepository, GenerationContext)} ***/  
	protected RawRepository repo;
	protected GenerationContext<RawRepository> ctx;

	/*** Store intermediate generation results ***/ 
	protected JavaResult<JavaClassSource> genRepoMain;
	
	@Override
	public void accept(RawRepository repo, GenerationContext<RawRepository> ctx) {
		this.repo = repo;
		this.ctx = ctx;

		// Count main types to generate
		{
			long start = System.currentTimeMillis();
			AtomicInteger totalNumberOfMainTypesToGenerate = new AtomicInteger();
			repo.listContent(repo.getRootObject(), true,  true).forEach(repoObj->{
				StructuredName javaName = getStructuredName(repoObj);
				if( javaName != null && javaName.getMemberName() == null && javaName.getNestedTypeName() == null )
					totalNumberOfMainTypesToGenerate.incrementAndGet();
			});
			ctx.setTotalNumberOfMainTypesToGenerate(totalNumberOfMainTypesToGenerate.get());
			System.out.println( "Found " + totalNumberOfMainTypesToGenerate + " java sources to generate. ( Calculated in " + (System.currentTimeMillis()-start) + " msec )");
		}
		
		// Create repo skeleton
		{
			StructuredName repoName = StructuredName.primaryType(basePackageName, mainClassSimpleName );
			JavaClassSource srcRepoMain = ctx.createSourceFile(JavaClassSource.class, repoName);
			srcRepoMain.addImport(ReflectionBasedRepository.class);
			srcRepoMain.setSuperType(ReflectionBasedRepository.class);
			genRepoMain = GenerationResult.fromJavaSource(srcRepoMain);
	
			// Add constructor
			srcRepoMain.addImport(StandardMetamodel2013.class);
			srcRepoMain.addMethod().setConstructor(true).setPrivate()
					.setBody("super( " + StandardMetamodel2013.class.getSimpleName() + ".metamodel());");
		}
	
		MMRepository root = repo.getRootObject();
	
	}
		

	protected StructuredName getStructuredName(GeneratedMetamodelBean mmElem) {
		
		BiFunction<GeneratedMetamodelBean, String, StructuredName> createJavaNameAsMemeber = (parentElem, memberName) -> {
			StructuredName parentStructName = getStructuredName(parentElem.getContainer());
			memberName = RoasterHelper.convertToJavaName(memberName);
			return StructuredName.member(parentStructName, memberName) ;
		};
	
		if (mmElem instanceof MMRepository) {
			return StructuredName.primaryType(basePackageName, mainClassSimpleName );
		} else if (mmElem instanceof MMDataDictionary) {
			return createJavaNameAsMemeber.apply(mmElem, "dataDict");
		} else if (mmElem instanceof MMBusinessProcessCatalogue) {
			return createJavaNameAsMemeber.apply(mmElem, "catalogue");
		} else if (mmElem instanceof MMBusinessAssociationEnd) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessAssociationEnd) mmElem).getName());
		} else if (mmElem instanceof MMBusinessAttribute) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessAttribute) mmElem).getName());
		} else if (mmElem instanceof MMMessageAssociationEnd) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageAssociationEnd) mmElem).getName());
		} else if (mmElem instanceof MMMessageAttribute) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageAttribute) mmElem).getName());
		} else if (mmElem instanceof MMMessageBuildingBlock) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageBuildingBlock) mmElem).getName());
		} else if (mmElem instanceof MMMessageDefinitionIdentifier) {
			return createJavaNameAsMemeber.apply(mmElem, "identifier");
		} else if (mmElem instanceof MMXor) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMXor) mmElem).getName());
		} else if (mmElem instanceof MMBusinessRole) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessRole) mmElem).getName());
		} else if (mmElem instanceof MMCode) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMCode) mmElem).getName());
		}
	
		String pkg;
		String cuName;
	
		// CU name
		if (mmElem instanceof MMRepositoryConcept) {
			cuName = (((MMRepositoryConcept) mmElem).getName()).toString();
		} else {
			cuName = null;
		}
	
		// Package
		if (mmElem instanceof MMMessageDefinition) {
			MMMessageDefinition msgDef = (MMMessageDefinition) mmElem;
			String areaCode = msgDef.getBusinessArea() == null ? "other"
					: msgDef.getBusinessArea().getCode() == null ? "other" : msgDef.getBusinessArea().getCode();
			pkg = "area." + areaCode;
		} else if (mmElem instanceof MMTopLevelCatalogueEntry) {
			if (mmElem instanceof MMMessageSet) {
				pkg = "msgset";
			} else if (mmElem instanceof MMBusinessArea) {
				pkg = "area";
			} else {
				pkg = "other";
			}
		} else if (mmElem instanceof MMTopLevelDictionaryEntry) {
			if (mmElem instanceof MMCodeSet) {
				pkg = "codeset";
			} else if (mmElem instanceof MMDataType) {
				pkg = "datatype";
			} else if (mmElem instanceof MMBusinessComponent) {
				pkg = "entity";
			} else if (mmElem instanceof MMMessageComponent) {
				pkg = "msg";
			} else if (mmElem instanceof MMChoiceComponent) {
				pkg = "choice";
			} else {
				pkg = "other";
			}
		} else {
			return null;
		}
		pkg = basePackageName + ".struct." + pkg;
	
		if (cuName == null) {
			return null;
		}
	
		cuName = RoasterHelper.convertToJavaName(cuName);
	
		if (mmElem instanceof MMBusinessArea) {
			if (cuName.endsWith("master"))
				cuName = cuName.substring(0, cuName.length() - "master".length());
			if (cuName.endsWith("version"))
				cuName = cuName.substring(0, cuName.length() - "version".length()) + "Version";
		}
	
		return StructuredName.primaryType(pkg, cuName + "_");
	}
	
	protected <MB extends GeneratedMetamodelBean, T> GenerationResult defaultOptionalAttribute( GenerationResult gen, 
			MetamodelAttribute<MB, Optional<T>> mmAttr, Optional<T> optValue) {
		return null;
	}

	protected <MB extends GeneratedMetamodelBean, T> GenerationResult defaultMandatoryAttribute( GenerationResult gen, 
			MetamodelAttribute<MB, T> mmAttr, T value) {
		return null;
	}

	protected <MB extends GeneratedMetamodelBean, T> GenerationResult defaultMultivalueAttribute( GenerationResult gen, 
			MetamodelAttribute<MB, List<T>> mmAttr, List<T> values) {
		return null;
	}


}
