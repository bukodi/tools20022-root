package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Obligation;
import com.tools20022.repository.dict.entity.ProductDelivery;
import com.tools20022.repository.dict.entity.CommercialTrade;

/**
 * Obligation for the seller to deliver goods or services to the buyer.
 */
public class ProductDeliveryObligation extends Obligation {

	private ProductDelivery ProductDeliveryOffset;
	private CommercialTrade CommercialTrade;

	public ProductDelivery getProductDeliveryOffset() {
		return ProductDeliveryOffset;
	}

	public void setProductDeliveryOffset(ProductDelivery ProductDeliveryOffset) {
		this.ProductDeliveryOffset = ProductDeliveryOffset;
	}

	public CommercialTrade getCommercialTrade() {
		return CommercialTrade;
	}

	public void setCommercialTrade(CommercialTrade CommercialTrade) {
		this.CommercialTrade = CommercialTrade;
	}
}