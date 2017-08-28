package com.tools20022.generators;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

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

public class GenerationContext<M> {

	Map<String,JavaSource<?>> unsavedSources = new LinkedHashMap<>();
	private GeneratorFileManager fileManager;
	private Properties formatterOptions;

	protected int totalNumberOfMainTypesToGenerate;
	protected int countOfGeneratedMainTypes;
	protected long generationStarted = System.currentTimeMillis();
	private boolean firstGeneratedFile = false;

	public GenerationContext(Class<M> modelltype) {
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
			formatterOptions.setProperty(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_IMPORTS, "1");
		}
		return formatterOptions;
	}

	public void setFormatterOptions(Properties formatterOptions) {
		if (this.formatterOptions != null)
			throw new IllegalStateException("formatterOptions already set");
		this.formatterOptions = formatterOptions;
	}

	public void dontChangeIfExists(Predicate<Path> filter) {
		getFileManager().dontChangeIfExists(filter);
	}

	protected GeneratorFileManager getFileManager() {
		if (fileManager == null) {
			try {
				// TODO: use jimfs instead of tmp dir
				Path srcRoot = Files.createTempDirectory("generatedSourceRoot");
				setFileManagerRoot(srcRoot);
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

	public void setFileManagerRoot(Path srcRoot) {
		GeneratorFileManager fm = new GeneratorFileManager(srcRoot, x -> false);
		setFileManager(fm);
	}

	protected boolean isOverwriteProtected(FileObject fileObj) {
		return false;
	}

	public <T extends JavaSource<?>> T createSourceFile(Class<T> sourceType, JavaName javaName) {
		if ( ! firstGeneratedFile   ) {
			firstGeneratedFile = true;
			generationStarted = System.currentTimeMillis();
		}
		T src = Roaster.create(sourceType);
		src.setPackage(javaName.getPackage());
		src.setName(javaName.getSimpleName());
		unsavedSources.put( src.getQualifiedName(), src);
		return src;
	}

	public void setTotalNumberOfMainTypesToGenerate(int numberOfFiles ) {
		totalNumberOfMainTypesToGenerate = numberOfFiles;
	}

	public void saveSourceFile(JavaSource<?> src) {		
		if( null == unsavedSources.remove(src.getQualifiedName()) ) {
			throw new IllegalStateException("The " + src.getName() + " wasn't unsaved!");
		}
		try {
			JavaFileObject jf = getFileManager().getJavaFileForOutput(StandardLocation.SOURCE_OUTPUT,
					src.getQualifiedName(), Kind.SOURCE, null);
			try (Writer w = jf.openWriter()) {
//				String srcAsFormattedString = Formatter.format(getFormatterOptions(), src.toUnformattedString());
//				w.append(srcAsFormattedString);
				w.append(src.toUnformattedString());
			}
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
		
		countOfGeneratedMainTypes ++;
		if( countOfGeneratedMainTypes % 100 == 0 ) {
			System.out.print(  countOfGeneratedMainTypes + " of " + totalNumberOfMainTypesToGenerate + " Java files generated. ");
			System.out.print( "( " + unsavedSources.size() + " unsaved files) ");
			long elapsedTime = System.currentTimeMillis() - generationStarted;
			System.out.print(" (" + (elapsedTime/1000) + " secs, ");
			System.out.print("ETA: " + ((( elapsedTime* totalNumberOfMainTypesToGenerate / countOfGeneratedMainTypes) - elapsedTime) / 1000 ) + " secs )" );
			System.out.println();
		}
		
	}



	public final void generate(M model, BiConsumer<M, GenerationContext<M>> generator) {
		long start = System.currentTimeMillis();
		generationStarted = System.currentTimeMillis();
		generator.accept(model, this);
		
		// Save the remaining unsaved sources
		for (JavaSource<?> src : new HashSet<>( unsavedSources.values() )) {
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

}
