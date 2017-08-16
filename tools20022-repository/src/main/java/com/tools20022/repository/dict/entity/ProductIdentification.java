package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.codeset.ProductIdentifierCode;

/**
 * Information used to identify a product.
 */
public class ProductIdentification extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text Identifier;
	private Product Product;
	private ProductIdentifierCode Type;
	private Max35Text GlobalSerialIdentifier;

	public Max35Text getIdentifier() {
		return Identifier;
	}

	public void setIdentifier(Max35Text Identifier) {
		this.Identifier = Identifier;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public ProductIdentifierCode getType() {
		return Type;
	}

	public void setType(ProductIdentifierCode Type) {
		this.Type = Type;
	}

	public Max35Text getGlobalSerialIdentifier() {
		return GlobalSerialIdentifier;
	}

	public void setGlobalSerialIdentifier(Max35Text GlobalSerialIdentifier) {
		this.GlobalSerialIdentifier = GlobalSerialIdentifier;
	}
}