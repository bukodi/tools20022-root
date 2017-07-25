package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMDataDictionary;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;

public interface MMRepository_ extends MMModelEntity_ {

	/**
	 * the DataDictionary owned by the ISO 20022 Repository
	 */
	MetamodelAttribute<MMRepository, MMDataDictionary> dataDictionary = newAttribute();
	/**
	 * the BusinessProcessCatalogue owned by the ISO 20022 Repository
	 */
	MetamodelAttribute<MMRepository, MMBusinessProcessCatalogue> businessProcessCatalogue = newAttribute();
}