package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBinary;
import com.tools20022.metamodel.struct.MMDataType_;
import java.util.Optional;

public interface MMBinary_ extends MMDataType_ {

	/**
	 * the minimum number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> minLength = newAttribute();
	/**
	 * the maximum number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> maxLength = newAttribute();
	/**
	 * the number of units of characters
	 */
	MetamodelAttribute<MMBinary, Optional<Integer>> length = newAttribute();
	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	MetamodelAttribute<MMBinary, Optional<String>> pattern = newAttribute();
}