package com.tools20022.generators;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

public class TestFileIOHelper {

	@Test
	public void testDeleteAll() throws Exception {
		Path src = Files.createTempDirectory("src");
		try {
			Path customDir = Files.createDirectories(src.resolve("com/tools20022/custom"));
			Path generatedDir = Files.createDirectories(src.resolve("com/tools20022/generated"));
			Path customFile = Files.write(customDir.resolve("MyFile.java"), "class MyFile{}".getBytes());
			Path generatedFile = Files.write(generatedDir.resolve("GenFile.java"), "class GenFile{}".getBytes());
			FileIOHelper.deleteAllExcept(src, p -> p.toString().contains("/custom/"));
			assertTrue(Files.exists(customFile));
			assertFalse(Files.exists(generatedFile));
		} finally {
			FileIOHelper.deleteAllExcept(src, p -> false);
			Files.delete(src);
		}
	}
}
