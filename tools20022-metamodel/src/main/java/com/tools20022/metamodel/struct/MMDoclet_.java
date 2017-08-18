package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMDoclet_ extends MMModelEntity_ {

	/**
	 * The type of doclet. The definition of the doclet type is left open so
	 * that new doclet types can be easily added without the need for a change
	 * to the meta-model.
	 */
	MetamodelAttribute<MMDoclet, Optional<String>> type = newAttribute();
	/**
	 * The content for the documentation.
	 */
	MetamodelAttribute<MMDoclet, Optional<String>> content = newAttribute();
}