package com.tools20022.generators;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;
import javax.xml.ws.Holder;

import org.jboss.forge.roaster.ParserException;
import org.jboss.forge.roaster.Problem;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.ASTNode;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Block;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.CompilationUnit;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Initializer;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.MethodDeclaration;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Statement;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.TypeDeclaration;
import org.jboss.forge.roaster.model.ast.ModifierAccessor;
import org.jboss.forge.roaster.model.ast.TypeDeclarationFinderVisitor;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.generators.GeneratorFileManager;
import com.tools20022.generators.RoasterHelper;

public class TestRoaster {

	@Test
	@Ignore
	public void testCreateParseModify() {
		String src;
		{
			JavaClassSource javaSrc = Roaster.create(JavaClassSource.class);
			javaSrc.setName("TestType");
			javaSrc.setPackage("com.bukodi.test");
			javaSrc.addField().setName("var").setType(String.class);
			javaSrc.addField().setName("holder").setType(Holder.class);
			System.out.println(javaSrc.toString());
			src = javaSrc.toString();
		}

		{
			JavaClassSource javaSrc = (JavaClassSource) Roaster.parse(src);
			javaSrc.addField().setName("var2").setType(AtomicInteger.class);

			String methodSrc = "void fn1() {java.util.function.Predicate<String> isEmpty = (s)->s.isEmpty(); }";
			javaSrc.addMethod(methodSrc);
			System.out.println(javaSrc.toString());
		}
	}

	@Test
	// @Ignore
	public void testStaticInitializer() {
		String srcTxt = "class Foo{" + " static int i;"
		// + " static{ i = 1;}"
				+ "}";
		JavaClassSource javaSrc = Roaster.parse(JavaClassSource.class, srcTxt);
		RoasterHelper.setStaticInitializer(javaSrc, " i = -34;");

		System.out.println(javaSrc);

		String init = RoasterHelper.getStaticInitializer(javaSrc);
		RoasterHelper.setStaticInitializer(javaSrc, init + "\nSystem.out.println();\n");
		System.out.println(javaSrc);

		// JavaClassSource javaSrc = (JavaClassSource) Roaster.parse(srcTxt);
		// javaSrc.addField().setName("var2").setType(AtomicInteger.class);

		String fieldStc = "final static int j; static { j = -2; }";
		javaSrc.addField(fieldStc);
		MethodSource<JavaClassSource> mFoo = javaSrc.addMethod("void foo(){}");
		mFoo.setStatic(true);
		mFoo.setBody("System.out.println();");
		String body = mFoo.getBody();
		System.out.println(body);
		System.out.println(javaSrc.toString());
	}

	@Test
	@Ignore
	public void testName() throws Exception {
		Path root = Paths.get("C:\\My\\git\\iso20022\\src\\test\\java\\");

		GeneratorFileManager fm = new GeneratorFileManager(root);
		Iterable<JavaFileObject> it = fm.list(StandardLocation.SOURCE_OUTPUT, "com.bukodi", Collections.emptySet(),
				true);

		for (JavaFileObject jfo : it) {
			System.out.println(jfo.getName());
		}
	}

}
