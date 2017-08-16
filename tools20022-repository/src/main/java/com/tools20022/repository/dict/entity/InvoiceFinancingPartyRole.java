package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InvoicePartyRole;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.InvoiceFinancingAgreement;

/**
 * Role played by a party in the context of financing an invoice.
 */
public class InvoiceFinancingPartyRole extends InvoicePartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashAccount CashAccount;
	private InvoiceFinancingAgreement InvoiceFinancingTransaction;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public InvoiceFinancingAgreement getInvoiceFinancingTransaction() {
		return InvoiceFinancingTransaction;
	}

	public void setInvoiceFinancingTransaction(
			InvoiceFinancingAgreement InvoiceFinancingTransaction) {
		this.InvoiceFinancingTransaction = InvoiceFinancingTransaction;
	}
}