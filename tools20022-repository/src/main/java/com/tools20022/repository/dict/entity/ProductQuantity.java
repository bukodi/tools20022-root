package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.UnitOfMeasureCode;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import com.tools20022.repository.dict.entity.LineItem;
import com.tools20022.repository.dict.entity.Packaging;
import com.tools20022.repository.dict.entity.Tolerance;

/**
 * Specifies the ordered quantity of a product.
 */
public class ProductQuantity extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private UnitOfMeasureCode UnitOfMeasure;
	private DecimalNumber Value;
	private Product Product;
	private Max15NumericText Factor;
	private LineItem NetWeightRelatedLineItem;
	private LineItem BilledQuantityRelatedLineItem;
	private Packaging RelatedPackaging;
	private Packaging PackagingForUnitQuantity;
	private LineItem ChargeFreeQuantityRelatedLineItem;
	private LineItem MeasureQuantityStart;
	private LineItem MeasureQuantityEnd;
	private Tolerance QuantityTolerance;
	private Packaging PackagingForConsignmentlQuantity;
	private Packaging PackagingForVolume;
	private Packaging PackagingForWeight;
	private LineItem GrossPriceQuantityRelatedLineItem;
	private LineItem NetPriceQuantityRelatedLineItem;
	private LineItem GrossWeightRelatedLineItem;

	public UnitOfMeasureCode getUnitOfMeasure() {
		return UnitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasureCode UnitOfMeasure) {
		this.UnitOfMeasure = UnitOfMeasure;
	}

	public DecimalNumber getValue() {
		return Value;
	}

	public void setValue(DecimalNumber Value) {
		this.Value = Value;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public Max15NumericText getFactor() {
		return Factor;
	}

	public void setFactor(Max15NumericText Factor) {
		this.Factor = Factor;
	}

	public LineItem getNetWeightRelatedLineItem() {
		return NetWeightRelatedLineItem;
	}

	public void setNetWeightRelatedLineItem(LineItem NetWeightRelatedLineItem) {
		this.NetWeightRelatedLineItem = NetWeightRelatedLineItem;
	}

	public LineItem getBilledQuantityRelatedLineItem() {
		return BilledQuantityRelatedLineItem;
	}

	public void setBilledQuantityRelatedLineItem(
			LineItem BilledQuantityRelatedLineItem) {
		this.BilledQuantityRelatedLineItem = BilledQuantityRelatedLineItem;
	}

	public Packaging getRelatedPackaging() {
		return RelatedPackaging;
	}

	public void setRelatedPackaging(Packaging RelatedPackaging) {
		this.RelatedPackaging = RelatedPackaging;
	}

	public Packaging getPackagingForUnitQuantity() {
		return PackagingForUnitQuantity;
	}

	public void setPackagingForUnitQuantity(Packaging PackagingForUnitQuantity) {
		this.PackagingForUnitQuantity = PackagingForUnitQuantity;
	}

	public LineItem getChargeFreeQuantityRelatedLineItem() {
		return ChargeFreeQuantityRelatedLineItem;
	}

	public void setChargeFreeQuantityRelatedLineItem(
			LineItem ChargeFreeQuantityRelatedLineItem) {
		this.ChargeFreeQuantityRelatedLineItem = ChargeFreeQuantityRelatedLineItem;
	}

	public LineItem getMeasureQuantityStart() {
		return MeasureQuantityStart;
	}

	public void setMeasureQuantityStart(LineItem MeasureQuantityStart) {
		this.MeasureQuantityStart = MeasureQuantityStart;
	}

	public LineItem getMeasureQuantityEnd() {
		return MeasureQuantityEnd;
	}

	public void setMeasureQuantityEnd(LineItem MeasureQuantityEnd) {
		this.MeasureQuantityEnd = MeasureQuantityEnd;
	}

	public Tolerance getQuantityTolerance() {
		return QuantityTolerance;
	}

	public void setQuantityTolerance(Tolerance QuantityTolerance) {
		this.QuantityTolerance = QuantityTolerance;
	}

	public Packaging getPackagingForConsignmentlQuantity() {
		return PackagingForConsignmentlQuantity;
	}

	public void setPackagingForConsignmentlQuantity(
			Packaging PackagingForConsignmentlQuantity) {
		this.PackagingForConsignmentlQuantity = PackagingForConsignmentlQuantity;
	}

	public Packaging getPackagingForVolume() {
		return PackagingForVolume;
	}

	public void setPackagingForVolume(Packaging PackagingForVolume) {
		this.PackagingForVolume = PackagingForVolume;
	}

	public Packaging getPackagingForWeight() {
		return PackagingForWeight;
	}

	public void setPackagingForWeight(Packaging PackagingForWeight) {
		this.PackagingForWeight = PackagingForWeight;
	}

	public LineItem getGrossPriceQuantityRelatedLineItem() {
		return GrossPriceQuantityRelatedLineItem;
	}

	public void setGrossPriceQuantityRelatedLineItem(
			LineItem GrossPriceQuantityRelatedLineItem) {
		this.GrossPriceQuantityRelatedLineItem = GrossPriceQuantityRelatedLineItem;
	}

	public LineItem getNetPriceQuantityRelatedLineItem() {
		return NetPriceQuantityRelatedLineItem;
	}

	public void setNetPriceQuantityRelatedLineItem(
			LineItem NetPriceQuantityRelatedLineItem) {
		this.NetPriceQuantityRelatedLineItem = NetPriceQuantityRelatedLineItem;
	}

	public LineItem getGrossWeightRelatedLineItem() {
		return GrossWeightRelatedLineItem;
	}

	public void setGrossWeightRelatedLineItem(
			LineItem GrossWeightRelatedLineItem) {
		this.GrossWeightRelatedLineItem = GrossWeightRelatedLineItem;
	}
}