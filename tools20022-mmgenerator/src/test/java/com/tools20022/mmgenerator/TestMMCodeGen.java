package com.tools20022.mmgenerator;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import com.tools20022.generators.GenerationContext;

public class TestMMCodeGen {

	@Test
	public void testGerateMMClasses() throws Exception {
		Path srcRoot = Paths.get("../tools20022-metamodel/src/main/java");
		
		GenerationContext genCtx = new GenerationContext();
		genCtx.setFileManagerRoot(srcRoot);
		DefaultMetamodelGenerator mmGenerator = new DefaultMetamodelGenerator();
		genCtx.generate(mmGenerator);
		System.out.println("Done.");
	}



}
