package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMBoolean_;
import com.tools20022.metamodel.MMIndicator;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMIndicator_ extends MMBoolean_ {

	/**
	 * Provides the semantic meaning when the Indicator is set to true.
	 */
	MetamodelAttribute<MMIndicator, String> meaningWhenTrue = newAttribute();
	/**
	 * Provides the semantic meaning when the Indicator is set to false.
	 */
	MetamodelAttribute<MMIndicator, String> meaningWhenFalse = newAttribute();
}