package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMIndustryMessageSet;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import java.util.function.Supplier;
import java.util.Optional;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * industryMessageSet constructed according to the rules defined in ISO 15022-1
 * and ISO 15022-2 and that is stored in the ISO 15022 Catalogue of Messages
 */
public class MMISO15022MessageSet extends MMIndustryMessageSet {

	private GeneratedMetamodelBean container;
	protected Supplier<MMBusinessProcessCatalogue> businessProcessCatalogue_lazy;
	protected String name;
	protected String definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Date removalDate;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMISO15022MessageSet> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMISO15022MessageSet> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMISO15022MessageSet.class);
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
		return semanticMarkup == null
				? Collections.emptyList()
				: semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet == null ? Collections.emptyList() : doclet;
	}

	@Override
	public List<String> getExample() {
		return example == null ? Collections.emptyList() : example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint == null ? Collections.emptyList() : constraint;
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