package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catp.ATMWithdrawalRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMWithdrawalRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMWithdrawalRequest message is sent by an ATM to an acquirer or its
 * agent to request the approval of a withdrawal transaction at an ATM.
 */
@PreviousVersion(ATMWithdrawalRequestV01.class)
public class ATMWithdrawalRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMWithdrawalRequest;
	private Optional<ATMWithdrawalRequest2> ATMWithdrawalRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMWithdrawalRequest() {
		return ProtectedATMWithdrawalRequest;
	}

	public void setProtectedATMWithdrawalRequest(
			Optional<ContentInformationType10> ProtectedATMWithdrawalRequest) {
		this.ProtectedATMWithdrawalRequest = ProtectedATMWithdrawalRequest;
	}

	public Optional<ATMWithdrawalRequest2> getATMWithdrawalRequest() {
		return ATMWithdrawalRequest;
	}

	public void setATMWithdrawalRequest(
			Optional<ATMWithdrawalRequest2> ATMWithdrawalRequest) {
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