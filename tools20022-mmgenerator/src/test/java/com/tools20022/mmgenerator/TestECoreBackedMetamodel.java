package com.tools20022.mmgenerator;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EPackage;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tools20022.core.metamodel.MetamodelDocImpl;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelAttribute;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelEnum;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelType;

public class TestECoreBackedMetamodel {
	
	static RawMetamodel metamodel;
	static MetamodelType mmBusinessComponent;
	static MetamodelType mmBusinessConcept;
	static MetamodelEnum mmDurability;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		EPackage ecorePkg = ECoreIOHelper.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
		metamodel = new ECoreBackedMetamodel(ecorePkg);
		mmBusinessComponent = metamodel.getTypeByName("BusinessComponent");
		mmBusinessConcept = metamodel.getTypeByName("BusinessConcept");		
		mmDurability = metamodel.getEnumByName("Durability");		
	}

	@Test
	public void testListTypes() {
		assertEquals(85, metamodel.listTypes().count());
		assertEquals(15, metamodel.listEnums().count());
	}
	
	@Test
	public void testGetDocs() {
		MetamodelDocImpl mmDoc = mmBusinessComponent.getDocumentation();		
		assertTrue(mmDoc.getDocumentation().contains("business"));
	}
	
	@Test
	public void testSuperTypes() {
		assertEquals(3, mmBusinessComponent.listSuperTypes(false, false).count());		
		assertEquals(4, mmBusinessComponent.listSuperTypes(true, false).count());		
		assertEquals(6, mmBusinessComponent.listSuperTypes(false, true).count());		
		assertEquals(7, mmBusinessComponent.listSuperTypes(true, true).count());		
	}
	
	@Test
	public void testSubTypes() {
		assertEquals(2, mmBusinessConcept.listSubTypes(false, false).count());		
		assertEquals(3, mmBusinessConcept.listSubTypes(true, false).count());		
		assertEquals(4, mmBusinessConcept.listSubTypes(false, true).count());		
		assertEquals(5, mmBusinessConcept.listSubTypes(true, true).count());		
	}
	
	@Test
	public void testMMBusinessComponent() {
		MetamodelType mmBusinessComponent = metamodel.getTypeByName("BusinessComponent");
		assertEquals(6, mmBusinessComponent.getDeclaredAttributes().size());
		assertEquals(1, mmBusinessComponent.getDeclaredConstraints().size());
	}

	@Test
	public void testListDeclaredConstraints() {
		assertEquals(1,mmBusinessComponent.listDeclaredConstraints().count() );
		assertEquals(3,mmBusinessComponent.listAllConstraints().count() );
	}

	@Test
	public void testListIncomingAttributes() {
		mmBusinessComponent.listIncomingAttributes().forEachOrdered(mmAttr->{
			System.out.println( mmAttr.getDeclaringType().getName() + "." + mmAttr.getName() + " : " + mmAttr.getReferencedType().getName()  );
		});
	}

	@Test
	public void testPossibleContainers() throws Exception {
		MetamodelType mmXor = metamodel.getTypeByName("Xor");
		Set<? extends MetamodelAttribute> incomingAttrs = mmXor.getIncomingAttributes();
		System.out.println( incomingAttrs);
		Set<? extends MetamodelType> contSet = mmXor.getPossibleContainers();
		System.out.println(contSet);
	}

	@Test
	public void listContainers() {		
		metamodel.listTypes().forEachOrdered(mmtype->{
			Stream<String> s = mmtype.getPossibleContainers().stream().map(x->x.getName());			
			System.out.println( mmtype.getName() + " : " + s.collect(Collectors.joining(", ")));
		});
	}
	

	@Test
	public void testEnum() {
		assertEquals(3,mmDurability.listEnumLiterals().count() );
	}
}
