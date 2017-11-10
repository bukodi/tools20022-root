package com.tools20022.generators;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.CompilationUnit;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.junit.Test;

import de.dainel.cleanqualifiedtypes.CleanQualifiedTypes;

public class TestCleanQualifiedTypes {
	
	
	@Test
	public void testSimple() throws Exception {
		String src1 = "package foo;"
				+ "class Foo {"
				+ "  void fn1( pkg1.Type1 param1, pkg2.Type2 param2 ) {}"
				+ "}";
	
		JavaClassSource javaSrc = (JavaClassSource) Roaster.parse(src1);
		CompilationUnit astCu = (CompilationUnit)javaSrc.getInternal();		
		CleanQualifiedTypes.cleanAst(astCu);
		String javaTxt = javaSrc.toString();
		assertTrue(javaTxt.contains("import pkg1.Type1;") && javaTxt.contains("import pkg2.Type2;"));
	}

	@Test
	public void testQualifiedSelfReference() throws Exception {
		String src1 = "package foo;"
				+ "class Foo {"
				+ "  Object field1 = foo.Foo.class;"
				+ "  void fn1( foo.Foo param1, pkg2.Type2 param2 ) {}"
				+ "}";
	
		JavaClassSource javaSrc = (JavaClassSource) Roaster.parse(src1);
		CompilationUnit astCu = (CompilationUnit)javaSrc.getInternal();		
		CleanQualifiedTypes.cleanAst(astCu);
		String javaTxt = javaSrc.toString();
		assertTrue(javaTxt.contains("field1 = Foo.class;") && javaTxt.contains("Foo param1"));
	}

	@Test
	public void testQualifiedInnerSelfReference() throws Exception {
		String src1 = "package foo;"
				+ "class Foo {"
				+ "  class InnerFoo{"
				+ "    Object field1 = foo.Foo.class;"
				+ "    void fn1( foo.Foo param1, pkg2.Type2 param2 ) {}"
				+ "  }"
				+ "}";
	
		JavaClassSource javaSrc = (JavaClassSource) Roaster.parse(src1);
		CompilationUnit astCu = (CompilationUnit)javaSrc.getInternal();		
		CleanQualifiedTypes.cleanAst(astCu);
		String javaTxt = javaSrc.toString();
		System.out.println(javaTxt);
		//assertTrue(javaTxt.contains("import pkg1.Type1;") && javaTxt.contains("import pkg2.Type2;"));
	}

	@Test
	public void testDuplicateUnqualifiedName() throws Exception {
		String src1 = "package foo;"
				+ "class Foo {"
				+ "  void fn1( pkg1.Type1 param1, pkg2.Type1 param2 ) {}"
				+ "}";

		JavaClassSource javaSrc = (JavaClassSource) Roaster.parse(src1);
		CompilationUnit astCu = (CompilationUnit)javaSrc.getInternal();		
		CleanQualifiedTypes.cleanAst(astCu);
		String javaTxt = javaSrc.toString();
		assertTrue(javaTxt.contains("pkg1.Type1 param1") && javaTxt.contains("pkg2.Type1 param2"));
	}

	@Test
	public void testDontModifyImports() throws Exception {
		String src1 = "package foo;"
				+ "class Foo {"
				+ "  void fn1( pkg1.Type1 param1, pkg2.Type2 param2 ) {}"
				+ "}";

		JavaClassSource javaSrc = (JavaClassSource) Roaster.parse(src1);
		CompilationUnit astCu = (CompilationUnit)javaSrc.getInternal();		
		CleanQualifiedTypes.cleanAst(astCu, Arrays.asList("pkg2.Type2"));
		String javaTxt = javaSrc.toString();
		assertTrue(javaTxt.contains("import pkg1.Type1;") && javaTxt.contains("pkg2.Type2 param2"));
	}

	@Test
	public void testKnownTypes() throws Exception {
		String src1 = "package foo;"
				+ "class Foo {"
				+ "  Object field1 = pkg1.Enum1.VALUE1;"
				+ "  void fn1( pkg1.Enum1 param1 ) {}"
				+ "}";

		JavaClassSource javaSrc = (JavaClassSource) Roaster.parse(src1);
		CompilationUnit astCu = (CompilationUnit)javaSrc.getInternal();		
		CleanQualifiedTypes.cleanAst(astCu, Collections.emptyList(), new HashSet<>( Arrays.asList("pkg1.Enum1")));
		String javaTxt = javaSrc.toString();
		//System.out.println( javaTxt);
		assertTrue(javaTxt.contains("import pkg1.Enum1;") && javaTxt.contains("(Enum1 param1)") && javaTxt.contains("= Enum1.VALUE1;"));
	}

}
