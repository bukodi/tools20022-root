package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.SecuritiesClearing;

/**
 * Process in which the buyer/CCP repurchases shares of stock because the seller
 * either failed to deliver the shares or did not deliver them in a timely
 * fashion. The seller has to make up the price difference if the new shares are
 * more expensive than originally agreed to.
 */
public class BuyIn extends ObligationFulfilment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesQuantity SecuritiesCompensation;
	private ISODate BuyinDate;
	private SecuritiesPricing BuyInPrice;
	private ActiveCurrencyAndAmount Fees;
	private PaymentObligation CashCompensation;
	private SecuritiesClearing RelatedSecuritiesClearingProcess;

	public SecuritiesQuantity getSecuritiesCompensation() {
		return SecuritiesCompensation;
	}

	public void setSecuritiesCompensation(
			SecuritiesQuantity SecuritiesCompensation) {
		this.SecuritiesCompensation = SecuritiesCompensation;
	}

	public ISODate getBuyinDate() {
		return BuyinDate;
	}

	public void setBuyinDate(ISODate BuyinDate) {
		this.BuyinDate = BuyinDate;
	}

	public SecuritiesPricing getBuyInPrice() {
		return BuyInPrice;
	}

	public void setBuyInPrice(SecuritiesPricing BuyInPrice) {
		this.BuyInPrice = BuyInPrice;
	}

	public ActiveCurrencyAndAmount getFees() {
		return Fees;
	}

	public void setFees(ActiveCurrencyAndAmount Fees) {
		this.Fees = Fees;
	}

	public PaymentObligation getCashCompensation() {
		return CashCompensation;
	}

	public void setCashCompensation(PaymentObligation CashCompensation) {
		this.CashCompensation = CashCompensation;
	}

	public SecuritiesClearing getRelatedSecuritiesClearingProcess() {
		return RelatedSecuritiesClearingProcess;
	}

	public void setRelatedSecuritiesClearingProcess(
			SecuritiesClearing RelatedSecuritiesClearingProcess) {
		this.RelatedSecuritiesClearingProcess = RelatedSecuritiesClearingProcess;
	}
}