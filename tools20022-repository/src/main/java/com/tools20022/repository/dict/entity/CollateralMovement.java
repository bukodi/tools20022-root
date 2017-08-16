package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.CollateralProposal;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.MarginCall;
import com.tools20022.repository.dict.entity.SecuritiesDeliveryObligation;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.FinancialTransaction;

/**
 * Provides the agreed amount and the collateral movement direction.
 */
public class CollateralMovement extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CollateralProposal RelatedCollateralProposal;
	private CurrencyAndAmount VariationMargin;
	private CurrencyAndAmount SegregatedIndependentAmount;
	private MarginCall MarginCall;
	private SecuritiesDeliveryObligation SecuritiesCollateralMovement;
	private PaymentObligation CashCollateralMovement;
	private FinancialTransaction FinancialTransaction;

	public CollateralProposal getRelatedCollateralProposal() {
		return RelatedCollateralProposal;
	}

	public void setRelatedCollateralProposal(
			CollateralProposal RelatedCollateralProposal) {
		this.RelatedCollateralProposal = RelatedCollateralProposal;
	}

	public CurrencyAndAmount getVariationMargin() {
		return VariationMargin;
	}

	public void setVariationMargin(CurrencyAndAmount VariationMargin) {
		this.VariationMargin = VariationMargin;
	}

	public CurrencyAndAmount getSegregatedIndependentAmount() {
		return SegregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(
			CurrencyAndAmount SegregatedIndependentAmount) {
		this.SegregatedIndependentAmount = SegregatedIndependentAmount;
	}

	public MarginCall getMarginCall() {
		return MarginCall;
	}

	public void setMarginCall(MarginCall MarginCall) {
		this.MarginCall = MarginCall;
	}

	public SecuritiesDeliveryObligation getSecuritiesCollateralMovement() {
		return SecuritiesCollateralMovement;
	}

	public void setSecuritiesCollateralMovement(
			SecuritiesDeliveryObligation SecuritiesCollateralMovement) {
		this.SecuritiesCollateralMovement = SecuritiesCollateralMovement;
	}

	public PaymentObligation getCashCollateralMovement() {
		return CashCollateralMovement;
	}

	public void setCashCollateralMovement(
			PaymentObligation CashCollateralMovement) {
		this.CashCollateralMovement = CashCollateralMovement;
	}

	public FinancialTransaction getFinancialTransaction() {
		return FinancialTransaction;
	}

	public void setFinancialTransaction(
			FinancialTransaction FinancialTransaction) {
		this.FinancialTransaction = FinancialTransaction;
	}
}