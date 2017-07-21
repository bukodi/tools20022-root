package com.tools20022.repogenerator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
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
	public void testGerateRepoClasses() throws Exception {
		DefaultRepoGenerator ctx = new DefaultRepoGenerator();
		ctx.generate();
	}

}
