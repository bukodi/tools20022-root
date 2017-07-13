package com.tools20022.repogenerator;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.repogenerator.RawRepository;
import com.tools20022.repogenerator.XMILoader;

import test.gen.mm.MMBusinessArea;
import test.gen.mm.MMBusinessAssociationEnd;
import test.gen.mm.MMBusinessComponent;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMMessageDefinition;
import test.gen.mm.StandardMetamodel2013;

public class TestXMIModel {

	static RawRepository domainModel;

	@BeforeClass
	public static void setup() {
		long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long start = System.currentTimeMillis();
		XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
		domainModel = loader.load("/model/ISO20022.ecore", "/model/20170516_ISO20022_2013_eRepository.iso20022");
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
			MMBusinessAssociationEnd o = a.getOpposite().orElseThrow(()->new RuntimeException());
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
		Map<MMBusinessArea, Set<MMMessageDefinition>> map = domainModel.listObjects(MMMessageDefinition.metaType()).collect(Collectors.groupingBy(msgDef->msgDef.getBusinessArea(), Collectors.toSet()));
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
	@Ignore
	public void testConstraints() throws Exception {
		System.out.println(domainModel.listObjects(MMConstraint.metaType()).count());
		System.out.println(domainModel.listObjects(MMConstraint.metaType()).filter(mmDef->mmDef.getExpression().isPresent()).count());
		domainModel.listObjects(MMConstraint.metaType()).filter(mmDef->mmDef.getExpression().isPresent()).forEachOrdered(mmC->{
			System.out.println( mmC.getName() + " on " + mmC.getOwner());
			System.out.println( mmC.getDefinition().orElse("-"));
			System.out.println( mmC.getExpressionLanguage() + ": " + mmC.getExpression().orElse("-"));
			System.out.println();
		});		
	}

}
