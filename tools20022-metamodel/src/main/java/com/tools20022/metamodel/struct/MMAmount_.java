package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMDecimal_;
import com.tools20022.metamodel.MMAmount;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMAmount_ extends MMDecimal_ {

	/**
	 * specifies the allowed currencies that can be used to qualify this amount
	 */
	MetamodelAttribute<MMAmount, Optional<MMDataType>> currencyIdentifierSet = newAttribute();
}