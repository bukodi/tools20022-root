package test.gen.mm.struct;

import test.gen.mm.struct.MMRepositoryConcept_;
import test.gen.mm.MMTopLevelDictionaryEntry;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMDataDictionary;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMTopLevelDictionaryEntry_ extends MMRepositoryConcept_ {

	/**
	 * the DataDictionary that contains all ISO 20022 TopLevelDictionaryEntries
	 */
	MetamodelAttribute<MMTopLevelDictionaryEntry, MMDataDictionary> dataDictionary = newAttribute();
}