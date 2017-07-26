package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMPINManagementRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMPINManagementRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMPINManagementRequest message is sent by an ATM to an ATM manager to
 * request an operation on the cardholder PIN.
 */
@NextVersion(ATMPINManagementRequestV02.class)
public class ATMPINManagementRequestV01 {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMPINManagementRequest;
	private Optional<ATMPINManagementRequest1> ATMPINManagementRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMPINManagementRequest() {
		return ProtectedATMPINManagementRequest;
	}

	public void setProtectedATMPINManagementRequest(
			Optional<ContentInformationType10> ProtectedATMPINManagementRequest) {
		this.ProtectedATMPINManagementRequest = ProtectedATMPINManagementRequest;
	}

	public Optional<ATMPINManagementRequest1> getATMPINManagementRequest() {
		return ATMPINManagementRequest;
	}

	public void setATMPINManagementRequest(
			Optional<ATMPINManagementRequest1> ATMPINManagementRequest) {
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