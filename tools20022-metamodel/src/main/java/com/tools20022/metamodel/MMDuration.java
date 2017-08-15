package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMAbstractDateTimeConcept;
import java.util.Optional;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMSemanticMarkup;
import java.util.List;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import java.util.Date;
import com.tools20022.metamodel.MMModelEntity;

/**
 * Any set of values drawn from the value space of 'duration', as specified by
 * W3C Recommendation XML Schema Part 2: Datatypes.
 */
public class MMDuration implements MMAbstractDateTimeConcept {

	private GeneratedMetamodelBean container;
	protected Optional<String> minInclusive;
	protected Optional<String> minExclusive;
	protected Optional<String> maxInclusive;
	protected Optional<String> maxExclusive;
	protected Optional<String> pattern;
	protected MMDataDictionary dataDictionary;
	protected String name;
	protected Optional<String> definition;
	protected List<MMSemanticMarkup> semanticMarkup;
	protected List<MMDoclet> doclet;
	protected List<String> example;
	protected List<MMConstraint> constraint;
	protected MMRegistrationStatus registrationStatus;
	protected Optional<Date> removalDate;
	protected List<MMModelEntity> nextVersions;
	protected Optional<MMModelEntity> previousVersion;
	protected Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMDuration> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMDuration> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMDuration.class);
	}

	@Override
	public Optional<String> getMinInclusive() {
		return minInclusive;
	}

	@Override
	public Optional<String> getMinExclusive() {
		return minExclusive;
	}

	@Override
	public Optional<String> getMaxInclusive() {
		return maxInclusive;
	}

	@Override
	public Optional<String> getMaxExclusive() {
		return maxExclusive;
	}

	@Override
	public Optional<String> getPattern() {
		return pattern;
	}

	@Override
	public MMDataDictionary getDataDictionary() {
		return dataDictionary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Optional<String> getDefinition() {
		return definition;
	}

	@Override
	public List<MMSemanticMarkup> getSemanticMarkup() {
		return semanticMarkup;
	}

	@Override
	public List<MMDoclet> getDoclet() {
		return doclet;
	}

	@Override
	public List<String> getExample() {
		return example;
	}

	@Override
	public List<MMConstraint> getConstraint() {
		return constraint;
	}

	@Override
	public MMRegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	@Override
	public Optional<Date> getRemovalDate() {
		return removalDate;
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions;
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion;
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier;
	}
}