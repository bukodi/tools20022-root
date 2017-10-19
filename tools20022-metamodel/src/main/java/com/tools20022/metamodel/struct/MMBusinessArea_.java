package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import java.util.List;

public interface MMBusinessArea_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * The value of the BusinessArea code.
	 */
	MetamodelAttribute<MMBusinessArea, String> code = newAttribute();
	/**
	 * The MessageDefinition that belongs to the BusinessArea.
	 */
	MetamodelAttribute<MMBusinessArea, List<MMMessageDefinition>> messageDefinition = newAttribute();
}