package com.tools20022.repogenerator;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.junit.Test;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessConcept;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.metamodel.MMMessageConcept;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageElement;
import com.tools20022.metamodel.MMMessageElementContainer;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;

public class InspectGeneratedMetamodel {

	@Test
	public void testContaining() {

		// StandardMetamodel2013.metamodel().
	}

	@Test
	public void inspectReferences() throws Exception {
		
		Set<MetamodelAttribute<?, ?>> processedAttrs = new HashSet<>();
		Set<MetamodelType<?>> processedTypes = new HashSet<>();
		Deque<MetamodelType<?>> typesToProcess = new ArrayDeque<>();
		
		typesToProcess.add(MMMessageDefinition.metaType());
		typesToProcess.addAll(StandardMetamodel2013.metamodel().getAllTypes());
		
		for (;!typesToProcess.isEmpty();) {			
			MetamodelType<?> mmType = typesToProcess.removeFirst();
			for( MetamodelAttribute<?, ?> mmRef: mmType.getDeclaredAttributes() ) {
				if( mmRef.getReferencedType() == null ) 
					continue;
				if( processedAttrs.contains(mmRef))
					continue;
				MetamodelType<?> refType = mmRef.getReferencedType();
				MetamodelAttribute<?, ?> oppositeRef = mmRef.getOpposite();
				
				String line = "";
				line += " " + mmType.getName() + "." + mmRef.getName() ;
				line +=  oppositeRef != null ? " <--> " : " ---> ";   
				if( oppositeRef != null ) {
					line +=   oppositeRef.getDeclaringType().getName() + "." + oppositeRef.getName() ;					
					processedAttrs.add(oppositeRef);
				} else {
					line += refType.getName() ;
				}
				if( mmRef.isDerived() ) {
					line = "( " + line + " )";
				}
				System.out.println( line );
				
				processedAttrs.add(mmRef);
				if( ! processedTypes.contains(refType) )
					typesToProcess.add(refType);
			}
			processedTypes.add(mmType);			
		}

		
	}
	
	@Test
	public void testRepoConceptTypes() throws Exception {
		List<? extends MetamodelType<? extends MMModelEntity>> allTypes = StandardMetamodel2013.metamodel()
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
		Set<MetamodelAttribute<?, ?>> refs = StandardMetamodel2013.metamodel().getAllTypes().stream()
				.flatMap(t -> t.listAllAttributes()).filter(r -> r.isContainment()).collect(Collectors.toSet());
		Set<MetamodelType<?>> referencedTypes = refs.stream()
				.flatMap(r -> r.getReferencedType().listSubTypes(true, true)).filter(t -> !t.isAbstract()).distinct()
				.collect(Collectors.toSet());
		Set<? extends MetamodelType<?>> nonAbstractTypes = StandardMetamodel2013.metamodel().getAllTypes().stream()
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
	public void listContainerTypes() throws Exception {
		LinkedHashMap<MetamodelType<? extends MMModelEntity>, Set<MetamodelAttribute<?, ?>>> containerRefsByTypes = new LinkedHashMap<>();
		for (MetamodelType<? extends MMModelEntity> mmType : StandardMetamodel2013.metamodel().getAllTypes()) {
			if( mmType.isAbstract() )
				continue;
			Set<MetamodelAttribute<?, ?>> containerRefs = new LinkedHashSet<>();
			mmType.getIncomingAttributes().stream().filter(mmAttr -> mmAttr.isContainment()).forEachOrdered(mmAttr -> {
				containerRefs.add(mmAttr);
			});
			containerRefsByTypes.put(mmType, containerRefs);
		}

		Consumer<Map.Entry<MetamodelType<? extends MMModelEntity>, Set<MetamodelAttribute<?, ?>>>> printEntry = e -> {
			System.out.println(e.getKey().getName());
			e.getValue().stream().forEachOrdered(mmAttr -> {
				System.out.print("    - " + mmAttr.getDeclaringType().getName() + "." + mmAttr.getName());
				if (mmAttr.getOpposite() != null)
					System.out.print(" ( opposite: " + mmAttr.getOpposite().getDeclaringType().getName() + "."
							+ mmAttr.getOpposite().getName() + ")");
				System.out.println();
			});
		};

		System.out.println("--- Types without containers --- ");
		containerRefsByTypes.entrySet().stream().filter(e -> e.getValue().isEmpty()).forEachOrdered(printEntry);
		System.out.println();

		System.out.println("--- Types with one bidirectional container reference --- ");
		containerRefsByTypes.entrySet().stream().filter(e -> e.getValue().size() == 1)
				.filter(e -> e.getValue().iterator().next().getOpposite() != null).forEachOrdered(printEntry);
		System.out.println();

		System.out.println("--- Types with one container reference without opposite ref --- ");
		containerRefsByTypes.entrySet().stream().filter(e -> e.getValue().size() == 1)
				.filter(e -> e.getValue().iterator().next().getOpposite() == null).forEachOrdered(printEntry);
		System.out.println();

		System.out.println("--- Types with more than one container reference --- ");
		containerRefsByTypes.entrySet().stream().filter(e -> e.getValue().size() > 1).forEachOrdered(printEntry);
		System.out.println();
	}

	@Test
	public void testContainmentHierarchy() throws Exception {
		System.out.println("-----Containment hiearchy (4 types skiped) -----");
		System.out.println("   (*: instance of RepositoryConcept )");
		printContainmentTree(MMRepository.metaType(), Collections.emptyList(), "  ", "");
	}

	private final static void printContainmentTree(MetamodelType<?> container, List<MetamodelAttribute<?, ?>> refPath,
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
				tab + prefix + pkg + container.getName() );

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
								printContainmentTree(subType, nextpath, tab + "  ", "(" + mmAttr.getName() + ") ");
							});
				});
	}

	final static LinkedHashMap<String,List<MetamodelType<?>>> togetherGroups;
	final static List<MetamodelType<?>> notInTogetherGroups;
	static {
		togetherGroups = new LinkedHashMap<>();
		{
			ArrayList<MetamodelType<?>> group = new ArrayList<>();
			group.add(MMBusinessConcept.metaType());
			group.add(MMBusinessComponent.metaType());
			group.add(MMBusinessAttribute.metaType());
			group.add(MMBusinessAssociationEnd.metaType());
			group.add(MMBusinessElement.metaType());
			group.add(MMBusinessElementType.metaType());
			togetherGroups.put("BusinessObjects", group);
		}
		{
			ArrayList<MetamodelType<?>> group = new ArrayList<>();
			group.add(MMMessageConcept.metaType());
			group.add(MMMessageComponent.metaType());
			group.add(MMMessageComponentType.metaType());
			group.add(MMMessageConstruct.metaType());
			group.add(MMMessageBuildingBlock.metaType());
			group.add(MMMessageDefinition.metaType());
			group.add(MMMessageAttribute.metaType());
			group.add(MMMessageAssociationEnd.metaType());
			group.add(MMMessageElement.metaType());
			group.add(MMMessageElementContainer.metaType());
			group.add(MMChoiceComponent.metaType());
			group.add(MMXor.metaType());
			togetherGroups.put("Messages", group);
		}
		
		notInTogetherGroups = new ArrayList<>();
		notInTogetherGroups.addAll(StandardMetamodel2013.metamodel().getAllTypes());
		for( List<MetamodelType<?>> group: togetherGroups.values() ) {
			notInTogetherGroups.removeAll(group);
		}
		
		
	}
	
	@Test
	//@Ignore
	public void plantUMLInheritanceDiagramm() {
		Set<MetamodelType<?>> selectedTypes = new LinkedHashSet<>();
		for( MetamodelType<? extends MMModelEntity> mmType : StandardMetamodel2013.metamodel().getAllTypes() ) {
			if( mmType.getSuperTypes(false, true).contains(MMDataType.metaType()))
				continue;
			selectedTypes.add(mmType);
		}

		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.println("@startuml");
		pw.println("hide empty members");

		for( Entry<String, List<MetamodelType<?>>> e : togetherGroups.entrySet() ) {
			pw.println("package " +e.getKey() + " <<Rectangle>> {");
			printEntities(pw, e.getValue());			
			pw.println("}");
			pw.println();
		}
		
		printEntities(pw, notInTogetherGroups);			
		
		
		Set<MetamodelAttribute<?, ?>> processedAttrs = new HashSet<>();
		for (MetamodelType<?> mmType : selectedTypes) {
			for (MetamodelType<?> st : mmType.getSuperTypes(false, false)) {
				if( "ModelEntity".equals( st.getName() ) )
					continue;
				pw.println(mmType.getName() + " -up-|> " + st.getName());
			}
			
			/*for (MetamodelAttribute<?, ?> mmAttr : mmType.getDeclaredAttributes()) {
				MetamodelType<?> refType = mmAttr.getReferencedType();
				if( refType == null  )
					continue;
				if( processedAttrs.contains(mmAttr))
					continue;
				
				pw.println(mmType.getName() + " -- " + refType.getName());
				processedAttrs.add(mmAttr);
				MetamodelAttribute<?, ?> oppositeAttr = mmAttr.getOpposite();
				if( oppositeAttr != null )
					processedAttrs.add(oppositeAttr);
			}*/
			pw.println();
//			for (EObject crossRef : ec.eContents()) {
//				pw.println("  --> " + crossRef);
//			}
		}

		
		generatePlantUMLClassDiagramm(pw, selectedTypes);
		pw.println("@enduml");
		System.out.println(sw.toString());
	}

	private void printEntities(PrintWriter pw, List<MetamodelType<?>> group) {
		for (MetamodelType<?> mmType : group) {
			pw.print(mmType.isAbstract() ? "interface " : "class ");
			pw.println( mmType.getName() + " {");
			for( MetamodelAttribute<?, ?> mmAttr: mmType.getDeclaredAttributes() ) {
				
				pw.print("  + " );
				//pw.print( mmAttr.isOptional() ? "{field}" : "{method}");
				pw.print( " " + mmAttr.getName() );
				pw.print( (mmAttr.isMultiple() ? " *":"") );
				if( mmAttr.getReferencedType() !=null ) {
					pw.print( " : " + mmAttr.getReferencedType().getName() );					
				} else if( mmAttr.getValueJavaClass() !=null ) {
					pw.print( " : " + mmAttr.getValueJavaClass().getSimpleName() );										
				} else if( mmAttr.getEnumType() !=null ) {
					pw.print( " : " + mmAttr.getEnumType().getName());															
				}
				pw.println();
			}
			pw.println( "}");
		}
	}
	
	

	public void generatePlantUMLClassDiagramm(PrintWriter pw, Set<MetamodelType<?>> eClasses) {
	}

}
