package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.codeset.TaxableIncomePerShareCalculatedCode;
import com.tools20022.repository.dict.codeset.EUCapitalGainCode;
import com.tools20022.repository.dict.codeset.EUDividendStatusCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.StampDutyTypeCode;
import com.tools20022.repository.dict.datatype.Max4AlphaNumericText;
import com.tools20022.repository.dict.entity.TaxVoucher;
import com.tools20022.repository.dict.entity.RateAndAmount;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.TEFRARulesCode;
import com.tools20022.repository.dict.entity.Jurisdiction;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 */
public class SecuritiesTax extends Tax {

	private ActiveCurrencyAndAmount TaxableIncomePerShare;
	private TaxableIncomePerShareCalculatedCode TaxableIncomePerShareCalculated;
	private EUCapitalGainCode EUCapitalGain;
	private EUDividendStatusCode EUDividendStatus;
	private CurrencyAndAmount TaxableIncomePerDividend;
	private StampDutyTypeCode StampDutyType;
	private Max4AlphaNumericText StampDutyTaxBasis;
	private TaxVoucher TaxVoucher;
	private ActiveCurrencyAndAmount TaxableIncomePerDividendShare;
	private RateAndAmount RelatedTax;
	private Max15NumericText TaxLotNumber;
	private Security Security;
	private YesNoIndicator TaxRuleExemptIndicator;
	private DateTimePeriod EffectivePeriod;
	private PercentageRate FrankedRate;
	private TEFRARulesCode TEFRARule;
	private Jurisdiction Jurisdiction;

	public ActiveCurrencyAndAmount getTaxableIncomePerShare() {
		return TaxableIncomePerShare;
	}

	public void setTaxableIncomePerShare(
			ActiveCurrencyAndAmount TaxableIncomePerShare) {
		this.TaxableIncomePerShare = TaxableIncomePerShare;
	}

	public TaxableIncomePerShareCalculatedCode getTaxableIncomePerShareCalculated() {
		return TaxableIncomePerShareCalculated;
	}

	public void setTaxableIncomePerShareCalculated(
			TaxableIncomePerShareCalculatedCode TaxableIncomePerShareCalculated) {
		this.TaxableIncomePerShareCalculated = TaxableIncomePerShareCalculated;
	}

	public EUCapitalGainCode getEUCapitalGain() {
		return EUCapitalGain;
	}

	public void setEUCapitalGain(EUCapitalGainCode EUCapitalGain) {
		this.EUCapitalGain = EUCapitalGain;
	}

	public EUDividendStatusCode getEUDividendStatus() {
		return EUDividendStatus;
	}

	public void setEUDividendStatus(EUDividendStatusCode EUDividendStatus) {
		this.EUDividendStatus = EUDividendStatus;
	}

	public CurrencyAndAmount getTaxableIncomePerDividend() {
		return TaxableIncomePerDividend;
	}

	public void setTaxableIncomePerDividend(
			CurrencyAndAmount TaxableIncomePerDividend) {
		this.TaxableIncomePerDividend = TaxableIncomePerDividend;
	}

	public StampDutyTypeCode getStampDutyType() {
		return StampDutyType;
	}

	public void setStampDutyType(StampDutyTypeCode StampDutyType) {
		this.StampDutyType = StampDutyType;
	}

	public Max4AlphaNumericText getStampDutyTaxBasis() {
		return StampDutyTaxBasis;
	}

	public void setStampDutyTaxBasis(Max4AlphaNumericText StampDutyTaxBasis) {
		this.StampDutyTaxBasis = StampDutyTaxBasis;
	}

	public TaxVoucher getTaxVoucher() {
		return TaxVoucher;
	}

	public void setTaxVoucher(TaxVoucher TaxVoucher) {
		this.TaxVoucher = TaxVoucher;
	}

	public ActiveCurrencyAndAmount getTaxableIncomePerDividendShare() {
		return TaxableIncomePerDividendShare;
	}

	public void setTaxableIncomePerDividendShare(
			ActiveCurrencyAndAmount TaxableIncomePerDividendShare) {
		this.TaxableIncomePerDividendShare = TaxableIncomePerDividendShare;
	}

	public RateAndAmount getRelatedTax() {
		return RelatedTax;
	}

	public void setRelatedTax(RateAndAmount RelatedTax) {
		this.RelatedTax = RelatedTax;
	}

	public Max15NumericText getTaxLotNumber() {
		return TaxLotNumber;
	}

	public void setTaxLotNumber(Max15NumericText TaxLotNumber) {
		this.TaxLotNumber = TaxLotNumber;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public YesNoIndicator getTaxRuleExemptIndicator() {
		return TaxRuleExemptIndicator;
	}

	public void setTaxRuleExemptIndicator(YesNoIndicator TaxRuleExemptIndicator) {
		this.TaxRuleExemptIndicator = TaxRuleExemptIndicator;
	}

	public DateTimePeriod getEffectivePeriod() {
		return EffectivePeriod;
	}

	public void setEffectivePeriod(DateTimePeriod EffectivePeriod) {
		this.EffectivePeriod = EffectivePeriod;
	}

	public PercentageRate getFrankedRate() {
		return FrankedRate;
	}

	public void setFrankedRate(PercentageRate FrankedRate) {
		this.FrankedRate = FrankedRate;
	}

	public TEFRARulesCode getTEFRARule() {
		return TEFRARule;
	}

	public void setTEFRARule(TEFRARulesCode TEFRARule) {
		this.TEFRARule = TEFRARule;
	}

	public Jurisdiction getJurisdiction() {
		return Jurisdiction;
	}

	public void setJurisdiction(Jurisdiction Jurisdiction) {
		this.Jurisdiction = Jurisdiction;
	}
}