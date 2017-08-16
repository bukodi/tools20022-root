package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMTransferResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMTransferResponse message is sent by an acquirer or its agent to inform
 * the ATM of the approval or decline of the transfer transaction.
 */
public class ATMTransferResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMTransferResponse;
	private Optional<ATMTransferResponse1> ATMTransferResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMTransferResponse() {
		return ProtectedATMTransferResponse;
	}

	public void setProtectedATMTransferResponse(
			Optional<ContentInformationType10> ProtectedATMTransferResponse) {
		this.ProtectedATMTransferResponse = ProtectedATMTransferResponse;
	}

	public Optional<ATMTransferResponse1> getATMTransferResponse() {
		return ATMTransferResponse;
	}

	public void setATMTransferResponse(
			Optional<ATMTransferResponse1> ATMTransferResponse) {
		this.ATMTransferResponse = ATMTransferResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}