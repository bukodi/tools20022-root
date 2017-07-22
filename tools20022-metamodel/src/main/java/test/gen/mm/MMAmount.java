package test.gen.mm;

import test.gen.mm.MMDecimal;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import test.gen.mm.MMDataType;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import test.gen.mm.StandardMetamodel2013;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMDataDictionary;
import test.gen.mm.MMSemanticMarkup;
import java.util.List;
import test.gen.mm.MMDoclet;
import test.gen.mm.MMConstraint;
import test.gen.mm.MMRegistrationStatus;
import java.util.Date;
import test.gen.mm.MMModelEntity;

/**
 * A number of monetary units specified in a currency where the unit of currency
 * is explicit or implied.
 */
public class MMAmount extends MMDecimal {

	private GeneratedMetamodelBean container;
	private Optional<MMDataType> currencyIdentifierSet;
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

	public static interface Members extends MMDecimal.Members {
		/**
		 * specifies the allowed currencies that can be used to qualify this
		 * amount
		 */
		MetamodelAttribute<MMAmount, Optional<MMDataType>> currencyIdentifierSet = newAttribute();
	}

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