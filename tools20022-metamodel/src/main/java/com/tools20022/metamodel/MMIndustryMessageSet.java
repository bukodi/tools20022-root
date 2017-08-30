package com.tools20022.metamodel;


import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import java.util.function.Supplier;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;/**
 * set of non ISO 20022 compliant messages that is defined and used by (a part of) the (financial) industry
 */
public class MMIndustryMessageSet implements MMTopLevelCatalogueEntry {

	protected Supplier<MMBusinessProcessCatalogue> businessProcessCatalogue_lazy;
	protected String name;
	protected String definition;
	protected Supplier<List<MMSemanticMarkup>> semanticMarkup_lazy;
	protected Supplier<List<MMDoclet>> doclet_lazy;
	protected List<String> example;
	protected Supplier<List<MMConstraint>> constraint_lazy;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public MMBusinessProcessCatalogue getContainer() {
		return getBusinessProcessCatalogue();
	}

	@Override
	public MetamodelType<? extends MMIndustryMessageSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMIndustryMessageSet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMIndustryMessageSet.class);
	}

	@Override
	public MMBusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue_lazy.get();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition == null ? Optional.empty() : Optional.of(definition);
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup_lazy == null ? Collections.emptyList()
				: semanticMarkup_lazy.get();
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet_lazy == null ? Collections.emptyList() : doclet_lazy
				.get();
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint_lazy == null ? Collections.emptyList()
				: constraint_lazy.get();
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate == null ? Optional.empty() : Optional
				.of(removalDate);
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