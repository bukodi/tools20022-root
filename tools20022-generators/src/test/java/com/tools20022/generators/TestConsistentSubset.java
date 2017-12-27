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
	

	@Test
	public void subsetForBusinessArea() throws Exception {
		boolean skipBusinessComponents = false;
		final String code = "pain";
		
		
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
	public void subsetForBusinessDomains() throws Exception {
		subsetForBusinessDomain("payments");			
		subsetForBusinessDomain("cards");			
		subsetForBusinessDomain("securities");			
		subsetForBusinessDomain("fx");			
		subsetForBusinessDomain("trade");			
	}

	private void subsetForBusinessDomain(String domainCode) throws Exception {
		boolean skipBusinessComponents = true;
		
		long start = System.currentTimeMillis();
		Path ecorePath = Paths.get("../tools20022-repogenerator/src/main/resources/model/ISO20022.ecore");
		Path xmiPath = Paths.get(
				"../tools20022-repogenerator/src/main/resources/model/20170713_ISO20022_2013_eRepository.iso20022");
		EPackage ecorePackage = ECoreIOHelper.loadECorePackage(ecorePath);
		EObject xmiRootEObj = ECoreIOHelper.loadXMIResource(xmiPath);
		System.out.println("EMF Load completed: " + (System.currentTimeMillis() - start) + " ms");

		SaveConsistentSubSet scss = new SaveConsistentSubSet(ecorePackage, xmiRootEObj);
		ProgressMonitor monitor = new ProgressMonitor();
		
		List<String> msgCodes = getMessageIdsByDomains().get(domainCode);
		msgCodes.add("head.001.001.01"); // Add Business Application Header
		
		Predicate<EObject> seedSetFilter = scss.filterMsgDefByMsgIds(msgCodes);
		
		ConsistentSubset ss = scss.createSubSet(seedSetFilter, skipBusinessComponents, monitor);
		Map<EClass, List<EObject>> stat = ss.getSatistics();

		Path testSubsetFile = Paths.get("../tools20022-repogenerator/src/test/resources/model/business-domain-" + domainCode + (skipBusinessComponents ? "-nobuscomp" : "") + ".iso20022");
		ss.saveFilteredXmiModel(testSubsetFile);

		System.out.println();
		System.out.println("--- Statistics of " + domainCode + " ---");
		AtomicInteger summCount = new AtomicInteger();
		stat.entrySet().forEach(e -> {
			summCount.addAndGet(e.getValue().size());
			System.out.println(e.getKey().getName() + " : " + e.getValue().size());
		});
		System.out.println("Summ of "+ domainCode +" : " + summCount.get());
		System.out.println();
	}

	@Test
	public void subsetForMessageDef() throws Exception {
		boolean skipBusinessComponents = false;
		//final String msgId = "pain.002.001.08";
		final String msgId = "camt.030.001.04";
		
		
		long start = System.currentTimeMillis();
		Path ecorePath = Paths.get("../tools20022-repogenerator/src/main/resources/model/ISO20022.ecore");
		Path xmiPath = Paths.get(
				"../tools20022-repogenerator/src/main/resources/model/20170713_ISO20022_2013_eRepository.iso20022");
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
		
	static Map<String,List<String>> getMessageIdsByDomains() {
		Map<String,List<String>> msgIdsByDomain = new HashMap<>();
		{
		  List<String> msgIds = new ArrayList<>();
		  msgIds.add( "auth.001.001.01");
		  msgIds.add( "auth.002.001.01");
		  msgIds.add( "auth.003.001.01");
		  msgIds.add( "acmt.007.001.02");
		  msgIds.add( "acmt.008.001.02");
		  msgIds.add( "acmt.009.001.02");
		  msgIds.add( "acmt.010.001.02");
		  msgIds.add( "acmt.011.001.02");
		  msgIds.add( "acmt.012.001.02");
		  msgIds.add( "acmt.013.001.02");
		  msgIds.add( "acmt.014.001.02");
		  msgIds.add( "acmt.015.001.02");
		  msgIds.add( "acmt.016.001.02");
		  msgIds.add( "acmt.017.001.02");
		  msgIds.add( "acmt.018.001.02");
		  msgIds.add( "acmt.019.001.02");
		  msgIds.add( "acmt.020.001.02");
		  msgIds.add( "acmt.021.001.02");
		  msgIds.add( "camt.052.001.06");
		  msgIds.add( "camt.053.001.06");
		  msgIds.add( "camt.054.001.06");
		  msgIds.add( "camt.060.001.03");
		  msgIds.add( "camt.086.001.02");
		  msgIds.add( "acmt.022.001.02");
		  msgIds.add( "acmt.023.001.02");
		  msgIds.add( "acmt.024.001.02");
		  msgIds.add( "pain.013.001.06");
		  msgIds.add( "pain.014.001.06");
		  msgIds.add( "auth.018.001.01");
		  msgIds.add( "auth.019.001.01");
		  msgIds.add( "auth.020.001.01");
		  msgIds.add( "auth.021.001.01");
		  msgIds.add( "auth.022.001.01");
		  msgIds.add( "auth.023.001.01");
		  msgIds.add( "auth.024.001.01");
		  msgIds.add( "auth.025.001.01");
		  msgIds.add( "auth.026.001.01");
		  msgIds.add( "auth.027.001.01");
		  msgIds.add( "camt.026.001.05");
		  msgIds.add( "camt.027.001.05");
		  msgIds.add( "camt.028.001.07");
		  msgIds.add( "camt.029.001.07");
		  msgIds.add( "camt.030.001.04");
		  msgIds.add( "camt.031.001.04");
		  msgIds.add( "camt.032.001.03");
		  msgIds.add( "camt.033.001.04");
		  msgIds.add( "camt.034.001.04");
		  msgIds.add( "camt.035.001.03");
		  msgIds.add( "camt.036.001.03");
		  msgIds.add( "camt.037.001.05");
		  msgIds.add( "camt.038.001.03");
		  msgIds.add( "camt.039.001.04");
		  msgIds.add( "camt.055.001.06");
		  msgIds.add( "camt.056.001.06");
		  msgIds.add( "camt.087.001.04");
		  msgIds.add( "camt.057.001.05");
		  msgIds.add( "camt.058.001.05");
		  msgIds.add( "camt.059.001.05");
		  msgIds.add( "pacs.002.001.08");
		  msgIds.add( "pacs.003.001.07");
		  msgIds.add( "pacs.004.001.07");
		  msgIds.add( "pacs.007.001.07");
		  msgIds.add( "pacs.008.001.06");
		  msgIds.add( "pacs.009.001.06");
		  msgIds.add( "pacs.010.001.02");
		  msgIds.add( "pacs.028.001.01");
		  msgIds.add( "pain.001.001.08");
		  msgIds.add( "pain.002.001.08");
		  msgIds.add( "pain.007.001.07");
		  msgIds.add( "pain.008.001.07");
		  msgIds.add( "pain.009.001.05");
		  msgIds.add( "pain.010.001.05");
		  msgIds.add( "pain.011.001.05");
		  msgIds.add( "pain.012.001.05");
		  msgIds.add( "pain.017.001.01");
		  msgIds.add( "pain.018.001.01");
		  msgIds.add( "remt.001.001.03");
		  msgIds.add( "remt.002.001.01");
		  msgIdsByDomain.put("payments", msgIds );
		}
		{
		  List<String> msgIds = new ArrayList<>();
		  msgIds.add( "secl.001.001.03");
		  msgIds.add( "secl.002.001.03");
		  msgIds.add( "secl.003.001.03");
		  msgIds.add( "secl.004.001.03");
		  msgIds.add( "secl.005.001.02");
		  msgIds.add( "secl.006.001.02");
		  msgIds.add( "secl.007.001.03");
		  msgIds.add( "secl.008.001.03");
		  msgIds.add( "secl.009.001.03");
		  msgIds.add( "secl.010.001.03");
		  msgIds.add( "colr.003.001.04");
		  msgIds.add( "colr.004.001.04");
		  msgIds.add( "colr.005.001.04");
		  msgIds.add( "colr.006.001.04");
		  msgIds.add( "colr.007.001.05");
		  msgIds.add( "colr.008.001.05");
		  msgIds.add( "colr.009.001.04");
		  msgIds.add( "colr.010.001.04");
		  msgIds.add( "colr.011.001.04");
		  msgIds.add( "colr.012.001.04");
		  msgIds.add( "colr.013.001.04");
		  msgIds.add( "colr.014.001.04");
		  msgIds.add( "colr.015.001.04");
		  msgIds.add( "colr.016.001.03");
		  msgIds.add( "seev.031.001.07");
		  msgIds.add( "seev.032.001.06");
		  msgIds.add( "seev.033.001.07");
		  msgIds.add( "seev.034.001.08");
		  msgIds.add( "seev.035.001.08");
		  msgIds.add( "seev.036.001.08");
		  msgIds.add( "seev.037.001.08");
		  msgIds.add( "seev.038.001.04");
		  msgIds.add( "seev.039.001.07");
		  msgIds.add( "seev.040.001.07");
		  msgIds.add( "seev.041.001.07");
		  msgIds.add( "seev.042.001.06");
		  msgIds.add( "seev.044.001.07");
		  msgIds.add( "auth.016.001.01");
		  msgIds.add( "auth.017.001.01");
		  msgIds.add( "auth.031.001.01");
		  msgIds.add( "auth.032.001.01");
		  msgIds.add( "auth.033.001.01");
		  msgIds.add( "auth.035.001.01");
		  msgIds.add( "auth.036.001.01");
		  msgIds.add( "auth.039.001.01");
		  msgIds.add( "auth.040.001.01");
		  msgIds.add( "auth.041.001.01");
		  msgIds.add( "auth.042.001.01");
		  msgIds.add( "auth.043.001.01");
		  msgIds.add( "auth.044.001.01");
		  msgIds.add( "auth.045.001.01");
		  msgIds.add( "auth.047.001.01");
		  msgIds.add( "auth.048.001.01");
		  msgIds.add( "auth.049.001.01");
		  msgIds.add( "auth.050.001.01");
		  msgIds.add( "acmt.001.001.07");
		  msgIds.add( "acmt.002.001.07");
		  msgIds.add( "acmt.003.001.07");
		  msgIds.add( "acmt.005.001.05");
		  msgIds.add( "acmt.006.001.06");
		  msgIds.add( "camt.040.001.04");
		  msgIds.add( "camt.041.001.04");
		  msgIds.add( "camt.042.001.04");
		  msgIds.add( "camt.043.001.04");
		  msgIds.add( "camt.044.001.03");
		  msgIds.add( "camt.045.001.03");
		  msgIds.add( "reda.001.001.04");
		  msgIds.add( "reda.002.001.04");
		  msgIds.add( "reda.004.001.02");
		  msgIds.add( "reda.005.001.02");
		  msgIds.add( "semt.001.001.03");
		  msgIds.add( "semt.002.001.02");
		  msgIds.add( "semt.003.001.02");
		  msgIds.add( "semt.004.001.02");
		  msgIds.add( "semt.005.001.02");
		  msgIds.add( "semt.006.001.03");
		  msgIds.add( "semt.007.001.03");
		  msgIds.add( "sese.001.001.07");
		  msgIds.add( "sese.002.001.07");
		  msgIds.add( "sese.003.001.07");
		  msgIds.add( "sese.004.001.07");
		  msgIds.add( "sese.005.001.07");
		  msgIds.add( "sese.006.001.07");
		  msgIds.add( "sese.007.001.07");
		  msgIds.add( "sese.008.001.07");
		  msgIds.add( "sese.009.001.05");
		  msgIds.add( "sese.010.001.05");
		  msgIds.add( "sese.011.001.05");
		  msgIds.add( "sese.012.001.07");
		  msgIds.add( "sese.013.001.07");
		  msgIds.add( "sese.014.001.07");
		  msgIds.add( "sese.018.001.05");
		  msgIds.add( "sese.019.001.04");
		  msgIds.add( "setr.001.001.04");
		  msgIds.add( "setr.002.001.04");
		  msgIds.add( "setr.003.001.04");
		  msgIds.add( "setr.004.001.04");
		  msgIds.add( "setr.005.001.04");
		  msgIds.add( "setr.006.001.04");
		  msgIds.add( "setr.007.001.04");
		  msgIds.add( "setr.008.001.04");
		  msgIds.add( "setr.009.001.04");
		  msgIds.add( "setr.010.001.04");
		  msgIds.add( "setr.011.001.04");
		  msgIds.add( "setr.012.001.04");
		  msgIds.add( "setr.013.001.04");
		  msgIds.add( "setr.014.001.04");
		  msgIds.add( "setr.015.001.04");
		  msgIds.add( "setr.016.001.04");
		  msgIds.add( "setr.017.001.04");
		  msgIds.add( "setr.018.001.04");
		  msgIds.add( "setr.047.001.02");
		  msgIds.add( "setr.049.001.02");
		  msgIds.add( "setr.051.001.02");
		  msgIds.add( "setr.053.001.02");
		  msgIds.add( "setr.055.001.02");
		  msgIds.add( "setr.057.001.02");
		  msgIds.add( "setr.058.001.02");
		  msgIds.add( "seev.009.001.01");
		  msgIds.add( "seev.010.001.01");
		  msgIds.add( "seev.011.001.01");
		  msgIds.add( "seev.012.001.01");
		  msgIds.add( "seev.013.001.01");
		  msgIds.add( "seev.014.001.01");
		  msgIds.add( "seev.015.001.01");
		  msgIds.add( "seev.016.001.01");
		  msgIds.add( "seev.017.001.01");
		  msgIds.add( "seev.018.001.01");
		  msgIds.add( "seev.019.001.01");
		  msgIds.add( "seev.020.001.01");
		  msgIds.add( "seev.021.001.01");
		  msgIds.add( "seev.022.001.01");
		  msgIds.add( "seev.023.001.01");
		  msgIds.add( "seev.024.001.01");
		  msgIds.add( "seev.025.001.01");
		  msgIds.add( "seev.026.001.01");
		  msgIds.add( "seev.027.001.01");
		  msgIds.add( "seev.028.001.01");
		  msgIds.add( "seev.029.001.01");
		  msgIds.add( "seev.030.001.01");
		  msgIds.add( "auth.012.001.02");
		  msgIds.add( "auth.013.001.02");
		  msgIds.add( "auth.014.001.02");
		  msgIds.add( "auth.015.001.02");
		  msgIds.add( "auth.028.001.01");
		  msgIds.add( "semt.023.001.01");
		  msgIds.add( "setr.027.001.03");
		  msgIds.add( "setr.029.001.01");
		  msgIds.add( "setr.030.001.01");
		  msgIds.add( "setr.044.001.02");
		  msgIds.add( "seev.001.001.05");
		  msgIds.add( "seev.002.001.05");
		  msgIds.add( "seev.003.001.05");
		  msgIds.add( "seev.004.001.05");
		  msgIds.add( "seev.005.001.05");
		  msgIds.add( "seev.006.001.05");
		  msgIds.add( "seev.007.001.05");
		  msgIds.add( "seev.008.001.05");
		  msgIds.add( "semt.002.001.09");
		  msgIds.add( "semt.003.001.09");
		  msgIds.add( "semt.013.001.04");
		  msgIds.add( "semt.014.001.05");
		  msgIds.add( "semt.015.001.06");
		  msgIds.add( "semt.016.001.06");
		  msgIds.add( "semt.017.001.07");
		  msgIds.add( "semt.018.001.08");
		  msgIds.add( "semt.019.001.06");
		  msgIds.add( "semt.020.001.05");
		  msgIds.add( "semt.021.001.06");
		  msgIds.add( "semt.022.001.03");
		  msgIds.add( "sese.020.001.05");
		  msgIds.add( "sese.021.001.04");
		  msgIds.add( "sese.022.001.04");
		  msgIds.add( "sese.023.001.07");
		  msgIds.add( "sese.024.001.08");
		  msgIds.add( "sese.025.001.07");
		  msgIds.add( "sese.026.001.06");
		  msgIds.add( "sese.027.001.05");
		  msgIds.add( "sese.028.001.06");
		  msgIds.add( "sese.029.001.04");
		  msgIds.add( "sese.030.001.07");
		  msgIds.add( "sese.031.001.07");
		  msgIds.add( "sese.032.001.07");
		  msgIds.add( "sese.033.001.07");
		  msgIds.add( "sese.034.001.07");
		  msgIds.add( "sese.035.001.07");
		  msgIds.add( "sese.036.001.06");
		  msgIds.add( "sese.037.001.04");
		  msgIds.add( "sese.038.001.05");
		  msgIds.add( "sese.039.001.04");
		  msgIds.add( "sese.040.001.02");
		  msgIds.add( "reda.056.001.01");
		  msgIds.add( "reda.057.001.01");
		  msgIds.add( "reda.058.001.01");
		  msgIds.add( "reda.059.001.01");
		  msgIds.add( "semt.024.001.01");
		  msgIds.add( "semt.041.001.02");
		  msgIds.add( "semt.042.001.01");
		  msgIdsByDomain.put("securities", msgIds );
		}
		{
		  List<String> msgIds = new ArrayList<>();
		  msgIds.add( "tsin.005.001.01");
		  msgIds.add( "tsrv.001.001.01");
		  msgIds.add( "tsrv.002.001.01");
		  msgIds.add( "tsrv.003.001.01");
		  msgIds.add( "tsrv.004.001.01");
		  msgIds.add( "tsrv.005.001.01");
		  msgIds.add( "tsrv.006.001.01");
		  msgIds.add( "tsrv.007.001.01");
		  msgIds.add( "tsrv.008.001.01");
		  msgIds.add( "tsrv.009.001.01");
		  msgIds.add( "tsrv.010.001.01");
		  msgIds.add( "tsrv.011.001.01");
		  msgIds.add( "tsrv.012.001.01");
		  msgIds.add( "tsrv.013.001.01");
		  msgIds.add( "tsrv.014.001.01");
		  msgIds.add( "tsrv.015.001.01");
		  msgIds.add( "tsrv.016.001.01");
		  msgIds.add( "tsrv.017.001.01");
		  msgIds.add( "tsrv.018.001.01");
		  msgIds.add( "tsrv.019.001.01");
		  msgIds.add( "tsin.006.001.01");
		  msgIds.add( "tsin.007.001.01");
		  msgIds.add( "tsin.008.001.01");
		  msgIds.add( "tsin.009.001.01");
		  msgIds.add( "tsin.010.001.01");
		  msgIds.add( "tsin.011.001.01");
		  msgIds.add( "tsin.012.001.01");
		  msgIds.add( "tsin.013.001.01");
		  msgIds.add( "tsmt.053.001.01");
		  msgIds.add( "tsmt.054.001.01");
		  msgIds.add( "tsmt.055.001.01");
		  msgIds.add( "tsin.001.001.01");
		  msgIds.add( "tsin.002.001.01");
		  msgIds.add( "tsin.003.001.01");
		  msgIds.add( "auth.034.001.01");
		  msgIds.add( "auth.038.001.01");
		  msgIds.add( "tsmt.001.001.03");
		  msgIds.add( "tsmt.002.001.04");
		  msgIds.add( "tsmt.003.001.03");
		  msgIds.add( "tsmt.004.001.02");
		  msgIds.add( "tsmt.005.001.02");
		  msgIds.add( "tsmt.006.001.03");
		  msgIds.add( "tsmt.007.001.02");
		  msgIds.add( "tsmt.008.001.03");
		  msgIds.add( "tsmt.009.001.05");
		  msgIds.add( "tsmt.010.001.03");
		  msgIds.add( "tsmt.011.001.04");
		  msgIds.add( "tsmt.012.001.05");
		  msgIds.add( "tsmt.013.001.03");
		  msgIds.add( "tsmt.014.001.05");
		  msgIds.add( "tsmt.015.001.03");
		  msgIds.add( "tsmt.016.001.03");
		  msgIds.add( "tsmt.017.001.05");
		  msgIds.add( "tsmt.018.001.05");
		  msgIds.add( "tsmt.019.001.05");
		  msgIds.add( "tsmt.020.001.02");
		  msgIds.add( "tsmt.021.001.03");
		  msgIds.add( "tsmt.022.001.02");
		  msgIds.add( "tsmt.023.001.03");
		  msgIds.add( "tsmt.024.001.03");
		  msgIds.add( "tsmt.025.001.03");
		  msgIds.add( "tsmt.026.001.02");
		  msgIds.add( "tsmt.027.001.02");
		  msgIds.add( "tsmt.028.001.03");
		  msgIds.add( "tsmt.029.001.02");
		  msgIds.add( "tsmt.030.001.03");
		  msgIds.add( "tsmt.031.001.03");
		  msgIds.add( "tsmt.032.001.03");
		  msgIds.add( "tsmt.033.001.03");
		  msgIds.add( "tsmt.034.001.03");
		  msgIds.add( "tsmt.035.001.03");
		  msgIds.add( "tsmt.036.001.03");
		  msgIds.add( "tsmt.037.001.03");
		  msgIds.add( "tsmt.038.001.03");
		  msgIds.add( "tsmt.040.001.03");
		  msgIds.add( "tsmt.041.001.03");
		  msgIds.add( "tsmt.042.001.03");
		  msgIds.add( "tsmt.044.001.02");
		  msgIds.add( "tsmt.045.001.02");
		  msgIds.add( "tsmt.046.001.01");
		  msgIds.add( "tsmt.047.001.01");
		  msgIds.add( "tsmt.048.001.01");
		  msgIds.add( "tsmt.049.001.01");
		  msgIds.add( "tsmt.050.001.01");
		  msgIds.add( "tsmt.051.001.01");
		  msgIds.add( "tsmt.052.001.01");
		  msgIdsByDomain.put("trade", msgIds );
		}
		{
		  List<String> msgIds = new ArrayList<>();
		  msgIds.add( "cain.001.001.01");
		  msgIds.add( "cain.002.001.01");
		  msgIds.add( "cain.003.001.01");
		  msgIds.add( "cain.004.001.01");
		  msgIds.add( "cain.005.001.01");
		  msgIds.add( "cain.006.001.01");
		  msgIds.add( "cain.007.001.01");
		  msgIds.add( "cain.008.001.01");
		  msgIds.add( "cain.009.001.01");
		  msgIds.add( "cain.010.001.01");
		  msgIds.add( "cain.011.001.01");
		  msgIds.add( "cain.012.001.01");
		  msgIds.add( "cain.013.001.01");
		  msgIds.add( "caam.001.001.02");
		  msgIds.add( "caam.002.001.02");
		  msgIds.add( "caam.003.001.02");
		  msgIds.add( "caam.004.001.02");
		  msgIds.add( "caam.005.001.02");
		  msgIds.add( "caam.006.001.02");
		  msgIds.add( "caam.007.001.01");
		  msgIds.add( "caam.008.001.01");
		  msgIds.add( "caam.009.001.02");
		  msgIds.add( "caam.010.001.02");
		  msgIds.add( "caam.011.001.01");
		  msgIds.add( "caam.012.001.01");
		  msgIds.add( "catp.001.001.02");
		  msgIds.add( "catp.002.001.02");
		  msgIds.add( "catp.003.001.02");
		  msgIds.add( "catp.004.001.02");
		  msgIds.add( "catp.005.001.02");
		  msgIds.add( "catp.006.001.02");
		  msgIds.add( "catp.007.001.02");
		  msgIds.add( "catp.008.001.02");
		  msgIds.add( "catp.009.001.02");
		  msgIds.add( "catp.010.001.02");
		  msgIds.add( "catp.011.001.02");
		  msgIds.add( "catp.012.001.01");
		  msgIds.add( "catp.013.001.01");
		  msgIds.add( "catp.014.001.01");
		  msgIds.add( "catp.015.001.01");
		  msgIds.add( "catp.016.001.01");
		  msgIds.add( "catp.017.001.01");
		  msgIds.add( "caaa.001.001.06");
		  msgIds.add( "caaa.002.001.06");
		  msgIds.add( "caaa.003.001.06");
		  msgIds.add( "caaa.004.001.06");
		  msgIds.add( "caaa.005.001.06");
		  msgIds.add( "caaa.006.001.06");
		  msgIds.add( "caaa.007.001.06");
		  msgIds.add( "caaa.008.001.06");
		  msgIds.add( "caaa.009.001.06");
		  msgIds.add( "caaa.010.001.05");
		  msgIds.add( "caaa.011.001.06");
		  msgIds.add( "caaa.012.001.06");
		  msgIds.add( "caaa.013.001.06");
		  msgIds.add( "caaa.014.001.05");
		  msgIds.add( "caaa.015.001.05");
		  msgIds.add( "caaa.016.001.04");
		  msgIds.add( "caaa.017.001.04");
		  msgIds.add( "caaa.018.001.01");
		  msgIds.add( "caaa.019.001.01");
		  msgIds.add( "catm.001.001.06");
		  msgIds.add( "catm.002.001.06");
		  msgIds.add( "catm.003.001.06");
		  msgIds.add( "catm.004.001.04");
		  msgIds.add( "catm.005.001.03");
		  msgIds.add( "catm.006.001.02");
		  msgIds.add( "catm.007.001.01");
		  msgIds.add( "catm.008.001.01");
		  msgIdsByDomain.put("cards", msgIds );
		}
		{
		  List<String> msgIds = new ArrayList<>();
		  msgIds.add( "fxtr.031.001.01");
		  msgIds.add( "fxtr.032.001.01");
		  msgIds.add( "fxtr.033.001.01");
		  msgIds.add( "fxtr.034.001.01");
		  msgIds.add( "fxtr.035.001.01");
		  msgIds.add( "fxtr.036.001.01");
		  msgIds.add( "fxtr.037.001.01");
		  msgIds.add( "fxtr.038.001.01");
		  msgIds.add( "admi.002.001.01");
		  msgIds.add( "admi.004.001.02");
		  msgIds.add( "admi.009.001.02");
		  msgIds.add( "admi.010.001.02");
		  msgIds.add( "admi.011.001.01");
		  msgIds.add( "admi.017.001.01");
		  msgIds.add( "camt.061.001.02");
		  msgIds.add( "camt.062.001.03");
		  msgIds.add( "camt.063.001.02");
		  msgIds.add( "camt.088.001.01");
		  msgIds.add( "fxtr.008.001.06");
		  msgIds.add( "fxtr.013.001.03");
		  msgIds.add( "fxtr.014.001.04");
		  msgIds.add( "fxtr.015.001.04");
		  msgIds.add( "fxtr.016.001.04");
		  msgIds.add( "fxtr.017.001.04");
		  msgIds.add( "fxtr.030.001.04");
		  msgIdsByDomain.put("fx", msgIds );
		}
		return msgIdsByDomain;
	}

}
