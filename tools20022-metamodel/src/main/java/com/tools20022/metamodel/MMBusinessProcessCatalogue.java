package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Containment;
import java.util.Optional;

/**
 * Part of the ISO 20022 Repository that contains all Business Process and
 * BusinessTransaction related items.
 */
public class MMBusinessProcessCatalogue implements MMModelEntity {

	private GeneratedMetamodelBean container;
	protected MMRepository repository;
	protected List<MMTopLevelCatalogueEntry> topLevelCatalogueEntry;
	protected List<MMModelEntity> nextVersions;
	protected MMModelEntity previousVersion;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMBusinessProcessCatalogue> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBusinessProcessCatalogue> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessProcessCatalogue.class);
	}

	/**
	 * The Repository that owns the BusinessProcessCatalogue.
	 * 
	 * @see MMRepository#getBusinessProcessCatalogue()
	 */
	@Opposite(bean = MMRepository.class, attribute = "businessProcessCatalogue")
	@Container
	public MMRepository getRepository() {
		return repository;
	}

	/**
	 * a TopLevelCatalogueEntry in the BusinessProcessCatalague
	 * 
	 * @see MMTopLevelCatalogueEntry#getBusinessProcessCatalogue()
	 */
	@Opposite(bean = MMTopLevelCatalogueEntry.class, attribute = "businessProcessCatalogue")
	@Containment
	public List<MMTopLevelCatalogueEntry> getTopLevelCatalogueEntry() {
		return topLevelCatalogueEntry == null
				? Collections.emptyList()
				: topLevelCatalogueEntry;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions == null ? Collections.emptyList() : nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return Optional.ofNullable(previousVersion);
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return Optional.ofNullable(objectIdentifier);
	}
}