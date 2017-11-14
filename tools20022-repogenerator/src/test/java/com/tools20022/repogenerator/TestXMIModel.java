package com.tools20022.repogenerator;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.StandardMetamodel2013;

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
	//@Ignore
	public void testConstraints() throws Exception {
		System.out.println("Number of constraints: " + domainModel.listObjects(MMConstraint.metaType()).count());
		System.out.println("Constraints with expression: " + domainModel.listObjects(MMConstraint.metaType()).filter(mmDef->mmDef.getExpression().isPresent()).count());

		Map<String,Set<MMConstraint>> constraintsWithDesc = new HashMap<>();
		domainModel.listObjects(MMConstraint.metaType()).forEach(mmConstr->{
			String nameDesc = mmConstr.getName() + ": " + mmConstr.getDefinition().orElse("<no def>");
			constraintsWithDesc.computeIfAbsent(nameDesc, x->new HashSet<>()).add(mmConstr);
		});
		System.out.println("Number of different constraints: " + constraintsWithDesc.size());

		domainModel.listObjects(MMConstraint.metaType()).filter(mmDef->mmDef.getExpression().isPresent()).forEachOrdered(mmC->{
//			System.out.println( mmC.getName() + " on " + mmC.getOwner());
//			System.out.println( mmC.getDefinition().orElse("-"));
//			System.out.println( mmC.getExpressionLanguage() + ": " + mmC.getExpression().orElse("-"));
//			System.out.println();
		});		
	}

}
