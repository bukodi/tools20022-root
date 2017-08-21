package com.tools20022.metamodel;

import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
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
 * Any set of values drawn from the value space of 'decimal', as specified by
 * W3C Recommendation XML Schema Part 2: Datatypes
 */
public class MMDecimal implements MMDataType {

	protected String minInclusive;
	protected String minExclusive;
	protected String maxInclusive;
	protected String maxExclusive;
	protected Integer totalDigits;
	protected Integer fractionDigits;
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
	public MMDataDictionary getContainer() {
		return getDataDictionary();
	}

	@Override
	public MetamodelType<? extends MMDecimal> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMDecimal> metaType() {
		return StandardMetamodel2013.metamodel()
				.getTypeByClass(MMDecimal.class);
	}

	/**
	 * the lowest value in the allowed set of values
	 */
	public Optional<String> getMinInclusive() {
		return minInclusive == null ? Optional.empty() : Optional
				.of(minInclusive);
	}

	/**
	 * the lowest but one value in the allowed set of values
	 */
	public Optional<String> getMinExclusive() {
		return minExclusive == null ? Optional.empty() : Optional
				.of(minExclusive);
	}

	/**
	 * the highest value in the allowed set of values
	 */
	public Optional<String> getMaxInclusive() {
		return maxInclusive == null ? Optional.empty() : Optional
				.of(maxInclusive);
	}

	/**
	 * the highest but one value in the allowed set of values
	 */
	public Optional<String> getMaxExclusive() {
		return maxExclusive == null ? Optional.empty() : Optional
				.of(maxExclusive);
	}

	/**
	 * the maximum number of allowed digits in a Decimal number
	 */
	public Optional<Integer> getTotalDigits() {
		return totalDigits == null ? Optional.empty() : Optional
				.of(totalDigits);
	}

	/**
	 * the fractional part of a Decimal number
	 */
	public Optional<Integer> getFractionDigits() {
		return fractionDigits == null ? Optional.empty() : Optional
				.of(fractionDigits);
	}

	/**
	 * A constraint on the value space of a datatype which is achieved by
	 * constraining the lexical space to literals which match a specific
	 * pattern.
	 */
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