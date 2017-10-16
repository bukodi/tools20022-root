package com.tools20022.repogenerator;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.GenerationContext;
import com.tools20022.metamodel.StandardMetamodel2013;
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
		System.out.println("Repo generation : " + (System.currentTimeMillis() - start) + " ms, "
				+ ((usedMem2 - usedMem) / (1024 * 1024)) + " MB" + " (Max mem: "
				+ (Runtime.getRuntime().maxMemory() / (1024 * 1024)) + " MB)");
	}

	@Test
	public void generateRepoSrc() throws Exception {
		Path srcRoot = Paths.get("../tools20022-testrepo/src/main/java/").toRealPath();
		if (Files.notExists(srcRoot)) {
			throw new FileNotFoundException(srcRoot.toFile().getAbsolutePath().toString());
		}

		EPackage ecorePkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
		EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/business-area-pain.iso20022");
		//EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/business-domain-payments.iso20022");
		// EObject xmiRootObj = ECoreIOHelper
		// .loadXMIResource("/model/MandateInitiationRequestV05-with-BusinessConceptsV2.iso20022");
		// EObject xmiRootObj =
		// ECoreIOHelper.loadXMIResource("/model/20170516_ISO20022_2013_eRepository.iso20022");
		XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
		RawRepository repo = loader.load(ecorePkg, xmiRootObj);

		GenerationContext<RawRepository> genCtx = new GenerationContext<>(RawRepository.class);
		genCtx.setFileManagerRoot(srcRoot);
		genCtx.dontChangeIfExists(p -> false);

		start = System.currentTimeMillis();
		System.out.println("Repo load time : " + (System.currentTimeMillis() - start) + " ms ");
		genCtx.generate(repo, new TestRepoGenerator());
		// genCtx.generate( repo, new DefaultRepoGenerator() );
		System.out.println("Generation time : " + (System.currentTimeMillis() - start) + " ms ");
	}

}
