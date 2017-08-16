package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CommercialTradePartyRole;
import com.tools20022.repository.dict.entity.CommercialTradeSettlement;
import com.tools20022.repository.dict.entity.ProductDeliveryObligation;
import com.tools20022.repository.dict.entity.PurchaseOrder;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.UnderlyingTransaction;
import com.tools20022.repository.dict.entity.BaselineStatus;
import com.tools20022.repository.dict.entity.Agreement;

/**
 * Commercial details of a trade transaction between a buyer and a seller.
 */
public class CommercialTrade extends Trade
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashAccount PurchaseAccount;
	private PaymentObligation PaymentObligation;
	private CurrencyAndAmount TotalAcceptedAmount;
	private CommercialTradePartyRole PartyRole;
	private CommercialTradeSettlement TradeSettlement;
	private ProductDeliveryObligation ProductDeliveryObligation;
	private PurchaseOrder PurchaseOrder;
	private Document Documents;
	private UnderlyingTransaction RelatedUndertaking;
	private BaselineStatus TransactionStatus;
	private Agreement Agreement;

	public CashAccount getPurchaseAccount() {
		return PurchaseAccount;
	}

	public void setPurchaseAccount(CashAccount PurchaseAccount) {
		this.PurchaseAccount = PurchaseAccount;
	}

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}

	public CurrencyAndAmount getTotalAcceptedAmount() {
		return TotalAcceptedAmount;
	}

	public void setTotalAcceptedAmount(CurrencyAndAmount TotalAcceptedAmount) {
		this.TotalAcceptedAmount = TotalAcceptedAmount;
	}

	public CommercialTradePartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(CommercialTradePartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public CommercialTradeSettlement getTradeSettlement() {
		return TradeSettlement;
	}

	public void setTradeSettlement(CommercialTradeSettlement TradeSettlement) {
		this.TradeSettlement = TradeSettlement;
	}

	public ProductDeliveryObligation getProductDeliveryObligation() {
		return ProductDeliveryObligation;
	}

	public void setProductDeliveryObligation(
			ProductDeliveryObligation ProductDeliveryObligation) {
		this.ProductDeliveryObligation = ProductDeliveryObligation;
	}

	public PurchaseOrder getPurchaseOrder() {
		return PurchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder PurchaseOrder) {
		this.PurchaseOrder = PurchaseOrder;
	}

	public Document getDocuments() {
		return Documents;
	}

	public void setDocuments(Document Documents) {
		this.Documents = Documents;
	}

	public UnderlyingTransaction getRelatedUndertaking() {
		return RelatedUndertaking;
	}

	public void setRelatedUndertaking(UnderlyingTransaction RelatedUndertaking) {
		this.RelatedUndertaking = RelatedUndertaking;
	}

	public BaselineStatus getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(BaselineStatus TransactionStatus) {
		this.TransactionStatus = TransactionStatus;
	}

	public Agreement getAgreement() {
		return Agreement;
	}

	public void setAgreement(Agreement Agreement) {
		this.Agreement = Agreement;
	}
}