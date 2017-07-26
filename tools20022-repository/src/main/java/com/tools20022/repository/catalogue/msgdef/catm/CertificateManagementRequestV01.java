package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.dict.msg.Header29;
import com.tools20022.repository.dict.msg.CertificateManagementRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType13;
import java.util.Optional;

/**
 * The certificate management request message is sent by a POI terminal or any
 * intermediary entity either to a terminal manager acting as a certificate
 * authority for managing X.509 certificate of a public key owned by the
 * initiating party, or for requesting the inclusion or the removal of the POI
 * to a white list of the terminal manager.
 */
public class CertificateManagementRequestV01 {

	private Header29 Header;
	private CertificateManagementRequest1 CertificateManagementRequest;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header29 getHeader() {
		return Header;
	}

	public void setHeader(Header29 Header) {
		this.Header = Header;
	}

	public CertificateManagementRequest1 getCertificateManagementRequest() {
		return CertificateManagementRequest;
	}

	public void setCertificateManagementRequest(
			CertificateManagementRequest1 CertificateManagementRequest) {
		this.CertificateManagementRequest = CertificateManagementRequest;
	}

	public Optional<ContentInformationType13> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType13> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}