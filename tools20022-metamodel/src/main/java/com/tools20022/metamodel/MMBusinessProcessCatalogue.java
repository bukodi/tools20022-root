package com.tools20022.metamodel;


import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;
import java.util.function.Supplier;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.Container;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import java.util.List;
import java.util.Collections;
import com.tools20022.core.metamodel.Containment;
import java.util.Optional;/**
 * Part of the ISO 20022 Repository that contains all Business Process and BusinessTransaction related items.
 */
public class MMBusinessProcessCatalogue implements MMModelEntity {

	protected Supplier<MMRepository> repository_lazy;
	protected Supplier<List<MMTopLevelCatalogueEntry>> topLevelCatalogueEntry_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMRepository getContainer() {
		return getRepository();
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
	 * @see MMRepository#getBusinessProcessCatalogue()
	 */
	@Opposite(bean = MMRepository.class, attribute = "businessProcessCatalogue")
	@Container
	public MMRepository getRepository() {
		return repository_lazy.get();
	}

	/**
	 * a TopLevelCatalogueEntry in the BusinessProcessCatalague
	 * @see MMTopLevelCatalogueEntry#getBusinessProcessCatalogue()
	 */
	@Opposite(bean = MMTopLevelCatalogueEntry.class, attribute = "businessProcessCatalogue")
	@Containment
	public List<MMTopLevelCatalogueEntry> getTopLevelCatalogueEntry() {
		return topLevelCatalogueEntry_lazy == null ? Collections.emptyList()
				: topLevelCatalogueEntry_lazy.get();
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList()
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
	} }