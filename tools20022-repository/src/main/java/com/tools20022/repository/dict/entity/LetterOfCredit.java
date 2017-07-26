package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.CommercialTradeSettlement;

/**
 * Instrument issued by a bank substituting its name and credit standing for
 * that of its customer. A letter of credit is a written undertaking of the
 * bank, issued for the account of a customer (the applicant), to honour a
 * demand for payment, upon the beneficiary's compliance with the terms and
 * conditions set forth in the undertaking.
 */
public class LetterOfCredit extends Asset {

	private ActiveCurrencyAndAmount Amount;
	private Document Document;
	private CommercialTradeSettlement CommercialTradeSettlement;

	public ActiveCurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(ActiveCurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Document getDocument() {
		return Document;
	}

	public void setDocument(Document Document) {
		this.Document = Document;
	}

	public CommercialTradeSettlement getCommercialTradeSettlement() {
		return CommercialTradeSettlement;
	}

	public void setCommercialTradeSettlement(
			CommercialTradeSettlement CommercialTradeSettlement) {
		this.CommercialTradeSettlement = CommercialTradeSettlement;
	}
}