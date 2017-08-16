package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.codeset.TradeCertificateTypeCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.TradeCertificatePartyRole;
import com.tools20022.repository.dict.entity.ProductDelivery;

/**
 * Formal document used to record a fact and used as proof of the fact, in the
 * context of a commercial trade transaction.
 */
public class TradeCertificate extends Document
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TradeCertificateTypeCode CertificateType;
	private DateTimePeriod InspectionDate;
	private TradeCertificatePartyRole TradeCertificatePartyRole;
	private ProductDelivery ProductDelivery;

	public TradeCertificateTypeCode getCertificateType() {
		return CertificateType;
	}

	public void setCertificateType(TradeCertificateTypeCode CertificateType) {
		this.CertificateType = CertificateType;
	}

	public DateTimePeriod getInspectionDate() {
		return InspectionDate;
	}

	public void setInspectionDate(DateTimePeriod InspectionDate) {
		this.InspectionDate = InspectionDate;
	}

	public TradeCertificatePartyRole getTradeCertificatePartyRole() {
		return TradeCertificatePartyRole;
	}

	public void setTradeCertificatePartyRole(
			TradeCertificatePartyRole TradeCertificatePartyRole) {
		this.TradeCertificatePartyRole = TradeCertificatePartyRole;
	}

	public ProductDelivery getProductDelivery() {
		return ProductDelivery;
	}

	public void setProductDelivery(ProductDelivery ProductDelivery) {
		this.ProductDelivery = ProductDelivery;
	}
}