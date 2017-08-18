package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import com.tools20022.metamodel.MMMessageChoreography;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMBusinessTransaction;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageDefinition;
import java.util.List;

public interface MMMessageChoreography_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * the BusinessTransactionTrace from the MessageChoreography to the
	 * BusinessTransaction
	 */
	MetamodelAttribute<MMMessageChoreography, Optional<MMBusinessTransaction>> businessTransactionTrace = newAttribute();
	/**
	 * The MessageDefinition that is used in a MessageChoreography.
	 */
	MetamodelAttribute<MMMessageChoreography, List<MMMessageDefinition>> messageDefinition = newAttribute();
}