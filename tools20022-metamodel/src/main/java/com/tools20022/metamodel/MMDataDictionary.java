package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Containment;
import com.tools20022.metamodel.MMRepository;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Container;
import java.util.Optional;

/**
 * Part of the ISO 20022 Repository that contains all items that can be re-used
 * during business process modelling and message definition activities.
 */
public class MMDataDictionary implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected List<MMTopLevelDictionaryEntry> topLevelDictionaryEntry;
	protected Supplier<MMRepository> repository_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMDataDictionary> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMDataDictionary> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMDataDictionary.class);
	}

	/**
	 * a TopLevelDictionaryEntry in the DataDictionary
	 * 
	 * @see MMTopLevelDictionaryEntry#getDataDictionary()
	 */
	@Opposite(bean = MMTopLevelDictionaryEntry.class, attribute = "dataDictionary")
	@Containment
	public List<MMTopLevelDictionaryEntry> getTopLevelDictionaryEntry() {
		return topLevelDictionaryEntry == null
				? Collections.emptyList()
				: topLevelDictionaryEntry;
	}

	/**
	 * The Repository that owns the DataDictionary.
	 * 
	 * @see MMRepository#getDataDictionary()
	 */
	@Opposite(bean = MMRepository.class, attribute = "dataDictionary")
	@Container
	public MMRepository getRepository() {
		return repository_lazy.get();
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null
				? Collections.emptyList()
				: nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional
				.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional
				.of(objectIdentifier);
	}
}