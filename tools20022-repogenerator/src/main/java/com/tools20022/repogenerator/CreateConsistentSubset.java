package com.tools20022.repogenerator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.struct.MMBusinessAttribute_;
import com.tools20022.metamodel.struct.MMMessageAttribute_;
import com.tools20022.metamodel.struct.MMMessageBuildingBlock_;

class CreateConsistentSubset {

	private RawRepository repo;

	private Set<MetamodelType<?>> dontAddContents = Stream.of(MMRepository.metaType(),
			MMBusinessProcessCatalogue.metaType(), MMDataDictionary.metaType(), MMBusinessArea.metaType())
			.collect(Collectors.toSet());

	private Set<MetamodelAttribute<?, ?>> keepRefs = Stream
			.of(MMMessageBuildingBlock_.simpleType, MMMessageBuildingBlock_.complexType, MMMessageAttribute_.simpleType,
					MMMessageAttribute_.complexType, MMBusinessAttribute_.simpleType, MMBusinessAttribute_.complexType)
			.collect(Collectors.toSet());

	private boolean keepRequiredBusinessAssociationEnds = false;

	public RawRepository createSubset(RawRepository repo, Predicate<GeneratedMetamodelBean> filter) {
		this.repo = repo;
		/*** Phase 1: collect seed set ***/
		long now = System.currentTimeMillis();
		Set<GeneratedMetamodelBean> markedForRetain = repo.listObjects().filter(filter).collect(Collectors.toSet());
		System.out.println("First phase: " + (System.currentTimeMillis() - now) + " msec");
		System.out.println();

		/*** Phase 2: extend retainSet ***/
		for (int round = 1; round < 3; round++) {
			System.out.println("--- Round " + round + " ---");
			int addedObjects = extendRetainSet(markedForRetain);
			System.out.println("" + addedObjects + " objects added in " + round + ". round. All objects: "
					+ markedForRetain.size());
			System.out.println();
			if (addedObjects == 0)
				break;
		}

		/*** Phase 3: create filtered repo ***/
		RawRepository filteredRepo = new RawRepository(repo.getMetamodel(), repo.getRootObject());
		for (GeneratedMetamodelBean repoObj : markedForRetain) {
			filteredRepo.addObject(repoObj);
		}
		return filteredRepo;
	}

	int extendRetainSet(Set<GeneratedMetamodelBean> markedForRetain) {
		int startCount = markedForRetain.size();

		HashMap<MetamodelAttribute<?, ?>, Set<GeneratedMetamodelBean>> newMarks = new HashMap<>();
		for (GeneratedMetamodelBean repoObj : new HashSet<GeneratedMetamodelBean>(markedForRetain)) {
			System.out.println("Extend object: " + toString(repoObj));
			// Add the container
			if (repoObj.getContainer() != null) {
				markedForRetain.add(repoObj.getContainer());
				System.out.println("  - add container: " + toString(repoObj.getContainer()));
			}

			Set<? extends MetamodelAttribute<?, ?>> attrList = repoObj.getMetamodel().getAllAttributes();
			for (MetamodelAttribute<?, ?> mmAttr : attrList) {
				if (mmAttr.isContainer() || mmAttr.isDerived())
					continue;
				if (mmAttr.getValueJavaClass() != null)
					continue;

				boolean isProtectedRef = keepRefs.contains(mmAttr);

				Object value = mmAttr.get(repoObj);
				if (value == null)
					continue;
				if (value instanceof Optional<?>) {
					Optional<?> optValue = (Optional<?>) value;
					if (!optValue.isPresent())
						continue;
					value = optValue.get();
				}
				if (value instanceof List<?>) {
					if (!isProtectedRef && mmAttr.isOptional() && (!mmAttr.isContainment()))
						continue;
					List<?> listValue = (List<?>) value;
					if (listValue.isEmpty())
						continue;
					// List value
					for (Object entry : listValue) {
						if (entry instanceof GeneratedMetamodelBean)
							addObject(mmAttr, (GeneratedMetamodelBean) entry, markedForRetain, newMarks);
					}

				} else {
					// Single value
					if (!isProtectedRef && mmAttr.isOptional())
						continue;
					if (value instanceof GeneratedMetamodelBean)
						addObject(mmAttr, (GeneratedMetamodelBean) value, markedForRetain, newMarks);
				}
			}
		}

		// Return delta
		markedForRetain.addAll(newMarks.values().stream().flatMap(s -> s.stream()).collect(Collectors.toSet()));
		return markedForRetain.size() - startCount;
	}

	void addObject(MetamodelAttribute<?, ?> mmAttr, GeneratedMetamodelBean repoObj,
			Set<GeneratedMetamodelBean> markedForRetain,
			HashMap<MetamodelAttribute<?, ?>, Set<GeneratedMetamodelBean>> newMarks) {
		if (markedForRetain.contains(repoObj))
			return;

		Set<GeneratedMetamodelBean> set = newMarks.computeIfAbsent(mmAttr, x -> new HashSet<>());
		set.add(repoObj);
		System.out.println("  - add by ref: " + mmAttr.getName() + "->" + toString(repoObj));

		if (dontAddContents.contains(repoObj.getMetamodel()))
			return;
		Set<? extends GeneratedMetamodelBean> content = repo.listContent(repoObj, false, false)
				.collect(Collectors.toSet());
		for (GeneratedMetamodelBean childObj : content) {
			if (childObj instanceof MMBusinessAssociationEnd) {
				MMBusinessAssociationEnd mmBAE = ((MMBusinessAssociationEnd) childObj);
				if (!mmBAE.getMinOccurs().isPresent() || mmBAE.getMinOccurs().get() == 0)
					continue;
				if (!keepRequiredBusinessAssociationEnds)
					continue;
			}

			set.add(childObj);
			System.out.println("    - child of the ref : " + toString(repoObj) + "/" + toString(childObj));
		}
	}

	String toString(GeneratedMetamodelBean repoObj) {
		return "[" + repoObj.getClass().getSimpleName() + "]"
				+ (repoObj instanceof MMRepositoryConcept ? ((MMRepositoryConcept) repoObj).getName() : "-no name-");
	}

}
