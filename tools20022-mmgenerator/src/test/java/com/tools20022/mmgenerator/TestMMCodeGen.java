package com.tools20022.mmgenerator;

import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.junit.Test;

import com.tools20022.mmgenerator.RawMetamodel.MetamodelType;

public class TestMMCodeGen {

	@Test
	public void testGerateMMClasses() throws Exception {
		DefaultMetamodelGenerator mmGenerator = new DefaultMetamodelGenerator() {

			@Override
			void generateMMClass(JavaClassSource srcMetamodelMain, MetamodelType mmType) {
			}
			
		};
		mmGenerator.generate();
	}

}
