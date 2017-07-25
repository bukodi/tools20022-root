package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMDecimal_;
import com.tools20022.metamodel.MMQuantity;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMQuantity_ extends MMDecimal_ {

	/**
	 * qualifies the value of a Quantity
	 */
	MetamodelAttribute<MMQuantity, Optional<String>> unitCode = newAttribute();
}