package com.tools20022.repogenerator;

import java.io.IOException;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Ignore;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;

public class InspectLoadedRepository {

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
	//@Ignore
	public void groupEntitiesByBusinessArea() throws Exception {
		//MMMessageComponentType_.trace;
		//MMMessageElement_.businessComponentTrace;

		/*** Collect repo types by area codes ***/  
		Map<String,Set<MMRepositoryType>> repoTypesByAreaName = new HashMap<>();
		for( MMMessageDefinition mmMsgDef : repo.listObjects(MMMessageDefinition.class).collect(Collectors.toList())) {
			Set<MMMessageConstruct> msgElemsAndBBs = new HashSet<>();
			for( MMXor mmXor : mmMsgDef.getXors() ) {
				msgElemsAndBBs.addAll( mmXor.getImpactedElements() );
				msgElemsAndBBs.addAll( mmXor.getImpactedMessageBuildingBlocks() );
			}
			msgElemsAndBBs.addAll(mmMsgDef.getMessageBuildingBlock());

			String areaCode = mmMsgDef.getBusinessArea().getCode();
			Set<MMRepositoryType> mmRepoTypes = repoTypesByAreaName.computeIfAbsent(areaCode, x->new LinkedHashSet<MMRepositoryType>());
			msgElemsAndBBs.forEach(msgElemOrBB->{
				mmRepoTypes.add( msgElemOrBB.getMemberType() );
			});
		}
			
		/*** Invert the map ***/ 
		Map<MMRepositoryType,Set<String>> areaCodesByRepoType = new HashMap<>();
		for( Map.Entry<String,Set<MMRepositoryType>> e : repoTypesByAreaName.entrySet() ) {
			for( MMRepositoryType repoType : e.getValue() ) {
				areaCodesByRepoType.computeIfAbsent(repoType, x->new LinkedHashSet<String>()).add(e.getKey());
			}
		}
		
		/*** Print elems with 1 area ***/
		Collator collator = Collator.getInstance();
		Comparator<Map.Entry<MMRepositoryType,Set<String>>> comparator = (e1,e2) -> {
			return collator.compare(e1.getKey().getClass().getSimpleName(), e2.getKey().getClass().getSimpleName());
		};

		System.out.println("--------Types belong to 1 area----------------------");
		areaCodesByRepoType.entrySet().stream().filter(e->e.getValue().size() == 1 ).sorted(comparator).forEach( e->{
			System.out.print( "[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print( e.getKey().getName() + " : ");
			System.out.println( String.join(", ", e.getValue()));
		});
		System.out.println();
		
		System.out.println("--------Types belong to more thane 1 area----------------------");
		areaCodesByRepoType.entrySet().stream().filter(e->e.getValue().size() > 1 ).sorted(comparator).forEach( e->{
			System.out.print( "[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print( e.getKey().getName() + " : ");
			System.out.println( String.join(", ", e.getValue()));
		});
		System.out.println();
		System.out.println("--------Types belong to 0 area----------------------");
		areaCodesByRepoType.entrySet().stream().filter(e->e.getValue().isEmpty() ).sorted(comparator).forEach( e->{
			System.out.print( "[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print( e.getKey().getName() + " : ");
			System.out.println( String.join(", ", e.getValue()));
		});
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*************************************************");
		
		Map<MMBusinessComponent, Set<String>> entitiesByAreaCodes = new HashMap<>();
		for( MMBusinessComponent mmEntity : repo.listObjects(MMBusinessComponent.class).collect(Collectors.toList())) {
			entitiesByAreaCodes.put(mmEntity, new HashSet<>());
		}
		for(Map.Entry<MMRepositoryType,Set<String>> x: areaCodesByRepoType.entrySet()) {
			if( ! (x.getKey() instanceof MMMessageComponent ))
				continue;
			if( x.getValue().size() != 1 )
				continue;
			String areaCode = x.getValue().iterator().next(); 
			Optional<MMBusinessComponent> optTracedEntity = ((MMMessageComponent)x.getKey()).getTrace();
			if(! optTracedEntity.isPresent())
				continue;
			entitiesByAreaCodes.get(optTracedEntity.get()).add(areaCode);
		};

		System.out.println( "Round 1. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes) );
		System.out.println( "Round 2. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes) );
		System.out.println( "Round 3. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes) );
		System.out.println( "Round 4. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes) );
		System.out.println( "Round 5. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes) );
		System.out.println( "Round 6. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes) );
		System.out.println( "Round 7. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes) );
		System.out.println( "Round 8. EntitiesWithSingleArea = " + extendAreaMapping(entitiesByAreaCodes) );
		
		System.out.println("--------Entities belong to 1 area----------------------");
		entitiesByAreaCodes.entrySet().stream().filter(e->e.getValue().size() == 1 ).forEach( e->{
			System.out.print( "[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print( e.getKey().getName() + " : ");
			System.out.println( String.join(", ", e.getValue()));
		});
		System.out.println();
		
		System.out.println("--------Entities belong more than 1 area----------------------");
		entitiesByAreaCodes.entrySet().stream().filter(e->e.getValue().size() > 1 ).forEach( e->{
			System.out.print( "[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print( e.getKey().getName() + " : ");
			System.out.println( String.join(", ", e.getValue()));
		});
		System.out.println();

		System.out.println("--------Entities belong to 0 area----------------------");
		entitiesByAreaCodes.entrySet().stream().filter(e->e.getValue().isEmpty() ).forEach( e->{
			System.out.print( "[" + e.getKey().getClass().getSimpleName() + "]");
			System.out.print( e.getKey().getName() + " : ");
			System.out.println( String.join(", ", e.getValue()));
		});
		System.out.println();
		
		System.out.println("*************************************************");
		System.out.println("--------Areas by number of entities -------------------");
		Map<String,AtomicInteger> entityCountsByArea = new HashMap<>();
		AtomicInteger entityCountsWithNoArea = new AtomicInteger();
		AtomicInteger entityCountsWithMultipleArea = new AtomicInteger();
		//Map<String,AtomicInteger> roleCountsByArea = new HashMap<>();
		entitiesByAreaCodes.entrySet().stream().forEach( e->{
			if( e.getValue().size() == 1 )
				entityCountsByArea.computeIfAbsent(e.getValue().iterator().next(), x->new AtomicInteger()).incrementAndGet();
			else if( e.getValue().isEmpty() ) 
				entityCountsWithNoArea.incrementAndGet();
			else
				entityCountsWithMultipleArea.incrementAndGet();
		});
		entityCountsByArea.entrySet().stream().forEach(e->{
			System.out.println( e.getKey() + " : " + e.getValue().get() );
		});
		System.out.println( "No area : " + entityCountsWithNoArea.get() );
		System.out.println( "Multiple area : " + entityCountsWithMultipleArea.get() );
		System.out.println();

	}
	
	private int extendAreaMapping(Map<MMBusinessComponent, Set<String>> entitiesByAreaCodes) {
		/*** Clone entities with single area code to a new map ***/
		Map<MMBusinessComponent, String> entitiesWithSingleAreaCode = new HashMap<>();
		for( Map.Entry<MMBusinessComponent, Set<String>> e: entitiesByAreaCodes.entrySet()) {
			if( e.getValue().size() != 1 )
				continue;
			entitiesWithSingleAreaCode.put(e.getKey(), e.getValue().iterator().next());
		}
		/*** Loop trough references */ 
		for( Map.Entry<MMBusinessComponent, String> e: entitiesWithSingleAreaCode.entrySet()) {
			MMBusinessComponent entity = e.getKey();
			// Extend outgoing relations
			for( MMBusinessElement member : entity.getElement() ) {
				if( ! (member instanceof MMBusinessAssociationEnd ) )
					continue;
				MMBusinessAssociationEnd rel = (MMBusinessAssociationEnd)member;
				MMBusinessComponent otherEntity = rel.getType();
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}			
			// Extend incoming relations
			for( MMBusinessAssociationEnd rel : entity.getAssociationDomain() ) {				
				MMBusinessComponent otherEntity = rel.getElementContext();
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}			
			// Extend by subtypes
			for( MMBusinessComponent otherEntity : entity.getSubType() ) {				
				entitiesByAreaCodes.get(otherEntity).add(e.getValue());
			}			
		}
		
		/*** Count entities with single area code ***/
		return (int)entitiesByAreaCodes.entrySet().stream().filter(e->e.getValue().size() == 1 ).count();
	}
}
