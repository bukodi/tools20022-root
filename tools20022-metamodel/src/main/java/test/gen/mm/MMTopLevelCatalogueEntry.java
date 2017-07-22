package test.gen.mm;

import test.gen.mm.MMRepositoryConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMBusinessProcessCatalogue;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;

/**
 * artefact in the BusinessProcessCatalogue that is not owned by another
 * artefact in the Repository
 */
public interface MMTopLevelCatalogueEntry extends MMRepositoryConcept {

	public static interface Members extends MMRepositoryConcept.Members {
		/**
		 * the BusinessProcessCatalogue that contains all ISO 20022
		 * TopLevelCatalogueEntries
		 */
		MetamodelAttribute<MMTopLevelCatalogueEntry, MMBusinessProcessCatalogue> businessProcessCatalogue = newAttribute();
	}

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
	MMBusinessProcessCatalogue getBusinessProcessCatalogue();
}