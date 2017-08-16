package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMTransferRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMTransferRequest message is sent by an ATM to an ATM manager to request
 * the approval of a fund transfer at the ATM.
 */
public class ATMTransferRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMTransferRequest;
	private Optional<ATMTransferRequest1> ATMTransferRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMTransferRequest() {
		return ProtectedATMTransferRequest;
	}

	public void setProtectedATMTransferRequest(
			Optional<ContentInformationType10> ProtectedATMTransferRequest) {
		this.ProtectedATMTransferRequest = ProtectedATMTransferRequest;
	}

	public Optional<ATMTransferRequest1> getATMTransferRequest() {
		return ATMTransferRequest;
	}

	public void setATMTransferRequest(
			Optional<ATMTransferRequest1> ATMTransferRequest) {
		this.ATMTransferRequest = ATMTransferRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}