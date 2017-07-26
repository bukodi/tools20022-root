package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDepositRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMDepositRequest message is sent by an ATM to an acquirer or its agent
 * to request the approval of a deposit transaction at an ATM, before or after
 * deposit media inside the ATM.
 */
public class ATMDepositRequestV01 {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMDepositRequest;
	private Optional<ATMDepositRequest1> ATMDepositRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDepositRequest() {
		return ProtectedATMDepositRequest;
	}

	public void setProtectedATMDepositRequest(
			Optional<ContentInformationType10> ProtectedATMDepositRequest) {
		this.ProtectedATMDepositRequest = ProtectedATMDepositRequest;
	}

	public Optional<ATMDepositRequest1> getATMDepositRequest() {
		return ATMDepositRequest;
	}

	public void setATMDepositRequest(
			Optional<ATMDepositRequest1> ATMDepositRequest) {
		this.ATMDepositRequest = ATMDepositRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}