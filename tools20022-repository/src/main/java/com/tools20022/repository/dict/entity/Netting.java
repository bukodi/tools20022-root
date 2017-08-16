package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.entity.Price;
import com.tools20022.repository.dict.entity.SecuritiesClearing;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Offset of payables against receivables to reduce credit exposure to a
 * counterparty.
 */
public class Netting extends ObligationFulfilment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Price AverageDealPrice;
	private SecuritiesClearing RelatedSecuritiesClearingProcess;
	private ActiveCurrencyAndAmount NetPositionAmount;
	private DebitCreditCode AmountDirection;
	private SecuritiesQuantity NetQuantity;
	private CurrencyAndAmount PositionAmount;

	public Price getAverageDealPrice() {
		return AverageDealPrice;
	}

	public void setAverageDealPrice(Price AverageDealPrice) {
		this.AverageDealPrice = AverageDealPrice;
	}

	public SecuritiesClearing getRelatedSecuritiesClearingProcess() {
		return RelatedSecuritiesClearingProcess;
	}

	public void setRelatedSecuritiesClearingProcess(
			SecuritiesClearing RelatedSecuritiesClearingProcess) {
		this.RelatedSecuritiesClearingProcess = RelatedSecuritiesClearingProcess;
	}

	public ActiveCurrencyAndAmount getNetPositionAmount() {
		return NetPositionAmount;
	}

	public void setNetPositionAmount(ActiveCurrencyAndAmount NetPositionAmount) {
		this.NetPositionAmount = NetPositionAmount;
	}

	public DebitCreditCode getAmountDirection() {
		return AmountDirection;
	}

	public void setAmountDirection(DebitCreditCode AmountDirection) {
		this.AmountDirection = AmountDirection;
	}

	public SecuritiesQuantity getNetQuantity() {
		return NetQuantity;
	}

	public void setNetQuantity(SecuritiesQuantity NetQuantity) {
		this.NetQuantity = NetQuantity;
	}

	public CurrencyAndAmount getPositionAmount() {
		return PositionAmount;
	}

	public void setPositionAmount(CurrencyAndAmount PositionAmount) {
		this.PositionAmount = PositionAmount;
	}
}