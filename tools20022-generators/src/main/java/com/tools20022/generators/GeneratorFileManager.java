package com.tools20022.generators;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.DocumentationTool;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardLocation;

/**
 * TODO: convert to maven layout file manager
 * 
 * @author bukodi
 *
 */
public class GeneratorFileManager implements JavaFileManager {

	//private Map<Location, Path> rootPaths = new HashMap<>();
	private Path mavenProjectRoot;
	private Predicate<Path> dontChangeIfExists;

	public GeneratorFileManager(Path mavenProjectRoot) {
		this.mavenProjectRoot = mavenProjectRoot;
		this.dontChangeIfExists = x->false;
	}
	
	public Path getLocationRoot( Location location ) {
		if( StandardLocation.SOURCE_OUTPUT.equals( location)) {
			return mavenProjectRoot.resolve("src/main/java");
		} else if ( StandardLocation.SOURCE_OUTPUT.equals(location) ) {
			return mavenProjectRoot.resolve("src/main/resources");
		} else if ( StandardLocation.CLASS_OUTPUT.equals(location) ) {
			return mavenProjectRoot.resolve("target/classes");
		} else if ( DocumentationTool.Location.DOCUMENTATION_OUTPUT.equals(location) ) {
			return mavenProjectRoot.resolve("src/main/javadoc");
		} else { 
			throw new IllegalArgumentException("Unsupported location : " + location );
		}
	}

	public void dontChangeIfExists( Predicate<Path> predicate) {
		this.dontChangeIfExists = predicate;
	}
	
	public void cleanOutputFolder() {
		try {
			Path srcOutputPath = getLocationRoot(StandardLocation.SOURCE_OUTPUT);
			FileIOHelper.deleteAllExcept(srcOutputPath, dontChangeIfExists);
			Path docOutputPath = getLocationRoot(DocumentationTool.Location.DOCUMENTATION_OUTPUT);
			FileIOHelper.deleteAllExcept(docOutputPath, dontChangeIfExists);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
	
	@Override
	public int isSupportedOption(String option) {
		return -1;
	}

	@Override
	public ClassLoader getClassLoader(Location location) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterable<JavaFileObject> list(Location location, String packageName, Set<Kind> kinds, boolean recurse)
			throws IOException {
		
		return () -> {
			Path startPath = getLocationRoot(location).resolve(packageName.replace('.', '/'));
			Stream<Path> filePathStream = listFiles(startPath, recurse);
			Stream<JavaFileObject> jfoStream = filePathStream.map(p -> new GeneratorJavaFileObject(location, p));
			// TODO: filter by kinds
			return jfoStream.iterator();
		};
	}

	@SuppressWarnings("resource")
	private Stream<Path> listFiles(Path path, boolean recurse) {
		Stream<Path> content;
		try {
			content = Files.list(path);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}

		return content.flatMap(p -> {
			if (Files.isDirectory(p) && recurse) {
				return listFiles(p, recurse);
			} else if (Files.isDirectory(p) && !recurse) {
				return Stream.of();
			} else {
				return Stream.of(p);
			}
		});
	}

	@Override
	public String inferBinaryName(Location location, JavaFileObject file) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isSameFile(FileObject a, FileObject b) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean handleOption(String current, Iterator<String> remaining) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasLocation(Location location) {
		try {
			getLocationRoot(location);
			return true;
		} catch ( IllegalArgumentException iae ) {
			return false;
		}
	}

	@Override
	public JavaFileObject getJavaFileForInput(Location location, String className, Kind kind) throws IOException {
		String ext;
		if (Kind.SOURCE.equals(kind)) {
			ext = ".java";
//		} else if (Kind.CLASS.equals(kind)) {
//			ext = ".class";
		} else {
			throw new IllegalArgumentException("Invalid kind: " + kind);
		}
		Path path = getLocationRoot(location).resolve(className.replace('.', '/') + ext);
		return new GeneratorJavaFileObject(location, path);
	}

	@Override
	public JavaFileObject getJavaFileForOutput(Location location, String className, Kind kind, FileObject sibling)
			throws IOException {
		String ext;
		if (Kind.SOURCE.equals(kind)) {
			ext = ".java";
//		} else if (Kind.CLASS.equals(kind)) {
//			ext = ".class";
		} else {
			throw new IllegalArgumentException("Invalid kind: " + kind);
		}
		Path path = getLocationRoot(location).resolve(className.replace('.', '/') + ext);
		return new GeneratorJavaFileObject(location, path);
	}

	@Override
	public FileObject getFileForInput(Location location, String packageName, String relativeName) throws IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public FileObject getFileForOutput(Location location, String packageName, String relativeName, FileObject sibling)
			throws IOException {
		if( sibling != null )
			throw new IllegalArgumentException("\"sibling\" argument isn't supported"); 
		Path path = getLocationRoot(location).resolve(packageName.replace('.', '/') ).resolve(relativeName);
		return new GeneratorJavaFileObject(location, path);
	}

	@Override
	public void flush() throws IOException {
		// Nothing to do
	}

	@Override
	public void close() throws IOException {
		// Nothing to do
	}

	public class GeneratorFileObject implements FileObject {

		private final Location location;
		private final Path path;
		private final boolean isProtected;

		GeneratorFileObject(Location location, Path path) {
			this.location = location;
			this.path = path;
			this.isProtected = Files.exists(path) && dontChangeIfExists.test(path);
		}

		private Charset charset = StandardCharsets.UTF_8;

		@Override
		public URI toUri() {
			return path.toUri();
		}

		@Override
		public String getName() {
			return path.getFileName().toString();
		}

		@Override
		public InputStream openInputStream() throws IOException {
			return Files.newInputStream(path);
		}

		@Override
		public OutputStream openOutputStream() throws IOException {
			if (isProtected) {
				return new ByteArrayOutputStream();
			} else {
				Files.createDirectories(path.getParent());
				return Files.newOutputStream(path, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			}
		}

		@Override
		public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
			return Files.newBufferedReader(path, charset);
		}

		@Override
		public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
			byte bytes[] = Files.readAllBytes(path);
			if (ignoreEncodingErrors)
				return new String(bytes, charset);
			else
				return charset.newDecoder().decode(ByteBuffer.wrap(bytes));
		}

		@Override
		public Writer openWriter() throws IOException {
			if (isProtected) 
				return new StringWriter();
			
			Path parentDir = path.getParent();
			if( Files.notExists(parentDir)) {
				Files.createDirectories(path.getParent());
			} 
			return Files.newBufferedWriter(path, charset, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING);
		}

		@Override
		public long getLastModified() {
			return path.toFile().lastModified();
		}

		@Override
		public boolean delete() {
			if( isProtected )
				return false;
			try {
				return Files.deleteIfExists(path);
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}

	}

	public class GeneratorJavaFileObject extends GeneratorFileObject implements JavaFileObject {

		GeneratorJavaFileObject(Location location, Path path) {
			super(location, path);
		}

		@Override
		public Kind getKind() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isNameCompatible(String simpleName, Kind kind) {
			throw new UnsupportedOperationException();
		}

		@Override
		public NestingKind getNestingKind() {
			throw new UnsupportedOperationException();
		}

		@Override
		public Modifier getAccessLevel() {
			throw new UnsupportedOperationException();
		}

	}

}
