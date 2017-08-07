package com.tools20022.generators;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;
import java.util.function.Consumer;

import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;
import javax.tools.JavaFileObject.Kind;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.JavaCore;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.internal.compiler.impl.CompilerOptions;
import org.jboss.forge.roaster.model.source.JavaSource;
import org.jboss.forge.roaster.model.util.Formatter;

public class GenerationContext {

	Set<JavaSource<?>> allSources = new LinkedHashSet<>();
	private JavaFileManager fileManager;
	private Properties formatterOptions;

	public GenerationContext() {
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
		if( this.formatterOptions != null )
			throw new IllegalStateException("formatterOptions already set");
		this.formatterOptions = formatterOptions;
	}

	protected JavaFileManager getFileManager() {
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

	protected void setFileManager(JavaFileManager fileManager) {
		if( this.fileManager != null )
			throw new IllegalStateException("fileManager already set");
		this.fileManager = fileManager;
	}

	public void setFileManagerRoot(Path srcRoot) {
		GeneratorFileManager fm = new GeneratorFileManager(srcRoot);
		setFileManager(fm);
	}

	protected boolean isOverwriteProtected(FileObject fileObj) {
		return false;
	}

	public <T extends JavaSource<?>> T createSourceFile(Class<T> sourceType, JavaName javaName) {
		T src = Roaster.create(sourceType);
		src.setPackage(javaName.getPackage());
		src.setName(javaName.getSimpleName());
		allSources.add(src);
		return src;
	}

	public final void generate( Consumer<GenerationContext> generator ) {
		long start = System.currentTimeMillis();
		
		generator.accept( this );

		System.out.println("Generation time:" + (System.currentTimeMillis() - start) + " ms");
		start = System.currentTimeMillis();
		for (JavaSource<?> src : allSources) {
			try {
				JavaFileObject jf = getFileManager().getJavaFileForOutput(StandardLocation.SOURCE_OUTPUT,
						src.getQualifiedName(), Kind.SOURCE, null);
				try (Writer w = jf.openWriter()) {
					String srcAsFormattedString = Formatter.format(getFormatterOptions(), src.toUnformattedString());
					w.append(srcAsFormattedString);
				}
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
		System.out.println("Save and format time:" + (System.currentTimeMillis() - start) + " ms");
	}


}
