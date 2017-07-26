package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Invoice;

/**
 * Role played by a party in the context of an invoice.
 */
public class InvoicePartyRole extends Role {

	private Invoice Invoice;

	public Invoice getInvoice() {
		return Invoice;
	}

	public void setInvoice(Invoice Invoice) {
		this.Invoice = Invoice;
	}
}