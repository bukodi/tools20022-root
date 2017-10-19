package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMDecimal;
import com.tools20022.metamodel.struct.MMDataType_;
import java.util.Optional;

public interface MMDecimal_ extends MMDataType_ {

	/**
	 * the lowest value in the allowed set of values
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> minInclusive = newAttribute();
	/**
	 * the lowest but one value in the allowed set of values
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> minExclusive = newAttribute();
	/**
	 * the highest value in the allowed set of values
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> maxInclusive = newAttribute();
	/**
	 * the highest but one value in the allowed set of values
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> maxExclusive = newAttribute();
	/**
	 * the maximum number of allowed digits in a Decimal number
	 */
	MetamodelAttribute<MMDecimal, Optional<Integer>> totalDigits = newAttribute();
	/**
	 * the fractional part of a Decimal number
	 */
	MetamodelAttribute<MMDecimal, Optional<Integer>> fractionDigits = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	MetamodelAttribute<MMDecimal, Optional<String>> pattern = newAttribute();
}