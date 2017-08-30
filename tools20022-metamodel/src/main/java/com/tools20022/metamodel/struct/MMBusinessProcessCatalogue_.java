package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMRepository;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import java.util.List;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;public interface MMBusinessProcessCatalogue_ extends MMModelEntity_ {

	/**
	 * The Repository that owns the BusinessProcessCatalogue.
	 */
	MetamodelAttribute<MMBusinessProcessCatalogue, MMRepository> repository = newAttribute();
	/**
	 * a TopLevelCatalogueEntry in the BusinessProcessCatalague
	 */
	MetamodelAttribute<MMBusinessProcessCatalogue, List<MMTopLevelCatalogueEntry>> topLevelCatalogueEntry = newAttribute();
	/**
	 * All TopLevelCatalogueEntries of a BusinessProcessCatalogue must have different names
	topLevelCatalogueEntry-&gt;forAll(entry1,entry2 | entry1 &lt;&gt; entry2 implies entry1.name &lt;&gt; entry2.name)
	 */
	MetamodelConstraint<MMBusinessProcessCatalogue> checkEntriesHaveUniqueName = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	}); }