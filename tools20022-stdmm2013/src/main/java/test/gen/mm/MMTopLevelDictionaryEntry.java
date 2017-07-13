package test.gen.mm;

import test.gen.mm.MMRepositoryConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMDataDictionary;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;

/**
 * artefact in the Dictionary that is not owned by another artefact in the
 * Repository
 */
public interface MMTopLevelDictionaryEntry extends MMRepositoryConcept {

	public static interface Members extends MMRepositoryConcept.Members {
		/**
		 * the DataDictionary that contains all ISO 20022
		 * TopLevelDictionaryEntries
		 */
		MetamodelAttribute<MMTopLevelDictionaryEntry, MMDataDictionary> dataDictionary = newAttribute();
	}

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