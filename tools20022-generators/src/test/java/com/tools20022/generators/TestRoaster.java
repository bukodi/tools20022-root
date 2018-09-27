package com.tools20022.generators;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;
import javax.xml.ws.Holder;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.AST;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.ASTNode;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.ASTVisitor;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Block;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.CompilationUnit;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.MethodDeclaration;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Name;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.QualifiedName;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.SimpleName;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Statement;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.junit.Ignore;
import org.junit.Test;

import de.dainel.cleanqualifiedtypes.CleanQualifiedTypes;

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
			javaSrc.addField().setName("Predicate").setType(Object.class);
			javaSrc.addImport(SimpleDateFormat.class);
//			javaSrc.addImport("java.util.function.*");

			String methodSrc = "void fn1() {java.util.function.Predicate<String> isEmpty = (s)->s.isEmpty(); }";
			javaSrc.addMethod(methodSrc);

			String methodSrc2 = "void fn2() {java.util.function.Supplier<String> sayHello = ()->\"Hello!\"; }";
			javaSrc.addMethod(methodSrc2);

			String methodSrc3 = "java.util.List<String> fn3( java.util.Set<String> name ) {  return \"Hello \" + name; }";
			javaSrc.addMethod(methodSrc3);

			javaSrc.addImport("com.tools20022.repogenerator.MainTypeResult");
			String methodSrc4 = "	protected MainTypeResult generateMMCode(\r\n"
					+ "			com.tools20022.repogenerator.EnumTypeResult containerGen,\r\n"
					+ "			MMCode mmBean) {\r\n"
					+ "		com.tools20022.repogenerator.MainTypeResult gen = null;\r\n"
					+ "		implementMMRepositoryConcept(gen, mmBean);\r\n"
					+ "		defaultMandatoryAttribute(gen, MMCode_.owner, mmBean.getOwner());\r\n"
					+ "		defaultOptionalAttribute(gen, MMCode_.codeName, mmBean.getCodeName());\r\n"
					+ "		return gen;\r\n" + "	}";
			javaSrc.addMethod(methodSrc4);

			CompilationUnit astCu = (CompilationUnit) javaSrc.getInternal();

			CleanQualifiedTypes.cleanAst(astCu);

			System.out.println(javaSrc.toString());
		}
	}

	static String templateClass = "" + "";

	@Test
	public void testBlockTemplate() throws Exception {
		JavaClassSource javaSrc = Roaster.create(JavaClassSource.class);
		javaSrc.setPackage("com.bukodi.test").setName("TestType");
		MethodSource<JavaClassSource> method = javaSrc.addMethod().setName("fn1");
		method.setBody("com.pkg1.Type1<ParamType1> obj;" + "replaceThisBlock();");
		System.out.println("--- before replace ----");
		System.out.println(javaSrc);
		
		
		System.out.println("--- after replace ----");
		Map<String,String> replaceMap = new HashMap<>();
		replaceMap.put("com.pkg1.Type1", "com.pkg2.Type2");
		replaceMap.put("ParamType1", "ParamType2");
		replaceMap.put("replaceThisBlock", "replacedBlock");
		NameReplaceVisitor visitor = new NameReplaceVisitor(replaceMap);
		
		MethodDeclaration jdtMethodDecl = (MethodDeclaration) method.getInternal();
		jdtMethodDecl.accept(visitor);
		System.out.println(javaSrc);

	}

	@Test
	public void testExprTemplate() throws Exception {
		ExpressionTemplate et = new ExpressionTemplate("x = 1; y = 2; return x+y;");
		
		JavaClassSource javaSrc = Roaster.create(JavaClassSource.class);
		javaSrc.setName("TestType");
		javaSrc.setPackage("com.bukodi.test");
		javaSrc.addField().setName("a").setType(Integer.TYPE);
		javaSrc.addField().setName("b").setType(Integer.TYPE);
		MethodSource<JavaClassSource> method = javaSrc.addMethod();
		method.setName("foo");
		method.setReturnType(Integer.TYPE);

		
		et.replace("x", "a").replace("y", "b").addToBody(method);
		System.out.println(javaSrc);
	}

	class ExpressionTemplate {
		private Block templateBlock;

		ExpressionTemplate(String snippet) {
			String stub = "public class Stub { public void method() {" + snippet + "} }";
			JavaClassSource temp = (JavaClassSource) Roaster.parse(stub);
			List<MethodSource<JavaClassSource>> methods = temp.getMethods();
			templateBlock = ((MethodDeclaration) methods.get(0).getInternal()).getBody();
			
		}
				
		public Replacer replace( String originalName, String replacedName ) {
			return new Replacer( new HashMap<>(), originalName, replacedName );
		}

		class Replacer {
			private Map<String, String> replaceMap;

			private Replacer(Map<String, String> replaceMap, String originalName, String replacedName ) {
				this.replaceMap = replaceMap;
				replaceMap.put(originalName, replacedName);
			}

			public Replacer replace( String originalName, String replacedName ) {
				return new Replacer( replaceMap, originalName, replacedName );
			}
			
			public void addToBody(MethodSource<?> method) {
				NameReplaceVisitor replaceVisitor = new NameReplaceVisitor(replaceMap);				

				MethodDeclaration jdtMethod = ((MethodDeclaration) method.getInternal()) ;

				if( jdtMethod.getBody() == null ) {
					jdtMethod.setBody( jdtMethod.getAST().newBlock() );
				}
				List dstList = jdtMethod.getBody().statements();

				List copy = ASTNode.copySubtrees(jdtMethod.getAST(), templateBlock.statements());
				for( Object stmtObj: copy ) {
					Statement stmt = (Statement)stmtObj;
					stmt.accept(replaceVisitor);
					dstList.add(stmt);
				}
			}			
		}

	}

	class NameReplaceVisitor extends ASTVisitor {

		private final Map<String, String> replaceMap;

		public NameReplaceVisitor(Map<String, String> simpleNameReplace) {
			this.replaceMap = simpleNameReplace;
		}

		@Override
		public boolean visit(SimpleName node) {
			String simpleName = node.getIdentifier();
			String replacement = replaceMap.get(simpleName);
			if( replacement != null ) {
				node.setIdentifier(replacement);				
			}
			return super.visit(node);
		}

		@Override
		public boolean visit(QualifiedName node) {
			String fqn = node.getFullyQualifiedName();
			String replacement = replaceMap.get(fqn);
			if ( replacement != null ) {
				int posLastDot = replacement.lastIndexOf('.');
				String pkgName = replacement.substring(0, posLastDot);
				String name = replacement.substring(posLastDot + 1);
				Name newPkgName = node.getAST().newName(pkgName);
				node.setQualifier(newPkgName);
				node.getName().setIdentifier(name);
			}
			return super.visit(node);
		}

	}
	@Test
	public void testASTCopy() throws Exception {
		
		JavaClassSource src1 = Roaster.create(JavaClassSource.class);
		src1.setName("TestType1");
		src1.setPackage("com.bukodi.test");
		src1.addField().setName("field1").setType(String.class);
		MethodSource<JavaClassSource> method1 = src1.addMethod();
		method1.setName("method1");
		method1.setBody("field1 = \"Hello 1\";");

		JavaClassSource src2 = Roaster.create(JavaClassSource.class);
		src2.setName("TestType2");
		src2.setPackage("com.bukodi.test");
		src2.addField().setName("field2").setType(String.class);
		MethodSource<JavaClassSource> method2 = src2.addMethod();
		method2.setName("method2");

		System.out.println("--- before copy ----");
		System.out.println( src1);
		System.out.println( src2);
		
		
		Map<String,String> replaceMap = new HashMap<>();
		replaceMap.put("field1", "field2");
		NameReplaceVisitor replaceVisitor = new NameReplaceVisitor(replaceMap);

		
		MethodDeclaration jdtMethod1 = (MethodDeclaration)(method1.getInternal());
		MethodDeclaration jdtMethod2 = (MethodDeclaration)(method2.getInternal());
		
		if( jdtMethod2.getBody() == null ) {
			jdtMethod2.setBody( jdtMethod2.getAST().newBlock() );
		}
		List dstList = jdtMethod2.getBody().statements();
//		for( Object stmtObj : jdtMethod1.getBody().statements() ) {
//			Statement stmt = (Statement)stmtObj;
//			ASTNode stmtCopy = ASTNode.copySubtree(jdtMethod2.getAST(), stmt);
//			dstList.add(stmtCopy);
//		}
		List copy = ASTNode.copySubtrees(jdtMethod2.getAST(), jdtMethod1.getBody().statements());
		for( Object stmtObj: copy ) {
			Statement stmt = (Statement)stmtObj;
			stmt.accept(replaceVisitor);
			dstList.add(stmt);
		}
		
		System.out.println("--- after copy ----");
		System.out.println( src1);
		System.out.println( src2);
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
		Path root = Paths.get("C:\\My\\git\\iso20022\\");

		GeneratorFileManager fm = new GeneratorFileManager(root);
		fm.dontChangeIfExists(x -> false);
		Iterable<JavaFileObject> it = fm.list(StandardLocation.SOURCE_OUTPUT, "com.bukodi", Collections.emptySet(),
				true);

		for (JavaFileObject jfo : it) {
			System.out.println(jfo.getName());
		}
	}

}
