package test.gen.mm;

import test.gen.mm.MMDataType;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

/**
 * Abstract definition of a data type whose properties are common to all kinds
 * of time-related concepts.
 */
public interface MMAbstractDateTimeConcept extends MMDataType {

	public static interface Members extends MMDataType.Members {
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