package com.tools20022.repogenerator;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.GenerationContext;
import com.tools20022.metamodel.StandardMetamodel2013;

public class GenerateRepositoryArtifact {
	
	public static void main(String[] args) throws FileNotFoundException {
		Path mvnProjectRoot = Paths.get("../tools20022-repository/");

		long usedMem, start;
		usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		start = System.currentTimeMillis();

		RawRepository repo;
		{
			final EPackage ecorePkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
			EObject rootEObj = ECoreIOHelper.loadXMIResource("/model/20170713_ISO20022_2013_eRepository.iso20022");
			XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());		
			repo = loader.load( ecorePkg, rootEObj);
		}
		
		GenerationContext<RawRepository> genCtx = new GenerationContext<>(RawRepository.class);
		genCtx.setMavenProjectRoot(mvnProjectRoot);
		genCtx.generate( repo, new CustomizedRepoGenerator() );

		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Repo generation : " + (System.currentTimeMillis() - start) + " ms, " + ((usedMem2 - usedMem )/(1024*1024)) + " MB" + " (Max mem: " + (Runtime.getRuntime().maxMemory()/(1024*1024)) + " MB)");
	}
	
}
