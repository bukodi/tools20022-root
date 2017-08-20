package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMAbstractDateTimeConcept;
import java.util.Optional;
import com.tools20022.metamodel.MMDataDictionary;
import java.util.function.Supplier;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import java.util.Collections;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Any set of values drawn from the value space of 'gYearMonth', as specified by
 * W3C Recommendation XML Schema Part 2: Datatypes.
 */
public class MMYearMonth implements MMAbstractDateTimeConcept {

	private GeneratedMetamodelBean container;
	protected String minInclusive;
	protected String minExclusive;
	protected String maxInclusive;
	protected String maxExclusive;
	protected String pattern;
	protected Supplier<MMDataDictionary> dataDictionary_lazy;
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
	public MetamodelType<? extends MMYearMonth> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMYearMonth> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMYearMonth.class);
	}

	@Override
	public Optional<String> getMinInclusive() {
		return minInclusive == null ? Optional.empty() : Optional
				.of(minInclusive);
	}

	@Override
	public Optional<String> getMinExclusive() {
		return minExclusive == null ? Optional.empty() : Optional
				.of(minExclusive);
	}

	@Override
	public Optional<String> getMaxInclusive() {
		return maxInclusive == null ? Optional.empty() : Optional
				.of(maxInclusive);
	}

	@Override
	public Optional<String> getMaxExclusive() {
		return maxExclusive == null ? Optional.empty() : Optional
				.of(maxExclusive);
	}

	@Override
	public Optional<String> getPattern() {
		return pattern == null ? Optional.empty() : Optional.of(pattern);
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary_lazy.get();
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