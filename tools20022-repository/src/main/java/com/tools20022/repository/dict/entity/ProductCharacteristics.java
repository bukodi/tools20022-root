package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.ProductCharacteristicsCode;

/**
 * Identifies the characteristic of a product.
 */
public class ProductCharacteristics extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Product Product;
	private Max35Text Characteristics;
	private ProductCharacteristicsCode Type;

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public Max35Text getCharacteristics() {
		return Characteristics;
	}

	public void setCharacteristics(Max35Text Characteristics) {
		this.Characteristics = Characteristics;
	}

	public ProductCharacteristicsCode getType() {
		return Type;
	}

	public void setType(ProductCharacteristicsCode Type) {
		this.Type = Type;
	}
}