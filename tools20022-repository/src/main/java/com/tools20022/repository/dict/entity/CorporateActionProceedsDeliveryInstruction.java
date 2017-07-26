package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CorporateActionDistribution;
import com.tools20022.repository.dict.entity.SecuritiesDeliveryObligation;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.AgentCorporateActionStandingInstruction;

/**
 * Specifies the delivery instructions for the securities and cash proceeds at
 * any stage of the Corporate Action process.
 */
public class CorporateActionProceedsDeliveryInstruction {

	private CorporateActionDistribution RelatedDistribution;
	private SecuritiesDeliveryObligation SecuritiesProceedsMovement;
	private PaymentObligation CashProceedsMovement;
	private Account SettlementAccount;
	private AgentCorporateActionStandingInstruction CorporateActionStandingInstruction;

	public CorporateActionDistribution getRelatedDistribution() {
		return RelatedDistribution;
	}

	public void setRelatedDistribution(
			CorporateActionDistribution RelatedDistribution) {
		this.RelatedDistribution = RelatedDistribution;
	}

	public SecuritiesDeliveryObligation getSecuritiesProceedsMovement() {
		return SecuritiesProceedsMovement;
	}

	public void setSecuritiesProceedsMovement(
			SecuritiesDeliveryObligation SecuritiesProceedsMovement) {
		this.SecuritiesProceedsMovement = SecuritiesProceedsMovement;
	}

	public PaymentObligation getCashProceedsMovement() {
		return CashProceedsMovement;
	}

	public void setCashProceedsMovement(PaymentObligation CashProceedsMovement) {
		this.CashProceedsMovement = CashProceedsMovement;
	}

	public Account getSettlementAccount() {
		return SettlementAccount;
	}

	public void setSettlementAccount(Account SettlementAccount) {
		this.SettlementAccount = SettlementAccount;
	}

	public AgentCorporateActionStandingInstruction getCorporateActionStandingInstruction() {
		return CorporateActionStandingInstruction;
	}

	public void setCorporateActionStandingInstruction(
			AgentCorporateActionStandingInstruction CorporateActionStandingInstruction) {
		this.CorporateActionStandingInstruction = CorporateActionStandingInstruction;
	}
}