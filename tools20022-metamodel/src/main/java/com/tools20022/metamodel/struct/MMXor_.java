package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.*;
import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import java.util.List;
import java.util.Optional;

public interface MMXor_ extends MMRepositoryConcept_ {

	/**
	 * Message Elements impacted by the XOR.
	 */
	MetamodelAttribute<MMXor, List<MMMessageElement>> impactedElements = newAttribute();
	/**
	 * Message Component owning the XOR.
	 */
	MetamodelAttribute<MMXor, Optional<MMMessageComponent>> messageComponent = newAttribute();
	/**
	 * MessageBuildingBlocks impacted by the XOR.
	 */
	MetamodelAttribute<MMXor, List<MMMessageBuildingBlock>> impactedMessageBuildingBlocks = newAttribute();
	/**
	 * Message Definition owning the XOR.
	 */
	MetamodelAttribute<MMXor, Optional<MMMessageDefinition>> messageDefinition = newAttribute();
}