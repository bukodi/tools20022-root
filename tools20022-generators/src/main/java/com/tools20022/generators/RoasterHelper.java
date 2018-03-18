package com.tools20022.generators;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import org.jboss.forge.roaster.model.source.JavaDocCapableSource;
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

	public final static Set<String> JAVA_RESERVED_WORDS = Collections.unmodifiableSet(new HashSet<>(
	Arrays.asList("continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized",
			"boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw",
			"byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
			"catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class",
			"finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while", "Class")));

	public final static Map<String, Class<?>> JAVA_PRIMITIVE_TYPE_WRAPPERS;
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

	public static String convertToFieldName( String name ) {
		String ret = convertToJavaName(name);
		ret = ret.substring(0, 1).toLowerCase() + ret.substring(1);
		if (JAVA_RESERVED_WORDS.contains(ret))
			ret = ret + "_";
		return ret;
	}
	
	/**
	 * Converts the input string to a valid Java identifier name.
	 * 
	 * Does two transformations:
	 * <ul>
	 * <li>removes non Java identifier characters</li>
	 * <li>if the name is a Java reserved word, appends an underscore character</li>   
	 * </ul>
	 * @param name
	 * @return
	 */
	public static String convertToJavaName(String name) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isJavaIdentifierPart(ch))
				sb.append(ch);
		}
		name = sb.toString();
		if (JAVA_RESERVED_WORDS.contains(name))
			name = name + "_";
		return name;
	}


	public static String escapeJavaDoc( String docTxt) {
		return docTxt.replace("&", "&amp;").replace(">", "&gt;").replace("<",
				"&lt;").replace("\r\n", "<br>\n");
	}

	public static String escapeSourceString( String srcString ) {
		return srcString.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
	}

	public static void addToJavaDoc(JavaDocCapableSource<?> javaDocHolder, String docTxt) {

		String existingDoc = javaDocHolder.getJavaDoc().getText();
		if (existingDoc == null)
			existingDoc = "";
		javaDocHolder.getJavaDoc().setText(existingDoc + docTxt);
	}
	
	public static String getPropertyNameFromGetterName( String getterName ) {
		String propName;
		if( getterName.startsWith("is") ) {
			propName = getterName.substring(2);
		} else if( getterName.startsWith("get") ) {
			propName = getterName.substring(3);
		} else {
			throw new IllegalArgumentException("The getter name must be start with 'is' or 'get': " + getterName );
		}
		
		if( Character.isUpperCase( propName.charAt(0)) && Character.isUpperCase( propName.charAt(1)) ) {
			// Begins with two uppercase letter, leave it unchanged:
			// See '8.8 Capitalization of inferred names.' in 'Java Bean Specification'
		} else {
			propName = propName.substring(0, 1).toLowerCase() + propName.substring(1);
		}
		return propName; 
	}

}
