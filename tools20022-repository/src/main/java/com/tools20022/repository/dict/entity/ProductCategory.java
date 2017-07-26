package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.codeset.ProductCategoryCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.CardPaymentValidation;

/**
 * Specifies the category of the product.
 */
public class ProductCategory {

	private Product Product;
	private ProductCategoryCode Type;
	private Max35Text Category;
	private CardPaymentValidation RelatedCardPaymentValidation;

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public ProductCategoryCode getType() {
		return Type;
	}

	public void setType(ProductCategoryCode Type) {
		this.Type = Type;
	}

	public Max35Text getCategory() {
		return Category;
	}

	public void setCategory(Max35Text Category) {
		this.Category = Category;
	}

	public CardPaymentValidation getRelatedCardPaymentValidation() {
		return RelatedCardPaymentValidation;
	}

	public void setRelatedCardPaymentValidation(
			CardPaymentValidation RelatedCardPaymentValidation) {
		this.RelatedCardPaymentValidation = RelatedCardPaymentValidation;
	}
}