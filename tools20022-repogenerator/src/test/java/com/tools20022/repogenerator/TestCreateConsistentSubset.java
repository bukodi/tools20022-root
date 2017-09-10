package com.tools20022.repogenerator;

import static org.junit.Assert.fail;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.StandardMetamodel2013;

public class TestCreateConsistentSubset {

	final static RawRepository repo;

	static {
		long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long start = System.currentTimeMillis();
		try {
			EPackage ecorePkg = ECoreIOHelper
					.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
			EObject rootEObj = ECoreIOHelper.loadXMIResource(
					ECoreIOHelper.class.getResourceAsStream("/model/20170516_ISO20022_2013_eRepository.iso20022"));
			XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
			repo = loader.load(ecorePkg, rootEObj);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Model load: " + (System.currentTimeMillis() - start) + " ms, "
				+ ((usedMem2 - usedMem) / (1024 * 1024)) + " MB");
	}
	
	@Test
	public void testApply() {
		RawRepository filteredRepo = (new CreateConsistentSubset()).createSubset(repo, repoObj-> {
			if( repoObj instanceof MMMessageDefinition) {
				return ((MMMessageDefinition)repoObj).getName().equals("MandateInitiationRequestV05");
			} else {
				return false;
			}
		});
		
		System.out.println( "Done.");
	}

}
