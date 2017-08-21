package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMDataDictionary;
import java.util.function.Supplier;
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
	public MMDataDictionary getDataDictionary();
}