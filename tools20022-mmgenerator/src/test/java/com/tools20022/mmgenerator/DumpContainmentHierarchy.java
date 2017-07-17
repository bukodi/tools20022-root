package com.tools20022.mmgenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;

// TODO : remove this test
public class DumpContainmentHierarchy {
	
	private static EPackage metamodelPkg;
	
	@BeforeClass
	public static void loadECore() {
		metamodelPkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
	}

	@Test
	public void dumpContainmentHiearchy2() {
		EClass ecRepository = (EClass) metamodelPkg.getEClassifier("Repository");
		printSubContainment(ecRepository, Collections.emptyList(), "", "");
	}

	private final static void printSubContainment(EClass container, List<EReference> refPath, String tab,
			String prefix) {
		List<EClass> ignoreEClasses = new ArrayList<>();
		ignoreEClasses.add((EClass) metamodelPkg.getEClassifier("Constraint"));
		ignoreEClasses.add((EClass) metamodelPkg.getEClassifier("Doclet"));
		ignoreEClasses.add((EClass) metamodelPkg.getEClassifier("SemanticMarkup"));

		System.out.println(tab + prefix + container.getName());
		Map<EClass, Set<EClass>> allImpementations = new LinkedHashMap<EClass, Set<EClass>>();

		for (EReference containmentRef : container.getEAllContainments()) {
			EClass refType = containmentRef.getEReferenceType();
			Stream<EClass> s = allImpementations.computeIfAbsent(refType, x -> new LinkedHashSet<>()).stream();
			s = Stream.concat(s, Stream.of(refType));
			s = s.filter((t) -> (!t.isAbstract())); // Ignore abstract classes
			s = s.filter((t) -> !ignoreEClasses.contains(t)); // ignore some
																// classes

			s.forEach((rt) -> {
				List<EReference> nextpath = new ArrayList<>(refPath);
				nextpath.add(containmentRef);
				printSubContainment(rt, nextpath, tab + "  ", containmentRef.getName() + ":");
			});
		}
	}

}
