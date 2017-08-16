package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CashAccountService;
import com.tools20022.repository.dict.entity.Limit;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.codeset.DebitCreditCode;

/**
 * Specifies the conditions for overdraft on the account or for positive
 * amounts.
 */
public class DebitCreditFacility extends CashAccountService
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Limit CreditLine;
	private Interest CashAccountInterest;
	private DebitCreditCode CreditDebitIndicator;

	public Limit getCreditLine() {
		return CreditLine;
	}

	public void setCreditLine(Limit CreditLine) {
		this.CreditLine = CreditLine;
	}

	public Interest getCashAccountInterest() {
		return CashAccountInterest;
	}

	public void setCashAccountInterest(Interest CashAccountInterest) {
		this.CashAccountInterest = CashAccountInterest;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}
}