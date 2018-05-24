package com.tools20022.generators;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import com.tools20022.generators.SaveConsistentSubSet.ConsistentSubset;

public class TestConsistentSubset {
	
	final static Path ecorePath = Paths.get("../tools20022-repogenerator/src/main/resources/model/ISO20022.ecore");
	final static Path xmiPath = Paths.get(
			"../tools20022-repogenerator/src/main/resources/model/20180314_ISO20022_2013_eRepository.iso20022");

	@Test
	public void subsetForBusinessArea() throws Exception {
		boolean skipBusinessComponents = false;
		final String code = "pain";
		
		
		long start = System.currentTimeMillis();
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
		Set<EObject> seedSet = new HashSet<>();
		seedSet.addAll(areaEObj.eContents());
		
		ConsistentSubset ss = scss.createSubSet(seedSet, skipBusinessComponents, monitor);
		Map<EClass, List<EObject>> stat = ss.getSatistics();

		Path testSubsetFile = Paths.get("../tools20022-repogenerator/src/test/resources/model/business-area-" + code + (skipBusinessComponents ? "-nobuscomp" : "") + ".iso20022");
		ss.saveFilteredXmiModel(testSubsetFile);

		System.out.println();
		System.out.println("--- Statistics of " + code + " ---");
		AtomicInteger summCount = new AtomicInteger();
		stat.entrySet().forEach(e -> {
			summCount.addAndGet(e.getValue().size());
			System.out.println(e.getKey().getName() + " : " + e.getValue().size());
		});
		System.out.println("Summ of "+ code +" : " + summCount.get());
	}
		
	@Test
	public void subsetForMessageDef() throws Exception {
		boolean skipBusinessComponents = false;
		//final String msgId = "pain.002.001.08";
		//final String msgId = "camt.030.001.04";
		//final String msgId = "pacs.008.001.02";
		//final String msgId = "pain.002.001.02";
		final String msgId = "auth.034.001.01";
		
		
		long start = System.currentTimeMillis();
		EPackage ecorePackage = ECoreIOHelper.loadECorePackage(ecorePath);
		EObject xmiRootEObj = ECoreIOHelper.loadXMIResource(xmiPath);
		System.out.println("EMF Load completed: " + (System.currentTimeMillis() - start) + " ms");

		SaveConsistentSubSet scss = new SaveConsistentSubSet(ecorePackage, xmiRootEObj);
		ProgressMonitor monitor = new ProgressMonitor();

		Predicate<EObject> seedSetFilter = scss.filterMsgDefByMsgIds(Arrays.asList(msgId));
		seedSetFilter = seedSetFilter.or(scss.filterEClassAndName("BusinessProcess", "BUSINESSPROCESS_FOR_ROLES"));

		
		ConsistentSubset ss = scss.createSubSet(seedSetFilter, skipBusinessComponents, monitor);
		Map<EClass, List<EObject>> stat = ss.getSatistics();

		String fileName = "msgdef-" + msgId + (skipBusinessComponents ? "-nobuscomp" : "") + ".iso20022"; 
		Path testSubsetFile = Paths.get("../tools20022-repogenerator/src/test/resources/model/" + fileName );
		ss.saveFilteredXmiModel(testSubsetFile);

		System.out.println();
		System.out.println("--- Statistics of " + msgId + " ---");
		AtomicInteger summCount = new AtomicInteger();
		stat.entrySet().forEach(e -> {
			summCount.addAndGet(e.getValue().size());
			System.out.println(e.getKey().getName() + " : " + e.getValue().size());
		});
		System.out.println("Summ of "+ msgId +" : " + summCount.get());
	}

}
