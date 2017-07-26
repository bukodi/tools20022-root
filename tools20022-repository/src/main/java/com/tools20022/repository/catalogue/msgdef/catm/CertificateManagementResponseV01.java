package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.dict.msg.Header29;
import com.tools20022.repository.dict.msg.CertificateManagementResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType13;
import java.util.Optional;

/**
 * The CertificateManagementResponse is sent by a terminal manager in response
 * to a CertificateManagementRequest to provide the outcome of the requested
 * service.
 */
public class CertificateManagementResponseV01 {

	private Header29 Header;
	private CertificateManagementResponse1 CertificateManagementResponse;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header29 getHeader() {
		return Header;
	}

	public void setHeader(Header29 Header) {
		this.Header = Header;
	}

	public CertificateManagementResponse1 getCertificateManagementResponse() {
		return CertificateManagementResponse;
	}

	public void setCertificateManagementResponse(
			CertificateManagementResponse1 CertificateManagementResponse) {
		this.CertificateManagementResponse = CertificateManagementResponse;
	}

	public Optional<ContentInformationType13> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType13> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}