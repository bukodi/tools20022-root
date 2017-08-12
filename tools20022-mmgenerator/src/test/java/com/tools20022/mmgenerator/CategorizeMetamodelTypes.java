package com.tools20022.mmgenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.mmgenerator.RawMetamodel.MetamodelType;

public class CategorizeMetamodelTypes {

	static RawMetamodel metamodel;
	static MetamodelType mmBusinessComponent;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		EPackage ecorePkg = ECoreIOHelper
				.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
		metamodel = new ECoreBackedMetamodel(ecorePkg);
		mmBusinessComponent = metamodel.getTypeByName("BusinessComponent");
	}

	@Test
	public void testCategories() throws Exception {
		Map<Cat, List<MetamodelType>> mmTypesByCat = metamodel.listTypes().collect(Collectors.groupingBy(mmType->getCat(mmType)));
		for( Cat cat: Cat.values() ) {
			List<MetamodelType> mmTypes = mmTypesByCat.computeIfAbsent(cat, x->Collections.emptyList());
			System.out.println( cat + " (" + mmTypes.size() + " types)");
			for( MetamodelType mmType : mmTypes ) {
				System.out.println(" - " + mmType.getName());
			}
		}
	}

	static enum Cat {
		PACKAGE, SINGLETON, BEAN, ENUM, ENUM_VALUE, ANNOTATION, INTERFACE, UNCATEGORIZED
	}

	static List<String> CATALOG_TYPE_NAMES = Arrays.asList("Repository", "DataDictionary", "BusinessProcess");
	static List<String> MARKUP_TYPE_NAMES = Arrays.asList("Constraint", "Doclet", "SemanticMarkup",
			"SemanticMarkupElement");
	static List<String> ENUM_TYPE_NAMES = Arrays.asList("CodeSet");

	static Cat getCat(MetamodelType mmType) {
		if (CATALOG_TYPE_NAMES.contains(mmType.getName())) {
			return Cat.PACKAGE;
		} else if (MARKUP_TYPE_NAMES.contains(mmType.getName())) {
			return Cat.ANNOTATION;
		} else if (ENUM_TYPE_NAMES.contains(mmType.getName())) {
			return Cat.ENUM;
		} else if (mmType.isAbstract()) {
			return Cat.INTERFACE;
		} else {
			return Cat.UNCATEGORIZED;
		}
	}

}
