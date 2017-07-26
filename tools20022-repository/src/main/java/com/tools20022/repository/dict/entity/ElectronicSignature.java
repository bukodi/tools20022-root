package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Signature;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.entity.SecurityCertificate;

/**
 * Additional security provisions, such as a digital signature.
 */
public class ElectronicSignature extends Signature {

	private Undertaking Undertaking;
	private SecurityCertificate RelatedSecurityCertificate;

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public SecurityCertificate getRelatedSecurityCertificate() {
		return RelatedSecurityCertificate;
	}

	public void setRelatedSecurityCertificate(
			SecurityCertificate RelatedSecurityCertificate) {
		this.RelatedSecurityCertificate = RelatedSecurityCertificate;
	}
}