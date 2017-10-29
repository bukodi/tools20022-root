package com.tools20022.generators;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import javax.tools.DocumentationTool;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardLocation;

import org.jboss.forge.roaster.ParserException;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.JavaCore;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.CompilationUnit;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.internal.compiler.impl.CompilerOptions;
import org.jboss.forge.roaster._shade.org.eclipse.jface.text.Document;
import org.jboss.forge.roaster._shade.org.eclipse.text.edits.TextEdit;
import org.jboss.forge.roaster.model.source.JavaSource;
import org.jboss.forge.roaster.model.util.Formatter;

import de.dainel.cleanqualifiedtypes.CleanQualifiedTypes;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;

public class GenerationContext<M> {

	Map<String, JavaSource<?>> unsavedSources = new LinkedHashMap<>();
	private GeneratorFileManager fileManager;
	private Properties formatterOptions;
	private String licenceHeader;

	protected int totalNumberOfMainTypesToGenerate;
	protected int countOfGeneratedMainTypes;
	protected long generationStarted = System.currentTimeMillis();
	private boolean firstGeneratedFile = false;

	private boolean skipDocGeneration = false;

	public GenerationContext(Class<M> modelType) {
	}

	protected Properties getFormatterOptions() {
		if (formatterOptions == null) {
			// Create default
			// @see link org.jboss.forge.roaster.model.util.Formatter#readConfigInternal()
			formatterOptions = new Properties();
			formatterOptions.setProperty(JavaCore.COMPILER_SOURCE, CompilerOptions.VERSION_1_8);
			formatterOptions.setProperty(JavaCore.COMPILER_COMPLIANCE, CompilerOptions.VERSION_1_8);
			formatterOptions.setProperty(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, CompilerOptions.VERSION_1_8);
			// ROASTER-96: Add a blank line after imports. "1" is equivalent to TRUE in the
			// formatter XML file
			formatterOptions.setProperty(DefaultCodeFormatterConstants.FORMATTER_LINE_SPLIT, "240");
			formatterOptions.setProperty(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, "tab");
			formatterOptions.setProperty(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE, "4");
			// formatterOptions.setProperty(DefaultCodeFormatterConstants.FORMATTER_JOIN_WRAPPED_LINES,
			// "false");
			formatterOptions.setProperty(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_IMPORTS, "1");
			// formatterOptions.setProperty(DefaultCodeFormatterConstants.FORMATTER_JBLANK_LINES_AFTER_IMPORTS,
			// "1");
		}
		return formatterOptions;
	}

	public void setFormatterOptions(Properties formatterOptions) {
		if (this.formatterOptions != null)
			throw new IllegalStateException("formatterOptions already set");
		this.formatterOptions = formatterOptions;
	}

	public void setLicenceHeader(String licenceHeader) {
		this.licenceHeader = licenceHeader;
	}

	public void setSkipDocGeneration(boolean skipDocGeneration) {
		this.skipDocGeneration = skipDocGeneration;
	}

	public boolean isSkipDocGeneration() {
		return this.skipDocGeneration;
	}

	public void setLicenceHeaderGPLv3() {
		this.licenceHeader = licenceHeaderGPLv3;
	}

	public void dontChangeIfExists(Predicate<Path> filter) {
		getFileManager().dontChangeIfExists(filter);
	}

	protected GeneratorFileManager getFileManager() {
		if (fileManager == null) {
			try {
				// TODO: use jimfs instead of tmp dir
				Path mvnProjectRoot = Files.createTempDirectory("generatedMavenProject");
				setMavenProjectRoot(mvnProjectRoot);
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
		return fileManager;
	}

	protected void setFileManager(GeneratorFileManager fileManager) {
		if (this.fileManager != null)
			throw new IllegalStateException("fileManager already set");
		this.fileManager = fileManager;
	}

	public void setMavenProjectRoot(Path mvnProjectRoot) {
		if (Files.notExists(mvnProjectRoot)) {
			throw new UncheckedIOException(
					new FileNotFoundException(mvnProjectRoot.toFile().getAbsolutePath().toString()));
		}
		GeneratorFileManager fm = new GeneratorFileManager(mvnProjectRoot, x -> false);
		setFileManager(fm);
	}

	protected boolean isOverwriteProtected(FileObject fileObj) {
		return false;
	}

	public <T extends JavaSource<?>> T createSourceFile(Class<T> sourceType, StructuredName javaName) {
		if (!firstGeneratedFile) {
			firstGeneratedFile = true;
			generationStarted = System.currentTimeMillis();
		}
		T src = Roaster.create(sourceType);
		src.setPackage(javaName.getPackage());
		src.setName(javaName.getSimpleName());
		unsavedSources.put(src.getQualifiedName(), src);
		return src;
	}

	public void createPlantUmlImage(StructuredName javaName, String plantUmlSource) {
		SourceStringReader reader = new SourceStringReader(plantUmlSource);
		try {
			String relativeName = "doc-files/" + javaName.getCompilationUnit() + ".svg";
			FileObject svgFileObject = fileManager.getFileForOutput(DocumentationTool.Location.DOCUMENTATION_OUTPUT,
					javaName.getPackage(), relativeName, null);
			try (OutputStream svgOut = svgFileObject.openOutputStream()) {
				DiagramDescription desc = reader.outputImage(svgOut, new FileFormatOption(FileFormat.SVG, false));
			}
		} catch (IOException ioe) {
			throw new UncheckedIOException(ioe);
		}
	}

	public <T extends JavaSource<?>> T createSourceFile(Class<T> sourceType, String javaFqn) {
		if (!firstGeneratedFile) {
			firstGeneratedFile = true;
			generationStarted = System.currentTimeMillis();
		}
		T src = Roaster.create(sourceType);
		int posDot = javaFqn.lastIndexOf('.');
		src.setPackage(javaFqn.substring(0, posDot));
		src.setName(javaFqn.substring(posDot + 1));
		unsavedSources.put(src.getQualifiedName(), src);
		return src;
	}

	public void setTotalNumberOfMainTypesToGenerate(int numberOfFiles) {
		totalNumberOfMainTypesToGenerate = numberOfFiles;
	}

	private long lastPrinted = System.currentTimeMillis();

	public void saveSourceFile(JavaSource<?> src) {
		saveSourceFile(src, Collections.emptyList());
	}

	public void saveSourceFile(JavaSource<?> src, List<String> dontModifyImports) {
		if (null == unsavedSources.remove(src.getQualifiedName())) {
			throw new IllegalStateException("The " + src.getName() + " wasn't unsaved!");
		}
		try {
			JavaFileObject jf = getFileManager().getJavaFileForOutput(StandardLocation.SOURCE_OUTPUT,
					src.getQualifiedName(), Kind.SOURCE, null);
			try (Writer w = jf.openWriter()) {
				// Clean qualified types
				CleanQualifiedTypes.cleanAst((CompilationUnit) src.getInternal(), dontModifyImports);

				String srcAsFormattedString = Formatter.format(getFormatterOptions(), src.toUnformattedString());
				if (licenceHeader != null)
					w.append(licenceHeader);
				w.append(srcAsFormattedString);
				// w.append(src.toUnformattedString());
			}
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}

		countOfGeneratedMainTypes++;
		if (System.currentTimeMillis() - lastPrinted > 10 * 1000) {
			System.out.print(
					countOfGeneratedMainTypes + " of " + totalNumberOfMainTypesToGenerate + " Java files generated. ");
			System.out.print("( " + unsavedSources.size() + " unsaved files) ");
			long elapsedTime = System.currentTimeMillis() - generationStarted;
			System.out.print(" (" + (elapsedTime / 1000) + " secs, ");
			System.out.print("ETA: "
					+ (((elapsedTime * totalNumberOfMainTypesToGenerate / countOfGeneratedMainTypes) - elapsedTime)
							/ 1000)
					+ " secs )");
			System.out.println();
			lastPrinted = System.currentTimeMillis();
		}

	}

	public final void generate(M model, BiConsumer<M, GenerationContext<M>> generator) {
		long start = System.currentTimeMillis();
		// Delete unprotected files
		fileManager.cleanOutputFolder();

		generationStarted = System.currentTimeMillis();
		generator.accept(model, this);

		// Save the remaining unsaved sources

		System.out.println("Before loop: " + (System.currentTimeMillis() - start) + " ms");
		JavaSource<?> srcArray[] = new JavaSource<?>[unsavedSources.size()];
		int i = 0;
		for (Entry<String, JavaSource<?>> e : unsavedSources.entrySet()) {
			srcArray[i] = e.getValue();
			i++;
		}
		System.out.println("After loop:" + (System.currentTimeMillis() - start) + " ms");

		for (JavaSource<?> src : srcArray) {
			saveSourceFile(src);
		}
		System.out.println("Generation time:" + (System.currentTimeMillis() - start) + " ms");
	}

	private String toUnformattedString(CompilationUnit unit) {
		Document documentLocal = new Document();

		try {
			@SuppressWarnings("rawtypes")
			Map options = JavaCore.getOptions();
			options.put(CompilerOptions.OPTION_Source, CompilerOptions.VERSION_1_8);
			options.put(CompilerOptions.OPTION_Encoding, "UTF-8");
			TextEdit edit = unit.rewrite(documentLocal, options);
			edit.apply(documentLocal);
		} catch (Exception e) {
			throw new ParserException("Could not modify source: " + unit.toString(), e);
		}

		return documentLocal.get();
	}

	private static String licenceHeaderGPLv3 = "/* Tools20022 - API for ISO 20022\n"
			+ "* Copyright (C) 2017 Tools20022.com - László Bukodi \n" + "* \n"
			+ "* This program is free software: you can redistribute it and/or modify\n"
			+ "* it under the terms of the GNU General Public License as published by\n"
			+ "* the Free Software Foundation, either version 3 of the License, or\n"
			+ "* (at your option) any later version.\n" + "* \n"
			+ "* This program is distributed in the hope that it will be useful,\n"
			+ "* but WITHOUT ANY WARRANTY; without even the implied warranty of\n"
			+ "* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n"
			+ "* GNU General Public License for more details.\n" + "* \n"
			+ "* You should have received a copy of the GNU General Public License\n"
			+ "* along with this program.  If not, see <http://www.gnu.org/licenses/>.\n" + "*/\n\n";

}
