package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMAmount;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.struct.MMDecimal_;
import java.util.Optional;

public interface MMAmount_ extends MMDecimal_ {

	/**
	 * specifies the allowed currencies that can be used to qualify this amount
	 */
	MetamodelAttribute<MMAmount, Optional<MMDataType>> currencyIdentifierSet = newAttribute();
}