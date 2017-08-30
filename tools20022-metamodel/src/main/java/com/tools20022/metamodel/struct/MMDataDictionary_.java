package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;public interface MMDataDictionary_ extends MMModelEntity_ {

	/**
	 * a TopLevelDictionaryEntry in the DataDictionary
	 */
	MetamodelAttribute<MMDataDictionary, List<MMTopLevelDictionaryEntry>> topLevelDictionaryEntry = newAttribute();
	/**
	 * The Repository that owns the DataDictionary.
	 */
	MetamodelAttribute<MMDataDictionary, MMRepository> repository = newAttribute();
	/**
	 * All TopLevelDictionaryEntries of a DataDictionary must have different names
	topLevelDictionaryEntry-&gt;forAll(entry1,entry2 | entry1 &lt;&gt; entry2 implies entry1.name &lt;&gt; entry2.name)
	 */
	MetamodelConstraint<MMDataDictionary> checkEntriesHaveUniqueName = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	}); }