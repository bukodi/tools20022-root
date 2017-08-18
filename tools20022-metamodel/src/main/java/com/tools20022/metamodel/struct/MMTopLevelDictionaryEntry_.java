package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMDataDictionary;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMTopLevelDictionaryEntry_ extends MMRepositoryConcept_ {

	/**
	 * the DataDictionary that contains all ISO 20022 TopLevelDictionaryEntries
	 */
	MetamodelAttribute<MMTopLevelDictionaryEntry, MMDataDictionary> dataDictionary = newAttribute();
}