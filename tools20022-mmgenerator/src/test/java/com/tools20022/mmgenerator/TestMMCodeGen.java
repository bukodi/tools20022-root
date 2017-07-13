package com.tools20022.mmgenerator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tools20022.generators.AbstractGenerator;
import com.tools20022.generators.GeneratorFileManager;
import com.tools20022.mmgenerator.DefaultMetamodelGenerator;
import com.tools20022.mmgenerator.ECoreBackedMetamodel;
import com.tools20022.mmgenerator.RawMetamodel;

public class TestMMCodeGen {

	static RawMetamodel mm;

	@BeforeClass
	public static void setup() {
		ECoreBackedMetamodel mb = new ECoreBackedMetamodel();
		mb.loadFromECore("/model/ISO20022.ecore");
		mm = mb.build();
	}

	@Test
	public void testGerateMMClasses() throws Exception {

		Path srcRoot = Paths.get("/home/bukodi/eclipse/ws_mars1/iso20022-test-gen/src" );
		if( ! Files.exists(srcRoot)) {
			srcRoot = Paths.get("C:\\Users\\lbukodi\\workspace\\iso-test-generated\\src" );
		}
		AbstractGenerator ctx = new DefaultMetamodelGenerator(mm);
		GeneratorFileManager fm = new GeneratorFileManager(srcRoot);
		ctx.generate(fm );


	}

	static class GenerationContext {

		
	}

}
