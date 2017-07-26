package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.IncentivePremium;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Dividend;
import com.tools20022.repository.dict.codeset.CorporateActionOptionCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;

/**
 * Distributions in cash and/or securities following a corporate event.
 */
public class Distribution {

	private DateTimePeriod ExercisePeriod;
	private DateTimePeriod OfferPeriod;
	private DateTimePeriod TradingPeriod;
	private DateTimePeriod BlockingPeriod;
	private DateTimePeriod InterestPeriod;
	private Tax DistributionTax;
	private SecuritiesPricing OfferPrice;
	private IncentivePremium IncentivePremium;
	private ISODateTime EffectiveDate;
	private Max350Text EventConditions;
	private ISODateTime ExDate;
	private PercentageRate GrossRate;
	private ISODateTime MeetingDate;
	private PercentageRate NetRate;
	private CurrencyAndAmount NewFaceValue;
	private CurrencyAndAmount NewParValue;
	private ISODateTime PaymentDate;
	private Dividend Dividend;
	private CorporateActionOptionCode CorporateActionOption;
	private CurrencyCode CurrencyOption;
	private CurrencyAndAmount DecreaseAmount;
	private PercentageRate DecreaseRate;
	private ISODateTime OfferPriceFixingDate;

	public DateTimePeriod getExercisePeriod() {
		return ExercisePeriod;
	}

	public void setExercisePeriod(DateTimePeriod ExercisePeriod) {
		this.ExercisePeriod = ExercisePeriod;
	}

	public DateTimePeriod getOfferPeriod() {
		return OfferPeriod;
	}

	public void setOfferPeriod(DateTimePeriod OfferPeriod) {
		this.OfferPeriod = OfferPeriod;
	}

	public DateTimePeriod getTradingPeriod() {
		return TradingPeriod;
	}

	public void setTradingPeriod(DateTimePeriod TradingPeriod) {
		this.TradingPeriod = TradingPeriod;
	}

	public DateTimePeriod getBlockingPeriod() {
		return BlockingPeriod;
	}

	public void setBlockingPeriod(DateTimePeriod BlockingPeriod) {
		this.BlockingPeriod = BlockingPeriod;
	}

	public DateTimePeriod getInterestPeriod() {
		return InterestPeriod;
	}

	public void setInterestPeriod(DateTimePeriod InterestPeriod) {
		this.InterestPeriod = InterestPeriod;
	}

	public Tax getDistributionTax() {
		return DistributionTax;
	}

	public void setDistributionTax(Tax DistributionTax) {
		this.DistributionTax = DistributionTax;
	}

	public SecuritiesPricing getOfferPrice() {
		return OfferPrice;
	}

	public void setOfferPrice(SecuritiesPricing OfferPrice) {
		this.OfferPrice = OfferPrice;
	}

	public IncentivePremium getIncentivePremium() {
		return IncentivePremium;
	}

	public void setIncentivePremium(IncentivePremium IncentivePremium) {
		this.IncentivePremium = IncentivePremium;
	}

	public ISODateTime getEffectiveDate() {
		return EffectiveDate;
	}

	public void setEffectiveDate(ISODateTime EffectiveDate) {
		this.EffectiveDate = EffectiveDate;
	}

	public Max350Text getEventConditions() {
		return EventConditions;
	}

	public void setEventConditions(Max350Text EventConditions) {
		this.EventConditions = EventConditions;
	}

	public ISODateTime getExDate() {
		return ExDate;
	}

	public void setExDate(ISODateTime ExDate) {
		this.ExDate = ExDate;
	}

	public PercentageRate getGrossRate() {
		return GrossRate;
	}

	public void setGrossRate(PercentageRate GrossRate) {
		this.GrossRate = GrossRate;
	}

	public ISODateTime getMeetingDate() {
		return MeetingDate;
	}

	public void setMeetingDate(ISODateTime MeetingDate) {
		this.MeetingDate = MeetingDate;
	}

	public PercentageRate getNetRate() {
		return NetRate;
	}

	public void setNetRate(PercentageRate NetRate) {
		this.NetRate = NetRate;
	}

	public CurrencyAndAmount getNewFaceValue() {
		return NewFaceValue;
	}

	public void setNewFaceValue(CurrencyAndAmount NewFaceValue) {
		this.NewFaceValue = NewFaceValue;
	}

	public CurrencyAndAmount getNewParValue() {
		return NewParValue;
	}

	public void setNewParValue(CurrencyAndAmount NewParValue) {
		this.NewParValue = NewParValue;
	}

	public ISODateTime getPaymentDate() {
		return PaymentDate;
	}

	public void setPaymentDate(ISODateTime PaymentDate) {
		this.PaymentDate = PaymentDate;
	}

	public Dividend getDividend() {
		return Dividend;
	}

	public void setDividend(Dividend Dividend) {
		this.Dividend = Dividend;
	}

	public CorporateActionOptionCode getCorporateActionOption() {
		return CorporateActionOption;
	}

	public void setCorporateActionOption(
			CorporateActionOptionCode CorporateActionOption) {
		this.CorporateActionOption = CorporateActionOption;
	}

	public CurrencyCode getCurrencyOption() {
		return CurrencyOption;
	}

	public void setCurrencyOption(CurrencyCode CurrencyOption) {
		this.CurrencyOption = CurrencyOption;
	}

	public CurrencyAndAmount getDecreaseAmount() {
		return DecreaseAmount;
	}

	public void setDecreaseAmount(CurrencyAndAmount DecreaseAmount) {
		this.DecreaseAmount = DecreaseAmount;
	}

	public PercentageRate getDecreaseRate() {
		return DecreaseRate;
	}

	public void setDecreaseRate(PercentageRate DecreaseRate) {
		this.DecreaseRate = DecreaseRate;
	}

	public ISODateTime getOfferPriceFixingDate() {
		return OfferPriceFixingDate;
	}

	public void setOfferPriceFixingDate(ISODateTime OfferPriceFixingDate) {
		this.OfferPriceFixingDate = OfferPriceFixingDate;
	}
}