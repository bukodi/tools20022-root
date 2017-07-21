package com.tools20022.generators;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardLocation;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.JavaCore;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.internal.compiler.impl.CompilerOptions;
import org.jboss.forge.roaster.model.source.JavaSource;
import org.jboss.forge.roaster.model.util.Formatter;

public abstract class AbstractGenerator<E> {

	Set<JavaSource<?>> allSources = new LinkedHashSet<>();
	private JavaFileManager fileManager;
	private Properties formatterOptions;

	protected AbstractGenerator() {
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

	protected abstract JavaName getJavaName(E mmElem);

	protected <T extends JavaSource<?>> T createSourceFile(Class<T> sourceType, E mmElem) {
		T src = createSourceFile(sourceType, getJavaName(mmElem));
		return src;
	}

	protected boolean isOverwriteProtected(FileObject fileObj) {
		return false;
	}

	protected <T extends JavaSource<?>> T createSourceFile(Class<T> sourceType, JavaName javaName) {
		T src = Roaster.create(sourceType);
		src.setPackage(javaName.getPackage());
		src.setName(javaName.getSimpleName());
		allSources.add(src);
		return src;
	}

	protected abstract void generateMain();

	public final void generate() {
		long start = System.currentTimeMillis();
		generateMain();
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

	protected final static Set<String> JAVA_RESERVED_WORDS = Collections.unmodifiableSet(new HashSet<>(
			Arrays.asList("continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized",
					"boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw",
					"byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
					"catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class",
					"finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while")));

	protected final static Map<String, Class<?>> JAVA_PRIMITIVE_TYPE_WRAPPERS;
	static {
		HashMap<String, Class<?>> tmp = new HashMap<>();
		tmp.put("boolean", Boolean.class);
		tmp.put("byte", Byte.class);
		tmp.put("char", Character.class);
		tmp.put("double", Double.class);
		tmp.put("float", Float.class);
		tmp.put("int", Integer.class);
		tmp.put("long", Long.class);
		tmp.put("short", Short.class);
		tmp.put("void", Void.class);
		JAVA_PRIMITIVE_TYPE_WRAPPERS = Collections.unmodifiableMap(tmp);
	}

}
