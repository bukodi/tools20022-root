package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.ProductQuantity;
import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.LineItem;
import com.tools20022.repository.dict.datatype.Max4Text;

/**
 * Physical packaging of goods for transport.
 */
public class Packaging extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ProductQuantity Quantity;
	private ProductQuantity PerPackageUnitQuantity;
	private Transport Transport;
	private Max350Text PackagingName;
	private ProductQuantity TotalConsignmentQuantity;
	private ProductQuantity TotalVolume;
	private ProductQuantity TotalWeight;
	private LineItem RelatedLineItem;
	private Max4Text PackageType;

	public ProductQuantity getQuantity() {
		return Quantity;
	}

	public void setQuantity(ProductQuantity Quantity) {
		this.Quantity = Quantity;
	}

	public ProductQuantity getPerPackageUnitQuantity() {
		return PerPackageUnitQuantity;
	}

	public void setPerPackageUnitQuantity(ProductQuantity PerPackageUnitQuantity) {
		this.PerPackageUnitQuantity = PerPackageUnitQuantity;
	}

	public Transport getTransport() {
		return Transport;
	}

	public void setTransport(Transport Transport) {
		this.Transport = Transport;
	}

	public Max350Text getPackagingName() {
		return PackagingName;
	}

	public void setPackagingName(Max350Text PackagingName) {
		this.PackagingName = PackagingName;
	}

	public ProductQuantity getTotalConsignmentQuantity() {
		return TotalConsignmentQuantity;
	}

	public void setTotalConsignmentQuantity(
			ProductQuantity TotalConsignmentQuantity) {
		this.TotalConsignmentQuantity = TotalConsignmentQuantity;
	}

	public ProductQuantity getTotalVolume() {
		return TotalVolume;
	}

	public void setTotalVolume(ProductQuantity TotalVolume) {
		this.TotalVolume = TotalVolume;
	}

	public ProductQuantity getTotalWeight() {
		return TotalWeight;
	}

	public void setTotalWeight(ProductQuantity TotalWeight) {
		this.TotalWeight = TotalWeight;
	}

	public LineItem getRelatedLineItem() {
		return RelatedLineItem;
	}

	public void setRelatedLineItem(LineItem RelatedLineItem) {
		this.RelatedLineItem = RelatedLineItem;
	}

	public Max4Text getPackageType() {
		return PackageType;
	}

	public void setPackageType(Max4Text PackageType) {
		this.PackageType = PackageType;
	}
}