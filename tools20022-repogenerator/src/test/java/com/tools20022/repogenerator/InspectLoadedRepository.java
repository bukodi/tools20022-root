package com.tools20022.repogenerator;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.Collator;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.metamodel.*;

import gen.lib.dotgen.conc__c;

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
//			EObject rootEObj = ECoreIOHelper.loadXMIResource(
//					ECoreIOHelper.class.getResourceAsStream("/model/20170713_ISO20022_2013_eRepository.iso20022"));
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
	public void inspectSpecificObject() throws Exception {
		GeneratedMetamodelBean obj = repo.findObjectByTypeAndName(MMCodeSet.class, "AddressType2Code");
		
		System.out.println( obj);
		
	}

	@Test
	public void dataTypes() throws Exception {	
		Map<MetamodelType<?>,List<MMDataType>> dataTypesBy = new HashMap<>();
		MMDataType.metaType().listSubTypes(false, true).forEach(mmDT -> {
			dataTypesBy.put(mmDT, new ArrayList<>());
		});;
		
		for (MMDataType mmDataType : repo.listObjects(MMDataType.class).collect(Collectors.toList()) ) {
			MetamodelType<? extends GeneratedMetamodelBean> mmType = mmDataType.getMetamodel();
			dataTypesBy.computeIfAbsent(mmType, x->new ArrayList<>()).add(mmDataType);
		}
		
		int max = 10;
		for( Map.Entry<MetamodelType<?>,List<MMDataType>> e : dataTypesBy.entrySet()) {
			System.out.println();
			System.out.println( "*** " + e.getKey().getName() + ": " + e.getValue().size() + " ***");
			
			for( MetamodelType<?> st : e.getKey().getSuperTypes(false, true) ) {
				if( !st.getSuperTypes(false, true).contains(MMDataType.metaType())) 
					continue;
				System.out.println("  supertype: " + st.getName() );
			}
			
			for( MetamodelAttribute<?, ?> coreAttr : e.getKey().getAllAttributes() ) {
				if( ! coreAttr.getDeclaringType().getSuperTypes(false, true).contains(MMDataType.metaType()) )
					continue;
				System.out.println("  attr: " + coreAttr.getDeclaringType().getName() + "." + coreAttr.getName() );
			}
			
			
			for( int i = 0; i < e.getValue().size(); i++ ) {
				MMDataType dt = e.getValue().get(i);				
				if( i < max ) {
					System.out.println( "  - " + dt.getName());
				} else if( i == max ) {
					System.out.println("  ( " + (e.getValue().size() - max) + " subsequent items...)" );
				}
			}
			
		}

	}

	@Test
	//@Ignore
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
	
	enum SynonymContext {
			  ISO_15022( "ISO 15022"), 
			  _15022( "15022"), 
			  ISO_15022_( "ISO 15022 "), 
			  ISO15002( "ISO15002"), 
			  ISO15022( "ISO15022"), 

			  FIX( "FIX"), 
			  FIX_50( "FIX 5.0"), 
			  FIXProtocol( "FIX Protocol"), 
			  FIX_( "FIX "), 
			  FIX50( "FIX5.0"), 
			  Fix50( "Fix5.0"), 

			  DTCC( "DTCC"), 
			  DTCC_( "DTCC "), 

			  MIFIDRequirement( "MIFID Requirement"), 
			  MIFIDrequirement( "MIFID requirement"), 
			  MiFIR( "MiFIR"), 
			  EFAMA( "EFAMA"), 
			  ebXML( "ebXML"), 
			  ISO( "ISO"), 
			  RUCMPG( "RU-CMPG"), 
			  SubSequenceD3Amounts( "SubSequenceD3 Amounts"), 
			  StatementBusinessModeling( "Statement Business Modeling"), 
			  ASN1( "ASN.1"),
			  OTHER("OTHER");
		
		public final String contextName; 
		SynonymContext( String contextName ) {
			this.contextName = contextName;
		}
		
		static SynonymContext fromContextName( String contextName ) {
			for( SynonymContext v: values() ) {
				if( contextName.equals(v.contextName))
					return v;
			}
			return OTHER;
		}
	}

	@Test
	public void semanticMarkups() throws Exception {
		Map<String, Set<MMSemanticMarkup>> markupsByType = new LinkedHashMap<>();
		for (MMRepositoryConcept mmRC : repo.listObjects(MMRepositoryConcept.class).collect(Collectors.toList())) {
			if (mmRC.getSemanticMarkup().isEmpty())
				continue;
			List<MMSemanticMarkup> markups = mmRC.getSemanticMarkup();
			if( markups.size() > 1 ) {
				System.out.print( "More than one markup on elem " + mmRC + ": ");
				List<String> list = new ArrayList<>();
				for( MMSemanticMarkup m: markups ) {
					String type = m.getType().orElse("-null-");
					if( "Synonym".equals( type) ) {
						String context = "???";
						for(MMSemanticMarkupElement e :  m.getElements() ) {
							if( "context".equals( e.getName().orElse("-null-")) ) {
								context = e.getValue().orElse("-null-");
							}
						}
						list.add("Syn(" + context + ")");
					} else {
						list.add(type);
					}
				}
				System.out.println( list.stream().collect(Collectors.joining(", ")));
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
			sysnonymsByContext.computeIfAbsent( context, x -> new ArrayList<>())
			.add(value);
		}
		System.out.println("--- ISO 15022 syonyms ---");
		for( Map.Entry<MMRepositoryConcept, String > entry : iso15022Sysnonyms.entrySet() ) {
			String tmp = entry.getValue() + "                                      "; 
			System.out.print( tmp.substring(0, 20) );
			System.out.println( ":[" + entry.getKey().getClass().getSimpleName() + "]" + entry.getKey().getName());
		}
		

		System.out.println("--- SemanticMarkups where the type='Synonym' ---");
		System.out.println(
				"Most of the SemanticMarkups are syonyms ( " + markupsByType.get("Synonym").size() + " instances)");
		System.out.println(
				"From that " + sysnonymsWithoutElements.size() + " hasn't any element. (Propably these are bugs)");
		System.out.println(
				"The rest of the synonym markups has two elements with key names [context,value] or [name,context].");
		System.out.println("Number of synonym markups grouped by context value:");
		for ( SynonymContext synCtx : SynonymContext.values() ) {
			List<String> values = sysnonymsByContext.get(synCtx);
			if( values == null )
				values = Collections.emptyList();
			System.out.println();
			System.out.println(" - context= '" + synCtx.contextName + "' : " + values.size());
			for( int i = 0; i < values.size(); i++ ) {
				if( i == 20 )
					break;
				String value = values.get(i);
				System.out.println("    " + value );
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

	@Test
	public void codeSets() throws Exception {


		List<? extends MMCodeSet> allCodesets = repo.listObjects(MMCodeSet.class).collect(Collectors.toList());
		Map<Integer, List<MMCodeSet>> csByCodesetSize = new HashMap<>();
		for (MMCodeSet mmCS : allCodesets) {
			csByCodesetSize.computeIfAbsent(mmCS.getCode().size(), x -> new ArrayList<>()).add(mmCS);			
		}

		List<MMCodeSet> csNoParent = new ArrayList<>();
		Map<MMCodeSet, List<MMCodeSet>> csByParent = new HashMap<>();
		for (MMCodeSet mmCS : allCodesets) {
			if( mmCS.getTrace().isPresent()  ) {
				csByParent.computeIfAbsent(mmCS.getTrace().get(), x -> new ArrayList<>()).add(mmCS);							
			} else {
				csNoParent.add(mmCS);
			}
		}

		System.out.println("Size of codeset : number of codesets");
		csByCodesetSize.entrySet().stream().forEachOrdered(e -> {
			System.out.println(e.getKey() + " : " + e.getValue().size());
		});
		System.out.println( "Summ: " + allCodesets.size() + " codesets");
		System.out.println();

		csByCodesetSize.get(1).stream().forEachOrdered(cs -> {
			System.out.print(cs.getName() + ", " + cs.getPattern().orElse("-") + ", "
					+ cs.getIdentificationScheme().orElse("-"));
			System.out.print(", " + (cs.getTrace().isPresent() ? cs.getTrace().get().getName() : "-"));
			System.out.println(", " + (cs.getDerivation().size()));
		});
		
		System.out.println();
		System.out.println("--- Codeset hierarchy ---");
		PrintWriter pw = new PrintWriter(System.out); 
		for( MMCodeSet mmCs : csNoParent ) {
			dumpCodeSetSubTree(mmCs, csByParent, pw, "");			
		}
		pw.flush();

		System.out.println();
		System.out.println("--- Find MMCode instances without effectiveCode value --- ");
		for( MMCodeSet mmCs : allCodesets) {			
			for( MMCode mmCode : mmCs.getCode() ) {
				if( mmCode.getCodeName().isPresent() ) {
					
				} else {
					Optional<MMCodeSet> optSuperCs = mmCode.getContainer().getTrace();
					if( ! optSuperCs.isPresent() ) {
						System.out.println( "(Root codeset)" + mmCs.getName() + "." + mmCode.getName() );
						continue;
					}
					
					Optional<MMCode> optSuperCode = optSuperCs.get().getCode().stream().filter(sc -> sc.getName().equals(mmCode.getName())).findFirst();
					if( ! optSuperCode.isPresent()) {
						System.out.println( "(Derived codeset)" + mmCs.getName() + "." + mmCode.getName() );
						continue;						
					}
				}
			}
		}

		System.out.println();
		System.out.println("--- Find MMCode in primary CodeSet without codeName, or derived codeset with codeName --- ");
		for( MMCodeSet mmCs : allCodesets) {
			if( mmCs.getTrace().isPresent() ) {
				// Derived codeset
				if( ! mmCs.getTrace().isPresent() ) {
					System.out.println( "Base codeset not exists: " + mmCs.getName()  );
					continue;
				}
				MMCodeSet baseCs = mmCs.getTrace().get();
				for( MMCode mmCode : mmCs.getCode() ) {
					Optional<MMCode> optSuperCode = baseCs.getCode().stream().filter(sc -> sc.getName().equals(mmCode.getName())).findFirst();
					if( ! optSuperCode.isPresent()) {
						System.out.println( "Base code not exists:" + mmCs.getName() + "." + mmCode.getName() );
						continue;						
					}

					if( mmCode.getCodeName().isPresent() ) {						
						System.out.println( "Codename exists in a derived codeset: " + mmCs.getName() + "." + mmCode.getName() + " [" + mmCode.getCodeName().get() + "] overrides [" + optSuperCode.get().getCodeName().get() + "]" );
					}
				}			
			} else {
				// Base codeset 
				for( MMCode mmCode : mmCs.getCode() ) {
					if( ! mmCode.getCodeName().isPresent() ) {
						System.out.println( "No codeName in a base codeset:" + mmCs.getName() + "." + mmCode.getName() );
					}
				}			
			}
		}

		System.out.println();
		System.out.println("--- Base codesets without any derived codeset --- ");
		for( MMCodeSet cs : csNoParent ) {
			if( ! csByParent.containsKey(cs) ) {
				System.out.println( "No derived codeset:" + cs.getName()  );				
			}
		}
	}
	
	private void dumpCodeSetSubTree( MMCodeSet mmCs, Map<MMCodeSet, List<MMCodeSet>> csByParent, PrintWriter pw, String tab ) {
		pw.println( tab + "" + mmCs.getName() );
		List<MMCodeSet> derivedCsList = csByParent.get(mmCs);
		if( derivedCsList == null )
			return;
		for( MMCodeSet derivedCs: derivedCsList) {
			dumpCodeSetSubTree(derivedCs, csByParent, pw, tab + "  ");
		}
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
	
	@Test
	public void listMsgDefsWithVersionHistory() throws Exception {
		int countLatestVersions = 0, countPreviousVersions = 0;
		for (MMMessageDefinition mmMsgDef : repo.listObjects(MMMessageDefinition.class)
				.collect(Collectors.toList())) {
			if( ! mmMsgDef.getNextVersions().isEmpty() )
				continue;
			System.out.println( msgIdToString(mmMsgDef.getMessageDefinitionIdentifier()) + " - " +  mmMsgDef.getName() );
			countLatestVersions ++;
			for( MMMessageDefinition prevVer = mmMsgDef;; ) {
				Optional<MMModelEntity> optPrevVer = prevVer.getPreviousVersion();
				if( ! optPrevVer.isPresent())
					break;
				prevVer = (MMMessageDefinition)(optPrevVer.get());
				System.out.println( "   " + msgIdToString(prevVer.getMessageDefinitionIdentifier()) + " - " +  prevVer.getName() );
				countPreviousVersions ++;
			}
		}		
		
		System.out.println();
		System.out.println("" + countLatestVersions + " latest msgDefs, and " + countPreviousVersions + " previous versions");
	}
	
	static String msgIdToString( MMMessageDefinitionIdentifier mmMsgId ) {
		return mmMsgId.getBusinessArea() + "." + mmMsgId.getMessageFunctionality()  + "." + mmMsgId.getFlavour() + "." + mmMsgId.getVersion();
	}

	@Test
	public void testConstraints() throws Exception {
		int countExpr = 0;
		int conutNonMsgDef = 0;

		Map<String, Set<MMConstraint>> sameDescMap = new HashMap<>();
		Map<String, Set<MMConstraint>> sameNameMap = new HashMap<>();
		Map<String, List<MMRepositoryConcept>> constraintOwners = new HashMap<>();

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
			
			String parentName = "["+ c.getContainer().getClass().getSimpleName() + "]" + c.getContainer().getName();
//			System.out.println(parent + " @" + c.getName() + ": " + c.getDefinition().orElse("-"));
//			System.out.println(c.getExpression());
//			System.out.println("----");
			constraintOwners.computeIfAbsent(c.getName(), x->new ArrayList<>()).add(c.getContainer());

			if (c.getExpression().isPresent()) {
				countExpr++;
			}

			Set<MMConstraint> set1 = sameDescMap.computeIfAbsent(c.getDefinition().orElse("-"),
					x -> new LinkedHashSet<MMConstraint>());
			set1.add(c);
			Set<MMConstraint> set = sameNameMap.computeIfAbsent(c.getName(),
					x -> new LinkedHashSet<MMConstraint>());
			set.add(c);
		}
		;
		System.out.println("------------------");
		System.out.println();
		List<String> defs = new ArrayList<>(sameDescMap.keySet());
		Collections.sort(defs);
		defs.stream().forEachOrdered(d -> {
			//System.out.print(sameDescMap.get(d).iterator().next().getName() + " : ");
			//System.out.println(d);
		});
		System.out.println("------------------");
		System.out.println( "Number of all constraints: " + constr.size() );
		System.out.println( "Number constraints not connected to MsgDefs: " + conutNonMsgDef );
		System.out.println( "Number constraints with different name: " + sameNameMap.keySet().size() );
		System.out.println( "Number constraints with different desc: " + sameDescMap.keySet().size() );
		System.out.println( "Number different contrains containing \"During ISO 15022 – 20022 coexistence\" : " + sameDescMap.keySet().stream().filter(d->d.contains("During ISO 15022 – 20022 coexistence")).count() );
		
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

		System.out.println("------ List constraints by number of owners ------------");
		List<Map.Entry<String, List<MMRepositoryConcept>>> byNumOfOwners = new ArrayList<>();
		byNumOfOwners.addAll(constraintOwners.entrySet());
		Collections.sort(byNumOfOwners, (a,b)->{
			return a.getValue().size() - b.getValue().size();
		});
		
		for( Map.Entry<String, List<MMRepositoryConcept>> e : byNumOfOwners ) {
			System.out.println( e.getKey() + " " + e.getValue().size() );
			Set<MMConstraint> constrSet = sameNameMap.get(e.getKey());
			if( constrSet == null ) {
				System.out.println();
			}
			String desc = sameNameMap.get(e.getKey()).iterator().next().getDefinition().orElse("-no desc");
			System.out.println("  " + desc );
			for( MMRepositoryConcept o : e.getValue() ) {
				System.out.println("   [" + o.getClass().getSimpleName() + "]" + o.getName());
			}
			System.out.println();
		}

	}

}
