package com.tools20022.repogenerator;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestRepoCodeGen {

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
	@Ignore
	public void testGerateRepoClasses() throws Exception {
		DefaultRepoGenerator repoGenerator = new DefaultRepoGenerator();
		start = System.currentTimeMillis();
		RawRepository repo = repoGenerator.getRepository();
		System.out.println("Repo load time : " + (System.currentTimeMillis() - start) + " ms ");
		
		
//		repoGenerator.generate();
	}

}
