package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMSemanticMarkupElement;
import java.util.List;

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