package com.tools20022.testrepo;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.GenerationResult.JavaResult;
import com.tools20022.generators.JavaName;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repogenerator.DefaultRepoGenerator;
import com.tools20022.repogenerator.RawRepository;
import com.tools20022.repogenerator.XMILoader;

public class GenerateSources {

	static long usedMem, start;
	
	@BeforeClass
	public static void setup() {
		usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		start = System.currentTimeMillis();
	}
	
	@AfterClass
	public static void tearDown() {
		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Repo generation : " + (System.currentTimeMillis() - start) + " ms, " + ((usedMem2 - usedMem )/(1024*1024)) + " MB" + " (Max mem: " + (Runtime.getRuntime().maxMemory()/(1024*1024)) + " MB)");
	}

	@Test
	public void generateRepoSrc() throws Exception {
		Path srcRoot = Paths.get("src/main/java/");
		if( Files.notExists(srcRoot) ) {
			throw new FileNotFoundException(srcRoot.toFile().getAbsolutePath().toString());
		}

		EPackage ecorePkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
		EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/MandateInitiationRequestV05-with-BusinessConcepts.iso20022");
		XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());		
		RawRepository repo = loader.load( ecorePkg, xmiRootObj);

		GenerationContext<RawRepository> genCtx = new GenerationContext<>(RawRepository.class);
		genCtx.setFileManagerRoot(srcRoot);

		start = System.currentTimeMillis();
		System.out.println("Repo load time : " + (System.currentTimeMillis() - start) + " ms ");
		genCtx.generate( repo, new TestRepoGenerator() );
		//genCtx.generate( repo, new DefaultRepoGenerator() );
		System.out.println("Generation time : " + (System.currentTimeMillis() - start) + " ms ");
	}
	
	public static class TestRepoGenerator extends DefaultRepoGenerator {

		@Override
		public void accept(RawRepository repo, GenerationContext<RawRepository> ctx) {
			this.repo = repo;
			this.ctx = ctx;
			this.basePackageName = "test.repository";
			
			repo.getRootObject();
			
			this.genRepoMain = generateMMRepository(null, repo.getRootObject());
			
			Collection<? extends GeneratedMetamodelBean> allObjects = repo.listObjects().collect(Collectors.toCollection(LinkedHashSet::new));
			for( GeneratedMetamodelBean obj : allObjects ) {
				getOrCreateSingelonClass(obj);
			}
			
		}
		
		JavaResult<JavaClassSource> getOrCreateSingelonClass( GeneratedMetamodelBean mmBean ) {
			JavaName javaName = getJavaName(mmBean);
			if( javaName == null || javaName.getMemberName() != null || javaName.getNestedTypeName() != null ) {
				return null;
				//throw new IllegalArgumentException("Not a compilation unit name: " + javaName );				
			}
			
			
			JavaClassSource src = ctx.createSourceFile(JavaClassSource.class, javaName);
			
			// Constructor
			MethodSource<JavaClassSource> strConstr = src.addMethod().setConstructor(true);
			strConstr.setPrivate();
			
			String body = "";
			for( MetamodelAttribute<?, ?> mmAttr : mmBean.getMetamodel().getAllAttributes() ) {
				 //mmAttr.get(mmBean);
			}
			
			
			MetamodelType<?> metamodelType = repo.getMetamodel().getTypeByClass(mmBean.getClass());
			src.addImport(mmBean.getClass());
			src.setSuperType(mmBean.getClass());

			src.addField("private final static " + javaName.getSimpleName() + " INSTANCE = new " + javaName.getSimpleName() + "();");
			src.addMethod("public static " + javaName.getSimpleName() + " instance() { return INSTANCE;}" );

			for( MetamodelAttribute<?, ?> attr :  metamodelType.getDeclaredAttributes() ) {
			}
			
			return GenerationResult.fromJavaSource(src);
		}
		
		JavaResult<JavaClassSource> generateMMRepository(GenerationResult container, MMRepository mmBean ) {
			JavaResult<JavaClassSource> srcRepoMain = getOrCreateSingelonClass(mmBean);
	
			return srcRepoMain;
		}
		
	}

}
