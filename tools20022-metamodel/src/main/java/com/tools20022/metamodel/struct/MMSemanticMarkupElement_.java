package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.Optional;

public interface MMSemanticMarkupElement_ extends MMModelEntity_ {

	/**
	 * Name of the semantic mark-up element.
	 */
	MetamodelAttribute<MMSemanticMarkupElement, Optional<String>> name = newAttribute();
	/**
	 * Value of the semantic mark-up element.
	 */
	MetamodelAttribute<MMSemanticMarkupElement, Optional<String>> value = newAttribute();
}