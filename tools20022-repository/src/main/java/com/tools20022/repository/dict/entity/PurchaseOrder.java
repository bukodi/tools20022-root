package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Order;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CommercialTrade;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.entity.GenericIdentification;

/**
 * Document issued by a buyer and containing the details of a purchase,
 * including description of goods, transport information, payment terms, etc.
 */
public class PurchaseOrder extends Order
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount TotalAmount;
	private CommercialTrade ResultingCommercialTrade;
	private Product Product;
	private GenericIdentification Identification;

	public CurrencyAndAmount getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount TotalAmount) {
		this.TotalAmount = TotalAmount;
	}

	public CommercialTrade getResultingCommercialTrade() {
		return ResultingCommercialTrade;
	}

	public void setResultingCommercialTrade(
			CommercialTrade ResultingCommercialTrade) {
		this.ResultingCommercialTrade = ResultingCommercialTrade;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public GenericIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(GenericIdentification Identification) {
		this.Identification = Identification;
	}
}