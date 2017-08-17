package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMDataType_;
import com.tools20022.metamodel.MMBoolean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMBoolean_ extends MMDataType_ {

	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
	MetamodelAttribute<MMBoolean, Optional<String>> pattern = newAttribute();
}