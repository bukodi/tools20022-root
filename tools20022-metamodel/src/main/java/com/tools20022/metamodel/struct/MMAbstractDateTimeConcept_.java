package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMDataType_;
import com.tools20022.metamodel.MMAbstractDateTimeConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMAbstractDateTimeConcept_ extends MMDataType_ {

	/**
	 * the lowest value in the allowed set of values
	 */
	MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> minInclusive = newAttribute();
	/**
	 * the lowest but one value in the allowed set of values
	 */
	MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> minExclusive = newAttribute();
	/**
	 * the highest value in the allowed set of values
	 */
	MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> maxInclusive = newAttribute();
	/**
	 * the highest but one value in the allowed set of values
	 */
	MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> maxExclusive = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	MetamodelAttribute<MMAbstractDateTimeConcept, Optional<String>> pattern = newAttribute();
}