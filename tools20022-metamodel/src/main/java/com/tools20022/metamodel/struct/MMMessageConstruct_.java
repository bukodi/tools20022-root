package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.struct.MMConstruct_;
import java.util.Optional;

public interface MMMessageConstruct_ extends MMConstruct_ {

	/**
	 * XML schema tag name for the element.
	 */
	MetamodelAttribute<MMMessageConstruct, Optional<String>> xmlTag = newAttribute();
	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	MetamodelAttribute<MMMessageConstruct, MMLogicalType> xmlMemberType = newAttribute();
}