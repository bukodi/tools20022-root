package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMTopLevelDictionaryEntry_;
import com.tools20022.metamodel.struct.MMLogicalType_;
import com.tools20022.metamodel.struct.MMMessageConcept_;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Optional;public interface MMMessageComponentType_ extends MMTopLevelDictionaryEntry_, MMLogicalType_, MMMessageConcept_ {

	/**
	 * The MessageBuildingBlock that is the context for this MessageComponentType
	 */
	MetamodelAttribute<MMMessageComponentType, List<MMMessageBuildingBlock>> messageBuildingBlock = newAttribute();
	/**
	 * A property indicating the absense of a semantic relationship to a BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	MetamodelAttribute<MMMessageComponentType, Boolean> isTechnical = newAttribute();
	/**
	 * The BusinessComponent that this MessageComponentType is derived from.
	 */
	MetamodelAttribute<MMMessageComponentType, Optional<MMBusinessComponent>> trace = newAttribute(); }