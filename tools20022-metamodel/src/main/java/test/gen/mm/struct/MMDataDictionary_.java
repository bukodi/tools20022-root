package test.gen.mm.struct;

import test.gen.mm.struct.MMModelEntity_;
import test.gen.mm.MMDataDictionary;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMTopLevelDictionaryEntry;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import test.gen.mm.MMRepository;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMDataDictionary_ extends MMModelEntity_ {

	/**
	 * a TopLevelDictionaryEntry in the DataDictionary
	 */
	MetamodelAttribute<MMDataDictionary, List<MMTopLevelDictionaryEntry>> topLevelDictionaryEntry = newAttribute();
	/**
	 * The Repository that owns the DataDictionary.
	 */
	MetamodelAttribute<MMDataDictionary, MMRepository> repository = newAttribute();
	/**
	 * All TopLevelDictionaryEntries of a DataDictionary must have different
	 * names topLevelDictionaryEntry-&gt;forAll(entry1,entry2 | entry1 &lt;&gt;
	 * entry2 implies entry1.name &lt;&gt; entry2.name)
	 */
	MetamodelConstraint<MMDataDictionary> checkEntriesHaveUniqueName = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}