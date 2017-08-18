package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import com.tools20022.metamodel.MMXor;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMMessageElement;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import java.util.Optional;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;

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