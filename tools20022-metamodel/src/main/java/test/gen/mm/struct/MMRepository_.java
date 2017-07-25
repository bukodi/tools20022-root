package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMRepository;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMDataDictionary;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMBusinessProcessCatalogue;

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