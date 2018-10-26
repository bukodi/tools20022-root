package com.tools20022.repogenerator;

import java.io.IOException;
import java.io.InputStream;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMAmount;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMEncoding;
import com.tools20022.metamodel.MMExternalSchema;
import com.tools20022.metamodel.MMISO15022MessageSet;
import com.tools20022.metamodel.MMIndustryMessageSet;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.MMSyntax;
import com.tools20022.metamodel.MMSyntaxMessageScheme;
import com.tools20022.metamodel.MMText;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMUserDefined;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repogenerator.RawRepository.IncominRef;

import junit.framework.AssertionFailedError;

public class InspectLoadedRepository {

	final static RawRepository repo;

	static {
		long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long start = System.currentTimeMillis();
		try {
			EPackage ecorePkg = ECoreIOHelper
					.loadECorePackage(ECoreIOHelper.class.getResourceAsStream("/model/ISO20022.ecore"));
			EObject rootEObj = ECoreIOHelper.loadXMIResource(
			ECoreIOHelper.class.getResourceAsStream("/model/business-domain-payments.iso20022"));
			// EObject rootEObj = ECoreIOHelper.loadXMIResource(
			// ECoreIOHelper.class.getResourceAsStream("/model/20170713_ISO20022_2013_eRepository.iso20022"));
			//EObject rootEObj = ECoreIOHelper.loadXMIResource(ECoreIOHelper.class.getResourceAsStream("/model/msgdef-pacs.008.001.02-nobuscomp.iso20022"));
			//EObject rootEObj = ECoreIOHelper.loadXMIResource(ECoreIOHelper.class.getResourceAsStream("/model/msgdef-tsmt.049.001.01-nobuscomp.iso20022"));
			//EObject rootEObj = ECoreIOHelper.loadXMIResource(ECoreIOHelper.class.getResourceAsStream("/model/20180314_ISO20022_2013_eRepository.iso20022"));
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
	public void whereUsed() throws Exception {
		List<? extends MMMessageDefinition> msgDefs = repo.getObjects(MMMessageDefinition.class);

	}

	static Set<MetamodelAttribute<?, ?>> msgDefRefs;
	static {
		Set<MetamodelAttribute<?, ?>> tmpSet = new HashSet<>();
		tmpSet.add(MMMessageDefinition.messageBuildingBlocksAttribute);
		tmpSet.add(MMMessageDefinition.xorsAttribute);
		tmpSet.add(MMXor.messageComponentAttribute);
		tmpSet.add(MMXor.impactedElementsAttribute);
		tmpSet.add(MMXor.impactedMessageBuildingBlocksAttribute);
		tmpSet.add(MMMessageElementContainer.messageElementsAttribute);
		tmpSet.add(MMMessageBuildingBlock.complexTypeAttribute);
		tmpSet.add(MMMessageBuildingBlock.simpleTypeAttribute);
		tmpSet.add(MMMessageAssociationEnd.typeAttribute);
		tmpSet.add(MMMessageAttribute.simpleTypeAttribute);
		tmpSet.add(MMMessageAttribute.complexTypeAttribute);
		msgDefRefs = Collections.unmodifiableSet(tmpSet);
	}

	@Test
	public void inspectSpecificMSGDefObject() throws Exception {
		MMMessageDefinition obj = repo.findObjectByTypeAndName(MMMessageDefinition.class, "RoleAndBaselineAcceptanceV01");

		printMembers(obj, "");
	}
	
	private void printMembers( MMModelEntity obj, String tab ) {
		for( MetamodelAttribute<?, ?> mmAttr : obj.getMetamodel().getAllAttributes() ) {
			if( ! msgDefRefs.contains(mmAttr) )
				continue;
			
			Object value = mmAttr.get(obj);
			if( value == null )
				continue;
			if( value instanceof Collection ) {
				for(Object entry : ((Collection)value)) {
					MMModelEntity refObj = (MMModelEntity)entry;					
					System.out.println( tab + "" + mmAttr.getName() + " : " + StandardMetamodel2013.toString(refObj));
					printMembers(refObj, tab + "  ");
				}				
			} else if( value instanceof MMModelEntity ) {
				MMModelEntity refObj = (MMModelEntity)value;
				System.out.println( tab + "" + mmAttr.getName() + " : " + StandardMetamodel2013.toString(refObj));
				printMembers(refObj, tab + "  ");
			} else if( value instanceof Optional ) {
				Optional<?> opt = (Optional<?>)value;
				if( opt.isPresent() ) {
					MMModelEntity refObj = (MMModelEntity)(opt.get());
					System.out.println( tab + "" + mmAttr.getName() + " : " + StandardMetamodel2013.toString(refObj));
					printMembers(refObj, tab + "  ");					
				}
			} else {
				throw new RuntimeException("Invalid type: " + value.getClass() );
			}					
		}
	}

	@Test
	public void fingUsagesOfAType() throws Exception {
		//MMText obj = repo.findObjectByTypeAndName(MMText.class, "Max35Text");
		MMCodeSet obj = repo.findObjectByTypeAndName(MMCodeSet.class, "ExternalCommunicationFormat1Code");
		Map<MMMessageDefinition, Set<List<IncominRef>>> pathsByMsgDefs = findPathsToMsgDefs(obj);
		
		for( Entry<MMMessageDefinition, Set<List<IncominRef>>> e : pathsByMsgDefs.entrySet()) {
			MMMessageDefinition msgDef = e.getKey();
			System.out.println( msgIdToString( msgDef.getMessageDefinitionIdentifier() ) + "  " + msgDef.getName() + " ( x " + e.getValue().size() + " )");
		}
		
	}

	public Map<MMMessageDefinition, Set<List<IncominRef>>> findPathsToMsgDefs( MMModelEntity obj ) {
		
		// Build seed set
		Set<List<IncominRef>> paths = new LinkedHashSet<>();
		for (IncominRef ir : repo.getIncomingRefs(obj)) {
			if (!msgDefRefs.contains(ir.mmAttr))
				continue;
			List<IncominRef> path = new ArrayList<>();
			path.add(ir);
			paths.add(path);
		}

		// Extend seed
		for( int i = 1;extendPaths(paths); i++) {
			System.out.println( i + ". iteration");
		}
		
		// Group by msgDef
		Comparator<MMMessageDefinition> cmp = (x,y)->Collator.getInstance().compare(x.getMessageDefinitionIdentifier().toString(), y.getMessageDefinitionIdentifier().toString());
		Map<MMMessageDefinition, Set<List<IncominRef>>> pathsByMsgDef = new TreeMap<>(cmp );
		for( List<IncominRef> path : paths ) {
			 IncominRef firstRef = path.iterator().next();
			 MMMessageDefinition msgDef = (MMMessageDefinition)firstRef.sourceObj;
			 pathsByMsgDef.computeIfAbsent(msgDef, x->new HashSet<>()).add(path);			
		}
		return pathsByMsgDef;
	}

	private Set<List<IncominRef>> dumpPaths(Set<List<IncominRef>> paths) {
		for (List<IncominRef> path : paths) {
			StringJoiner sj = new StringJoiner(" > ");
			for (IncominRef step : path) {
				String txt = "[" + step.sourceObj.getClass().getSimpleName() + "]";
				if( step.sourceObj instanceof MMRepositoryConcept ) {
					txt+= ((MMRepositoryConcept)step.sourceObj).getName();
				}
				txt += "." + step.mmAttr.getName();
				sj.add(txt);
			}
			System.out.println(sj);
		}
		System.out.println();
		return paths;
	}

	private boolean extendPaths(Set<List<IncominRef>> prevPaths) {
		//Set<List<IncominRef>> nextPaths = new LinkedHashSet<>();
		boolean changed = false;
		for (List<IncominRef> path : new ArrayList<>( prevPaths) ) {
			IncominRef headIR = path.get(0);
			if( headIR.sourceObj instanceof MMMessageDefinition ) {
				// Ok, don't change
			} else {
				changed = true;
				prevPaths.remove(path);
				for (IncominRef ir : repo.getIncomingRefs(headIR.sourceObj)) {
					if (!msgDefRefs.contains(ir.mmAttr))
						continue;
					List<IncominRef> newPath = new ArrayList<>();
					newPath.add(ir);
					newPath.addAll(path);
					prevPaths.add(newPath);
				}				
			}
		}
		return changed;
	}

	@Test
	public void categorizeMMTypes() {
		Map<String, Set<MetamodelType<? extends MMModelEntity>>> typesByCategorie = new HashMap<>();
		BiConsumer<MetamodelType<? extends MMModelEntity>, String> printType = (mmType, name) -> {
			typesByCategorie.computeIfAbsent(name, x -> new LinkedHashSet<MetamodelType<? extends MMModelEntity>>())
					.add(mmType);
		};

		System.out.println("------------------------");

		for (MetamodelType<? extends MMModelEntity> mmType : StandardMetamodel2013.metamodel().getAllTypes()) {

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
			for (MetamodelType<? extends MMModelEntity> mmType : typesByCategorie.get(name)) {
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
	public void countMMTypes() throws Exception {
		System.out.println("Abstract types: "
				+ StandardMetamodel2013.metamodel().getAllTypes().stream().filter(t -> t.isAbstract()).count());
		System.out.println("Non abstract types: "
				+ StandardMetamodel2013.metamodel().getAllTypes().stream().filter(t -> !t.isAbstract()).count());
		System.out.println("Non abstract and RepositoryConcept: " + StandardMetamodel2013.metamodel().getAllTypes()
				.stream().filter(t -> !t.isAbstract())
				.filter(t -> t.listSuperTypes(false, true).anyMatch(s -> s.equals(MMRepositoryConcept.metaType())))
				.count());
		System.out.println("Non abstract and non RepositoryConcept: " + StandardMetamodel2013.metamodel().getAllTypes()
				.stream().filter(t -> !t.isAbstract())
				.filter(t -> !t.listSuperTypes(false, true).anyMatch(s -> s.equals(MMRepositoryConcept.metaType())))
				.count());
		System.out.println();
		System.out.println("Non abstract and non RepositoryConcept: ");
		StandardMetamodel2013.metamodel().getAllTypes().stream().filter(t -> !t.isAbstract())
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

	}

	@Test
	// @Ignore
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
	public void inspectRequestToModifyPaymentV03() throws Exception {
		MMMessageDefinition objRequestToModifyPaymentV03 = repo.findObjectByTypeAndName(MMMessageDefinition.class,
				"RequestToModifyPaymentV03");
		MMMessageDefinition objRequestToModifyPaymentV04 = repo.findObjectByTypeAndName(MMMessageDefinition.class,
				"RequestToModifyPaymentV04");

		System.out.println(objRequestToModifyPaymentV03);
		System.out.println(objRequestToModifyPaymentV03);

	}

	@Test
	public void dataTypes() throws Exception {
		Map<MetamodelType<?>, List<MMDataType>> dataTypesBy = new HashMap<>();
		MMDataType.metaType().listSubTypes(false, true).forEach(mmDT -> {
			dataTypesBy.put(mmDT, new ArrayList<>());
		});
		;

		for (MMDataType mmDataType : repo.getObjects(MMDataType.class)) {
			MetamodelType<? extends MMModelEntity> mmType = mmDataType.getMetamodel();
			dataTypesBy.computeIfAbsent(mmType, x -> new ArrayList<>()).add(mmDataType);
		}

		int max = 10;
		for (Map.Entry<MetamodelType<?>, List<MMDataType>> e : dataTypesBy.entrySet()) {
			System.out.println();
			System.out.println("*** " + e.getKey().getName() + ": " + e.getValue().size() + " ***");

			for (MetamodelType<?> st : e.getKey().getSuperTypes(false, true)) {
				if (!st.getSuperTypes(false, true).contains(MMDataType.metaType()))
					continue;
				System.out.println("  supertype: " + st.getName());
			}

			for (MetamodelAttribute<?, ?> coreAttr : e.getKey().getAllAttributes()) {
				if (!coreAttr.getDeclaringType().getSuperTypes(false, true).contains(MMDataType.metaType()))
					continue;
				System.out.println("  attr: " + coreAttr.getDeclaringType().getName() + "." + coreAttr.getName());
			}

			for (int i = 0; i < e.getValue().size(); i++) {
				MMDataType dt = e.getValue().get(i);
				if (i < max) {
					System.out.println("  - " + dt.getName());
				} else if (i == max) {
					System.out.println("  ( " + (e.getValue().size() - max) + " subsequent items...)");
				}
			}

		}

	}

	@Test
	// @Ignore
	public void codeSetRelations() throws Exception {
		for (MMCodeSet mmCodeSet : repo.getObjects(MMCodeSet.class).stream()
				.filter(cs -> cs.getName().startsWith("Repurchase")).collect(Collectors.toList())) {
			System.out.println(mmCodeSet.getName() + " derivation: "
					+ mmCodeSet.getDerivations().stream().map(cs -> cs.getName()).collect(Collectors.joining(", "))
					+ "");
			for (MMCode c : mmCodeSet.getCodes()) {
				System.out.println(" - " + c.getCodeName() + " - " + c.getName());
			}
			System.out.println();

		}

	}

	@Test
	public void registrationStatus() throws Exception {

		Map<MMRegistrationStatus, List<MMRepositoryConcept>> byRegStatus = repo.getObjects(MMRepositoryConcept.class)
				.stream().collect(Collectors.groupingBy(rc -> rc.getRegistrationStatus()));

		for (Entry<MMRegistrationStatus, List<MMRepositoryConcept>> e : byRegStatus.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		}

		Date epoch = new Date(0L);
		Map<Date, List<MMRepositoryConcept>> byRemovalDate = repo.getObjects(MMRepositoryConcept.class).stream()
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
		for (MMRepositoryConcept mmRC : repo.getObjects(MMRepositoryConcept.class)) {
			countRC++;
			if (mmRC.getDefinition().isPresent())
				countDef++;
			if (!mmRC.getDoclets().isEmpty()) {
				countDoclet++;
				countAllDoclet += mmRC.getDoclets().size();
			}
			if (!mmRC.getSemanticMarkups().isEmpty()) {
				countMarkups++;
				countAllMarkups += mmRC.getSemanticMarkups().size();
			}
		}
		System.out.println("CountRC=" + countRC + ", countDef=" + countDef);

	}

	enum SynonymContext {
		ISO_15022("ISO 15022"), _15022("15022"), ISO_15022_("ISO 15022 "), ISO15002("ISO15002"), ISO15022("ISO15022"),

		FIX("FIX"), FIX_50("FIX 5.0"), FIXProtocol("FIX Protocol"), FIX_("FIX "), FIX50("FIX5.0"), Fix50("Fix5.0"),

		DTCC("DTCC"), DTCC_("DTCC "),

		MIFIDRequirement("MIFID Requirement"), MIFIDrequirement("MIFID requirement"), MiFIR("MiFIR"), EFAMA("EFAMA"),
		ebXML("ebXML"), ISO("ISO"), RUCMPG("RU-CMPG"), SubSequenceD3Amounts("SubSequenceD3 Amounts"),
		StatementBusinessModeling("Statement Business Modeling"), ASN1("ASN.1"), OTHER("OTHER");

		public final String contextName;

		SynonymContext(String contextName) {
			this.contextName = contextName;
		}

		static SynonymContext fromContextName(String contextName) {
			for (SynonymContext v : values()) {
				if (contextName.equals(v.contextName))
					return v;
			}
			return OTHER;
		}
	}

	@Test
	public void semanticMarkups() throws Exception {
		Map<String, Set<MMSemanticMarkup>> markupsByType = new LinkedHashMap<>();
		for (MMRepositoryConcept mmRC : repo.getObjects(MMRepositoryConcept.class)) {
			if (mmRC.getSemanticMarkups().isEmpty())
				continue;
			List<MMSemanticMarkup> markups = mmRC.getSemanticMarkups();
			if (markups.size() > 1) {
				System.out.print("More than one markup on elem " + mmRC + ": ");
				List<String> list = new ArrayList<>();
				for (MMSemanticMarkup m : markups) {
					String type = m.getType().orElse("-null-");
					if ("Synonym".equals(type)) {
						String context = "???";
						for (MMSemanticMarkupElement e : m.getElements()) {
							if ("context".equals(e.getName().orElse("-null-"))) {
								context = e.getValue().orElse("-null-");
							}
						}
						list.add("Syn(" + context + ")");
					} else {
						list.add(type);
					}
				}
				System.out.println(list.stream().collect(Collectors.joining(", ")));
			}
			for (MMSemanticMarkup mmSM : markups) {
				String type = mmSM.getType().orElse("NULL");
				markupsByType.computeIfAbsent(type, x -> new LinkedHashSet<>()).add(mmSM);
			}
		}

		Map<SynonymContext, List<String>> sysnonymsByContext = new LinkedHashMap<>();
		Set<MMSemanticMarkup> sysnonymsWithoutElements = new LinkedHashSet<>();
		Map<MMRepositoryConcept, String> iso15022Sysnonyms = new LinkedHashMap<>();
		Set<MMSemanticMarkup> otherSysnonyms = new LinkedHashSet<>();
		for (MMSemanticMarkup mmSM : markupsByType.get("Synonym")) {
			if (mmSM.getElements().isEmpty()) {
				sysnonymsWithoutElements.add(mmSM);
				continue;
			}

			String keys = mmSM.getElements().stream().map(sme -> sme.getName().orElse("NULL"))
					.collect(Collectors.joining(","));
			String contextText;
			String value;
			if ("context,value".equals(keys)) {
				contextText = mmSM.getElements().get(0).getValue().get();
				value = "value=" + mmSM.getElements().get(1).getValue().orElse("-null-");
			} else if ("name,context".equals(keys)) {
				contextText = mmSM.getElements().get(1).getValue().get();
				value = "name=" + mmSM.getElements().get(0).getValue().orElse("-null-");
			} else {
				contextText = "OTHER";
				value = keys;
			}
			SynonymContext context = SynonymContext.fromContextName(contextText);
			sysnonymsByContext.computeIfAbsent(context, x -> new ArrayList<>()).add(value);
		}
		System.out.println("--- ISO 15022 syonyms ---");
		for (Map.Entry<MMRepositoryConcept, String> entry : iso15022Sysnonyms.entrySet()) {
			String tmp = entry.getValue() + "                                      ";
			System.out.print(tmp.substring(0, 20));
			System.out.println(":[" + entry.getKey().getClass().getSimpleName() + "]" + entry.getKey().getName());
		}

		System.out.println("--- SemanticMarkups where the type='Synonym' ---");
		System.out.println(
				"Most of the SemanticMarkups are syonyms ( " + markupsByType.get("Synonym").size() + " instances)");
		System.out.println(
				"From that " + sysnonymsWithoutElements.size() + " hasn't any element. (Propably these are bugs)");
		System.out.println(
				"The rest of the synonym markups has two elements with key names [context,value] or [name,context].");
		System.out.println("Number of synonym markups grouped by context value:");
		for (SynonymContext synCtx : SynonymContext.values()) {
			List<String> values = sysnonymsByContext.get(synCtx);
			if (values == null)
				values = Collections.emptyList();
			System.out.println();
			System.out.println(" - context= '" + synCtx.contextName + "' : " + values.size());
			for (int i = 0; i < values.size(); i++) {
				if (i == 20)
					break;
				String value = values.get(i);
				System.out.println("    " + value);
			}
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

	static class ExtCodeSetGroup {
		MMCodeSet mmParent;
		SortedSet<MMCodeSet> mmchildren = new TreeSet<>(
				(a, b) -> Collator.getInstance().compare(a.getName(), b.getName()));
	}

	@Test
	public void codeSetsEmptyNotInXls() throws Exception {

		List<? extends MMCodeSet> allCodesets = repo.getObjects(MMCodeSet.class);
		SortedSet<MMCodeSet> emptyCodeSets = new TreeSet<>(
				(a, b) -> Collator.getInstance().compare(a.getName(), b.getName()));
		for (MMCodeSet cs : allCodesets) {
			if (!cs.getCodes().isEmpty())
				continue;
			if (cs.getTrace().isPresent() && !cs.getTrace().get().getCodes().isEmpty())
				continue;
			if (cs.getName().startsWith("External"))
				continue;
			emptyCodeSets.add(cs);
		}

		for (MMCodeSet cs : emptyCodeSets) {
			cs.getTrace().ifPresent(p -> {
				System.out.print("(" + p.getName() + ") -> ");
			});
			System.out.print(cs.getName() + " :");
			if (!cs.getDerivations().isEmpty()) {
				System.out.print(" -> (" + cs.getDerivations().size() + " codesets )");
			}

			System.out.println();
			System.out.println(cs.getDefinition().orElse("-no doc-"));
			System.out.println();
		}
	}

	@Test
	public void codeSetsExternal() throws Exception {

		InputStream is = ExternalCodeSetsXlsx.class
				.getResourceAsStream("/externalcodes/ExternalCodeSets_1Q2018_May2018_v1.xlsx");
		ExternalCodeSetsXlsx ecXlsx = new ExternalCodeSetsXlsx(is);

		SortedMap<String, ExtCodeSetGroup> groupbyParentName = new TreeMap<>();

		List<? extends MMCodeSet> allCodesets = repo.getObjects(MMCodeSet.class);
		SortedMap<String, MMCodeSet> emptyCodeSets = new TreeMap<>();
		for (MMCodeSet cs : allCodesets) {
			if (!cs.getCodes().isEmpty())
				continue;
			// MMCodeSet mmParent = null, mmChild = null;
			ExtCodeSetGroup group;
			if (!cs.getTrace().isPresent()) {
				group = groupbyParentName.get(cs.getName());
				if (group == null) {
					group = new ExtCodeSetGroup();
					groupbyParentName.put(cs.getName(), group);
				}
				group.mmParent = cs;
				groupbyParentName.put(cs.getName(), group);
			} else {
				group = groupbyParentName.get(cs.getTrace().get().getName());
				if (group == null) {
					group = new ExtCodeSetGroup();
					groupbyParentName.put(cs.getTrace().get().getName(), group);
				}
				group.mmchildren.add(cs);
			}
		}

		// Dump
		SortedSet<MMCodeSet> notInXls = new TreeSet<>(
				(a, b) -> Collator.getInstance().compare(a.getName(), b.getName()));
		for (Map.Entry<String, ExtCodeSetGroup> e : groupbyParentName.entrySet()) {
			ExtCodeSetGroup group = e.getValue();
			String pname = group.mmParent != null ? group.mmParent.getName() : "!!!" + e.getKey() + "!!!";
			ExternalCodeSetsXlsx.CodeSet pCs = ecXlsx.getCodeSet(pname);
			System.out.println(pname + " -> " + (pCs != null ? pCs.codeSetName : "null"));
			for (MMCodeSet cs : group.mmchildren) {
				ExternalCodeSetsXlsx.CodeSet cCs = ecXlsx.getCodeSet(cs.getName());
				System.out.println("   " + cs.getName() + " -> " + (cCs != null ? cCs.codeSetName : "null"));
			}
			System.out.println();
		}

	}

	@Test
	public void codeSets() throws Exception {

		List<? extends MMCodeSet> allCodesets = repo.getObjects(MMCodeSet.class);
		System.out.println("There are " + allCodesets.size() + " codesets in the repository.");

		for (MMCodeSet mmCS : allCodesets) {
		}

		System.out.println();
		System.out.println("--- Base and derived codesets: ---");
		System.out.println("Codesets may have a tace or a derived codeset, but not both.");

		Comparator<MMCodeSet> compareCs = (cs1, cs2) -> Collator.getInstance().compare(cs1.getName(), cs2.getName());

		Map<MMCodeSet, SortedSet<MMCodeSet>> csByTrace = new TreeMap<>(compareCs);
		SortedSet<MMCodeSet> csNoTraceOrDerivation = new TreeSet<>(compareCs);
		for (MMCodeSet mmCS : allCodesets) {
			if (mmCS.getTrace().isPresent() && mmCS.getDerivations().isEmpty()) {
				// Derived codeSet
				csByTrace.computeIfAbsent(mmCS.getTrace().get(), x -> new TreeSet<>(compareCs)).add(mmCS);
			} else if (mmCS.getTrace().isPresent() && !mmCS.getDerivations().isEmpty()) {
				// Invalid codeset
				throw new AssertionFailedError("The " + mmCS.getName() + " codeset has a trace AND derivation.");
			} else if (!mmCS.getTrace().isPresent() && !mmCS.getDerivations().isEmpty()) {
				// Base codeSet
				// will indirectly added to csByTrace map as key.
			} else if (!mmCS.getTrace().isPresent() && mmCS.getDerivations().isEmpty()) {
				// Standalone codeSet
				csNoTraceOrDerivation.add(mmCS);
			} else {
				throw new RuntimeException("Invalid case");
			}
		}
		System.out.println("  Standalone : " + csNoTraceOrDerivation.size() + " codesets hasn't trace or derivation");
		System.out.println("  Base       : " + csByTrace.keySet().size() + " codesets has at least one derivation");
		System.out.println("  Derived    : " + csByTrace.values().stream().flatMap(csList -> csList.stream()).count()
				+ " codesets has a trace");
		System.out.println("  There are no codeset what has trace AND derivation.");
		System.out.println();

		System.out.println();
		System.out.println("--- Codes within base-derived codesets ---");
		System.out.println("Derived codesets are subsets of the base codesets:\n"
				+ "every code exists in a derived codeset must exists \n" + "in the base codeset with the same name.");
		System.out.println(
				"There are no direct link between the base code and the derived code, just have the same name.");

		// Process codes
		Comparator<MMCode> compareCode = (c1, c2) -> Collator.getInstance()
				.compare(c1.getOwner().getName() + "." + c1.getName(), c1.getOwner().getName() + "." + c2.getName());

		SortedSet<MMCode> onlyInBaseCodes = new TreeSet<MMCode>(compareCode);
		SortedMap<MMCode, SortedSet<MMCode>> derivedCodes = new TreeMap<MMCode, SortedSet<MMCode>>(compareCode);

		// Loop on base codesets
		for (Map.Entry<MMCodeSet, SortedSet<MMCodeSet>> e : csByTrace.entrySet()) {
			MMCodeSet csBase = e.getKey();
			LinkedHashMap<String, MMCode> baseCodesByName = new LinkedHashMap<>();
			csBase.getCodes().stream().forEach(c -> baseCodesByName.put(c.getName(), c));
			onlyInBaseCodes.addAll(baseCodesByName.values());
			// Loop on derived codesets
			for (MMCodeSet csDerived : e.getValue()) {
				// Loop on codes in a derived codeset
				for (MMCode derivedCode : csDerived.getCodes()) {
					MMCode baseCode = baseCodesByName.get(derivedCode.getName());

					if (baseCode == null) {
						throw new AssertionFailedError(
								"Code " + derivedCode.getOwner().getName() + "." + derivedCode.getName()
										+ " exists only in derived codeset but not in the base codeset.");
					} else {
						onlyInBaseCodes.remove(baseCode);
						derivedCodes.computeIfAbsent(baseCode, x -> new TreeSet<>(compareCode)).add(derivedCode);
					}
				}
			}
		}
		System.out
				.println("  " + onlyInBaseCodes.size() + " codes exists only a base codeset without any derived code.");
		System.out.println("  " + derivedCodes.values().stream().flatMap(csList -> csList.stream()).count()
				+ " codes exists a derived codeset which links to " + derivedCodes.keySet().size()
				+ " codes in base codeset.");
		System.out.println("  There are no code in a derived codeset without the matching base code.");

		System.out.println();
		System.out.println("--- Analyze codeName and definition attributes in base-derived code pairs ----");
		{
			int countIdentical = 0, countOnlyInBase = 0, countOnlyInDerived = 0, countNon = 0;
			SortedMap<MMCode, SortedSet<MMCode>> differentCodeNames = new TreeMap<>(compareCode);
			for (Entry<MMCode, SortedSet<MMCode>> e : derivedCodes.entrySet()) {
				MMCode baseCode = e.getKey();
				Optional<String> baseCodeName = e.getKey().getCodeName();
				// Loop on derived codes
				for (MMCode derivedCode : e.getValue()) {
					Optional<String> derivedCodeName = derivedCode.getCodeName();

					if (baseCodeName.isPresent() && derivedCodeName.isPresent()) {
						// Both present
						if (Objects.equals(baseCodeName, derivedCodeName)) {
							countIdentical++;
						} else {
							differentCodeNames.computeIfAbsent(baseCode, x -> new TreeSet<>(compareCode))
									.add(derivedCode);
						}
					} else if (baseCodeName.isPresent() && !derivedCodeName.isPresent()) {
						countOnlyInBase++;
					} else if (!baseCodeName.isPresent() && derivedCodeName.isPresent()) {
						countOnlyInDerived++;
					} else if (!baseCodeName.isPresent() && !derivedCodeName.isPresent()) {
						countNon++;
					} else {
						throw new RuntimeException("Invalid case");
					}
				}
			}
			System.out.println("  codeName exists only in base: " + countOnlyInBase);
			System.out.println("  codeName exists only in derived: " + countOnlyInDerived);
			System.out.println("  codeName not exits in base nor derived : " + countNon);
			System.out
					.println("  codeName exists booth in base and derived, but they are identical: " + countIdentical);
			System.out.println("  codeName exists booth in base and derived, but they aren't identical: "
					+ differentCodeNames.values().stream().flatMap(csList -> csList.stream()).count());
			for (Entry<MMCode, SortedSet<MMCode>> e : differentCodeNames.entrySet()) {
				System.out.println("    " + getFullName(e.getKey()) + ".codeName = " + e.getKey().getCodeName().get());
				for (MMCode d : e.getValue()) {
					System.out.println("      !=  " + getFullName(d) + ".codeName = " + d.getCodeName().get());
				}
			}
			System.out.println();
		}
		{
			int countIdentical = 0, countOnlyInBase = 0, countOnlyInDerived = 0, countNon = 0;
			SortedMap<MMCode, SortedSet<MMCode>> differentDefs = new TreeMap<>(compareCode);
			for (Entry<MMCode, SortedSet<MMCode>> e : derivedCodes.entrySet()) {
				MMCode baseCode = e.getKey();
				Optional<String> baseDef = e.getKey().getDefinition();
				// Loop on derived codes
				for (MMCode derivedCode : e.getValue()) {
					Optional<String> derivedDef = derivedCode.getDefinition();

					if (baseDef.isPresent() && derivedDef.isPresent()) {
						// Both present
						if (Objects.equals(baseDef, derivedDef)) {
							countIdentical++;
						} else {
							differentDefs.computeIfAbsent(baseCode, x -> new TreeSet<>(compareCode)).add(derivedCode);
						}
					} else if (baseDef.isPresent() && !derivedDef.isPresent()) {
						countOnlyInBase++;
					} else if (!baseDef.isPresent() && derivedDef.isPresent()) {
						countOnlyInDerived++;
					} else if (!baseDef.isPresent() && !derivedDef.isPresent()) {
						countNon++;
					} else {
						throw new RuntimeException("Invalid case");
					}
				}
			}
			System.out.println("  definition exists only in base: " + countOnlyInBase);
			System.out.println("  definition exists only in derived: " + countOnlyInDerived);
			System.out.println("  definition not exits in base nor derived : " + countNon);
			System.out.println(
					"  definition exists booth in base and derived, but they are identical: " + countIdentical);
			System.out.println("  definition exists booth in base and derived, but they aren't identical: "
					+ differentDefs.values().stream().flatMap(csList -> csList.stream()).count());
			for (Entry<MMCode, SortedSet<MMCode>> e : differentDefs.entrySet()) {
				System.out.println(
						"    " + getFullName(e.getKey()) + ".definition = '" + e.getKey().getDefinition().get() + "'");
				for (MMCode d : e.getValue()) {
					System.out
							.println("      !=  " + getFullName(d) + ".definition = '" + d.getDefinition().get() + "'");
				}
			}
			System.out.println();
		}
		{
			SortedSet<MMCode> noCodeName = new TreeSet<>(compareCode);
			for (MMCodeSet cs : csNoTraceOrDerivation) {
				for (MMCode code : cs.getCodes()) {
					if (!code.getCodeName().isPresent())
						noCodeName.add(code);
				}
			}
			System.out.println("  standalone code hasn't codeName: " + noCodeName.size());
			for (MMCode c : noCodeName) {
				System.out.println("    " + getFullName(c) + ".codeName = " + c.getCodeName());
			}
			System.out.println();
		}

		System.out.println("---------------------");

		System.out.println("Size of codeset : number of codesets");
		Map<Integer, List<MMCodeSet>> csByCodesetSize = new HashMap<>();
		for (MMCodeSet mmCS : allCodesets) {
			csByCodesetSize.computeIfAbsent(mmCS.getCodes().size(), x -> new ArrayList<>()).add(mmCS);
		}
		csByCodesetSize.entrySet().stream().forEachOrdered(e -> {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		});
		System.out.println();

		/*
		 * csByCodesetSize.get(1).stream().forEachOrdered(cs -> {
		 * System.out.print(cs.getName() + ", " + cs.getPattern().orElse("-") + ", " +
		 * cs.getIdentificationScheme().orElse("-")); System.out.print(", " +
		 * (cs.getTrace().isPresent() ? cs.getTrace().get().getName() : "-"));
		 * System.out.println(", " + (cs.getDerivation().size())); })
		 */;

		System.out.println();
		System.out.println("--- Find MMCode instances without effectiveCode value --- ");
		for (MMCodeSet mmCs : allCodesets) {
			for (MMCode mmCode : mmCs.getCodes()) {
				if (mmCode.getCodeName().isPresent()) {

				} else {
					Optional<MMCodeSet> optSuperCs = mmCode.getContainer().getTrace();
					if (!optSuperCs.isPresent()) {
						System.out.println("(Root codeset)" + mmCs.getName() + "." + mmCode.getName());
						continue;
					}

					Optional<MMCode> optSuperCode = optSuperCs.get().getCodes().stream()
							.filter(sc -> sc.getName().equals(mmCode.getName())).findFirst();
					if (!optSuperCode.isPresent()) {
						System.out.println("(Derived codeset)" + mmCs.getName() + "." + mmCode.getName());
						continue;
					}
				}
			}
		}

		System.out.println();
		System.out
				.println("--- Find MMCode in primary CodeSet without codeName, or derived codeset with codeName --- ");
		for (MMCodeSet mmCs : allCodesets) {
			if (mmCs.getTrace().isPresent()) {
				// Derived codeset
				if (!mmCs.getTrace().isPresent()) {
					System.out.println("Base codeset not exists: " + mmCs.getName());
					continue;
				}
				MMCodeSet baseCs = mmCs.getTrace().get();
				for (MMCode mmCode : mmCs.getCodes()) {
					Optional<MMCode> optSuperCode = baseCs.getCodes().stream()
							.filter(sc -> sc.getName().equals(mmCode.getName())).findFirst();
					if (!optSuperCode.isPresent()) {
						System.out.println("Base code not exists:" + mmCs.getName() + "." + mmCode.getName());
						continue;
					}

					if (mmCode.getCodeName().isPresent()) {
						System.out.println("Codename exists in a derived codeset: " + mmCs.getName() + "."
								+ mmCode.getName() + " [" + mmCode.getCodeName().get() + "] overrides ["
								+ optSuperCode.get().getCodeName().get() + "]");
					}
				}
			} else {
				// Base codeset
				for (MMCode mmCode : mmCs.getCodes()) {
					if (!mmCode.getCodeName().isPresent()) {
						System.out.println("No codeName in a base codeset:" + mmCs.getName() + "." + mmCode.getName());
					}
				}
			}
		}

		System.out.println();
		System.out.println("--- Base codesets without any derived codeset --- ");
		for (MMCodeSet cs : csNoTraceOrDerivation) {
			if (!csByTrace.containsKey(cs)) {
				System.out.println("No derived codeset:" + cs.getName());
			}
		}
	}

	@Test
	public void doclets() throws Exception {
		Map<String, Set<MMDoclet>> docletsByType = new LinkedHashMap<>();
		for (MMDoclet mmD : repo.getObjects(MMDoclet.class)) {
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
				mmObj -> !(mmObj.getDerivationComponents().isEmpty() && mmObj.getDerivationComponents().isEmpty()));
		inspectTraces(MMBusinessAttribute.class, mmObj -> !mmObj.getDerivations().isEmpty());
		inspectTraces(MMBusinessAssociationEnd.class, mmObj -> !mmObj.getDerivations().isEmpty());

		inspectTraces(MMMessageAttribute.class,
				mmObj -> mmObj.getBusinessComponentTrace().isPresent() || mmObj.getBusinessElementTrace().isPresent());
		inspectTraces(MMMessageAssociationEnd.class,
				mmObj -> mmObj.getBusinessComponentTrace().isPresent() || mmObj.getBusinessElementTrace().isPresent());

		inspectTraces(MMExternalSchema.class, mmObj -> mmObj.getTrace().isPresent());
		inspectTraces(MMUserDefined.class, mmObj -> mmObj.getTrace().isPresent());
		inspectTraces(MMChoiceComponent.class, mmObj -> mmObj.getTrace().isPresent());
		inspectTraces(MMMessageComponent.class, mmObj -> mmObj.getTrace().isPresent());

		for (Class<?> mmType : noTrace.keySet()) {
			System.out.println(mmType.getSimpleName() + ": no=" + noTrace.get(mmType).size() + " with="
					+ withTrace.get(mmType).size());
		}

	}

	public <T extends MMModelEntity> void inspectTraces(Class<T> mmType, Predicate<T> hasTrace) {
		Set<MMModelEntity> noTraceSet = noTrace.computeIfAbsent(mmType, x -> new HashSet<>());
		Set<MMModelEntity> withTraceSet = withTrace.computeIfAbsent(mmType, x -> new HashSet<>());
		repo.getObjects(mmType).forEach(mmObj -> {
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
		for (MMBusinessAssociationEnd mmRef : repo.getObjects(MMBusinessAssociationEnd.class)) {
			if (processedMMRef.contains(mmRef))
				continue;
			processedMMRef.add(mmRef);
			mmRef.getOpposite().ifPresent(opposite -> processedMMRef.add((MMBusinessAssociationEnd) opposite));

			refsByAggr.computeIfAbsent(mmRef.getAggregation(), x -> new ArrayList<>()).add(mmRef);

			String arity = mmRef.getMinOccurs().isPresent() ? mmRef.getMinOccurs().get().toString() : "?";
			arity += "..";
			arity += mmRef.getMaxOccurs().isPresent() ? mmRef.getMaxOccurs().get().toString() : "?";

			if (mmRef.getOpposite().isPresent()) {
				MMBusinessAssociationEnd<?, ?> mmOp = (MMBusinessAssociationEnd<?, ?>) mmRef.getOpposite().get();
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

		for (MMBusinessComponent mmBC : repo.getObjects(MMBusinessComponent.class)) {
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
		System.out.println(tab + mmBC.getName() + "( " + mmBC.getElements().size() + ")");
		mmBC.getSubTypes().forEach(x -> {
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
		for (MMMessageDefinition mmMsgDef : repo.getObjects(MMMessageDefinition.class)) {
			Set<MMMessageConstruct> msgElemsAndBBs = new HashSet<>();
			for (MMXor mmXor : mmMsgDef.getXors()) {
				msgElemsAndBBs.addAll(mmXor.getImpactedElements());
				msgElemsAndBBs.addAll(mmXor.getImpactedMessageBuildingBlocks());
			}
			msgElemsAndBBs.addAll(mmMsgDef.getMessageBuildingBlocks());

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
		for (MMBusinessComponent mmEntity : repo.getObjects(MMBusinessComponent.class)) {
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
			for (MMBusinessElement member : entity.getElements()) {
				if (!(member instanceof MMBusinessAssociationEnd))
					continue;
				MMBusinessAssociationEnd rel = (MMBusinessAssociationEnd) member;
				MMBusinessComponent otherEntity = rel.getType();
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}
			// Extend incoming relations
			for (MMBusinessAssociationEnd rel : entity.getAssociationDomains()) {
				MMBusinessComponent otherEntity = rel.getElementContext();
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}
			// Extend by subtypes
			for (MMBusinessComponent otherEntity : entity.getSubTypes()) {
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}
		}

		/*** Count entities with single area code ***/
		return (int) entitiesByAreaCodes.entrySet().stream().filter(e -> e.getValue().size() == 1).count();
	}

	@Test
	public void listMsgDefsWithVersionHistory() throws Exception {
		int countLatestVersions = 0, countPreviousVersions = 0;
		for (MMMessageDefinition mmMsgDef : repo.getObjects(MMMessageDefinition.class)) {
			if (!mmMsgDef.getNextVersions().isEmpty())
				continue;
			System.out.println(msgIdToString(mmMsgDef.getMessageDefinitionIdentifier()) + " - " + mmMsgDef.getName()
					+ " (" + mmMsgDef.getRegistrationStatus() + ")");
			countLatestVersions++;
			for (MMMessageDefinition prevVer = mmMsgDef;;) {
				Optional<MMModelEntity> optPrevVer = prevVer.getPreviousVersion();
				if (!optPrevVer.isPresent())
					break;
				prevVer = (MMMessageDefinition) (optPrevVer.get());
				System.out.println("   " + msgIdToString(prevVer.getMessageDefinitionIdentifier()) + " - "
						+ prevVer.getName() + " (" + mmMsgDef.getRegistrationStatus() + ")");
				countPreviousVersions++;
			}
		}

		System.out.println();
		System.out.println(
				"" + countLatestVersions + " latest msgDefs, and " + countPreviousVersions + " previous versions");
	}

	static String msgIdToString(MMMessageDefinitionIdentifier mmMsgId) {
		return mmMsgId.getBusinessArea() + "." + mmMsgId.getMessageFunctionality() + "." + mmMsgId.getFlavour() + "."
				+ mmMsgId.getVersion();
	}

	@Test
	public void testMsgDefAmbiguousNames() throws Exception {
		List<MMMessageDefinition> wrongAreaCode = new ArrayList<>();
		Map<String, List<MMMessageDefinition>> defById = new HashMap<>();
		Map<String, List<MMMessageDefinition>> defByName = new HashMap<>();
		for (MMMessageDefinition def : repo.getObjects(MMMessageDefinition.class)) {
			try {
				defByName.computeIfAbsent(def.getName(), x -> new ArrayList<>()).add(def);
				defById.computeIfAbsent(msgIdToString(def.getMessageDefinitionIdentifier()), x -> new ArrayList<>())
						.add(def);

				if (!def.getBusinessArea().getCode().equals(def.getMessageDefinitionIdentifier().getBusinessArea())) {
					wrongAreaCode.add(def);
				}
			} catch (Exception e) {
				System.out.println("Error at " + def.getName() + " ("
						+ msgIdToString(def.getMessageDefinitionIdentifier()) + ") : " + e.toString());
			}
		}

		System.out.println("---- Test MsgDef names: wrong area code ----");
		for (MMMessageDefinition def : wrongAreaCode) {
			System.out.println(def.getBusinessArea().getCode() + "-" + def.getName() + ": "
					+ msgIdToString(def.getMessageDefinitionIdentifier()) + "  " + def.getRegistrationStatus());
		}

		System.out.println("---- Test MsgDef names: duplicated name ----");
		for (Map.Entry<String, List<MMMessageDefinition>> e : defByName.entrySet()) {
			if (e.getValue().size() <= 1)
				continue;
			System.out.println(e.getKey());
			for (MMMessageDefinition def : e.getValue()) {
				MMMessageDefinitionIdentifier id = def.getMessageDefinitionIdentifier();
				System.out.println(def.getBusinessArea().getCode() + ": " + msgIdToString(id) + "  "
						+ def.getRegistrationStatus());
			}
			System.out.println();
		}

		System.out.println("---- Test MsgDef names: duplicated id ----");
		for (Map.Entry<String, List<MMMessageDefinition>> e : defById.entrySet()) {
			if (e.getValue().size() <= 1)
				continue;
			System.out.println(e.getKey());
			for (MMMessageDefinition def : e.getValue()) {
				MMMessageDefinitionIdentifier id = def.getMessageDefinitionIdentifier();
				System.out.println(
						def.getBusinessArea().getCode() + ": " + def.getName() + "  " + def.getRegistrationStatus());
			}
			System.out.println();
		}

	}

	@Test
	public void testConstraintOwners() throws Exception {
		Map<String, List<MMRepositoryConcept>> ownersByType = new HashMap<>();
		List<? extends MMConstraint<?>> constr = repo.listObjects(MMConstraint.metaType()).collect(Collectors.toList());
		for (MMConstraint<?> c : constr) {
			String typeName = c.getContainer().getClass().getSimpleName();
			ownersByType.computeIfAbsent(typeName, x -> new ArrayList<>()).add(c.getContainer());
		}

		System.out.println("------ List constraint owners by type ------------");
		for (Map.Entry<String, List<MMRepositoryConcept>> e : ownersByType.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		}

		System.out.println("------ Constraints on " + MMMessageAttribute.class.getSimpleName() + " ------------");
		for (MMRepositoryConcept x : ownersByType.get(MMMessageAttribute.class.getSimpleName())) {
			MMMessageAttribute<?, ?> mmMsgAttr = (MMMessageAttribute<?, ?>) x;
			MMConstraint<?> c = mmMsgAttr.getConstraints().get(0);

			System.out.println(c.getName() + " constraint on " + mmMsgAttr.getContainer().getName() + "."
					+ mmMsgAttr.getName() + "(" + mmMsgAttr.getMemberType().getName() + ")");
			System.out.println("  ( def:" + c.getDefinition().get() + ")");

			// System.out.println( mmMsgAttr.getMemberType().getName() + " " +
			// mmMsgAttr.getContainer().getName() + "." + mmMsgAttr.getName() + "
			// constraints: ");
			// for( MMConstraint<?> c : mmMsgAttr.getConstraint() ) {
			// System.out.println(" - " + c.getName() + " : " +
			// c.getDefinition().orElse("-no def"));
			// }
		}

	}

	@Test
	public void testConstraintNames() throws Exception {
		List<? extends MMConstraint<?>> constr = repo.listObjects(MMConstraint.metaType()).collect(Collectors.toList());
		for (MMConstraint<?> c : constr) {
			String javaNme = RoasterHelper.convertToJavaName(c.getName());
			if (c.getName().equals(javaNme))
				continue;

			System.out.println("Wrong constraint name: \"" + c.getName() + "\" on " + getFullName(c.getOwner()));

		}
	}

	private String getFullName(MMModelEntity mmBean) {
		String name = "[" + mmBean.getMetamodel().getName() + "]";
		if (mmBean instanceof MMRepositoryConcept) {
			name += ((MMRepositoryConcept) mmBean).getName();
		}
		if (mmBean.getContainer() != null && !(mmBean.getContainer() instanceof MMRepository)) {
			name = getFullName(mmBean.getContainer()) + "/" + name;
		}
		return name;
	}

	@Test
	public void encodingAndSyntax() throws Exception {
		List<? extends MMEncoding> mmEncodings = repo.listObjects(MMEncoding.metaType()).collect(Collectors.toList());
		System.out.println("--- List of encodings ---");
		for (MMEncoding mmEncoding : repo.listObjects(MMEncoding.metaType()).collect(Collectors.toList())) {
			System.out.println(" > " + mmEncoding.toString());
		}
		System.out.println("--- List of syntaxes---");
		for (MMSyntax mmSyntax : repo.listObjects(MMSyntax.metaType()).collect(Collectors.toList())) {
			System.out.println(" > " + mmSyntax.toString());
		}

		System.out.println("--- List of SyntaxMessageSchemes ---");
		for (MMSyntaxMessageScheme mmSyntaxMsgScheme : repo.listObjects(MMSyntaxMessageScheme.metaType())
				.collect(Collectors.toList())) {
			System.out.println(" > " + mmSyntaxMsgScheme.getName());
		}
		System.out.println("--- List of MessageSet ---");
		for (MMMessageSet mmMsgSet : repo.listObjects(MMMessageSet.metaType()).collect(Collectors.toList())) {
			System.out.println(" > " + mmMsgSet.getName());
		}
		System.out.println("--- List of MMIndustryMessageSet ---");
		for (MMIndustryMessageSet mmMsgSet : repo.listObjects(MMIndustryMessageSet.metaType())
				.collect(Collectors.toList())) {
			System.out.println(" > " + mmMsgSet.getName());
		}
		System.out.println("--- List of MMISO15022MessageSet ---");
		for (MMISO15022MessageSet mmMsgSet : repo.listObjects(MMISO15022MessageSet.metaType())
				.collect(Collectors.toList())) {
			System.out.println(" > " + mmMsgSet.getName());
		}
	}

	@Test
	public void testConstraints() throws Exception {
		int countExpr = 0;
		int conutNonMsgDef = 0;

		Map<String, Set<MMConstraint<?>>> sameDescMap = new HashMap<>();
		Map<String, Set<MMConstraint<?>>> sameNameMap = new HashMap<>();
		Map<String, List<MMRepositoryConcept>> constraintOwners = new HashMap<>();

		List<? extends MMConstraint<?>> constr = repo.listObjects(MMConstraint.metaType()).collect(Collectors.toList());
		System.out.println("--- Constraints : -----");
		for (MMConstraint<?> c : constr) {
			// if(! c.getName().equals("ControlSumAndGroupReversalRule") )
			// continue;

			if (c.getContainer() instanceof MMMessageDefinition || c.getContainer() instanceof MMMessageComponent
					|| c.getContainer() instanceof MMChoiceComponent) {
				// continue;
			} else {
				conutNonMsgDef++;
			}

			String parentName = "[" + c.getContainer().getClass().getSimpleName() + "]" + c.getContainer().getName();
			// System.out.println(parent + " @" + c.getName() + ": " +
			// c.getDefinition().orElse("-"));
			// System.out.println(c.getExpression());
			// System.out.println("----");
			constraintOwners.computeIfAbsent(c.getName(), x -> new ArrayList<>()).add(c.getContainer());

			if (c.getExpression().isPresent()) {
				countExpr++;
			}

			Set<MMConstraint<?>> set1 = sameDescMap.computeIfAbsent(c.getDefinition().orElse("-"),
					x -> new LinkedHashSet<MMConstraint<?>>());
			set1.add(c);
			Set<MMConstraint<?>> set = sameNameMap.computeIfAbsent(c.getName(),
					x -> new LinkedHashSet<MMConstraint<?>>());
			set.add(c);
		}
		;
		System.out.println("------------------");
		System.out.println();
		List<String> defs = new ArrayList<>(sameDescMap.keySet());
		Collections.sort(defs);
		defs.stream().forEachOrdered(d -> {
			// System.out.print(sameDescMap.get(d).iterator().next().getName() + " : ");
			// System.out.println(d);
		});
		System.out.println("------------------");
		System.out.println("Number of all constraints: " + constr.size());
		System.out.println("Number constraints not connected to MsgDefs: " + conutNonMsgDef);
		System.out.println("Number constraints with different name: " + sameNameMap.keySet().size());
		System.out.println("Number constraints with different desc: " + sameDescMap.keySet().size());
		System.out.println(
				"Number different contrains containing \"During ISO 15022 – 20022 coexistence\" : " + sameDescMap
						.keySet().stream().filter(d -> d.contains("During ISO 15022 – 20022 coexistence")).count());

		if (Boolean.parseBoolean("false")) {
			System.out.println("---- Same name but different description -----------");
			for (Map.Entry<String, Set<MMConstraint<?>>> e : sameNameMap.entrySet()) {
				if (e.getValue().stream().map(c -> c.getDefinition()).distinct().count() <= 1)
					continue;
				System.out.println("***" + e.getKey() + "***");
				e.getValue().stream().map(c -> c.getDefinition()).forEach(d -> {
					System.out.println(" - " + d);
				});
				System.out.println();
			}
		}

		if (Boolean.parseBoolean("false")) {
			System.out.println("------ List constraints by number of owners ------------");
			List<Map.Entry<String, List<MMRepositoryConcept>>> byNumOfOwners = new ArrayList<>();
			byNumOfOwners.addAll(constraintOwners.entrySet());
			Collections.sort(byNumOfOwners, (a, b) -> {
				return a.getValue().size() - b.getValue().size();
			});

			for (Map.Entry<String, List<MMRepositoryConcept>> e : byNumOfOwners) {
				System.out.println(e.getKey() + " " + e.getValue().size());
				Set<MMConstraint<?>> constrSet = sameNameMap.get(e.getKey());
				if (constrSet == null) {
					System.out.println();
				}
				String desc = sameNameMap.get(e.getKey()).iterator().next().getDefinition().orElse("-no desc");
				System.out.println("  " + desc);
				for (MMRepositoryConcept o : e.getValue()) {
					System.out.println("   [" + o.getClass().getSimpleName() + "]" + o.getName());
				}
				System.out.println();
			}
		}
	}

	@Test
	public void inspectAmmountTypes() throws Exception {
		List<? extends MMAmount> mmAmounts = repo.listObjects(MMAmount.metaType()).collect(Collectors.toList());
		for (MMAmount mmAmount : mmAmounts) {
			System.out.println("**> " + mmAmount.getName() + ":");
			if (mmAmount.getCurrencyIdentifierSet().isPresent()) {
				MMDataType currIdSet = mmAmount.getCurrencyIdentifierSet().get();
				System.out.println("CurrencyIdentifierSet: " + "[" + currIdSet.getClass().getSimpleName() + "]"
						+ currIdSet.getName());
				System.out.println("CurrencyIdSet def: " + currIdSet.getDefinition().orElse("-nod doc-"));
			} else {
				System.out.println("CurrencyIdentifierSet: no curr id set ");
			}
			System.out.println("Doc: " + mmAmount.getDefinition().orElse("-no doc-"));
			System.out.println();
		}
	}

	@Test
	public void listEmptyCodesets() throws Exception {
		List<? extends MMCodeSet> mmCodesets = repo.listObjects(MMCodeSet.metaType())
				.filter(cs -> cs.getCodes().isEmpty())
				.sorted((c1, c2) -> Collator.getInstance().compare(c1.getName(), c2.getName()))
				.collect(Collectors.toList());
		int i = 1;
		for (MMCodeSet mmCodeSet : mmCodesets) {
			System.out.println(i++ + ": " + mmCodeSet.getName());
		}
	}

}
