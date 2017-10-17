package com.tools20022.generators;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;
import javax.xml.ws.Holder;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.CompilationUnit;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.junit.Ignore;
import org.junit.Test;

import de.dainel.cleanqualifiedtypes.CleanQualifiedTypes;

public class TestRoaster {

	@Test
//	@Ignore
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
			javaSrc.addField().setName("Predicate").setType(Object.class);
			javaSrc.addImport(SimpleDateFormat.class);
//			javaSrc.addImport("java.util.function.*");

			String methodSrc = "void fn1() {java.util.function.Predicate<String> isEmpty = (s)->s.isEmpty(); }";
			javaSrc.addMethod(methodSrc);

			String methodSrc2 = "void fn2() {java.util.function.Supplier<String> sayHello = ()->\"Hello!\"; }";
			javaSrc.addMethod(methodSrc2);

			
			CompilationUnit astCu = (CompilationUnit)javaSrc.getInternal();
			
			CleanQualifiedTypes.cleanAst(astCu);
					
			
			System.out.println(javaSrc.toString());
		}
	}
	
	
	@Test
	@Ignore
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

		GeneratorFileManager fm = new GeneratorFileManager(root, x->false);
		Iterable<JavaFileObject> it = fm.list(StandardLocation.SOURCE_OUTPUT, "com.bukodi", Collections.emptySet(),
				true);

		for (JavaFileObject jfo : it) {
			System.out.println(jfo.getName());
		}
	}

}
