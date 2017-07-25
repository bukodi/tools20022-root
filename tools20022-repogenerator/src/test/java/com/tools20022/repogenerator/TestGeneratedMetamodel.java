package com.tools20022.repogenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.StandardMetamodel2013;

public class TestGeneratedMetamodel {

	final static RawRepository repo;

	static {
		long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long start = System.currentTimeMillis();
		try {
			EPackage ecorePkg = ECoreIOHelper.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
			EObject rootEObj = ECoreIOHelper.loadXMIResource(ECoreIOHelper.class.getResourceAsStream("/model/20170516_ISO20022_2013_eRepository.iso20022"));
			XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
			repo = loader.load( ecorePkg, rootEObj);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Model load: " + (System.currentTimeMillis() - start) + " ms, "
				+ ((usedMem2 - usedMem) / (1024 * 1024)) + " MB");
	}

	@Test
	public void categorizeMMTypes() {
		Map<String, Set<MetamodelType<? extends GeneratedMetamodelBean>>> typesByCategorie = new HashMap<>();
		BiConsumer<MetamodelType<? extends GeneratedMetamodelBean>, String> printType = (mmType, name) -> {
			typesByCategorie
					.computeIfAbsent(name, x -> new LinkedHashSet<MetamodelType<? extends GeneratedMetamodelBean>>())
					.add(mmType);
		};

		System.out.println("------------------------");

		for (MetamodelType<? extends GeneratedMetamodelBean> mmType : StandardMetamodel2013.metamodel().getAllTypes()) {

			if (MMDataType.class.isAssignableFrom(mmType.getBeanClass())) {
				printType.accept(mmType, "DataType");
			} else if (Arrays.asList(MMRepository.class, MMDataDictionary.class, MMBusinessProcessCatalogue.class)
					.contains(mmType.getBeanClass())) {
				printType.accept(mmType, "Structure");
			} else if (Arrays
					.asList(MMConstraint.class, MMDoclet.class, MMSemanticMarkup.class, MMSemanticMarkupElement.class)
					.contains(mmType.getBeanClass())) {
				printType.accept(mmType, "Markups");
			} else if (mmType.isAbstract()) {
				printType.accept(mmType, "Interface");
			} else if (MMTopLevelCatalogueEntry.class.isAssignableFrom(mmType.getBeanClass())
					|| MMTopLevelDictionaryEntry.class.isAssignableFrom(mmType.getBeanClass())
					|| MMMessageDefinition.class.equals(mmType.getBeanClass())) {
				printType.accept(mmType, repo.getCountByType(mmType) > 1 ? "MainType" : "SingletonMain");
			} else {
				printType.accept(mmType, repo.getCountByType(mmType) > 1 ? "SubType" : "SingletonSub");
			}
		}

		for (String name : typesByCategorie.keySet().stream().sorted().collect(Collectors.toSet())) {
			for (MetamodelType<? extends GeneratedMetamodelBean> mmType : typesByCategorie.get(name)) {
				System.out.println(name + " - " + mmType.getName() + " ( " + repo.getCountByType(mmType) + ")");
				if ("MainType".equals(name) || "SubType".equals(name)) {
					mmType.listAllAttributes().filter(a -> a.isContainment()).map(a -> a.getReferencedType()).distinct()
							.forEach(rt -> {
								if (!Arrays.asList(MMConstraint.class, MMDoclet.class, MMSemanticMarkup.class,
										MMSemanticMarkupElement.class).contains(rt.getBeanClass()))
									System.out.println("  - " + rt.getName());
							});
				}
			}
		}

		System.out.println("------------------------");
	}

	@Test
	public void testConstraints() throws Exception {
		int countMT15 = 0;
		int countExpr = 0;
		int conutNonMsgDef = 0;

		Map<String, Set<MMConstraint>> sameDescMap = new HashMap<>();
		Map<String, Set<MMConstraint>> sameNameMap = new HashMap<>();

		List<? extends MMConstraint> constr = repo.listObjects(MMConstraint.metaType()).collect(Collectors.toList());
		System.out.println("--- Constraints : -----");
		for (MMConstraint c : constr) {
			// if(! c.getName().equals("ControlSumAndGroupReversalRule") )
			// continue;

			if (c.getContainer() instanceof MMMessageDefinition || c.getContainer() instanceof MMMessageComponent
					|| c.getContainer() instanceof MMChoiceComponent) {
				// continue;
			} else {
				conutNonMsgDef++;
			}

			String parent = c.getContainer().getClass().getSimpleName();
			System.out.println(parent + " @" + c.getName() + ": " + c.getDefinition().orElse("-"));
			System.out.println(c.getExpression());
			System.out.println("----");

			if (c.getDefinition().orElse("-").contains("During ISO 15022 – 20022 coexistence")) {
				countMT15++;
			}
			if (c.getExpression().isPresent()) {
				countExpr++;
			}

			Set<MMConstraint> set1 = sameDescMap.computeIfAbsent(c.getDefinition().orElse("-"),
					x -> new LinkedHashSet<MMConstraint>());
			set1.add(c);
			Set<MMConstraint> set = sameNameMap.computeIfAbsent(c.getDefinition().orElse("-"),
					x -> new LinkedHashSet<MMConstraint>());
			set.add(c);
		}
		;
		System.out.println("------------------");
		System.out.println(constr.size() + " - " + countMT15 + ", expr:" + countExpr + ", diffCount: "
				+ sameDescMap.keySet().size() + "");
		System.out.println();
		List<String> defs = new ArrayList<>(sameDescMap.keySet());
		Collections.sort(defs);
		defs.stream().forEachOrdered(d -> {
			System.out.print(sameDescMap.get(d).iterator().next().getName() + " : ");
			System.out.println(d);
		});
		System.out.println("------------------");
		System.out.println(constr.size() + " - " + countMT15 + ", expr:" + countExpr + ", diffDescCount: "
				+ sameDescMap.keySet().size() + ", diffNameCount: " + sameNameMap.keySet().size() + ", nonMsgDef "
				+ conutNonMsgDef);
		System.out.println("---- Same name but different description -----------");
		for (Map.Entry<String, Set<MMConstraint>> e : sameNameMap.entrySet()) {
			if (e.getValue().stream().map(c -> c.getDefinition()).distinct().count() <= 1)
				continue;
			System.out.println("***" + e.getKey() + "***");
			e.getValue().stream().map(c -> c.getDefinition()).forEach(d -> {
				System.out.println(" - " + d);
			});
			System.out.println();
		}

	}

	@Test
	public void testRepoConceptTypes() throws Exception {
		Set<? extends MetamodelType<? extends GeneratedMetamodelBean>> allTypes = StandardMetamodel2013.metamodel()
				.getAllTypes();
		allTypes.stream().filter(t -> t instanceof MMRepositoryConcept)
				.forEachOrdered(t -> System.out.println(t.getName()));

		System.out.println("--- 2. level repo concepts, non-abstract and non-datatype: ---------");
		for (MetamodelType<?> mmType : allTypes) {
			if (!MMRepositoryConcept.class.isAssignableFrom(mmType.getBeanClass()))
				continue;
			if (MMDataType.class.isAssignableFrom(mmType.getBeanClass()))
				continue;
			if (!(MMTopLevelCatalogueEntry.class.isAssignableFrom(mmType.getBeanClass())
					|| MMTopLevelDictionaryEntry.class.isAssignableFrom(mmType.getBeanClass())))
				continue;
			if (mmType.isAbstract())
				continue;
			System.out.println(mmType.getName());
		}
		System.out.println();

		System.out.println("--- non 2. level repo concepts : ---------");
		for (MetamodelType<?> mmType : allTypes) {
			if (!MMRepositoryConcept.class.isAssignableFrom(mmType.getBeanClass()))
				continue;
			if ((MMTopLevelCatalogueEntry.class.isAssignableFrom(mmType.getBeanClass())
					|| MMTopLevelDictionaryEntry.class.isAssignableFrom(mmType.getBeanClass()))) {
				continue;
			}

			if (mmType.isAbstract())
				continue;
			System.out.println(mmType.getName());
		}
		System.out.println();

		System.out.println("--- datatypes (also 2. level repo concepts ): ---------");
		for (MetamodelType<?> mmType : allTypes) {
			if (!MMDataType.class.isAssignableFrom(mmType.getBeanClass()))
				continue;

			if (mmType.isAbstract())
				continue;
			System.out.println(mmType.getName());
		}
		System.out.println();

		System.out.println("--- non repo concepts: ---------");
		for (MetamodelType<?> mmType : allTypes) {
			if (MMRepositoryConcept.class.isAssignableFrom(mmType.getBeanClass()))
				continue;
			if (mmType.isAbstract())
				continue;
			System.out.println(mmType.getName());
		}
		System.out.println();

		System.out.println("------------------");
		System.out.println();
	}

	@Test
	public void testNonContainedTypes() throws Exception {
		Set<MetamodelAttribute<?, ?>> refs = StandardMetamodel2013.metamodel().listTypes()
				.flatMap(t -> t.listAllAttributes()).filter(r -> r.isContainment()).collect(Collectors.toSet());
		Set<MetamodelType<?>> referencedTypes = refs.stream()
				.flatMap(r -> r.getReferencedType().listSubTypes(true, true)).filter(t -> !t.isAbstract()).distinct()
				.collect(Collectors.toSet());
		Set<? extends MetamodelType<?>> nonAbstractTypes = StandardMetamodel2013.metamodel().listTypes()
				.filter(t -> !t.isAbstract()).collect(Collectors.toSet());

		System.out.println("--- Contained types : -----");
		nonAbstractTypes.stream().filter(t -> referencedTypes.contains(t)).forEachOrdered(t -> {
			System.out.println(t.getName());
		});
		System.out.println("--- Orphan types : -----");
		nonAbstractTypes.stream().filter(t -> !referencedTypes.contains(t)).forEachOrdered(t -> {
			System.out.println(t.getName());
		});
		System.out.println("------------------");
		System.out.println();
	}

	@Test
	@Ignore
	public void testMsgBolcs() throws Exception {
		System.out.println("----- MSG Blocks ---------");
		System.out.println();
		Map<String, Set<Integer>> seqsByName = new HashMap<>();
		for (MMMessageComponent msgComp : repo.listObjects(MMMessageComponent.metaType())
				.collect(Collectors.toList())) {
			// System.out.println(msgComp.getName());
			String name = msgComp.getName();
			String seq = "";
			for (;;) {
				char lastChar = name.charAt(name.length() - 1);
				if (!Character.isDigit(lastChar))
					break;
				name = name.substring(0, name.length() - 1);
				seq += lastChar;
			}
			Integer s = seq.length() == 0 ? 0 : Integer.valueOf(seq);
			Set<Integer> seqs = seqsByName.computeIfAbsent(name, x -> new HashSet<>());
			seqs.add(s);
		}

		for (Entry<String, Set<Integer>> e : seqsByName.entrySet()) {
			System.out.println(
					e.getKey() + " " + e.getValue().stream().max(Integer::compare).get() + " " + e.getValue().size());
		}
		System.out.println("------------------");
		System.out.println("Names: " + seqsByName.keySet().size() + ", values: " + seqsByName.values().size());
		System.out.println();
	}

	@Test
	public void testContainmentHierarchy() throws Exception {

		System.out.println(
				"Abstract types: " + StandardMetamodel2013.metamodel().listTypes().filter(t -> t.isAbstract()).count());
		System.out.println("Non abstract types: "
				+ StandardMetamodel2013.metamodel().listTypes().filter(t -> !t.isAbstract()).count());
		System.out.println("Non abstract and RepositoryConcept: " + StandardMetamodel2013.metamodel().listTypes()
				.filter(t -> !t.isAbstract())
				.filter(t -> t.listSuperTypes(false, true).anyMatch(s -> s.equals(MMRepositoryConcept.metaType())))
				.count());
		System.out.println("Non abstract and non RepositoryConcept: " + StandardMetamodel2013.metamodel().listTypes()
				.filter(t -> !t.isAbstract())
				.filter(t -> !t.listSuperTypes(false, true).anyMatch(s -> s.equals(MMRepositoryConcept.metaType())))
				.count());
		System.out.println();
		System.out.println("Non abstract and non RepositoryConcept: ");
		StandardMetamodel2013.metamodel().listTypes().filter(t -> !t.isAbstract())
				.filter(t -> !t.listSuperTypes(false, true).anyMatch(s -> s.equals(MMRepositoryConcept.metaType())))
				.forEachOrdered(t -> {
					System.out.println(t.getName() + " " + repo.getCountByType(t));
				});

		System.out.println("Number of MMConstraint objects : " + repo.getCountByType(MMConstraint.metaType()));
		System.out.println("Number of MMDoclet objects : " + repo.getCountByType(MMDoclet.metaType()));
		System.out.println("Number of MMSemanticMarkup objects : " + repo.getCountByType(MMSemanticMarkup.metaType()));
		System.out.println("Number of MMSemanticMarkupElement objects : "
				+ repo.getCountByType(MMSemanticMarkupElement.metaType()));
		System.out.println();
		System.out.println("-----Containment hiearchy (4 types skiped) -----");
		System.out.println("   (*: instance of RepositoryConcept )");
		printSubContainment2(MMRepository.metaType(), Collections.emptyList(), "  ", "");
	}

	private final static void printSubContainment2(MetamodelType<?> container, List<MetamodelAttribute<?, ?>> refPath,
			String tab, String prefix) {
		List<MetamodelType<?>> ignoreTypes = new ArrayList<>();
		ignoreTypes.add(MMConstraint.metaType());
		ignoreTypes.add(MMDoclet.metaType());
		ignoreTypes.add(MMSemanticMarkup.metaType());
		if (ignoreTypes.contains(container))
			return;

		String pkg;
		Set<? extends MetamodelType<?>> allSt = container.getSuperTypes(true, true);
		if (allSt.contains(MMTopLevelCatalogueEntry.metaType())) {
			if (allSt.contains(MMMessageSet.metaType())) {
				pkg = "catalogue.msgset.";
			} else if (allSt.contains(MMBusinessArea.metaType())) {
				pkg = "catalogue.area.";
			} else {
				pkg = "catalogue.other.";
			}
		} else if (allSt.contains(MMTopLevelDictionaryEntry.metaType())) {
			if (allSt.contains(MMCodeSet.metaType())) {
				pkg = "dict.codeset.";
			} else if (allSt.contains(MMDataType.metaType())) {
				pkg = "dict.datatype.";
			} else if (allSt.contains(MMBusinessComponent.metaType())) {
				pkg = "dict.entity.";
			} else if (allSt.contains(MMMessageComponent.metaType())) {
				pkg = "dict.msg.";
			} else if (allSt.contains(MMChoiceComponent.metaType())) {
				pkg = "dict.choice.";
			} else {
				pkg = "dict.other.";
			}
		} else if (allSt.contains(MMMessageDefinition.metaType())) {
			pkg = "catalogue.msgdef.<area>.";
		} else {
			pkg = null;
		}

		if (pkg == null)
			pkg = "-";
		System.out.println(
				tab + prefix + pkg + container.getName() + " (" + repo.getCountByType(container) + " objects )");

		container.listAllAttributes().filter(mmAttr -> mmAttr.isContainment())
				.filter(mmAttr -> !refPath.contains(mmAttr)).forEachOrdered(mmAttr -> {
					MetamodelType<?> refType = mmAttr.getReferencedType();
					// System.out.println( tab + mmAttr.getName() + ":" +
					// refType.getName() );
					Set<? extends MetamodelType<?>> subTypes = refType.getSubTypes(true, true);
					refType.listSubTypes(true, true).filter(subType -> !subType.isAbstract())
							.forEachOrdered(subType -> {
								List<MetamodelAttribute<?, ?>> nextpath = new ArrayList<>(refPath);
								nextpath.add(mmAttr);
								printSubContainment2(subType, nextpath, tab + "  ", "(" + mmAttr.getName() + ") ");
							});
				});
	}


}
