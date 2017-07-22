package com.tools20022.repogenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

import test.gen.mm.MMBusinessArea;
import test.gen.mm.MMBusinessAttribute;
import test.gen.mm.MMBusinessProcessCatalogue;
import test.gen.mm.MMDataDictionary;
import test.gen.mm.MMMessageAttribute;
import test.gen.mm.MMMessageBuildingBlock;
import test.gen.mm.MMMessageBuildingBlock.Members;
import test.gen.mm.MMRepository;

class CreateConsistentSubset implements Function<RawRepository, RawRepository> {

	private final RawRepository source;

	Set<MetamodelType<?>> dontAddContents = Stream.of(MMRepository.metaType(), MMBusinessProcessCatalogue.metaType(),
			MMDataDictionary.metaType(), MMBusinessArea.metaType()).collect(Collectors.toSet());

	Set<GeneratedMetamodelBean> markedForRetain = new HashSet<>();

	Set<MetamodelAttribute<?, ?>> keepRefs = Stream
			.of(MMMessageBuildingBlock.Members.simpleType, MMMessageBuildingBlock.Members.complexType,
					MMMessageAttribute.Members.simpleType, MMMessageAttribute.Members.complexType, 
					MMBusinessAttribute.Members.simpleType, MMBusinessAttribute.Members.complexType )
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
