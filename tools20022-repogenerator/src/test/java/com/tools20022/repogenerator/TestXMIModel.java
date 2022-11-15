package com.tools20022.repogenerator;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tools20022.metamodel.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;

public class TestXMIModel {

	static RawRepository domainModel;

	@BeforeClass
	public static void setup() {
		long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long start = System.currentTimeMillis();
		try {
			EPackage ecorePkg = ECoreIOHelper.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
			EObject rootEObj = ECoreIOHelper.loadXMIResource(ECoreIOHelper.class.getResourceAsStream("/model/20170713_ISO20022_2013_eRepository.iso20022"));
			//EObject rootEObj = ECoreIOHelper.loadXMIResource(ECoreIOHelper.class.getResourceAsStream("/model/business-domain-payments.iso20022"));
			XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
			domainModel = loader.load( ecorePkg, rootEObj);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Model load: " + (System.currentTimeMillis() - start) + " ms, " + ((usedMem2 - usedMem )/(1024*1024)) + " MB");
	}

	@Test
	public void testAggregations() throws Exception {
		long c = domainModel.listObjects(MMBusinessAssociationEnd.metaType()).count();
		System.out.println("All number os Association: " + c);
		c = domainModel.listObjects(MMBusinessAssociationEnd.metaType()).filter(a->(!a.getOpposite().isPresent())).count();
		System.out.println("Associations without opposite: " + c );
		
		final Set<MMBusinessAssociationEnd> processedAssoc = new HashSet<>();
		domainModel.listObjects(MMBusinessAssociationEnd.metaType()).forEach(a->{
			if( processedAssoc.contains(a))
				return;
			MMBusinessAssociationEnd o = (MMBusinessAssociationEnd) a.getOpposite().get();
			String msg = "";
			msg += "(" + a.getMinOccurs() + ".." + a.getMaxOccurs() + ") - (" + o.getMinOccurs() + ".." + o.getMaxOccurs() + ")"; 
			msg +=  "  " + a.getAggregation() + "-" + o.getAggregation() ;
			
			msg +=  "  " + o.getType().getName() + "." + a.getName();
			msg += "<->" + a.getType().getName() + "." + o.getName() ; 
			System.out.println( msg );
			processedAssoc.add(a);
			processedAssoc.add(o);
		});
		//System.out.println(c);
	}

	@Test
	@Ignore
	public void testMsgDefsByArea() throws Exception {
		List<MMMessageDefinition> msgDefs = domainModel.listObjects(MMMessageDefinition.metaType()).collect(Collectors.toList());
		Map<MMBusinessArea, Set<MMMessageDefinition>> map = msgDefs.stream().collect(Collectors.groupingBy(msgDef->msgDef.getBusinessArea(), Collectors.toSet()));
		System.out.println(map);
		map.entrySet().forEach(e->{
			System.out.println( e.getKey().getCode() + " " + e.getValue().size() );
			System.out.println( e.getKey().getDefinition());
			System.out.println();
		});		
	}
	
	@Test
	@Ignore
	public void testCounts() throws Exception {
		domainModel.listObjects(MMMessageDefinition.metaType()).forEachOrdered(mmDef-> {
//			System.out.println(mmDef.getName() + "  ( " + (mmDef.getPreviousVersion() == null) + ", " + mmDef.getNextVersions().isEmpty()  + ")");
		});

		System.out.println(domainModel.listObjects(MMMessageDefinition.metaType()).count());
		System.out.println(domainModel.listObjects(MMMessageDefinition.metaType()).filter(mmDef->mmDef.getNextVersions().isEmpty()).count());
		System.out.println(domainModel.listObjects(MMBusinessComponent.metaType()).count());
		System.out.println(domainModel.listObjects(MMBusinessComponent.metaType()).filter(mmDef->mmDef.getNextVersions().isEmpty()).count());		
		
	}
	
	@Test
	//@Ignore
	public void testConstraints() throws Exception {
		Map<String,Set<MMConstraint>> constraintsWithDesc = new HashMap<>();
		domainModel.listObjects(MMConstraint.metaType()).forEach(mmConstr->{
			String nameDesc = mmConstr.getName() + ": " + mmConstr.getDefinition().orElse("<no def>");
			constraintsWithDesc.computeIfAbsent(nameDesc, x->new HashSet<>()).add(mmConstr);
		});

		int i = 0;
		int hasExpression = 0;
		int hasExample = 0;
		for( Map.Entry<String,Set<MMConstraint>> e : constraintsWithDesc.entrySet() ) {
			MMConstraint c = e.getValue().stream().findFirst().get();
			System.out.printf( "*** %d. constraint: %s (used %d times) ***\n", ++i, c.getName(), e.getValue().size());
			System.out.printf( "%s\n", e.getKey());
			if( c.getExpression().isPresent() ) hasExpression ++;
			if( !c.getExamples().isEmpty() ) hasExample ++;
		}

		System.out.printf( "\n\n**** Summary ****\n");
		System.out.printf( "  %-5d constraints\n", constraintsWithDesc.size());
		System.out.printf( "  %-5d has expression\n", hasExpression);
		System.out.printf( "  %-5d has example\n", hasExample);
		Set<MMConstraint> noDesc = constraintsWithDesc.get("<no def>");
		if( noDesc != null ) {
			System.out.printf( "  %-5d has no description\n", noDesc.size());
		}
	}

	@Test
	//@Ignore
	public void testConnectionsBetweenMessagesAndBusinessModel() throws Exception {
		//List<? extends MMMessageDefinition> mmMessageDefs = domainModel.getObjects(MMMessageDefinition.class);
		List<? extends MMMessageElement> mmMessageElements = domainModel.getObjects(MMMessageElement.class, true);
		List<? extends MMBusinessComponent> mmBusinessComponents = domainModel.getObjects(MMBusinessComponent.class, true);
		List<? extends MMBusinessElement> mmBusinessElements = domainModel.getObjects(MMBusinessElement.class, true);

		//long msgDefHasTrace = mmMessageDefs.stream().filter( md-> !md.getTraces().isEmpty() ).count();
		//System.out.printf("MessageDefinitions has trace: %d (from %d)\n", msgDefHasTrace, mmMessageDefs.size());
		long msgElemHasTrace = mmMessageElements.stream().filter( me-> me.getBusinessElementTrace().isPresent() || me.getBusinessComponentTrace().isPresent() ).count();
		System.out.printf("MessageElements has trace: %d (from %d)\n", msgElemHasTrace, mmMessageElements.size());
		long busCompHasDerivation = mmBusinessComponents.stream().filter( bc-> !(bc.getDerivationElements().isEmpty() && bc.getDerivationComponents().isEmpty()) ).count();
		System.out.printf("BusinessComponents has at least one derivation: %d (from %d)\n", busCompHasDerivation, mmBusinessComponents.size());
		long busElemHasDerivation = mmBusinessElements.stream().filter( be-> !be.getDerivations().isEmpty()).count();
		System.out.printf("BusinessElements has at least one derivation: %d (from %d)\n", busElemHasDerivation, mmBusinessElements.size());
	}

}
