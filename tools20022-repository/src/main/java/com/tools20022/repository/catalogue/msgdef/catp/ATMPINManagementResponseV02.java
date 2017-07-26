package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMPINManagementResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMPINManagementResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMPINManagementResponse message is sent by an ATM manager or its agent
 * to the ATM to provide the information and the outcome of the cardholder PIN
 * operation requested in the ATMPINManagementRequest.
 */
@PreviousVersion(ATMPINManagementResponseV01.class)
public class ATMPINManagementResponseV02 {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMPINManagementResponse;
	private Optional<ATMPINManagementResponse2> ATMPINManagementResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMPINManagementResponse() {
		return ProtectedATMPINManagementResponse;
	}

	public void setProtectedATMPINManagementResponse(
			Optional<ContentInformationType10> ProtectedATMPINManagementResponse) {
		this.ProtectedATMPINManagementResponse = ProtectedATMPINManagementResponse;
	}

	public Optional<ATMPINManagementResponse2> getATMPINManagementResponse() {
		return ATMPINManagementResponse;
	}

	public void setATMPINManagementResponse(
			Optional<ATMPINManagementResponse2> ATMPINManagementResponse) {
		this.ATMPINManagementResponse = ATMPINManagementResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}