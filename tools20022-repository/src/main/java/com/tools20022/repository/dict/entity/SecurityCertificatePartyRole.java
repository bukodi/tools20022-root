package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.SecurityCertificate;

/**
 * Role played by a party in the context of a security certificate
 */
public class SecurityCertificatePartyRole extends Role {

	private SecurityCertificate SecurityCertificate;

	public SecurityCertificate getSecurityCertificate() {
		return SecurityCertificate;
	}

	public void setSecurityCertificate(SecurityCertificate SecurityCertificate) {
		this.SecurityCertificate = SecurityCertificate;
	}
}