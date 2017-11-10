package de.dainel.cleanqualifiedtypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.ASTVisitor;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.CompilationUnit;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Expression;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.FieldDeclaration;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.ImportDeclaration;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.MemberValuePair;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.MethodInvocation;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.Name;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.NormalAnnotation;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.QualifiedName;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.QualifiedType;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.SimpleName;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.SimpleType;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.TypeDeclaration;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import gen.lib.dotgen.conc__c;

/**
 * @author Michael Ernst
 */
class QualifiedTypeDetector extends ASTVisitor {
	private Map<String, ImportDeclaration> imports = new HashMap<String, ImportDeclaration>();
	private Map<String, QualifiedTypeBindingManager> bindingManagers = new HashMap<String, QualifiedTypeBindingManager>();
	private Map<String, String> usedTypes = new HashMap<String, String>();
	private List<String> compilationUnitTypes = new ArrayList<String>();
	private List<String> propertyNames = new ArrayList<String>();
	private final Set<String> knownTypeNames;

	QualifiedTypeDetector(Set<String> knownTypeNames) {
		this.knownTypeNames = knownTypeNames;
	}

	private void handleName(Name name) {
		if (name.isSimpleName()) {
			usedTypes.put(name.getFullyQualifiedName(),
					resolveFullyQualifiedNameFromImports(name.getFullyQualifiedName()));
		}
		if (name.isQualifiedName()) {
			String qualifiedName = name.getFullyQualifiedName();
			QualifiedTypeBindingManager qm = bindingManagers.get(qualifiedName);
			if (qm == null) {
				qm = new QualifiedTypeBindingManager();
				if (imports.containsKey(qualifiedName)) {
					qm.setImportAlreadyExists(true);
				}
			}
			qm.addQualifiedName((QualifiedName) name);
			bindingManagers.put(qualifiedName, qm);
		}
	}

	private String resolveFullyQualifiedNameFromImports(String name) {
		for (String key : imports.keySet()) {
			if (key.endsWith("." + name)) {
				return key;
			}
		}
		return "java.lang." + name;
	}

	public boolean visit(TypeDeclaration node) {
		SimpleName name = node.getName();
		StringBuilder qualifiedType = new StringBuilder(name.getFullyQualifiedName());
		if (node.getParent() instanceof CompilationUnit) {
			CompilationUnit cu = (CompilationUnit) node.getParent();
			qualifiedType.insert(0, cu.getPackage().getName().getFullyQualifiedName() + ".");
			compilationUnitTypes.add(qualifiedType.toString());
		}
		return true;
	}

	@Override
	public boolean visit(QualifiedName qn) {
		if( knownTypeNames.contains( qn.toString() ) ) {
			handleName(qn);
		}
		return true;
	}

	@Override
	public boolean visit(QualifiedType qt) {
//		System.out.println("QualifiedType:" + qt.toString() );
//		Name name = qt.getName();
//		handleName(name);
		return true;
	}

	@Override
	public boolean visit(SimpleType st) {
		Name name = st.getName();
		handleName(name);
		return true;
	}

	@Override
	public boolean visit(NormalAnnotation node) {
		Name name = node.getTypeName();
		handleName(name);
		return true;
	}

	@Override
	public boolean visit(MarkerAnnotation node) {
		Name name = node.getTypeName();
		handleName(name);
		return true;
	}

	@Override
	public boolean visit(ImportDeclaration importNode) {
		Name name = importNode.getName();
		String fullyQualifiedName = name.getFullyQualifiedName();
		imports.put(fullyQualifiedName, importNode);
		return false;
	}

	@Override
	public boolean visit(SingleMemberAnnotation node) {
		Name name = node.getTypeName();
		handleName(name);
		return true;
	}

	@Override
	public boolean visit(MethodInvocation node) {
		Expression expression = node.getExpression();
		if (expression instanceof QualifiedName) {
			handleName(((QualifiedName) expression));
		}
		return true;
	}

	@Override
	public boolean visit(FieldDeclaration node) {
		@SuppressWarnings("unchecked")
		List<VariableDeclarationFragment> fragments = node.fragments();
		for (VariableDeclarationFragment fragment : fragments) {
			SimpleName name = fragment.getName();
			propertyNames.add(name.getFullyQualifiedName());
		}
		return true;
	}

	@Override
	public boolean visit(MemberValuePair node) {
		Expression value = node.getValue();
		if (value instanceof QualifiedName) {
			QualifiedName name = ((QualifiedName) value);
			Name qualifier = name.getQualifier();
			if (qualifier instanceof QualifiedName) {
				handleName(qualifier);
			}
		}
		return true;
	}

	private String getUnqualifiedName(String fullyQualifiedName) {
		int lastDot = fullyQualifiedName.lastIndexOf('.');
		if (lastDot == -1) {
			return fullyQualifiedName;
		} else {
			return fullyQualifiedName.substring(++lastDot);
		}
	}

	public List<QualifiedTypeBindingManager> getTypeManagers() {
		List<QualifiedTypeBindingManager> result = new ArrayList<QualifiedTypeBindingManager>();
		List<String> unqualifiedNamesInResult = new ArrayList<String>();
		
		{ // Remove entries with same unqualified name
			Map<String,Set<String>> fqnsByUnqualifiedName = new HashMap<>();   
			for( String fqn : bindingManagers.keySet() ) {
				String unqualifiedName = getUnqualifiedName(fqn);
				fqnsByUnqualifiedName.computeIfAbsent(unqualifiedName, x->new HashSet<>()).add(fqn);
			}
			for( Map.Entry<String, Set<String>> e : fqnsByUnqualifiedName.entrySet()) {
				if(e.getValue().size() == 1)
					continue;
				for( String fqn : e.getValue() ) {
					bindingManagers.remove(fqn);					
				}				
			}
		}		
		
		for (Entry<String, QualifiedTypeBindingManager> entry : bindingManagers.entrySet()) {
			String unqualifiedName = getUnqualifiedName(entry.getKey());
			if (propertyNames.contains(unqualifiedName) || unqualifiedNamesInResult.contains(unqualifiedName)) {
				continue;
			}
			boolean found = false;
			for (String compType : compilationUnitTypes) {
				String ownCompilationUnits = getUnqualifiedName(compType);
				if (ownCompilationUnits.equals(unqualifiedName) && !compType.equals(entry.getKey())) {
					found = true;
					break;
				}
			}
			if (found) {
				continue;
			}
			if (compilationUnitTypes.contains(unqualifiedName)) {
				continue;
			}
			String alreadyUsed = usedTypes.get(unqualifiedName);
			if (alreadyUsed != null && alreadyUsed.equals(entry.getKey())) {
				result.add(entry.getValue());
				unqualifiedNamesInResult.add(unqualifiedName);
			} else if (alreadyUsed != null && !alreadyUsed.equals(entry.getKey())) {
				continue;
			} else {
				result.add(entry.getValue());
				unqualifiedNamesInResult.add(unqualifiedName);
			}
		}
		return result;
	}
}
