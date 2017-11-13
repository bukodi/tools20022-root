package com.tools20022.repogenerator;

import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMExternalSchema;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.MMUserDefined;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;

public class InspectLoadedRepository {

	final static RawRepository repo;

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
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Model load: " + (System.currentTimeMillis() - start) + " ms, "
				+ ((usedMem2 - usedMem) / (1024 * 1024)) + " MB");
	}

	@Test
	public void dataTypes() throws Exception {	
		Map<MetamodelType<?>,List<MMDataType>> dataTypesBy = new HashMap<>();
		for (MMDataType mmDataType : repo.listObjects(MMDataType.class).collect(Collectors.toList()) ) {
			MetamodelType<? extends GeneratedMetamodelBean> mmType = mmDataType.getMetamodel();
			dataTypesBy.computeIfAbsent(mmType, x->new ArrayList<>()).add(mmDataType);
		}
		
		int max = 10;
		for( Map.Entry<MetamodelType<?>,List<MMDataType>> e : dataTypesBy.entrySet()) {
			System.out.println();
			System.out.println( "***" + e.getKey().getName() + ": " + e.getValue().size() + " ***");
			for( MetamodelAttribute<?, ?> coreAttr : e.getKey().getAllAttributes() ) {
				if( ! coreAttr.getDeclaringType().getSuperTypes(false, true).contains(MMDataType.metaType()) )
					continue;
				System.out.println("  attr: " + coreAttr.getName() );
			}
			
			
			for( int i = 0; i < e.getValue().size(); i++ ) {
				MMDataType dt = e.getValue().get(i);
				if( i < max ) {
					System.out.println( "  " + dt.getName());
				} else if( i == max ) {
					System.out.println("  ( " + (e.getValue().size() - max) + " subsequent items...)" );
				}
			}
			
		}

	}

	@Test
	@Ignore
	public void codeSetRelations() throws Exception {
		for (MMCodeSet mmCodeSet : repo.listObjects(MMCodeSet.class).filter(cs -> cs.getName().startsWith("Repurchase"))
				.collect(Collectors.toList())) {
			System.out.println(mmCodeSet.getName() + " derivation: "
					+ mmCodeSet.getDerivation().stream().map(cs -> cs.getName()).collect(Collectors.joining(", "))
					+ "");
			for (MMCode c : mmCodeSet.getCode()) {
				System.out.println(" - " + c.getCodeName() + " - " + c.getName());
			}
			System.out.println();

		}

	}

	@Test
	public void registrationStatus() throws Exception {

		Map<MMRegistrationStatus, List<MMRepositoryConcept>> byRegStatus = repo.listObjects(MMRepositoryConcept.class)
				.collect(Collectors.groupingBy(rc -> rc.getRegistrationStatus()));

		for (Entry<MMRegistrationStatus, List<MMRepositoryConcept>> e : byRegStatus.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		}

		Date epoch = new Date(0L);
		Map<Date, List<MMRepositoryConcept>> byRemovalDate = repo.listObjects(MMRepositoryConcept.class)
				.collect(Collectors.groupingBy(rc -> rc.getRemovalDate().orElse(epoch)));
		for (Entry<Date, List<MMRepositoryConcept>> e : byRemovalDate.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		}

	}

	@Test
	public void countMarkupsAndDescriptions() throws Exception {
		int countRC = 0;
		int countDef = 0;
		int countDoclet = 0;
		int countAllDoclet = 0;
		int countMarkups = 0;
		int countAllMarkups = 0;
		for (MMRepositoryConcept mmRC : repo.listObjects(MMRepositoryConcept.class).collect(Collectors.toList())) {
			countRC++;
			if (mmRC.getDefinition().isPresent())
				countDef++;
			if (!mmRC.getDoclet().isEmpty()) {
				countDoclet++;
				countAllDoclet += mmRC.getDoclet().size();
			}
			if (!mmRC.getSemanticMarkup().isEmpty()) {
				countMarkups++;
				countAllMarkups += mmRC.getSemanticMarkup().size();
			}
		}
		System.out.println("CountRC=" + countRC + ", countDef=" + countDef);

	}

	@Test
	public void semantiMarkups() throws Exception {
		Map<String, Set<MMSemanticMarkup>> markupsByType = new LinkedHashMap<>();
		for (MMRepositoryConcept mmRC : repo.listObjects(MMRepositoryConcept.class).collect(Collectors.toList())) {
			if (mmRC.getSemanticMarkup().isEmpty())
				continue;
			for (MMSemanticMarkup mmSM : mmRC.getSemanticMarkup()) {
				String type = mmSM.getType().orElse("NULL");
				markupsByType.computeIfAbsent(type, x -> new LinkedHashSet<>()).add(mmSM);
			}
		}

		Map<String, Set<MMSemanticMarkup>> sysnonymsByContext = new LinkedHashMap<>();
		Set<MMSemanticMarkup> sysnonymsWithoutElements = new LinkedHashSet<>();
		Set<MMSemanticMarkup> otherSysnonyms = new LinkedHashSet<>();
		for (MMSemanticMarkup mmSM : markupsByType.get("Synonym")) {
			if (mmSM.getElements().isEmpty()) {
				sysnonymsWithoutElements.add(mmSM);
				continue;
			}

			String keys = mmSM.getElements().stream().map(sme -> sme.getName().orElse("NULL"))
					.collect(Collectors.joining(","));
			if ("context,value".equals(keys)) {
				sysnonymsByContext.computeIfAbsent(mmSM.getElements().get(0).getValue().get(), x -> new HashSet<>())
						.add(mmSM);
			} else if ("name,context".equals(keys)) {
				sysnonymsByContext.computeIfAbsent(mmSM.getElements().get(1).getValue().get(), x -> new HashSet<>())
						.add(mmSM);
			} else {
				otherSysnonyms.add(mmSM);
			}
		}

		System.out.println("--- SemanticMarkups where the type='Synonym' ---");
		System.out.println(
				"Most of the SemanticMarkups are syonyms ( " + markupsByType.get("Synonym").size() + " instances)");
		System.out.println(
				"From that " + sysnonymsWithoutElements.size() + " hasn't any element. (Propably these are bugs)");
		System.out.println(
				"The rest of the synonym markups has two elements with key names [context,value] or [name,context].");
		System.out.println("Number of synonym markups grouped by context value:");
		for (Map.Entry<String, Set<MMSemanticMarkup>> e : sysnonymsByContext.entrySet()) {
			System.out.println(" - context= '" + e.getKey() + "' : " + e.getValue().size());
		}
		System.out.println();
		for (MMSemanticMarkup mmSM : otherSysnonyms) {
			String line = "[" + mmSM.getContainer().getClass().getSimpleName() + "]" + mmSM.getContainer().getName()
					+ " :";
			for (MMSemanticMarkupElement mmSME : mmSM.getElements()) {
				String kv = " " + mmSME.getName().orElse("NULL") + "=" + mmSME.getValue().orElse("NULL");
				line += kv;
			}
			System.out.println("Execept this: " + line);
		}

		System.out.println("--- Non synonym SemanticMarkups ---");
		System.out.println("List of SemanticMarkups grouped by type (where type<>'Synonym')");
		for (Map.Entry<String, Set<MMSemanticMarkup>> e : markupsByType.entrySet()) {
			if ("Synonym".equals(e.getKey()))
				continue;
			System.out.println("type=" + e.getKey() + "");
			if ("SampleData".equals(e.getKey())) {
				System.out.println("  - " + e.getValue().size() + " instances, but they are useless.");
				continue;
			}
			for (MMSemanticMarkup mmSM : e.getValue()) {
				String line = "[" + mmSM.getContainer().getClass().getSimpleName() + "]" + mmSM.getContainer().getName()
						+ " :";
				for (MMSemanticMarkupElement mmSME : mmSM.getElements()) {
					String kv = " " + mmSME.getName().orElse("NULL") + "=" + mmSME.getValue().orElse("NULL");
					line += kv;
				}
				System.out.println("  - " + line);
			}
		}
		System.out.println();
		System.out.println(
				"No SemanticMarkups where the 'type' is empty. (But the SemanticMarkups.type defined as optional in eCore model)");

	}

	@Test
	public void codeSets() throws Exception {

		Map<Integer, List<MMCodeSet>> csByCodesetSize = new HashMap<>();

		for (MMCodeSet mmCS : repo.listObjects(MMCodeSet.class).collect(Collectors.toList())) {
			csByCodesetSize.computeIfAbsent(mmCS.getCode().size(), x -> new ArrayList<>()).add(mmCS);
		}

		csByCodesetSize.entrySet().stream().forEachOrdered(e -> {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		});

		csByCodesetSize.get(1).stream().forEachOrdered(cs -> {
			System.out.print(cs.getName() + ", " + cs.getPattern().orElse("-") + ", "
					+ cs.getIdentificationScheme().orElse("-"));
			System.out.print(", " + (cs.getTrace().isPresent() ? cs.getTrace().get().getName() : "-"));
			System.out.println(", " + (cs.getDerivation().size()));
		});

	}

	@Test
	public void doclets() throws Exception {
		Map<String, Set<MMDoclet>> docletsByType = new LinkedHashMap<>();
		for (MMDoclet mmD : repo.listObjects(MMDoclet.class).collect(Collectors.toList())) {
			docletsByType.computeIfAbsent(mmD.getType().orElse("-noType-"), x -> new LinkedHashSet<>()).add(mmD);
		}

		docletsByType.entrySet().stream().forEachOrdered(e -> {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		});
		System.out.println();
		docletsByType.entrySet().stream().forEachOrdered(e -> {
			System.out.println("---" + e.getKey() + " ---");
			e.getValue().forEach(mmD -> {
				System.out.println(mmD.getContent().orElse("-noContent-"));
			});
		});

	}

	final Map<Class<? extends MMModelEntity>, Set<MMModelEntity>> noTrace = new HashMap<>();
	final Map<Class<? extends MMModelEntity>, Set<MMModelEntity>> withTrace = new HashMap<>();

	@Test
	public void traces() throws Exception {
		noTrace.clear();
		withTrace.clear();

		inspectTraces(MMBusinessComponent.class,
				mmObj -> !(mmObj.getDerivationComponent().isEmpty() && mmObj.getDerivationComponent().isEmpty()));
		inspectTraces(MMBusinessAttribute.class, mmObj -> !mmObj.getDerivation().isEmpty());
		inspectTraces(MMBusinessAssociationEnd.class, mmObj -> !mmObj.getDerivation().isEmpty());

		inspectTraces(MMMessageAttribute.class, mmObj -> mmObj.getBusinessComponentTrace().isPresent() || mmObj.getBusinessElementTrace().isPresent());
		inspectTraces(MMMessageAssociationEnd.class, mmObj -> mmObj.getBusinessComponentTrace().isPresent() || mmObj.getBusinessElementTrace().isPresent());

		inspectTraces(MMExternalSchema.class, mmObj -> mmObj.getTrace().isPresent());
		inspectTraces(MMUserDefined.class, mmObj -> mmObj.getTrace().isPresent());
		inspectTraces(MMChoiceComponent.class, mmObj -> mmObj.getTrace().isPresent());
		inspectTraces(MMMessageComponent.class, mmObj -> mmObj.getTrace().isPresent());
		
		for(Class<?> mmType :  noTrace.keySet() ) {
			System.out.println( mmType.getSimpleName() + ": no=" + noTrace.get(mmType).size() + " with=" + withTrace.get(mmType).size());
		}

	}

	public <T extends MMModelEntity> void inspectTraces(Class<T> mmType, Predicate<T> hasTrace) {
		Set<MMModelEntity> noTraceSet = noTrace.computeIfAbsent(mmType, x -> new HashSet<>());
		Set<MMModelEntity> withTraceSet = withTrace.computeIfAbsent(mmType, x -> new HashSet<>());
		repo.listObjects(mmType).forEach(mmObj -> {
			if (hasTrace.test(mmObj)) {
				withTraceSet.add(mmObj);
			} else {
				noTraceSet.add(mmObj);
			}
		});
	}

	@Test
	public void businessAssociations() throws Exception {
		Map<MMAggregation, List<MMBusinessAssociationEnd>> refsByAggr = new LinkedHashMap<>();
		Map<String, List<MMBusinessAssociationEnd>> refsByArity = new LinkedHashMap<>();
		Set<MMBusinessAssociationEnd> processedMMRef = new HashSet<>();
		for (MMBusinessAssociationEnd mmRef : repo.listObjects(MMBusinessAssociationEnd.class)
				.collect(Collectors.toList())) {
			if (processedMMRef.contains(mmRef))
				continue;
			processedMMRef.add(mmRef);
			mmRef.getOpposite().ifPresent(opposite -> processedMMRef.add(opposite));

			refsByAggr.computeIfAbsent(mmRef.getAggregation(), x -> new ArrayList<>()).add(mmRef);

			String arity = mmRef.getMinOccurs().isPresent() ? mmRef.getMinOccurs().get().toString() : "?";
			arity += "..";
			arity += mmRef.getMaxOccurs().isPresent() ? mmRef.getMaxOccurs().get().toString() : "?";

			if (mmRef.getOpposite().isPresent()) {
				MMBusinessAssociationEnd mmOp = mmRef.getOpposite().get();
				arity += "-";
				arity += mmOp.getMinOccurs().isPresent() ? mmOp.getMinOccurs().get().toString() : "?";
				arity += "..";
				arity += mmOp.getMaxOccurs().isPresent() ? mmOp.getMaxOccurs().get().toString() : "?";
			}

			refsByArity.computeIfAbsent(arity, x -> new ArrayList<>()).add(mmRef);

		}

		refsByAggr.entrySet().stream().forEachOrdered(e -> {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		});
		System.out.println();
		refsByArity.entrySet().stream().forEachOrdered(e -> {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		});
		System.out.println();

	}

	@Test
	// @Ignore
	public void entityInheritance() throws Exception {
		List<MMBusinessComponent> topLevelEntities = new ArrayList<>();
		Map<MMBusinessComponent, List<MMBusinessComponent>> subTypesByParent = new LinkedHashMap<>();

		for (MMBusinessComponent mmBC : repo.listObjects(MMBusinessComponent.class).collect(Collectors.toList())) {
			if (mmBC.getSuperType().isPresent()) {
				subTypesByParent.computeIfAbsent(mmBC.getSuperType().get(), x -> new ArrayList<>()).add(mmBC);
			} else {
				topLevelEntities.add(mmBC);
			}
		}

		System.out.println("-- no super or sub type ---");
		topLevelEntities.stream().filter(x -> (!subTypesByParent.containsKey(x))).forEach(y -> {
			System.out.println(y.getName());
		});
		System.out.println();
		System.out.println("-- Hierarchy ---");
		topLevelEntities.stream().filter(x -> (subTypesByParent.containsKey(x))).forEach(y -> {
			printWithSubtypes(y, "", subTypesByParent);
		});

	}

	private void printWithSubtypes(MMBusinessComponent mmBC, String tab,
			Map<MMBusinessComponent, List<MMBusinessComponent>> subTypesByParent) {
		System.out.println(tab + mmBC.getName() + "( " + mmBC.getElement().size() + ")");
		mmBC.getSubType().forEach(x -> {
			printWithSubtypes(x, tab + "  ", subTypesByParent);
		});
	}

	@Test
	// @Ignore
	public void groupEntitiesByBusinessArea() throws Exception {
		// MMMessageComponentType_.trace;
		// MMMessageElement_.businessComponentTrace;

		/*** Collect repo types by area codes ***/
		Map<String, Set<MMRepositoryType>> repoTypesByAreaName = new HashMap<>();
		for (MMMessageDefinition mmMsgDef : repo.listObjects(MMMessageDefinition.class).collect(Collectors.toList())) {
			Set<MMMessageConstruct> msgElemsAndBBs = new HashSet<>();
			for (MMXor mmXor : mmMsgDef.getXors()) {
				msgElemsAndBBs.addAll(mmXor.getImpactedElements());
				msgElemsAndBBs.addAll(mmXor.getImpactedMessageBuildingBlocks());
			}
			msgElemsAndBBs.addAll(mmMsgDef.getMessageBuildingBlock());

			String areaCode = mmMsgDef.getBusinessArea().getCode();
			Set<MMRepositoryType> mmRepoTypes = repoTypesByAreaName.computeIfAbsent(areaCode,
					x -> new LinkedHashSet<MMRepositoryType>());
			msgElemsAndBBs.forEach(msgElemOrBB -> {
				mmRepoTypes.add(msgElemOrBB.getMemberType());
			});
		}

		/*** Invert the map ***/
		Map<MMRepositoryType, Set<String>> areaCodesByRepoType = new HashMap<>();
		for (Map.Entry<String, Set<MMRepositoryType>> e : repoTypesByAreaName.entrySet()) {
			for (MMRepositoryType repoType : e.getValue()) {
				areaCodesByRepoType.computeIfAbsent(repoType, x -> new LinkedHashSet<String>()).add(e.getKey());
			}
		}

		/*** Print elems with 1 area ***/
		Collator collator = Collator.getInstance();
		Comparator<Map.Entry<MMRepositoryType, Set<String>>> comparator = (e1, e2) -> {
			return collator.compare(e1.getKey().getClass().getSimpleName(), e2.getKey().getClass().getSimpleName());
		};

		System.out.println("--------Types belong to 1 area----------------------");
		areaCodesByRepoType.entrySet().stream().filter(e -> e.getValue().size() == 1).sorted(comparator).forEach(e -> {
			System.out.print("[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print(e.getKey().getName() + " : ");
			System.out.println(String.join(", ", e.getValue()));
		});
		System.out.println();

		System.out.println("--------Types belong to more thane 1 area----------------------");
		areaCodesByRepoType.entrySet().stream().filter(e -> e.getValue().size() > 1).sorted(comparator).forEach(e -> {
			System.out.print("[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print(e.getKey().getName() + " : ");
			System.out.println(String.join(", ", e.getValue()));
		});
		System.out.println();
		System.out.println("--------Types belong to 0 area----------------------");
		areaCodesByRepoType.entrySet().stream().filter(e -> e.getValue().isEmpty()).sorted(comparator).forEach(e -> {
			System.out.print("[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print(e.getKey().getName() + " : ");
			System.out.println(String.join(", ", e.getValue()));
		});
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*************************************************");

		Map<MMBusinessComponent, Set<String>> entitiesByAreaCodes = new HashMap<>();
		for (MMBusinessComponent mmEntity : repo.listObjects(MMBusinessComponent.class).collect(Collectors.toList())) {
			entitiesByAreaCodes.put(mmEntity, new HashSet<>());
		}
		for (Map.Entry<MMRepositoryType, Set<String>> x : areaCodesByRepoType.entrySet()) {
			if (!(x.getKey() instanceof MMMessageComponent))
				continue;
			if (x.getValue().size() != 1)
				continue;
			String areaCode = x.getValue().iterator().next();
			Optional<MMBusinessComponent> optTracedEntity = ((MMMessageComponent) x.getKey()).getTrace();
			if (!optTracedEntity.isPresent())
				continue;
			entitiesByAreaCodes.get(optTracedEntity.get()).add(areaCode);
		}
		;

		System.out.println("Round 1. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes));
		System.out.println("Round 2. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes));
		System.out.println("Round 3. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes));
		System.out.println("Round 4. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes));
		System.out.println("Round 5. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes));
		System.out.println("Round 6. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes));
		System.out.println("Round 7. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes));
		System.out.println("Round 8. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes));

		System.out.println("--------Entities belong to 1 area----------------------");
		entitiesByAreaCodes.entrySet().stream().filter(e -> e.getValue().size() == 1).forEach(e -> {
			System.out.print("[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print(e.getKey().getName() + " : ");
			System.out.println(String.join(", ", e.getValue()));
		});
		System.out.println();

		System.out.println("--------Entities belong more than 1 area----------------------");
		entitiesByAreaCodes.entrySet().stream().filter(e -> e.getValue().size() > 1).forEach(e -> {
			System.out.print("[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print(e.getKey().getName() + " : ");
			System.out.println(String.join(", ", e.getValue()));
		});
		System.out.println();

		System.out.println("--------Entities belong to 0 area----------------------");
		entitiesByAreaCodes.entrySet().stream().filter(e -> e.getValue().isEmpty()).forEach(e -> {
			System.out.print("[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print(e.getKey().getName() + " : ");
			System.out.println(String.join(", ", e.getValue()));
		});
		System.out.println();

		System.out.println("*************************************************");
		System.out.println("--------Areas by number of entities -------------------");
		Map<String, AtomicInteger> entityCountsByArea = new HashMap<>();
		AtomicInteger entityCountsWithNoArea = new AtomicInteger();
		AtomicInteger entityCountsWithMultipleArea = new AtomicInteger();
		// Map<String,AtomicInteger> roleCountsByArea = new HashMap<>();
		entitiesByAreaCodes.entrySet().stream().forEach(e -> {
			if (e.getValue().size() == 1)
				entityCountsByArea.computeIfAbsent(e.getValue().iterator().next(), x -> new AtomicInteger())
						.incrementAndGet();
			else if (e.getValue().isEmpty())
				entityCountsWithNoArea.incrementAndGet();
			else
				entityCountsWithMultipleArea.incrementAndGet();
		});
		entityCountsByArea.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey() + " : " + e.getValue().get());
		});
		System.out.println("No area : " + entityCountsWithNoArea.get());
		System.out.println("Multiple area : " + entityCountsWithMultipleArea.get());
		System.out.println();

	}

	private int extendAreaMapping(Map<MMBusinessComponent, Set<String>> entitiesByAreaCodes) {
		/*** Clone entities with single area code to a new map ***/
		Map<MMBusinessComponent, String> entitiesWithSingleAreaCode = new HashMap<>();
		for (Map.Entry<MMBusinessComponent, Set<String>> e : entitiesByAreaCodes.entrySet()) {
			if (e.getValue().size() != 1)
				continue;
			entitiesWithSingleAreaCode.put(e.getKey(), e.getValue().iterator().next());
		}
		/*** Loop trough references */
		for (Map.Entry<MMBusinessComponent, String> e : entitiesWithSingleAreaCode.entrySet()) {
			MMBusinessComponent entity = e.getKey();
			// Extend outgoing relations
			for (MMBusinessElement member : entity.getElement()) {
				if (!(member instanceof MMBusinessAssociationEnd))
					continue;
				MMBusinessAssociationEnd rel = (MMBusinessAssociationEnd) member;
				MMBusinessComponent otherEntity = rel.getType();
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}
			// Extend incoming relations
			for (MMBusinessAssociationEnd rel : entity.getAssociationDomain()) {
				MMBusinessComponent otherEntity = rel.getElementContext();
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}
			// Extend by subtypes
			for (MMBusinessComponent otherEntity : entity.getSubType()) {
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}
		}

		/*** Count entities with single area code ***/
		return (int) entitiesByAreaCodes.entrySet().stream().filter(e -> e.getValue().size() == 1).count();
	}

}
