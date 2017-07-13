package com.tools20022.repogenerator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.jboss.forge.roaster.model.impl.TypeImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tools20022.generators.AbstractGenerator;
import com.tools20022.generators.GeneratorFileManager;

import test.gen.mm.StandardMetamodel2013;

public class TestRepoCodeGen {

	static RawRepository repo;
	static long usedMem, start;
	
	@BeforeClass
	public static void setup() {
		usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		start = System.currentTimeMillis();

		XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
		repo = loader.load("/model/ISO20022.ecore", "/model/20170516_ISO20022_2013_eRepository.iso20022");
		//repo = loader.load("/model/ISO20022.ecore", "/test.iso20022");
	}
	
	@AfterClass
	public static void tearDown() {
		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Repo generation : " + (System.currentTimeMillis() - start) + " ms, " + ((usedMem2 - usedMem )/(1024*1024)) + " MB" + " (Max mem: " + (Runtime.getRuntime().maxMemory()/(1024*1024)) + " MB)");
	}

	@Test
	public void testGerateRepoClasses() throws Exception {

		Path srcRoot = Paths.get("/home/bukodi/eclipse/ws_mars1/iso20022-test-gen/src" );
		if( ! Files.exists(srcRoot)) {
			srcRoot = Paths.get("C:\\Users\\lbukodi\\workspace\\iso-test-generated\\src" );
		}
		
		AbstractGenerator ctx = new DefaultRepoGenerator(repo);
		GeneratorFileManager fm = new GeneratorFileManager(srcRoot);
		ctx.generate(fm );

	}

	static class GenerationContext {

		
	}

}
