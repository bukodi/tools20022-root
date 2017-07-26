package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMWithdrawalRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMWithdrawalRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMWithdrawalRequest message is sent by an ATM to an acquirer or its
 * agent to request the approval of a withdrawal transaction at an ATM.
 */
@NextVersion(ATMWithdrawalRequestV02.class)
public class ATMWithdrawalRequestV01 {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMWithdrawalRequest;
	private Optional<ATMWithdrawalRequest1> ATMWithdrawalRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMWithdrawalRequest() {
		return ProtectedATMWithdrawalRequest;
	}

	public void setProtectedATMWithdrawalRequest(
			Optional<ContentInformationType10> ProtectedATMWithdrawalRequest) {
		this.ProtectedATMWithdrawalRequest = ProtectedATMWithdrawalRequest;
	}

	public Optional<ATMWithdrawalRequest1> getATMWithdrawalRequest() {
		return ATMWithdrawalRequest;
	}

	public void setATMWithdrawalRequest(
			Optional<ATMWithdrawalRequest1> ATMWithdrawalRequest) {
		this.ATMWithdrawalRequest = ATMWithdrawalRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}