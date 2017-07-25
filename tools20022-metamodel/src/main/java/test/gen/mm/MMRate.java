package test.gen.mm;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMDecimal;
import java.util.Optional;
import test.gen.mm.MMDataDictionary;
import test.gen.mm.MMSemanticMarkup;
import java.util.List;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * A quantity or amount measured with respect to another measured quantity or
 * amount
 */
public class MMRate extends MMDecimal {

	private GeneratedMetamodelBean container;
	private Double baseValue;
	private Optional<String> baseUnitCode;
	private Optional<String> minInclusive;
	private Optional<String> minExclusive;
	private Optional<String> maxInclusive;
	private Optional<String> maxExclusive;
	private Optional<Integer> totalDigits;
	private Optional<Integer> fractionDigits;
	private Optional<String> pattern;
	private MMDataDictionary dataDictionary;
	private String name;
	private Optional<String> definition;
	private List<MMSemanticMarkup> semanticMarkup;
	private List<MMDoclet> doclet;
	private List<String> example;
	private List<MMConstraint> constraint;
	private MMRegistrationStatus registrationStatus;
	private Optional<Date> removalDate;
	private List<MMModelEntity> nextVersions;
	private Optional<MMModelEntity> previousVersion;
	private Optional<String> objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return container;
	}

	@Override
	public MetamodelType<? extends MMRate> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMRate> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMRate.class);
	}

	/**
	 * specifies the ratio between the base value and the actual value
	 */
	public Double getBaseValue() {
		return baseValue;
	}

	/**
	 * specifies unit code required to qualify this rate
	 */
	public Optional<String> getBaseUnitCode() {
		return baseUnitCode;
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