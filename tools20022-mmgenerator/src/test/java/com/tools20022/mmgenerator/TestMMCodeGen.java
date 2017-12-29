package com.tools20022.mmgenerator;

import java.io.File;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import com.tools20022.core.metamodel.Metamodel.MetamodelElement;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GeneratorFileManager;
import com.tools20022.generators.ProgressMonitor;

public class TestMMCodeGen {

	@Test
	public void testGerateMMClasses() throws Exception {
		// Load metamodel
		EPackage ecorePkg = ECoreIOHelper.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
		RawMetamodel metamodel = new ECoreBackedMetamodel(ecorePkg );
		
		GeneratorFileManager fileManager = new GeneratorFileManager(Paths.get("../tools20022-metamodel/"));
		fileManager.dontChangeIfExists(p -> p.toString().contains( File.separator + "constraints" + File.separator ) || p.toString().contains(File.separator + "derived" + File.separator )  || p.toString().contains(File.separator + "ext" + File.separator ) );
		fileManager.cleanOutputFolder();
		
		// Create generation context
		GenerationContext<RawMetamodel,RawMetamodel.MetamodelElement> genCtx = new GenerationContext<>(RawMetamodel.class,RawMetamodel.MetamodelElement.class, fileManager);
		genCtx.setLicenceHeaderGPLv3();

		// Execute generation
		ProgressMonitor monitor = new ProgressMonitor();
		genCtx.generate(metamodel, new DefaultMetamodelGenerator(genCtx), monitor);
	}



}
