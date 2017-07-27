package com.tools20022.repogenerator;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenerateRepositoryArtifact {

	public static void main(String[] args) throws FileNotFoundException {
		Path srcRoot = Paths.get("../tools20022-repository/src/main/java/");
		if( Files.notExists(srcRoot) ) {
			throw new FileNotFoundException(srcRoot.toFile().getAbsolutePath().toString());
		}
		
		DefaultRepoGenerator repoGenerator = new DefaultRepoGenerator();
		repoGenerator.setFileManagerRoot(srcRoot);
		repoGenerator.generate();
	}
}
