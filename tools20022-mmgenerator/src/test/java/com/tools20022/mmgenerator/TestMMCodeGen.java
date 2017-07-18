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

	@Test
	public void testGerateMMClasses() throws Exception {
		ECoreBackedMetamodel mb = new ECoreBackedMetamodel();
		mb.loadFromECore("/model/ISO20022.ecore");
		RawMetamodel mm = mb.build();

		Path srcRoot = Paths.get("/home/bukodi/eclipse/ws_mars1/iso20022-test-gen/src" );
		if( ! Files.exists(srcRoot)) {
			srcRoot = Paths.get("C:\\Users\\lbukodi\\workspace\\iso-test-generated\\src" );
		}
		DefaultMetamodelGenerator mmGenerator = new DefaultMetamodelGenerator(mm);
		GeneratorFileManager fm = new GeneratorFileManager(srcRoot);
		mmGenerator.generate(fm );


	}

}
