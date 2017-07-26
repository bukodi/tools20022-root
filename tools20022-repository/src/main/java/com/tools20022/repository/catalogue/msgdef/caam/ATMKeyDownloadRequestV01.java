package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.catalogue.msgdef.caam.ATMKeyDownloadRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMKeyDownloadRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType13;

/**
 * The ATMKeyDownloadRequest message is sent by an ATM to an ATM manager to
 * initiate the download of one or several cryptographic keys.
 */
@NextVersion(ATMKeyDownloadRequestV02.class)
public class ATMKeyDownloadRequestV01 {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMKeyDownloadRequest;
	private Optional<ATMKeyDownloadRequest1> ATMKeyDownloadRequest;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMKeyDownloadRequest() {
		return ProtectedATMKeyDownloadRequest;
	}

	public void setProtectedATMKeyDownloadRequest(
			Optional<ContentInformationType10> ProtectedATMKeyDownloadRequest) {
		this.ProtectedATMKeyDownloadRequest = ProtectedATMKeyDownloadRequest;
	}

	public Optional<ATMKeyDownloadRequest1> getATMKeyDownloadRequest() {
		return ATMKeyDownloadRequest;
	}

	public void setATMKeyDownloadRequest(
			Optional<ATMKeyDownloadRequest1> ATMKeyDownloadRequest) {
		this.ATMKeyDownloadRequest = ATMKeyDownloadRequest;
	}

	public Optional<ContentInformationType13> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType13> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}