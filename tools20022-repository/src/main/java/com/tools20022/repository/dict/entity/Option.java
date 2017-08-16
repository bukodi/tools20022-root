package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Derivative;
import com.tools20022.repository.dict.codeset.AssignmentMethodCode;
import com.tools20022.repository.dict.codeset.SettleStyleCode;
import com.tools20022.repository.dict.codeset.StandardisationCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.UnderlyingTypeCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.SecuritiesConversion;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.SecuritiesOptionTrade;
import com.tools20022.repository.dict.codeset.SettlementTypeCode;
import com.tools20022.repository.dict.datatype.Max4AlphaNumericText;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.OptionStyleCode;
import com.tools20022.repository.dict.entity.CurrencyOption;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Price;
import com.tools20022.repository.dict.codeset.OptionDefinitionTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Contracts which grant to the holder either the privilege to purchase or the
 * privilege to sell the assets specified at a predetermined price or formula at
 * or within a time in the future.
 */
public class Option extends Derivative
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AssignmentMethodCode InstrumentAssignmentMethod;
	private SettleStyleCode SettleStyle;
	private StandardisationCode Standardisation;
	private Number PositionLimit;
	private UnderlyingTypeCode UnderlyingType;
	private YesNoIndicator CoverIndicator;
	private SecuritiesConversion OptionConversionInformation;
	private PercentageRate OptionRatio;
	private SecuritiesOptionTrade SecuritiesOptionTrade;
	private SettlementTypeCode SettlementType;
	private Number StrikeMultiplier;
	private Max4AlphaNumericText ExpiryLocation;
	private ISODate FinalSettlementDate;
	private OptionStyleCode OptionStyle;
	private CurrencyOption CurrencyOption;
	private ISODateTime EarliestExerciseDate;
	private Number SettlementDays;
	private Price StrikePrice;
	private ISODateTime OptionStartDate;
	private ISODateTime ExpiryDateAndTime;
	private OptionDefinitionTypeCode OptionType;
	private Number StrikeValue;
	private Max35Text SettlementPeriodType;

	public AssignmentMethodCode getInstrumentAssignmentMethod() {
		return InstrumentAssignmentMethod;
	}

	public void setInstrumentAssignmentMethod(
			AssignmentMethodCode InstrumentAssignmentMethod) {
		this.InstrumentAssignmentMethod = InstrumentAssignmentMethod;
	}

	public SettleStyleCode getSettleStyle() {
		return SettleStyle;
	}

	public void setSettleStyle(SettleStyleCode SettleStyle) {
		this.SettleStyle = SettleStyle;
	}

	public StandardisationCode getStandardisation() {
		return Standardisation;
	}

	public void setStandardisation(StandardisationCode Standardisation) {
		this.Standardisation = Standardisation;
	}

	public Number getPositionLimit() {
		return PositionLimit;
	}

	public void setPositionLimit(Number PositionLimit) {
		this.PositionLimit = PositionLimit;
	}

	public UnderlyingTypeCode getUnderlyingType() {
		return UnderlyingType;
	}

	public void setUnderlyingType(UnderlyingTypeCode UnderlyingType) {
		this.UnderlyingType = UnderlyingType;
	}

	public YesNoIndicator getCoverIndicator() {
		return CoverIndicator;
	}

	public void setCoverIndicator(YesNoIndicator CoverIndicator) {
		this.CoverIndicator = CoverIndicator;
	}

	public SecuritiesConversion getOptionConversionInformation() {
		return OptionConversionInformation;
	}

	public void setOptionConversionInformation(
			SecuritiesConversion OptionConversionInformation) {
		this.OptionConversionInformation = OptionConversionInformation;
	}

	public PercentageRate getOptionRatio() {
		return OptionRatio;
	}

	public void setOptionRatio(PercentageRate OptionRatio) {
		this.OptionRatio = OptionRatio;
	}

	public SecuritiesOptionTrade getSecuritiesOptionTrade() {
		return SecuritiesOptionTrade;
	}

	public void setSecuritiesOptionTrade(
			SecuritiesOptionTrade SecuritiesOptionTrade) {
		this.SecuritiesOptionTrade = SecuritiesOptionTrade;
	}

	public SettlementTypeCode getSettlementType() {
		return SettlementType;
	}

	public void setSettlementType(SettlementTypeCode SettlementType) {
		this.SettlementType = SettlementType;
	}

	public Number getStrikeMultiplier() {
		return StrikeMultiplier;
	}

	public void setStrikeMultiplier(Number StrikeMultiplier) {
		this.StrikeMultiplier = StrikeMultiplier;
	}

	public Max4AlphaNumericText getExpiryLocation() {
		return ExpiryLocation;
	}

	public void setExpiryLocation(Max4AlphaNumericText ExpiryLocation) {
		this.ExpiryLocation = ExpiryLocation;
	}

	public ISODate getFinalSettlementDate() {
		return FinalSettlementDate;
	}

	public void setFinalSettlementDate(ISODate FinalSettlementDate) {
		this.FinalSettlementDate = FinalSettlementDate;
	}

	public OptionStyleCode getOptionStyle() {
		return OptionStyle;
	}

	public void setOptionStyle(OptionStyleCode OptionStyle) {
		this.OptionStyle = OptionStyle;
	}

	public CurrencyOption getCurrencyOption() {
		return CurrencyOption;
	}

	public void setCurrencyOption(CurrencyOption CurrencyOption) {
		this.CurrencyOption = CurrencyOption;
	}

	public ISODateTime getEarliestExerciseDate() {
		return EarliestExerciseDate;
	}

	public void setEarliestExerciseDate(ISODateTime EarliestExerciseDate) {
		this.EarliestExerciseDate = EarliestExerciseDate;
	}

	public Number getSettlementDays() {
		return SettlementDays;
	}

	public void setSettlementDays(Number SettlementDays) {
		this.SettlementDays = SettlementDays;
	}

	public Price getStrikePrice() {
		return StrikePrice;
	}

	public void setStrikePrice(Price StrikePrice) {
		this.StrikePrice = StrikePrice;
	}

	public ISODateTime getOptionStartDate() {
		return OptionStartDate;
	}

	public void setOptionStartDate(ISODateTime OptionStartDate) {
		this.OptionStartDate = OptionStartDate;
	}

	public ISODateTime getExpiryDateAndTime() {
		return ExpiryDateAndTime;
	}

	public void setExpiryDateAndTime(ISODateTime ExpiryDateAndTime) {
		this.ExpiryDateAndTime = ExpiryDateAndTime;
	}

	public OptionDefinitionTypeCode getOptionType() {
		return OptionType;
	}

	public void setOptionType(OptionDefinitionTypeCode OptionType) {
		this.OptionType = OptionType;
	}

	public Number getStrikeValue() {
		return StrikeValue;
	}

	public void setStrikeValue(Number StrikeValue) {
		this.StrikeValue = StrikeValue;
	}

	public Max35Text getSettlementPeriodType() {
		return SettlementPeriodType;
	}

	public void setSettlementPeriodType(Max35Text SettlementPeriodType) {
		this.SettlementPeriodType = SettlementPeriodType;
	}
}