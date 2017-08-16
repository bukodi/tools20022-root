package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catp.ATMPINManagementRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMPINManagementRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMPINManagementRequest message is sent by an ATM to an ATM manager to
 * request an operation on the cardholder PIN.
 */
@PreviousVersion(ATMPINManagementRequestV01.class)
public class ATMPINManagementRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMPINManagementRequest;
	private Optional<ATMPINManagementRequest2> ATMPINManagementRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMPINManagementRequest() {
		return ProtectedATMPINManagementRequest;
	}

	public void setProtectedATMPINManagementRequest(
			Optional<ContentInformationType10> ProtectedATMPINManagementRequest) {
		this.ProtectedATMPINManagementRequest = ProtectedATMPINManagementRequest;
	}

	public Optional<ATMPINManagementRequest2> getATMPINManagementRequest() {
		return ATMPINManagementRequest;
	}

	public void setATMPINManagementRequest(
			Optional<ATMPINManagementRequest2> ATMPINManagementRequest) {
		this.ATMPINManagementRequest = ATMPINManagementRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}