package com.tools20022.repogenerator;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.tools20022.generators.GenerationContext;

public class GenerateRepositoryArtifact {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Path srcRoot = Paths.get("../tools20022-repository/src/main/java/");
		if( Files.notExists(srcRoot) ) {
			throw new FileNotFoundException(srcRoot.toFile().getAbsolutePath().toString());
		}

		long usedMem, start;
		usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		start = System.currentTimeMillis();

		GenerationContext genCtx = new GenerationContext();
		DefaultRepoGenerator repoGenerator = new DefaultRepoGenerator();
		genCtx.setFileManagerRoot(srcRoot);
		genCtx.generate( repoGenerator );

		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Repo generation : " + (System.currentTimeMillis() - start) + " ms, " + ((usedMem2 - usedMem )/(1024*1024)) + " MB" + " (Max mem: " + (Runtime.getRuntime().maxMemory()/(1024*1024)) + " MB)");
	}
	
}
