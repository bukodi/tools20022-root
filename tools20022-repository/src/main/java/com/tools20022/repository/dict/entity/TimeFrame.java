package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max350Text;

/**
 * TimeFrame or period concept that allows definition of a period as number of
 * days before or after a defined activity.
 */
public class TimeFrame {

	private Number TradeMinus;
	private Number RenunciationMinus;
	private InvestmentFundClassProcessingCharacteristics SubscriptionSettlementRelatedFundProcessing;
	private Number TradePlus;
	private Number RenunciationPlus;
	private YesNoIndicator Prepayment;
	private Max350Text OtherTimeFrameDescription;
	private InvestmentFundClassProcessingCharacteristics RelatedProcessingCharacteristics;

	public Number getTradeMinus() {
		return TradeMinus;
	}

	public void setTradeMinus(Number TradeMinus) {
		this.TradeMinus = TradeMinus;
	}

	public Number getRenunciationMinus() {
		return RenunciationMinus;
	}

	public void setRenunciationMinus(Number RenunciationMinus) {
		this.RenunciationMinus = RenunciationMinus;
	}

	public InvestmentFundClassProcessingCharacteristics getSubscriptionSettlementRelatedFundProcessing() {
		return SubscriptionSettlementRelatedFundProcessing;
	}

	public void setSubscriptionSettlementRelatedFundProcessing(
			InvestmentFundClassProcessingCharacteristics SubscriptionSettlementRelatedFundProcessing) {
		this.SubscriptionSettlementRelatedFundProcessing = SubscriptionSettlementRelatedFundProcessing;
	}

	public Number getTradePlus() {
		return TradePlus;
	}

	public void setTradePlus(Number TradePlus) {
		this.TradePlus = TradePlus;
	}

	public Number getRenunciationPlus() {
		return RenunciationPlus;
	}

	public void setRenunciationPlus(Number RenunciationPlus) {
		this.RenunciationPlus = RenunciationPlus;
	}

	public YesNoIndicator getPrepayment() {
		return Prepayment;
	}

	public void setPrepayment(YesNoIndicator Prepayment) {
		this.Prepayment = Prepayment;
	}

	public Max350Text getOtherTimeFrameDescription() {
		return OtherTimeFrameDescription;
	}

	public void setOtherTimeFrameDescription(
			Max350Text OtherTimeFrameDescription) {
		this.OtherTimeFrameDescription = OtherTimeFrameDescription;
	}

	public InvestmentFundClassProcessingCharacteristics getRelatedProcessingCharacteristics() {
		return RelatedProcessingCharacteristics;
	}

	public void setRelatedProcessingCharacteristics(
			InvestmentFundClassProcessingCharacteristics RelatedProcessingCharacteristics) {
		this.RelatedProcessingCharacteristics = RelatedProcessingCharacteristics;
	}
}