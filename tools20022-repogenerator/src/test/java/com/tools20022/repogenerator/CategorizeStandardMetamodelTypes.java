package com.tools20022.repogenerator;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import com.tools20022.core.metamodel.Metamodel;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.StandardMetamodel2013;

public class CategorizeStandardMetamodelTypes {

	final static RawRepository repo;
	final static Metamodel metamodel;

	static {
		long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long start = System.currentTimeMillis();
		try {
			EPackage ecorePkg = ECoreIOHelper
					.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
			EObject rootEObj = ECoreIOHelper.loadXMIResource(
					ECoreIOHelper.class.getResourceAsStream("/model/20170516_ISO20022_2013_eRepository.iso20022"));
			XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
			repo = loader.load(ecorePkg, rootEObj);
			metamodel = StandardMetamodel2013.metamodel();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Model load: " + (System.currentTimeMillis() - start) + " ms, "
				+ ((usedMem2 - usedMem) / (1024 * 1024)) + " MB");
	}

	@Test
	public void testCategories() throws Exception {
		Map<Cat, List<MetamodelType<?>>> mmTypesByCat = metamodel.listTypes()
				.collect(Collectors.groupingBy(mmType -> getCat(mmType)));
		for (Cat cat : Cat.values()) {
			List<MetamodelType<?>> mmTypes = mmTypesByCat.computeIfAbsent(cat, x -> Collections.emptyList());
			System.out.println(cat + " (" + mmTypes.size() + " types)");
			for (MetamodelType<?> mmType : mmTypes) {
				System.out.println(" - " + mmType.getName() + " (" + repo.getCountByType(mmType) + ")");
			}
		}
	}

	static enum Cat {
		/**
		 * If the type one of the {@link MMRepository},
		 * {@link MMBusinessProcessCatalogue}, {@link MMDataDictionary}, {@link MMBusinessArea}
		 * 
		 * These types treated as package level singletons.
		 */
		PACKAGE, SINGLETON, BEAN, 
		
		/**
		 * 
		 */
		ENUM, ENUM_VALUE,
		
		/**
		 * If the type one of the {@link MMDoclet}, {@link MMSemanticMarkup}, {@link MMSemanticMarkupElement}, {@link MMConstraint}
		 * 
		 * These types treated as annotations.
		 */
		ANNOTATION, INTERFACE, UNCATEGORIZED
	}

	static List<String> CATALOG_TYPE_NAMES = Arrays.asList("Repository", "DataDictionary", "BusinessProcessCatalogue");
	static List<String> MARKUP_TYPE_NAMES = Arrays.asList("Constraint", "Doclet", "SemanticMarkup",
			"SemanticMarkupElement");
	static List<String> ENUM_TYPE_NAMES = Arrays.asList("CodeSet");

	static Cat getCat(MetamodelType<?> mmType) {
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
