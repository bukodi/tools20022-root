package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Settlement;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.Invoice;
import com.tools20022.repository.dict.entity.LetterOfCredit;
import com.tools20022.repository.dict.entity.ProductDelivery;
import com.tools20022.repository.dict.entity.CommercialTrade;

/**
 * Settlement of a commercial trade, that is, the instruction to deliver goods
 * or services against the payment of an amount of money.
 */
public class CommercialTradeSettlement extends Settlement
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Payment Payment;
	private Invoice Invoice;
	private LetterOfCredit LetterOfCredit;
	private ProductDelivery ProductDelivery;
	private CommercialTrade CommercialTrade;

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public Invoice getInvoice() {
		return Invoice;
	}

	public void setInvoice(Invoice Invoice) {
		this.Invoice = Invoice;
	}

	public LetterOfCredit getLetterOfCredit() {
		return LetterOfCredit;
	}

	public void setLetterOfCredit(LetterOfCredit LetterOfCredit) {
		this.LetterOfCredit = LetterOfCredit;
	}

	public ProductDelivery getProductDelivery() {
		return ProductDelivery;
	}

	public void setProductDelivery(ProductDelivery ProductDelivery) {
		this.ProductDelivery = ProductDelivery;
	}

	public CommercialTrade getCommercialTrade() {
		return CommercialTrade;
	}

	public void setCommercialTrade(CommercialTrade CommercialTrade) {
		this.CommercialTrade = CommercialTrade;
	}
}