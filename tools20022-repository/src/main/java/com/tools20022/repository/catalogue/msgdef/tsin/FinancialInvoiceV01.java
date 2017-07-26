package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.InvoiceHeader1;
import com.tools20022.repository.dict.msg.TradeAgreement6;
import com.tools20022.repository.dict.msg.TradeDelivery1;
import com.tools20022.repository.dict.msg.TradeSettlement1;
import com.tools20022.repository.dict.msg.LineItem10;
import java.util.Optional;

/**
 * Scope The FinancialInvoice message is used to support the provision of
 * financial and related services where there is a requirement to exchange
 * invoice information. Usage While the prime function of the FinancialInvoice
 * message is as a request from the seller to the buyer for payment, the
 * FinancialInvoice message can also serve to evidence an invoice in support of
 * a financial service such as invoice factoring, letters of credit, and bank
 * payment obligations, to enable Web based services such as electronic bill
 * payment and presentment, and as the basis to transfer invoice information via
 * third parties such as e-invoicing service providers. A consequence of the
 * receipt of an invoice by the buyer is that it acts as a trigger for the use
 * of related messages that are already defined in ISO 20022, notably where the
 * information contained in the Financial Invoice enables payment for the goods
 * or services received, and/or is provided in support of a request for invoice
 * financing. While certain of these related messages, such as the
 * CreditTransfer and PaymentInitiation messages, are shown in the sequence
 * diagram they are out of scope. They are shown only to illustrate a given
 * scenario and to place the invoice in the context of the financial banking
 * processes that might be conducted between different financial institutions.
 * The use of self-billing by the buyer to the seller, where the buyer acts as
 * the invoice issuer or the process of handling an incorrect invoice, is not in
 * scope.
 */
public class FinancialInvoiceV01 {

	private InvoiceHeader1 InvoiceHeader;
	private TradeAgreement6 TradeAgreement;
	private TradeDelivery1 TradeDelivery;
	private TradeSettlement1 TradeSettlement;
	private Optional<LineItem10> LineItem;

	public InvoiceHeader1 getInvoiceHeader() {
		return InvoiceHeader;
	}

	public void setInvoiceHeader(InvoiceHeader1 InvoiceHeader) {
		this.InvoiceHeader = InvoiceHeader;
	}

	public TradeAgreement6 getTradeAgreement() {
		return TradeAgreement;
	}

	public void setTradeAgreement(TradeAgreement6 TradeAgreement) {
		this.TradeAgreement = TradeAgreement;
	}

	public TradeDelivery1 getTradeDelivery() {
		return TradeDelivery;
	}

	public void setTradeDelivery(TradeDelivery1 TradeDelivery) {
		this.TradeDelivery = TradeDelivery;
	}

	public TradeSettlement1 getTradeSettlement() {
		return TradeSettlement;
	}

	public void setTradeSettlement(TradeSettlement1 TradeSettlement) {
		this.TradeSettlement = TradeSettlement;
	}

	public Optional<LineItem10> getLineItem() {
		return LineItem;
	}

	public void setLineItem(Optional<LineItem10> LineItem) {
		this.LineItem = LineItem;
	}
}