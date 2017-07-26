package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.RateAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.codeset.CorporateActionCalculationMethodCode;
import com.tools20022.repository.dict.entity.CorporateActionEvent;

/**
 * Specifies the conditions under which securities can be acquired as part of a
 * corporate action.
 */
public class BiddingConditions {

	private PercentageRate ProposedRate;
	private PercentageRate OversubscriptionRate;
	private Max350Text InformationToComplyWith;
	private ISODateTime SubscriptionCostDebitDate;
	private RateAndAmount MaximumAllowedOverSubscription;
	private PercentageRate ProrationRate;
	private RateAndAmount ApplicableRate;
	private SecuritiesQuantity FrontEndOddLotQuantity;
	private SecuritiesQuantity BackEndOddLotQuantity;
	private PercentageRate TransformationRate;
	private ISODateTime ProrationDate;
	private DateTimePeriod CompulsoryPurchasePeriod;
	private PercentageRate PercentageSought;
	private CurrencyAndAmount BidInterval;
	private SecuritiesPricing MaximumPrice;
	private SecuritiesPricing MinimumPrice;
	private SecuritiesQuantity MaximumQuantity;
	private SecuritiesQuantity MinimumQuantitySought;
	private SecuritiesQuantity BaseDenomination;
	private CorporateActionCalculationMethodCode CalculationMethod;
	private CurrencyAndAmount AdditionalSubscriptionCost;
	private CorporateActionEvent Event;

	public PercentageRate getProposedRate() {
		return ProposedRate;
	}

	public void setProposedRate(PercentageRate ProposedRate) {
		this.ProposedRate = ProposedRate;
	}

	public PercentageRate getOversubscriptionRate() {
		return OversubscriptionRate;
	}

	public void setOversubscriptionRate(PercentageRate OversubscriptionRate) {
		this.OversubscriptionRate = OversubscriptionRate;
	}

	public Max350Text getInformationToComplyWith() {
		return InformationToComplyWith;
	}

	public void setInformationToComplyWith(Max350Text InformationToComplyWith) {
		this.InformationToComplyWith = InformationToComplyWith;
	}

	public ISODateTime getSubscriptionCostDebitDate() {
		return SubscriptionCostDebitDate;
	}

	public void setSubscriptionCostDebitDate(
			ISODateTime SubscriptionCostDebitDate) {
		this.SubscriptionCostDebitDate = SubscriptionCostDebitDate;
	}

	public RateAndAmount getMaximumAllowedOverSubscription() {
		return MaximumAllowedOverSubscription;
	}

	public void setMaximumAllowedOverSubscription(
			RateAndAmount MaximumAllowedOverSubscription) {
		this.MaximumAllowedOverSubscription = MaximumAllowedOverSubscription;
	}

	public PercentageRate getProrationRate() {
		return ProrationRate;
	}

	public void setProrationRate(PercentageRate ProrationRate) {
		this.ProrationRate = ProrationRate;
	}

	public RateAndAmount getApplicableRate() {
		return ApplicableRate;
	}

	public void setApplicableRate(RateAndAmount ApplicableRate) {
		this.ApplicableRate = ApplicableRate;
	}

	public SecuritiesQuantity getFrontEndOddLotQuantity() {
		return FrontEndOddLotQuantity;
	}

	public void setFrontEndOddLotQuantity(
			SecuritiesQuantity FrontEndOddLotQuantity) {
		this.FrontEndOddLotQuantity = FrontEndOddLotQuantity;
	}

	public SecuritiesQuantity getBackEndOddLotQuantity() {
		return BackEndOddLotQuantity;
	}

	public void setBackEndOddLotQuantity(
			SecuritiesQuantity BackEndOddLotQuantity) {
		this.BackEndOddLotQuantity = BackEndOddLotQuantity;
	}

	public PercentageRate getTransformationRate() {
		return TransformationRate;
	}

	public void setTransformationRate(PercentageRate TransformationRate) {
		this.TransformationRate = TransformationRate;
	}

	public ISODateTime getProrationDate() {
		return ProrationDate;
	}

	public void setProrationDate(ISODateTime ProrationDate) {
		this.ProrationDate = ProrationDate;
	}

	public DateTimePeriod getCompulsoryPurchasePeriod() {
		return CompulsoryPurchasePeriod;
	}

	public void setCompulsoryPurchasePeriod(
			DateTimePeriod CompulsoryPurchasePeriod) {
		this.CompulsoryPurchasePeriod = CompulsoryPurchasePeriod;
	}

	public PercentageRate getPercentageSought() {
		return PercentageSought;
	}

	public void setPercentageSought(PercentageRate PercentageSought) {
		this.PercentageSought = PercentageSought;
	}

	public CurrencyAndAmount getBidInterval() {
		return BidInterval;
	}

	public void setBidInterval(CurrencyAndAmount BidInterval) {
		this.BidInterval = BidInterval;
	}

	public SecuritiesPricing getMaximumPrice() {
		return MaximumPrice;
	}

	public void setMaximumPrice(SecuritiesPricing MaximumPrice) {
		this.MaximumPrice = MaximumPrice;
	}

	public SecuritiesPricing getMinimumPrice() {
		return MinimumPrice;
	}

	public void setMinimumPrice(SecuritiesPricing MinimumPrice) {
		this.MinimumPrice = MinimumPrice;
	}

	public SecuritiesQuantity getMaximumQuantity() {
		return MaximumQuantity;
	}

	public void setMaximumQuantity(SecuritiesQuantity MaximumQuantity) {
		this.MaximumQuantity = MaximumQuantity;
	}

	public SecuritiesQuantity getMinimumQuantitySought() {
		return MinimumQuantitySought;
	}

	public void setMinimumQuantitySought(
			SecuritiesQuantity MinimumQuantitySought) {
		this.MinimumQuantitySought = MinimumQuantitySought;
	}

	public SecuritiesQuantity getBaseDenomination() {
		return BaseDenomination;
	}

	public void setBaseDenomination(SecuritiesQuantity BaseDenomination) {
		this.BaseDenomination = BaseDenomination;
	}

	public CorporateActionCalculationMethodCode getCalculationMethod() {
		return CalculationMethod;
	}

	public void setCalculationMethod(
			CorporateActionCalculationMethodCode CalculationMethod) {
		this.CalculationMethod = CalculationMethod;
	}

	public CurrencyAndAmount getAdditionalSubscriptionCost() {
		return AdditionalSubscriptionCost;
	}

	public void setAdditionalSubscriptionCost(
			CurrencyAndAmount AdditionalSubscriptionCost) {
		this.AdditionalSubscriptionCost = AdditionalSubscriptionCost;
	}

	public CorporateActionEvent getEvent() {
		return Event;
	}

	public void setEvent(CorporateActionEvent Event) {
		this.Event = Event;
	}
}