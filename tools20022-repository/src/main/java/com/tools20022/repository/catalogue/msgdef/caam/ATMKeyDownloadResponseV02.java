package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caam.ATMKeyDownloadResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMKeyDownloadResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType13;

/**
 * The ATMKeyDownloadResponse message is sent from an acquirer to an ATM in
 * response to an ATMKeyDownloadRequest message, to download of one or several
 * cryptographic keys.
 */
@PreviousVersion(ATMKeyDownloadResponseV01.class)
public class ATMKeyDownloadResponseV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMKeyDownloadResponse;
	private Optional<ATMKeyDownloadResponse2> ATMKeyDownloadResponse;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMKeyDownloadResponse() {
		return ProtectedATMKeyDownloadResponse;
	}

	public void setProtectedATMKeyDownloadResponse(
			Optional<ContentInformationType10> ProtectedATMKeyDownloadResponse) {
		this.ProtectedATMKeyDownloadResponse = ProtectedATMKeyDownloadResponse;
	}

	public Optional<ATMKeyDownloadResponse2> getATMKeyDownloadResponse() {
		return ATMKeyDownloadResponse;
	}

	public void setATMKeyDownloadResponse(
			Optional<ATMKeyDownloadResponse2> ATMKeyDownloadResponse) {
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