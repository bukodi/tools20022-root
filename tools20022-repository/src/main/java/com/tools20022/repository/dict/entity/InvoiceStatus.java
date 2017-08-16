package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.entity.Invoice;

/**
 * Status of the invoice or of the billing process.
 */
public class InvoiceStatus extends Status
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Invoice Invoice;

	public Invoice getInvoice() {
		return Invoice;
	}

	public void setInvoice(Invoice Invoice) {
		this.Invoice = Invoice;
	}
}