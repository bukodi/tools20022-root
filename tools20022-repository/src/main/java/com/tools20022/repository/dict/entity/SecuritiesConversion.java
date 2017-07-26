package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.ConversionTypeCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.UnderlyingRatio;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.entity.Option;
import com.tools20022.repository.dict.codeset.BusinessDayConventionCode;
import com.tools20022.repository.dict.codeset.ChoiceCode;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.CorporateActionOptionCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.FinancialCenterCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.NoticePeriodTypeCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.codeset.PartyTypeCode;

/**
 * Conversion exchange of securities, generally convertible bonds or preferred
 * equities, into another form of securities, usually common equities.
 */
public class SecuritiesConversion {

	private SecuritiesPricing ConversionPrice;
	private ISODateTime ConversionDate;
	private SecuritiesQuantity MinimumExercisableQuantity;
	private SecuritiesQuantity MinimumExercisableMultipleQuantity;
	private SecuritiesQuantity MaximumExercisableQuantity;
	private ConversionTypeCode ConversionType;
	private DateTimePeriod ConversionPeriod;
	private SecuritiesQuantity ConversionRatioDenominator;
	private SecuritiesQuantity ConversionRatioNumerator;
	private UnderlyingRatio Ratio;
	private CurrencyExchange ConversionUnitCurrency;
	private Option RelatedOption;
	private BusinessDayConventionCode BusinessDayConvention;
	private ChoiceCode ConversionChoice;
	private BaseOneRate ConversionFixedExchangeRate;
	private CurrencyAndAmount ConversionMarginAmount;
	private CorporateActionOptionCode ConversionOption;
	private CurrencyCode ConversionQuotedCurrency;
	private FinancialCenterCode FinancialCenter;
	private Number MinimumNoticeDays;
	private NoticePeriodTypeCode NoticePeriodType;
	private YesNoIndicator ProtectionAgainstDilutionIndicator;
	private YesNoIndicator ReverseConversionIndicator;
	private Security SecurityIdentification;
	private PartyTypeCode PartyType;
	private BaseOneRate ContractSize;

	public SecuritiesPricing getConversionPrice() {
		return ConversionPrice;
	}

	public void setConversionPrice(SecuritiesPricing ConversionPrice) {
		this.ConversionPrice = ConversionPrice;
	}

	public ISODateTime getConversionDate() {
		return ConversionDate;
	}

	public void setConversionDate(ISODateTime ConversionDate) {
		this.ConversionDate = ConversionDate;
	}

	public SecuritiesQuantity getMinimumExercisableQuantity() {
		return MinimumExercisableQuantity;
	}

	public void setMinimumExercisableQuantity(
			SecuritiesQuantity MinimumExercisableQuantity) {
		this.MinimumExercisableQuantity = MinimumExercisableQuantity;
	}

	public SecuritiesQuantity getMinimumExercisableMultipleQuantity() {
		return MinimumExercisableMultipleQuantity;
	}

	public void setMinimumExercisableMultipleQuantity(
			SecuritiesQuantity MinimumExercisableMultipleQuantity) {
		this.MinimumExercisableMultipleQuantity = MinimumExercisableMultipleQuantity;
	}

	public SecuritiesQuantity getMaximumExercisableQuantity() {
		return MaximumExercisableQuantity;
	}

	public void setMaximumExercisableQuantity(
			SecuritiesQuantity MaximumExercisableQuantity) {
		this.MaximumExercisableQuantity = MaximumExercisableQuantity;
	}

	public ConversionTypeCode getConversionType() {
		return ConversionType;
	}

	public void setConversionType(ConversionTypeCode ConversionType) {
		this.ConversionType = ConversionType;
	}

	public DateTimePeriod getConversionPeriod() {
		return ConversionPeriod;
	}

	public void setConversionPeriod(DateTimePeriod ConversionPeriod) {
		this.ConversionPeriod = ConversionPeriod;
	}

	public SecuritiesQuantity getConversionRatioDenominator() {
		return ConversionRatioDenominator;
	}

	public void setConversionRatioDenominator(
			SecuritiesQuantity ConversionRatioDenominator) {
		this.ConversionRatioDenominator = ConversionRatioDenominator;
	}

	public SecuritiesQuantity getConversionRatioNumerator() {
		return ConversionRatioNumerator;
	}

	public void setConversionRatioNumerator(
			SecuritiesQuantity ConversionRatioNumerator) {
		this.ConversionRatioNumerator = ConversionRatioNumerator;
	}

	public UnderlyingRatio getRatio() {
		return Ratio;
	}

	public void setRatio(UnderlyingRatio Ratio) {
		this.Ratio = Ratio;
	}

	public CurrencyExchange getConversionUnitCurrency() {
		return ConversionUnitCurrency;
	}

	public void setConversionUnitCurrency(
			CurrencyExchange ConversionUnitCurrency) {
		this.ConversionUnitCurrency = ConversionUnitCurrency;
	}

	public Option getRelatedOption() {
		return RelatedOption;
	}

	public void setRelatedOption(Option RelatedOption) {
		this.RelatedOption = RelatedOption;
	}

	public BusinessDayConventionCode getBusinessDayConvention() {
		return BusinessDayConvention;
	}

	public void setBusinessDayConvention(
			BusinessDayConventionCode BusinessDayConvention) {
		this.BusinessDayConvention = BusinessDayConvention;
	}

	public ChoiceCode getConversionChoice() {
		return ConversionChoice;
	}

	public void setConversionChoice(ChoiceCode ConversionChoice) {
		this.ConversionChoice = ConversionChoice;
	}

	public BaseOneRate getConversionFixedExchangeRate() {
		return ConversionFixedExchangeRate;
	}

	public void setConversionFixedExchangeRate(
			BaseOneRate ConversionFixedExchangeRate) {
		this.ConversionFixedExchangeRate = ConversionFixedExchangeRate;
	}

	public CurrencyAndAmount getConversionMarginAmount() {
		return ConversionMarginAmount;
	}

	public void setConversionMarginAmount(
			CurrencyAndAmount ConversionMarginAmount) {
		this.ConversionMarginAmount = ConversionMarginAmount;
	}

	public CorporateActionOptionCode getConversionOption() {
		return ConversionOption;
	}

	public void setConversionOption(CorporateActionOptionCode ConversionOption) {
		this.ConversionOption = ConversionOption;
	}

	public CurrencyCode getConversionQuotedCurrency() {
		return ConversionQuotedCurrency;
	}

	public void setConversionQuotedCurrency(
			CurrencyCode ConversionQuotedCurrency) {
		this.ConversionQuotedCurrency = ConversionQuotedCurrency;
	}

	public FinancialCenterCode getFinancialCenter() {
		return FinancialCenter;
	}

	public void setFinancialCenter(FinancialCenterCode FinancialCenter) {
		this.FinancialCenter = FinancialCenter;
	}

	public Number getMinimumNoticeDays() {
		return MinimumNoticeDays;
	}

	public void setMinimumNoticeDays(Number MinimumNoticeDays) {
		this.MinimumNoticeDays = MinimumNoticeDays;
	}

	public NoticePeriodTypeCode getNoticePeriodType() {
		return NoticePeriodType;
	}

	public void setNoticePeriodType(NoticePeriodTypeCode NoticePeriodType) {
		this.NoticePeriodType = NoticePeriodType;
	}

	public YesNoIndicator getProtectionAgainstDilutionIndicator() {
		return ProtectionAgainstDilutionIndicator;
	}

	public void setProtectionAgainstDilutionIndicator(
			YesNoIndicator ProtectionAgainstDilutionIndicator) {
		this.ProtectionAgainstDilutionIndicator = ProtectionAgainstDilutionIndicator;
	}

	public YesNoIndicator getReverseConversionIndicator() {
		return ReverseConversionIndicator;
	}

	public void setReverseConversionIndicator(
			YesNoIndicator ReverseConversionIndicator) {
		this.ReverseConversionIndicator = ReverseConversionIndicator;
	}

	public Security getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(Security SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public PartyTypeCode getPartyType() {
		return PartyType;
	}

	public void setPartyType(PartyTypeCode PartyType) {
		this.PartyType = PartyType;
	}

	public BaseOneRate getContractSize() {
		return ContractSize;
	}

	public void setContractSize(BaseOneRate ContractSize) {
		this.ContractSize = ContractSize;
	}
}