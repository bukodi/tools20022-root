package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMDecimal;
import com.tools20022.metamodel.MMDataType;
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
 * A number of monetary units specified in a currency where the unit of currency
 * is explicit or implied.
 */
public class MMAmount extends MMDecimal {

	private GeneratedMetamodelBean container;
	protected Optional<MMDataType> currencyIdentifierSet;
	protected Optional<String> minInclusive;
	protected Optional<String> minExclusive;
	protected Optional<String> maxInclusive;
	protected Optional<String> maxExclusive;
	protected Optional<Integer> totalDigits;
	protected Optional<Integer> fractionDigits;
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
	public MetamodelType<? extends MMAmount> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMAmount> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMAmount.class);
	}

	/**
	 * specifies the allowed currencies that can be used to qualify this amount
	 */
	public Optional<MMDataType> getCurrencyIdentifierSet() {
		return currencyIdentifierSet;
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
	public Optional<Integer> getTotalDigits() {
		return totalDigits;
	}

	@Override
	public Optional<Integer> getFractionDigits() {
		return fractionDigits;
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