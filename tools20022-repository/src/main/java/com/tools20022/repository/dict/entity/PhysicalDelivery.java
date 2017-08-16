package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.SecuritiesCertificate;
import com.tools20022.repository.dict.entity.PostalAddress;
import com.tools20022.repository.dict.codeset.PhysicalTransferTypeCode;

/**
 * Parameters of a physical delivery.
 */
public class PhysicalDelivery extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesTransfer RelatedTransfer;
	private YesNoIndicator RegisteredAddressIndicator;
	private SecuritiesCertificate IssuedCertificateNumber;
	private PostalAddress Address;
	private PhysicalTransferTypeCode Type;

	public SecuritiesTransfer getRelatedTransfer() {
		return RelatedTransfer;
	}

	public void setRelatedTransfer(SecuritiesTransfer RelatedTransfer) {
		this.RelatedTransfer = RelatedTransfer;
	}

	public YesNoIndicator getRegisteredAddressIndicator() {
		return RegisteredAddressIndicator;
	}

	public void setRegisteredAddressIndicator(
			YesNoIndicator RegisteredAddressIndicator) {
		this.RegisteredAddressIndicator = RegisteredAddressIndicator;
	}

	public SecuritiesCertificate getIssuedCertificateNumber() {
		return IssuedCertificateNumber;
	}

	public void setIssuedCertificateNumber(
			SecuritiesCertificate IssuedCertificateNumber) {
		this.IssuedCertificateNumber = IssuedCertificateNumber;
	}

	public PostalAddress getAddress() {
		return Address;
	}

	public void setAddress(PostalAddress Address) {
		this.Address = Address;
	}

	public PhysicalTransferTypeCode getType() {
		return Type;
	}

	public void setType(PhysicalTransferTypeCode Type) {
		this.Type = Type;
	}
}