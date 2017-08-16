package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caam.ATMKeyDownloadResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMKeyDownloadResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType13;

/**
 * The ATMKeyDownloadResponse message is sent from an acquirer to an ATM in
 * response to an ATMKeyDownloadRequest message, to download of one or several
 * cryptographic keys.
 */
@NextVersion(ATMKeyDownloadResponseV02.class)
public class ATMKeyDownloadResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMKeyDownloadResponse;
	private Optional<ATMKeyDownloadResponse1> ATMKeyDownloadResponse;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMKeyDownloadResponse() {
		return ProtectedATMKeyDownloadResponse;
	}

	public void setProtectedATMKeyDownloadResponse(
			Optional<ContentInformationType10> ProtectedATMKeyDownloadResponse) {
		this.ProtectedATMKeyDownloadResponse = ProtectedATMKeyDownloadResponse;
	}

	public Optional<ATMKeyDownloadResponse1> getATMKeyDownloadResponse() {
		return ATMKeyDownloadResponse;
	}

	public void setATMKeyDownloadResponse(
			Optional<ATMKeyDownloadResponse1> ATMKeyDownloadResponse) {
		this.ATMKeyDownloadResponse = ATMKeyDownloadResponse;
	}

	public Optional<ContentInformationType13> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType13> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}