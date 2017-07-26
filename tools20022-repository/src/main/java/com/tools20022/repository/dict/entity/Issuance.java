package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.RateAndAmount;
import com.tools20022.repository.dict.datatype.Max256Text;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.TradingMarket;
import com.tools20022.repository.dict.codeset.GlobalNoteCode;
import com.tools20022.repository.dict.entity.Capital;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Preparation/bringing to market of a security (also known as primary market or
 * Initial Public Offering (IPO) issuance).
 */
public class Issuance {

	private ISODateTime IssueDate;
	private CurrencyAndAmount IssueDiscountAllowance;
	private RateAndAmount InterestShortfall;
	private RateAndAmount RealisedLoss;
	private Max256Text Purpose;
	private Number IssueSize;
	private SecuritiesQuantity IssueNominalAmount;
	private CorporateActionEvent EventInformation;
	private Asset IssuedAsset;
	private SecuritiesPricing OriginalIssueDiscount;
	private TradingMarket IssuePlace;
	private GlobalNoteCode GlobalNoteType;
	private Capital CapitalRaised;
	private DateTimePeriod SubscriptionPeriod;
	private SecuritiesQuantity Minimum;
	private CurrencyAndAmount IssuePrice;

	public ISODateTime getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(ISODateTime IssueDate) {
		this.IssueDate = IssueDate;
	}

	public CurrencyAndAmount getIssueDiscountAllowance() {
		return IssueDiscountAllowance;
	}

	public void setIssueDiscountAllowance(
			CurrencyAndAmount IssueDiscountAllowance) {
		this.IssueDiscountAllowance = IssueDiscountAllowance;
	}

	public RateAndAmount getInterestShortfall() {
		return InterestShortfall;
	}

	public void setInterestShortfall(RateAndAmount InterestShortfall) {
		this.InterestShortfall = InterestShortfall;
	}

	public RateAndAmount getRealisedLoss() {
		return RealisedLoss;
	}

	public void setRealisedLoss(RateAndAmount RealisedLoss) {
		this.RealisedLoss = RealisedLoss;
	}

	public Max256Text getPurpose() {
		return Purpose;
	}

	public void setPurpose(Max256Text Purpose) {
		this.Purpose = Purpose;
	}

	public Number getIssueSize() {
		return IssueSize;
	}

	public void setIssueSize(Number IssueSize) {
		this.IssueSize = IssueSize;
	}

	public SecuritiesQuantity getIssueNominalAmount() {
		return IssueNominalAmount;
	}

	public void setIssueNominalAmount(SecuritiesQuantity IssueNominalAmount) {
		this.IssueNominalAmount = IssueNominalAmount;
	}

	public CorporateActionEvent getEventInformation() {
		return EventInformation;
	}

	public void setEventInformation(CorporateActionEvent EventInformation) {
		this.EventInformation = EventInformation;
	}

	public Asset getIssuedAsset() {
		return IssuedAsset;
	}

	public void setIssuedAsset(Asset IssuedAsset) {
		this.IssuedAsset = IssuedAsset;
	}

	public SecuritiesPricing getOriginalIssueDiscount() {
		return OriginalIssueDiscount;
	}

	public void setOriginalIssueDiscount(SecuritiesPricing OriginalIssueDiscount) {
		this.OriginalIssueDiscount = OriginalIssueDiscount;
	}

	public TradingMarket getIssuePlace() {
		return IssuePlace;
	}

	public void setIssuePlace(TradingMarket IssuePlace) {
		this.IssuePlace = IssuePlace;
	}

	public GlobalNoteCode getGlobalNoteType() {
		return GlobalNoteType;
	}

	public void setGlobalNoteType(GlobalNoteCode GlobalNoteType) {
		this.GlobalNoteType = GlobalNoteType;
	}

	public Capital getCapitalRaised() {
		return CapitalRaised;
	}

	public void setCapitalRaised(Capital CapitalRaised) {
		this.CapitalRaised = CapitalRaised;
	}

	public DateTimePeriod getSubscriptionPeriod() {
		return SubscriptionPeriod;
	}

	public void setSubscriptionPeriod(DateTimePeriod SubscriptionPeriod) {
		this.SubscriptionPeriod = SubscriptionPeriod;
	}

	public SecuritiesQuantity getMinimum() {
		return Minimum;
	}

	public void setMinimum(SecuritiesQuantity Minimum) {
		this.Minimum = Minimum;
	}

	public CurrencyAndAmount getIssuePrice() {
		return IssuePrice;
	}

	public void setIssuePrice(CurrencyAndAmount IssuePrice) {
		this.IssuePrice = IssuePrice;
	}
}