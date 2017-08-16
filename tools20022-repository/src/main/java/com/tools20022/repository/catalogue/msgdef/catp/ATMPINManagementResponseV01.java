package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catp.ATMPINManagementResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMPINManagementResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMPINManagementResponse message is sent by an ATM manager or its agent
 * to the ATM to provide the information and the outcome of the cardholder PIN
 * operation requested in the ATMPINManagementRequest.
 */
@NextVersion(ATMPINManagementResponseV02.class)
public class ATMPINManagementResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMPINManagementResponse;
	private Optional<ATMPINManagementResponse1> ATMPINManagementResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMPINManagementResponse() {
		return ProtectedATMPINManagementResponse;
	}

	public void setProtectedATMPINManagementResponse(
			Optional<ContentInformationType10> ProtectedATMPINManagementResponse) {
		this.ProtectedATMPINManagementResponse = ProtectedATMPINManagementResponse;
	}

	public Optional<ATMPINManagementResponse1> getATMPINManagementResponse() {
		return ATMPINManagementResponse;
	}

	public void setATMPINManagementResponse(
			Optional<ATMPINManagementResponse1> ATMPINManagementResponse) {
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