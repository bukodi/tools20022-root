package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;

/**
 * artefact in the BusinessProcessCatalogue that is not owned by another
 * artefact in the Repository
 */
public interface MMTopLevelCatalogueEntry extends MMRepositoryConcept {

	public static MetamodelType<MMTopLevelCatalogueEntry> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMTopLevelCatalogueEntry.class);
	}

	/**
	 * the BusinessProcessCatalogue that contains all ISO 20022
	 * TopLevelCatalogueEntries
	 * 
	 * @see MMBusinessProcessCatalogue#getTopLevelCatalogueEntry()
	 */
	@Opposite(bean = MMBusinessProcessCatalogue.class, attribute = "topLevelCatalogueEntry")
	@Container
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue();
}