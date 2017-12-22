package com.tools20022.repogenerator;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GeneratorFileManager;
import com.tools20022.generators.ProgressMonitor;
import com.tools20022.metamodel.StandardMetamodel2013;

public class TestGeneratedGenerator {

	static long usedMem, start;
	

	@BeforeClass
	public static void setup() {
		usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		start = System.currentTimeMillis();
	}

	@AfterClass
	public static void tearDown() {
		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Repo generation : " + (System.currentTimeMillis() - start) + " ms, "
				+ ((usedMem2 - usedMem) / (1024 * 1024)) + " MB" + " (Max mem: "
				+ (Runtime.getRuntime().maxMemory() / (1024 * 1024)) + " MB)");
	}

	@Test
	public void generateRepoSrc() throws Exception {
		Path mvnProjectRoot = Paths.get("../tools20022-testrepo/").toRealPath();
		//Path srcRoot = Paths.get("/tmp/1019/").toRealPath();

		EPackage ecorePkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
		//EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/msgdef-camt.030.001.04.iso20022");
		EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/msgdef-camt.030.001.04-nobuscomp.iso20022");
		//EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/business-area-pain.iso20022");
		//EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/business-domain-payments.iso20022");
		// EObject xmiRootObj = ECoreIOHelper
		// .loadXMIResource("/model/MandateInitiationRequestV05-with-BusinessConceptsV2.iso20022");
//		EObject xmiRootObj =
//		 ECoreIOHelper.loadXMIResource("/model/20170713_ISO20022_2013_eRepository.iso20022");
		XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
		RawRepository repo = loader.load(ecorePkg, xmiRootObj);
		
		GeneratorFileManager fileManager = new GeneratorFileManager(mvnProjectRoot);
		fileManager.dontChangeIfExists(p -> !p.toString().contains("com/tools20022/repository/"));
		fileManager.cleanOutputFolder();

		GenerationContext<RawRepository,GeneratedMetamodelBean> genCtx = new GenerationContext<>(RawRepository.class,GeneratedMetamodelBean.class, fileManager);
		genCtx.setSkipDocGeneration(true);
		genCtx.setLicenceHeaderGPLv3();

		ProgressMonitor monitor = new ProgressMonitor();
		genCtx.generate(repo, new CustomizedRepoGenerator(genCtx),monitor);
	}

}
