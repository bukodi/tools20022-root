package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.entity.CommercialTradeSettlement;
import com.tools20022.repository.dict.entity.ProductDeliveryObligation;
import com.tools20022.repository.dict.entity.TradeCertificate;
import com.tools20022.repository.dict.entity.InsuranceCertificate;
import com.tools20022.repository.dict.entity.Product;

/**
 * Arrangements for delivery of invoiced products and/or services.
 */
public class ProductDelivery extends ObligationFulfilment {

	private DateTimePeriod DeliveryPeriod;
	private Transport Routing;
	private CommercialTradeSettlement TradeSettlement;
	private ProductDeliveryObligation Obligation;
	private TradeCertificate TradeCertificate;
	private InsuranceCertificate InsuranceCertificate;
	private Product Product;

	public DateTimePeriod getDeliveryPeriod() {
		return DeliveryPeriod;
	}

	public void setDeliveryPeriod(DateTimePeriod DeliveryPeriod) {
		this.DeliveryPeriod = DeliveryPeriod;
	}

	public Transport getRouting() {
		return Routing;
	}

	public void setRouting(Transport Routing) {
		this.Routing = Routing;
	}

	public CommercialTradeSettlement getTradeSettlement() {
		return TradeSettlement;
	}

	public void setTradeSettlement(CommercialTradeSettlement TradeSettlement) {
		this.TradeSettlement = TradeSettlement;
	}

	public ProductDeliveryObligation getObligation() {
		return Obligation;
	}

	public void setObligation(ProductDeliveryObligation Obligation) {
		this.Obligation = Obligation;
	}

	public TradeCertificate getTradeCertificate() {
		return TradeCertificate;
	}

	public void setTradeCertificate(TradeCertificate TradeCertificate) {
		this.TradeCertificate = TradeCertificate;
	}

	public InsuranceCertificate getInsuranceCertificate() {
		return InsuranceCertificate;
	}

	public void setInsuranceCertificate(
			InsuranceCertificate InsuranceCertificate) {
		this.InsuranceCertificate = InsuranceCertificate;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}
}