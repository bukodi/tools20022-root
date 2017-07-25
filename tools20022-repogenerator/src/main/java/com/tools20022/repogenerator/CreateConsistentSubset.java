package com.tools20022.repogenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.struct.MMBusinessAttribute_;
import com.tools20022.metamodel.struct.MMMessageAttribute_;
import com.tools20022.metamodel.struct.MMMessageBuildingBlock_;

class CreateConsistentSubset implements Function<RawRepository, RawRepository> {

	private final RawRepository source;

	Set<MetamodelType<?>> dontAddContents = Stream.of(MMRepository.metaType(), MMBusinessProcessCatalogue.metaType(),
			MMDataDictionary.metaType(), MMBusinessArea.metaType()).collect(Collectors.toSet());

	Set<GeneratedMetamodelBean> markedForRetain = new HashSet<>();

	Set<MetamodelAttribute<?, ?>> keepRefs = Stream
			.of(MMMessageBuildingBlock_.simpleType, MMMessageBuildingBlock_.complexType,
					MMMessageAttribute_.simpleType, MMMessageAttribute_.complexType, 
					MMBusinessAttribute_.simpleType, MMBusinessAttribute_.complexType )
			.collect(Collectors.toSet());

	CreateConsistentSubset(RawRepository source) {
		this.source = source;
		// source.listObjects(mmClass)
	}

	@Override
	public RawRepository apply(RawRepository source) {

		return null;
	}

}
