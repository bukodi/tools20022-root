package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import com.tools20022.metamodel.MMCode;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMCodeSet;

public interface MMCode_ extends MMRepositoryConcept_ {

	/**
	 * Provides the full, non-abbreviated name of the Code
	 */
	MetamodelAttribute<MMCode, Optional<String>> codeName = newAttribute();
	/**
	 * Direct reference to the CodeSet owning this Code.
	 */
	MetamodelAttribute<MMCode, MMCodeSet> owner = newAttribute();
}