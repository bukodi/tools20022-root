package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.ElectronicSignature;
import com.tools20022.repository.dict.entity.SecurityCertificatePartyRole;
import com.tools20022.repository.dict.entity.NetworkAccess;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Certificate linked to a digital signature.
 */
public class SecurityCertificate extends Document
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ElectronicSignature ElectronicSignature;
	private SecurityCertificatePartyRole SecurityCertificatePartyRole;
	private NetworkAccess NetworkAccess;
	private Max35Text CertificateType;

	public ElectronicSignature getElectronicSignature() {
		return ElectronicSignature;
	}

	public void setElectronicSignature(ElectronicSignature ElectronicSignature) {
		this.ElectronicSignature = ElectronicSignature;
	}

	public SecurityCertificatePartyRole getSecurityCertificatePartyRole() {
		return SecurityCertificatePartyRole;
	}

	public void setSecurityCertificatePartyRole(
			SecurityCertificatePartyRole SecurityCertificatePartyRole) {
		this.SecurityCertificatePartyRole = SecurityCertificatePartyRole;
	}

	public NetworkAccess getNetworkAccess() {
		return NetworkAccess;
	}

	public void setNetworkAccess(NetworkAccess NetworkAccess) {
		this.NetworkAccess = NetworkAccess;
	}

	public Max35Text getCertificateType() {
		return CertificateType;
	}

	public void setCertificateType(Max35Text CertificateType) {
		this.CertificateType = CertificateType;
	}
}