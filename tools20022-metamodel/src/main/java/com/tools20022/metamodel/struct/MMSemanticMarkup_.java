package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.List;
import java.util.Optional;

public interface MMSemanticMarkup_ extends MMModelEntity_ {

	/**
	 * The type of semantic mark-up e.g. "synonym".
	 */
	MetamodelAttribute<MMSemanticMarkup, Optional<String>> type = newAttribute();
	/**
	 * The elements of semantic markup.
	 */
	MetamodelAttribute<MMSemanticMarkup, List<MMSemanticMarkupElement>> elements = newAttribute();
}