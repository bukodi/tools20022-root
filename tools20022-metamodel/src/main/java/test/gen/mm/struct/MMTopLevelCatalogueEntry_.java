package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.MMTopLevelCatalogueEntry;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessProcessCatalogue;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMTopLevelCatalogueEntry_ extends MMRepositoryConcept_ {

	/**
	 * the BusinessProcessCatalogue that contains all ISO 20022
	 * TopLevelCatalogueEntries
	 */
	MetamodelAttribute<MMTopLevelCatalogueEntry, MMBusinessProcessCatalogue> businessProcessCatalogue = newAttribute();
}