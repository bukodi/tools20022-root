package com.tools20022.generators;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.junit.Test;

import com.tools20022.generators.SaveConsistentSubSet.ConsistentSubset;

public class TestConsistentSubset {

	@Test
	public void testName() throws Exception {
		long start = System.currentTimeMillis();
		Path ecorePath = Paths.get("../tools20022-repogenerator/src/main/resources/model/ISO20022.ecore");
		Path xmiPath = Paths.get(
				"../tools20022-repogenerator/src/main/resources/model/20170516_ISO20022_2013_eRepository.iso20022");
		EPackage ecorePackage = ECoreIOHelper.loadECorePackage(ecorePath);
		EObject xmiRootEObj = ECoreIOHelper.loadXMIResource(xmiPath);
		System.out.println("EMF Load completed: " + (System.currentTimeMillis() - start) + " ms");

		EClass eClassMessageDefinition = (EClass) ecorePackage.getEClassifier("MessageDefinition");
		EAttribute eAttrName = (EAttribute) eClassMessageDefinition.getEStructuralFeature("name");
		EReference eRefNextVersions = (EReference) eClassMessageDefinition.getEStructuralFeature("nextVersions");
		// Predicate<EObject> filter = eObj -> {
		// if (!eClassMessageDefinition.equals(eObj.eClass()))
		// return false;
		// String name = (String) eObj.eGet(eAttrName);
		// return "MandateInitiationRequestV05".equals(name);
		// };

		EClass eClassBusinessArea = (EClass) ecorePackage.getEClassifier("BusinessArea");
		EAttribute eAttrCode = (EAttribute) eClassBusinessArea.getEStructuralFeature("code");
		// Predicate<EObject> filter = eObj -> {
		// if (!eClassBusinessArea.equals(eObj.eClass()))
		// return false;
		// String name = (String) eObj.eGet(eAttrCode);
		// return "pain".equals(name);
		// };

		Predicate<EObject> filter = eObj -> {
			if (!eClassMessageDefinition.equals(eObj.eClass()))
				return false;
			if ( ! ((List) eObj.eGet(eRefNextVersions)).isEmpty())
				return false;
			EObject ba = eObj.eContainer();
			String code = (String) ba.eGet(eAttrCode);
//			if (!"acmt".equals(code))
//				return false;
			if ( ! ((List) ba.eGet(eRefNextVersions)).isEmpty())
				return false;
			return true;
		};

		SaveConsistentSubSet scss = new SaveConsistentSubSet(ecorePackage, xmiRootEObj);
		ProgressMonitor monitor = new ProgressMonitor();
		ConsistentSubset ss = scss.createSubSet(filter, monitor);
		System.out.println("Filter completed: " + (System.currentTimeMillis() - start) + " ms");
		Map<EClass, List<EObject>> stat = ss.getSatistics();
		System.out.println("Stat query completed: " + (System.currentTimeMillis() - start) + " ms");

		Path testSubsetFile = Paths.get("../tools20022-testrepo/src/test/resources/model/testSubset.iso20022");
		ss.saveFilteredXmiModel(testSubsetFile);
		System.out.println("Save completed: " + (System.currentTimeMillis() - start) + " ms");

		System.out.println();
		System.out.println("--- Statistics ---");
		AtomicInteger summCount = new AtomicInteger();
		stat.entrySet().forEach(e -> {
			summCount.addAndGet(e.getValue().size());
			System.out.println(e.getKey().getName() + " : " + e.getValue().size());
		});
		System.out.println("Summ: " + summCount.get());
	}

}
