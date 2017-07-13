package com.tools20022.repogenerator;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.tools20022.generators.PerformantXMIResourceFactoryImpl;

public class TestUtil {

	private static EPackage metamodelPkg;
	
	public static synchronized EPackage getISO200022Ecore() {
		if( metamodelPkg == null ) {
			metamodelPkg = loadECoreFromReasouce("/model/ISO20022.ecore");
			EPackage.Registry.INSTANCE.put(metamodelPkg.getNsURI(), metamodelPkg);
		}			
		return metamodelPkg;
	}

	private static EPackage loadECoreFromReasouce(String eCoreResource) {
		try {
			ResourceSet load_resourceSet = new ResourceSetImpl();
			load_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
					new PerformantXMIResourceFactoryImpl());

			URL url = TestUtil.class.getResource(eCoreResource);

			// Create empty resource with the given URI
			Resource load_resource = load_resourceSet.getResource(URI.createURI(url.toString()), true);

			EPackage rootPkg = (EPackage) load_resource.getContents().get(0);
			return rootPkg;
		} catch (Exception e) {
			throw new RuntimeException("Can't load ECore resource: " + eCoreResource, e);
		}
	}

	

}
