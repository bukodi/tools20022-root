package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CardPayment;
import com.tools20022.repository.dict.entity.Price;
import com.tools20022.repository.dict.entity.ProductCategory;
import com.tools20022.repository.dict.entity.LineItem;
import com.tools20022.repository.dict.entity.ProductIdentification;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.entity.ProductCharacteristics;
import com.tools20022.repository.dict.entity.ProductQuantity;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.entity.ProductDelivery;
import com.tools20022.repository.dict.entity.PurchaseOrder;
import com.tools20022.repository.dict.entity.Tax;

/**
 * Item that is offered for sale. Products can be services or goods.
 */
public class Product {

	private CardPayment CardPayment;
	private Price UnitPrice;
	private ProductCategory ProductCategory;
	private LineItem LineItem;
	private ProductIdentification ProductIdentification;
	private Max35Text Name;
	private Max140Text Description;
	private Country Origin;
	private ProductCharacteristics Characteristics;
	private Price NetPrice;
	private ProductQuantity Quantity;
	private Price GrossPrice;
	private Max70Text Quality;
	private ProductDelivery Delivery;
	private PurchaseOrder PurchaseOrder;
	private Tax Tax;

	public CardPayment getCardPayment() {
		return CardPayment;
	}

	public void setCardPayment(CardPayment CardPayment) {
		this.CardPayment = CardPayment;
	}

	public Price getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(Price UnitPrice) {
		this.UnitPrice = UnitPrice;
	}

	public ProductCategory getProductCategory() {
		return ProductCategory;
	}

	public void setProductCategory(ProductCategory ProductCategory) {
		this.ProductCategory = ProductCategory;
	}

	public LineItem getLineItem() {
		return LineItem;
	}

	public void setLineItem(LineItem LineItem) {
		this.LineItem = LineItem;
	}

	public ProductIdentification getProductIdentification() {
		return ProductIdentification;
	}

	public void setProductIdentification(
			ProductIdentification ProductIdentification) {
		this.ProductIdentification = ProductIdentification;
	}

	public Max35Text getName() {
		return Name;
	}

	public void setName(Max35Text Name) {
		this.Name = Name;
	}

	public Max140Text getDescription() {
		return Description;
	}

	public void setDescription(Max140Text Description) {
		this.Description = Description;
	}

	public Country getOrigin() {
		return Origin;
	}

	public void setOrigin(Country Origin) {
		this.Origin = Origin;
	}

	public ProductCharacteristics getCharacteristics() {
		return Characteristics;
	}

	public void setCharacteristics(ProductCharacteristics Characteristics) {
		this.Characteristics = Characteristics;
	}

	public Price getNetPrice() {
		return NetPrice;
	}

	public void setNetPrice(Price NetPrice) {
		this.NetPrice = NetPrice;
	}

	public ProductQuantity getQuantity() {
		return Quantity;
	}

	public void setQuantity(ProductQuantity Quantity) {
		this.Quantity = Quantity;
	}

	public Price getGrossPrice() {
		return GrossPrice;
	}

	public void setGrossPrice(Price GrossPrice) {
		this.GrossPrice = GrossPrice;
	}

	public Max70Text getQuality() {
		return Quality;
	}

	public void setQuality(Max70Text Quality) {
		this.Quality = Quality;
	}

	public ProductDelivery getDelivery() {
		return Delivery;
	}

	public void setDelivery(ProductDelivery Delivery) {
		this.Delivery = Delivery;
	}

	public PurchaseOrder getPurchaseOrder() {
		return PurchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder PurchaseOrder) {
		this.PurchaseOrder = PurchaseOrder;
	}

	public Tax getTax() {
		return Tax;
	}

	public void setTax(Tax Tax) {
		this.Tax = Tax;
	}
}