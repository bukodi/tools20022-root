package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.entity.ProductQuantity;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Invoice;
import com.tools20022.repository.dict.entity.Packaging;

/**
 * Unit of information showing the related provision of products and/or services
 * and monetary summations reported as a discrete line item.
 */
public class LineItem extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Adjustment FinancialAdjustment;
	private Charges LogisticsCharge;
	private CurrencyAndAmount GrossAmount;
	private Max35Text Identification;
	private Product InvoicedProduct;
	private ProductQuantity NetWeight;
	private ProductQuantity BilledQuantity;
	private ProductQuantity ChargeFreeQuantity;
	private ProductQuantity MeasureQuantityStartRelatedLineItem;
	private ProductQuantity MeasureQuantityEndRelatedLineItem;
	private ISODateTime MeasureDateTimeStart;
	private ISODateTime MeasureDateTimeEnd;
	private Invoice Invoice;
	private CurrencyAndAmount NetAmount;
	private Packaging Packaging;
	private ISODateTime DeliveryDateTime;
	private Charges Charges;
	private Charges NetPriceCharge;
	private ProductQuantity GrossPriceQuantity;
	private ProductQuantity NetPriceQuantity;
	private ProductQuantity GrossWeight;

	public Adjustment getFinancialAdjustment() {
		return FinancialAdjustment;
	}

	public void setFinancialAdjustment(Adjustment FinancialAdjustment) {
		this.FinancialAdjustment = FinancialAdjustment;
	}

	public Charges getLogisticsCharge() {
		return LogisticsCharge;
	}

	public void setLogisticsCharge(Charges LogisticsCharge) {
		this.LogisticsCharge = LogisticsCharge;
	}

	public CurrencyAndAmount getGrossAmount() {
		return GrossAmount;
	}

	public void setGrossAmount(CurrencyAndAmount GrossAmount) {
		this.GrossAmount = GrossAmount;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Product getInvoicedProduct() {
		return InvoicedProduct;
	}

	public void setInvoicedProduct(Product InvoicedProduct) {
		this.InvoicedProduct = InvoicedProduct;
	}

	public ProductQuantity getNetWeight() {
		return NetWeight;
	}

	public void setNetWeight(ProductQuantity NetWeight) {
		this.NetWeight = NetWeight;
	}

	public ProductQuantity getBilledQuantity() {
		return BilledQuantity;
	}

	public void setBilledQuantity(ProductQuantity BilledQuantity) {
		this.BilledQuantity = BilledQuantity;
	}

	public ProductQuantity getChargeFreeQuantity() {
		return ChargeFreeQuantity;
	}

	public void setChargeFreeQuantity(ProductQuantity ChargeFreeQuantity) {
		this.ChargeFreeQuantity = ChargeFreeQuantity;
	}

	public ProductQuantity getMeasureQuantityStartRelatedLineItem() {
		return MeasureQuantityStartRelatedLineItem;
	}

	public void setMeasureQuantityStartRelatedLineItem(
			ProductQuantity MeasureQuantityStartRelatedLineItem) {
		this.MeasureQuantityStartRelatedLineItem = MeasureQuantityStartRelatedLineItem;
	}

	public ProductQuantity getMeasureQuantityEndRelatedLineItem() {
		return MeasureQuantityEndRelatedLineItem;
	}

	public void setMeasureQuantityEndRelatedLineItem(
			ProductQuantity MeasureQuantityEndRelatedLineItem) {
		this.MeasureQuantityEndRelatedLineItem = MeasureQuantityEndRelatedLineItem;
	}

	public ISODateTime getMeasureDateTimeStart() {
		return MeasureDateTimeStart;
	}

	public void setMeasureDateTimeStart(ISODateTime MeasureDateTimeStart) {
		this.MeasureDateTimeStart = MeasureDateTimeStart;
	}

	public ISODateTime getMeasureDateTimeEnd() {
		return MeasureDateTimeEnd;
	}

	public void setMeasureDateTimeEnd(ISODateTime MeasureDateTimeEnd) {
		this.MeasureDateTimeEnd = MeasureDateTimeEnd;
	}

	public Invoice getInvoice() {
		return Invoice;
	}

	public void setInvoice(Invoice Invoice) {
		this.Invoice = Invoice;
	}

	public CurrencyAndAmount getNetAmount() {
		return NetAmount;
	}

	public void setNetAmount(CurrencyAndAmount NetAmount) {
		this.NetAmount = NetAmount;
	}

	public Packaging getPackaging() {
		return Packaging;
	}

	public void setPackaging(Packaging Packaging) {
		this.Packaging = Packaging;
	}

	public ISODateTime getDeliveryDateTime() {
		return DeliveryDateTime;
	}

	public void setDeliveryDateTime(ISODateTime DeliveryDateTime) {
		this.DeliveryDateTime = DeliveryDateTime;
	}

	public Charges getCharges() {
		return Charges;
	}

	public void setCharges(Charges Charges) {
		this.Charges = Charges;
	}

	public Charges getNetPriceCharge() {
		return NetPriceCharge;
	}

	public void setNetPriceCharge(Charges NetPriceCharge) {
		this.NetPriceCharge = NetPriceCharge;
	}

	public ProductQuantity getGrossPriceQuantity() {
		return GrossPriceQuantity;
	}

	public void setGrossPriceQuantity(ProductQuantity GrossPriceQuantity) {
		this.GrossPriceQuantity = GrossPriceQuantity;
	}

	public ProductQuantity getNetPriceQuantity() {
		return NetPriceQuantity;
	}

	public void setNetPriceQuantity(ProductQuantity NetPriceQuantity) {
		this.NetPriceQuantity = NetPriceQuantity;
	}

	public ProductQuantity getGrossWeight() {
		return GrossWeight;
	}

	public void setGrossWeight(ProductQuantity GrossWeight) {
		this.GrossWeight = GrossWeight;
	}
}