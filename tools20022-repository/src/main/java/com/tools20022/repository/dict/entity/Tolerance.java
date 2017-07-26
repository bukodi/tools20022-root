package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.UndertakingAmount;
import com.tools20022.repository.dict.entity.ProductQuantity;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.Price;

/**
 * Variance allowed on a quantity or on a price.
 */
public class Tolerance {

	private UndertakingAmount RelatedUndertakingAmount;
	private ProductQuantity Quantity;
	private PercentageRate PlusPercent;
	private PercentageRate MinusPercent;
	private Price Price;

	public UndertakingAmount getRelatedUndertakingAmount() {
		return RelatedUndertakingAmount;
	}

	public void setRelatedUndertakingAmount(
			UndertakingAmount RelatedUndertakingAmount) {
		this.RelatedUndertakingAmount = RelatedUndertakingAmount;
	}

	public ProductQuantity getQuantity() {
		return Quantity;
	}

	public void setQuantity(ProductQuantity Quantity) {
		this.Quantity = Quantity;
	}

	public PercentageRate getPlusPercent() {
		return PlusPercent;
	}

	public void setPlusPercent(PercentageRate PlusPercent) {
		this.PlusPercent = PlusPercent;
	}

	public PercentageRate getMinusPercent() {
		return MinusPercent;
	}

	public void setMinusPercent(PercentageRate MinusPercent) {
		this.MinusPercent = MinusPercent;
	}

	public Price getPrice() {
		return Price;
	}

	public void setPrice(Price Price) {
		this.Price = Price;
	}
}