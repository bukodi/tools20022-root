package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.catalogue.msgdef.caam.ATMKeyDownloadRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMKeyDownloadRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType13;

/**
 * The ATMKeyDownloadRequest message is sent by an ATM to an ATM manager to
 * initiate the download of one or several cryptographic keys.
 */
@PreviousVersion(ATMKeyDownloadRequestV01.class)
public class ATMKeyDownloadRequestV02 {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMKeyDownloadRequest;
	private Optional<ATMKeyDownloadRequest2> ATMKeyDownloadRequest;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMKeyDownloadRequest() {
		return ProtectedATMKeyDownloadRequest;
	}

	public void setProtectedATMKeyDownloadRequest(
			Optional<ContentInformationType10> ProtectedATMKeyDownloadRequest) {
		this.ProtectedATMKeyDownloadRequest = ProtectedATMKeyDownloadRequest;
	}

	public Optional<ATMKeyDownloadRequest2> getATMKeyDownloadRequest() {
		return ATMKeyDownloadRequest;
	}

	public void setATMKeyDownloadRequest(
			Optional<ATMKeyDownloadRequest2> ATMKeyDownloadRequest) {
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