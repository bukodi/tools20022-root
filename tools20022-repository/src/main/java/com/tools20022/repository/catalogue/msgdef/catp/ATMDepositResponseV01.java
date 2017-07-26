package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDepositResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMDepositResponse message is sent by an ATM manager or its agent to
 * inform the ATM of the approval or decline of the deposit transaction.
 */
public class ATMDepositResponseV01 {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMDepositResponse;
	private Optional<ATMDepositResponse1> ATMDepositResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDepositResponse() {
		return ProtectedATMDepositResponse;
	}

	public void setProtectedATMDepositResponse(
			Optional<ContentInformationType10> ProtectedATMDepositResponse) {
		this.ProtectedATMDepositResponse = ProtectedATMDepositResponse;
	}

	public Optional<ATMDepositResponse1> getATMDepositResponse() {
		return ATMDepositResponse;
	}

	public void setATMDepositResponse(
			Optional<ATMDepositResponse1> ATMDepositResponse) {
		this.ATMDepositResponse = ATMDepositResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}