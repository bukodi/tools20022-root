package com.tools20022.generators;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardLocation;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaSource;

public abstract class AbstractGenerator<E> {

	Set<JavaSource<?>> allSources = new LinkedHashSet<>();
	JavaFileManager fileManager = null;

	protected abstract JavaName getJavaName(E mmElem);
	
	protected <T extends JavaSource<?>> T createSourceFile(Class<T> sourceType, E mmElem) {
		T src = createSourceFile(sourceType, getJavaName(mmElem));
		return src;
	}

	protected <T extends JavaSource<?>> T createSourceFile(Class<T> sourceType, JavaName javaName) {
		T src = Roaster.create(sourceType);
		src.setPackage(javaName.getPackage());
		src.setName(javaName.getSimpleName());
		allSources.add(src);
		return src;
	}

	protected abstract void generateMain();

	public final void generate( JavaFileManager fileManager) {
		this.fileManager = fileManager;
		long start = System.currentTimeMillis();
		generateMain();
		System.out.println( "Generation time:" + (System.currentTimeMillis() - start) + " ms");
		start = System.currentTimeMillis();
		for (JavaSource<?> src : allSources) {
			try {
				JavaFileObject jf = fileManager.getJavaFileForOutput(StandardLocation.SOURCE_OUTPUT,
						src.getQualifiedName(), Kind.SOURCE, null);
				try (Writer w = jf.openWriter()) {
					w.append(src.toString());
				}
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
		System.out.println( "Save and format time:" + (System.currentTimeMillis() - start) + " ms");
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
