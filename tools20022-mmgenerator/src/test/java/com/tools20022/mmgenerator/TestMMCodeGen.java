package com.tools20022.mmgenerator;

import java.nio.file.Paths;

import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.GenerationContext;

public class TestMMCodeGen {

	@Test
	public void testGerateMMClasses() throws Exception {
		// Load metamodel
		EPackage ecorePkg = ECoreIOHelper.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
		RawMetamodel metamodel = new ECoreBackedMetamodel(ecorePkg );
		
		// Create generation context
		GenerationContext<RawMetamodel> genCtx = new GenerationContext<>(RawMetamodel.class);
		genCtx.setFileManagerRoot(Paths.get("../tools20022-metamodel/src/main/java"));

		// Execute generation
		genCtx.generate(metamodel, new DefaultMetamodelGenerator());
		System.out.println("Done.");
	}



}
