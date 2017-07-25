package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMRepositoryConcept;
import test.gen.mm.MMDataDictionary;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;

/**
 * artefact in the Dictionary that is not owned by another artefact in the
 * Repository
 */
public interface MMTopLevelDictionaryEntry extends MMRepositoryConcept {

	public static MetamodelType<MMTopLevelDictionaryEntry> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMTopLevelDictionaryEntry.class);
	}

	/**
	 * the DataDictionary that contains all ISO 20022 TopLevelDictionaryEntries
	 * 
	 * @see MMDataDictionary#getTopLevelDictionaryEntry()
	 */
	@Opposite(bean = MMDataDictionary.class, attribute = "topLevelDictionaryEntry")
	@Container
	MMDataDictionary getDataDictionary();
}