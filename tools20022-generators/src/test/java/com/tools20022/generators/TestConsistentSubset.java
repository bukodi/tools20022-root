package com.tools20022.generators;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

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
				"../tools20022-repogenerator/src/main/resources/model/20170713_ISO20022_2013_eRepository.iso20022");
		EPackage ecorePackage = ECoreIOHelper.loadECorePackage(ecorePath);
		EObject xmiRootEObj = ECoreIOHelper.loadXMIResource(xmiPath);
		System.out.println("EMF Load completed: " + (System.currentTimeMillis() - start) + " ms");

		SaveConsistentSubSet scss = new SaveConsistentSubSet(ecorePackage, xmiRootEObj);
		ProgressMonitor monitor = new ProgressMonitor();
		
		//EObject pain = scss.getBusinessAreaByName("Payments Initiation - Latest version - master");
		System.out.println( "--- List of business areas ----");
		Map<String, EObject> areasByCode = scss.getLatestBusinessAreas();
		for( Entry<String, EObject> e : areasByCode.entrySet() ) {
			System.out.println( e.getKey() + " : " + e.getValue().eContents().size() );
		}
		System.out.println();
		
		EObject areaEObj = scss.getLatestBusinessAreaByCode("pain");
		ConsistentSubset ss = saveSubsetForArea(scss, "pain", areaEObj, monitor);
//		for( Entry<String, EObject> e : areasByCode.entrySet() ) {
//		}
	}
	
	private ConsistentSubset saveSubsetForArea( SaveConsistentSubSet scss, String code, EObject areaEObj, ProgressMonitor monitor) throws Exception {
		Set<EObject> seedSet = new HashSet<>();
		seedSet.addAll(areaEObj.eContents());
		ConsistentSubset ss = scss.createSubSet(seedSet, monitor);
		Map<EClass, List<EObject>> stat = ss.getSatistics();

		Path testSubsetFile = Paths.get("../tools20022-testrepo/src/test/resources/model/business-area-" + code + ".iso20022");
		ss.saveFilteredXmiModel(testSubsetFile);

		System.out.println();
		System.out.println("--- Statistics of " + code + " ---");
		AtomicInteger summCount = new AtomicInteger();
		stat.entrySet().forEach(e -> {
			summCount.addAndGet(e.getValue().size());
			System.out.println(e.getKey().getName() + " : " + e.getValue().size());
		});
		System.out.println("Summ of "+ code +" : " + summCount.get());
		return ss;
	}
	
	
}
