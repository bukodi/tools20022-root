package com.tools20022.mmgenerator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.Test;

public class TestMMCodeGen {

	@Test
	public void testGerateMMClasses() throws Exception {
		DefaultMetamodelGenerator mmGenerator = new DefaultMetamodelGenerator();
		mmGenerator.generate();
		System.out.println("Done.");
	}

	static void deleteAll(Path directory) throws IOException {
		if (Files.notExists(directory))
			return;
		Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				Files.delete(file);
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				Files.delete(dir);
				return FileVisitResult.CONTINUE;
			}

		});
	}

	static void isEquals(Path rootDirExpected, Path rootDirActual) throws IOException {
		Files.walkFileTree(rootDirExpected, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path fileExpected, BasicFileAttributes attrs) throws IOException {
				Path fileActual = rootDirActual.resolve(rootDirExpected.relativize(fileExpected));
				byte[] expectedBytes = Files.readAllBytes(fileExpected);
				byte[] actualBytes = Files.readAllBytes(fileActual);
				if (!Arrays.equals(expectedBytes, actualBytes)) {
					System.err.println("Expected: " + fileExpected.toString());
					System.err.println("Actual  : " + fileActual.toString());
					throw new RuntimeException();
				}
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dirExpected, IOException exc) throws IOException {
				Path dirActual = rootDirActual.resolve(rootDirExpected.relativize(dirExpected));
				long cntExpectedFiles = Files.list(dirExpected).count();
				long cntActualFiles = Files.list(dirActual).count();
				if (cntExpectedFiles != cntActualFiles) {
					System.err.println("Expected: " + dirExpected.toString());
					System.err.println("Actual  : " + dirActual.toString());
					throw new RuntimeException();
				}
				return FileVisitResult.CONTINUE;
			}

		});
	}

	public static byte[] createZip(Path... filesOrDirs) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try (ZipOutputStream zos = new ZipOutputStream(baos)) {
			for (Path fileOrDir : filesOrDirs) {
				addToZip(zos, "", fileOrDir);
			}
		} catch (IOException ioe) {
			throw new UncheckedIOException(ioe);
		}
		return baos.toByteArray();
	}

	private static void addToZip(ZipOutputStream zos, String basePath, Path fileOrDir) throws IOException {
		if (Files.isDirectory(fileOrDir)) {
			AtomicBoolean isEmptyDir = new AtomicBoolean(true);
			Files.list(fileOrDir).forEachOrdered(p -> {
				isEmptyDir.set(false);
				try {
					addToZip(zos, basePath + "/" + fileOrDir.getFileName(), p);
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			});
			if (isEmptyDir.get()) {
				zos.putNextEntry(new ZipEntry(basePath + "/" + fileOrDir.getFileName() + "/"));
				zos.closeEntry();
			}
		} else {
			zos.putNextEntry(new ZipEntry(basePath + "/" + fileOrDir.getFileName()));
			zos.write(Files.readAllBytes(fileOrDir));
			zos.closeEntry();
		}
	}

}
