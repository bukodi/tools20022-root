package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMSyntaxMessageScheme;
import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import java.util.Optional;

public interface MMSyntaxMessageScheme_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * the MessageDefinitionTrace from the SyntaxMessageScheme to the
	 * MessageDefinition
	 */
	MetamodelAttribute<MMSyntaxMessageScheme, Optional<MMMessageDefinition>> messageDefinitionTrace = newAttribute();
}