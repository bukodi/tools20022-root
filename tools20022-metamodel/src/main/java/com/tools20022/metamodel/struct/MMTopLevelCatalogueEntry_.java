package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMTopLevelCatalogueEntry_ extends MMRepositoryConcept_ {

	/**
	 * the BusinessProcessCatalogue that contains all ISO 20022
	 * TopLevelCatalogueEntries
	 */
	MetamodelAttribute<MMTopLevelCatalogueEntry, MMBusinessProcessCatalogue> businessProcessCatalogue = newAttribute();
}