package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;

/**
 * Abstract definition of a data type whose properties are common to all kinds
 * of time-related concepts.
 */
public interface MMAbstractDateTimeConcept extends MMDataType {

	public static MetamodelType<MMAbstractDateTimeConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMAbstractDateTimeConcept.class);
	}

	/**
	 * the lowest value in the allowed set of values
	 */
	Optional<String> getMinInclusive();

	/**
	 * the lowest but one value in the allowed set of values
	 */
	Optional<String> getMinExclusive();

	/**
	 * the highest value in the allowed set of values
	 */
	Optional<String> getMaxInclusive();

	/**
	 * the highest but one value in the allowed set of values
	 */
	Optional<String> getMaxExclusive();

	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	Optional<String> getPattern();
}