package com.tools20022.generators;

import java.util.List;

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

/**
 * Some functionality missing from Roaster API. This class adds them.
 * 
 * @author lbukodi
 *
 */
public class RoasterHelper {

	// This is a static utility class, no instances allowed
	private RoasterHelper() {
	}

	public static void setStaticInitializer(JavaClassSource javaSrc, final String bodyTxt) {
		CompilationUnit cu = (CompilationUnit) javaSrc.getInternal();
		TypeDeclaration pt = findPrimaryType(cu);
		Initializer init = null;
		for (Object bd : pt.bodyDeclarations()) {
			if (!(bd instanceof Initializer))
				continue;
			if (!(new ModifierAccessor()).hasModifier(((Initializer) bd), ModifierKeyword.STATIC_KEYWORD))
				continue;
			init = (Initializer) bd;
		}

		if (bodyTxt == null) {
			if (init == null) {
				// Nothing to do
			} else if (init != null) {
				init.delete();
			}
			return;
		}

		if (init == null) {
			init = cu.getAST().newInitializer();
			(new ModifierAccessor()).addModifier(init, ModifierKeyword.STATIC_KEYWORD);
			pt.bodyDeclarations().add(init);
		}

		List<Problem> problems = Roaster.validateSnippet(bodyTxt);
		if (problems.size() > 0) {
			throw new ParserException(problems);
		}
		String stub = "public class Stub { static void init(){" + bodyTxt + "} }";
		JavaClassSource temp = (JavaClassSource) Roaster.parse(stub);
		List<MethodSource<JavaClassSource>> methods = temp.getMethods();
		Block block = ((MethodDeclaration) methods.get(0).getInternal()).getBody();
		block = (Block) ASTNode.copySubtree(init.getAST(), block);
		init.setBody(block);
	}

	public static String getStaticInitializer(JavaClassSource javaSrc) {
		CompilationUnit cu = (CompilationUnit) javaSrc.getInternal();
		TypeDeclaration pt = findPrimaryType(cu);
		Initializer init = null;
		for (Object bd : pt.bodyDeclarations()) {
			if (!(bd instanceof Initializer))
				continue;
			if (!(new ModifierAccessor()).hasModifier(((Initializer) bd), ModifierKeyword.STATIC_KEYWORD))
				continue;
			init = (Initializer) bd;
		}

		if (init == null)
			return null;

		Block body = init.getBody();
		StringBuilder result = new StringBuilder();
		List<Statement> statements = (List<Statement>) body.getStructuralProperty(Block.STATEMENTS_PROPERTY);
		for (Statement statement : statements) {
			result.append(statement).append(" ");
		}
		return result.toString().trim();

	}

	private static TypeDeclaration findPrimaryType(CompilationUnit unit) {
		TypeDeclarationFinderVisitor visitor = new TypeDeclarationFinderVisitor();
		unit.accept(visitor);

		List<AbstractTypeDeclaration> declarations = visitor.getTypeDeclarations();
		return declarations.stream().filter(t -> t instanceof TypeDeclaration).map(t -> (TypeDeclaration) t).findFirst()
				.get();
	}

}
