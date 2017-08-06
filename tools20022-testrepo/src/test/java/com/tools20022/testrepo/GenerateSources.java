package com.tools20022.testrepo;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repogenerator.DefaultRepoGenerator;
import com.tools20022.repogenerator.RawRepository;

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

		DefaultRepoGenerator repoGenerator = new DefaultRepoGenerator();
		repoGenerator.setFileManagerRoot(srcRoot);

		EPackage ecorePkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
		EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/MandateInitiationRequestV05-with-BusinessConcepts.iso20022");
		repoGenerator.loadRepository(StandardMetamodel2013.metamodel(), ecorePkg, xmiRootObj);
		start = System.currentTimeMillis();
		RawRepository repo = repoGenerator.getRepository();
		System.out.println("Repo load time : " + (System.currentTimeMillis() - start) + " ms ");
		repoGenerator.generate();
		System.out.println("Generation time : " + (System.currentTimeMillis() - start) + " ms ");
	}

}
