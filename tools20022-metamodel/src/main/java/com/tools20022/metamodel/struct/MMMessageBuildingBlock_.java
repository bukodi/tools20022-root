package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMMessageConstruct_;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageComponentType;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMMessageBuildingBlock_ extends MMMessageConstruct_ {

	/**
	 * The simple content model of a MessageBuildingBlock when it is expressed
	 * using a DataType
	 */
	MetamodelAttribute<MMMessageBuildingBlock, Optional<MMDataType>> simpleType = newAttribute();
	/**
	 * the complex content model of a MessageBuildingBlock when it is expressed
	 * using a MessageComponentType
	 */
	MetamodelAttribute<MMMessageBuildingBlock, Optional<MMMessageComponentType>> complexType = newAttribute();
	/**
	 * A MessageBuildingBlock must have exactly one of the following: simpleType
	 * or complexType. complexType-&gt;size() + simpleType-&gt;size() = 1
	 */
	MetamodelConstraint<MMMessageBuildingBlock> checkMessageBuildingBlockHasExactlyOneType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}