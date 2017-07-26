package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.Account;

/**
 * Process of matching different documents submitted by parties to a trade.
 */
public class Reconciliation {

	private System System;
	private Document Document;
	private Trade ReconciledTrades;
	private Account Account;

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public Document getDocument() {
		return Document;
	}

	public void setDocument(Document Document) {
		this.Document = Document;
	}

	public Trade getReconciledTrades() {
		return ReconciledTrades;
	}

	public void setReconciledTrades(Trade ReconciledTrades) {
		this.ReconciledTrades = ReconciledTrades;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}
}