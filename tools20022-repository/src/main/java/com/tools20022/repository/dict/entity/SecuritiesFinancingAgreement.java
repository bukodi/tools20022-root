package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.dict.entity.SecuritiesFinancing;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.TerminationTypeCode;
import com.tools20022.repository.dict.codeset.DeliveryTypeCode;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Contractual details related to the agreement between parties.
 */
public class SecuritiesFinancingAgreement extends Agreement
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesFinancing SecuritiesFinancingTrade;
	private CurrencyCode Currency;
	private TerminationTypeCode TerminationType;
	private DeliveryTypeCode DeliveryType;
	private PercentageRate MarginRatio;

	public SecuritiesFinancing getSecuritiesFinancingTrade() {
		return SecuritiesFinancingTrade;
	}

	public void setSecuritiesFinancingTrade(
			SecuritiesFinancing SecuritiesFinancingTrade) {
		this.SecuritiesFinancingTrade = SecuritiesFinancingTrade;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public TerminationTypeCode getTerminationType() {
		return TerminationType;
	}

	public void setTerminationType(TerminationTypeCode TerminationType) {
		this.TerminationType = TerminationType;
	}

	public DeliveryTypeCode getDeliveryType() {
		return DeliveryType;
	}

	public void setDeliveryType(DeliveryTypeCode DeliveryType) {
		this.DeliveryType = DeliveryType;
	}

	public PercentageRate getMarginRatio() {
		return MarginRatio;
	}

	public void setMarginRatio(PercentageRate MarginRatio) {
		this.MarginRatio = MarginRatio;
	}
}