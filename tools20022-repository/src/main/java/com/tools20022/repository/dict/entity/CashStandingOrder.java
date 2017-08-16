package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.StandingOrder;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.entity.CashManagementService;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.entity.CreditTransfer;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CashAccount;

/**
 * Instruction given by a party that has explicit authority to instruct a debit
 * on the account, ie, either the debit account owner or originating party, to a
 * first agent, to process cash transfers at specified intervals during an
 * implicit or explicit period of time. A standing order is given once and is
 * valid for an open or closed period of time.
 */
public class CashStandingOrder extends StandingOrder
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TrueFalseIndicator ZeroSweepIndicator;
	private CashManagementService RelatedCashServices;
	private DebitCreditCode CreditDebitIndicator;
	private CreditTransfer CreditTransfer;
	private CurrencyAndAmount FloorAmount;
	private CashAccount CashAccount;

	public TrueFalseIndicator getZeroSweepIndicator() {
		return ZeroSweepIndicator;
	}

	public void setZeroSweepIndicator(TrueFalseIndicator ZeroSweepIndicator) {
		this.ZeroSweepIndicator = ZeroSweepIndicator;
	}

	public CashManagementService getRelatedCashServices() {
		return RelatedCashServices;
	}

	public void setRelatedCashServices(CashManagementService RelatedCashServices) {
		this.RelatedCashServices = RelatedCashServices;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public CreditTransfer getCreditTransfer() {
		return CreditTransfer;
	}

	public void setCreditTransfer(CreditTransfer CreditTransfer) {
		this.CreditTransfer = CreditTransfer;
	}

	public CurrencyAndAmount getFloorAmount() {
		return FloorAmount;
	}

	public void setFloorAmount(CurrencyAndAmount FloorAmount) {
		this.FloorAmount = FloorAmount;
	}

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}
}