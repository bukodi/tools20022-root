package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catp.ATMWithdrawalResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMWithdrawalResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMWithdrawalResponse message is sent by an acquirer or its agent to an
 * ATM in response to the ATMWithdrawalRequest to inform the ATM of the approval
 * or decline of the withdrawal transaction.
 */
@NextVersion(ATMWithdrawalResponseV02.class)
public class ATMWithdrawalResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMWithdrawalResponse;
	private Optional<ATMWithdrawalResponse1> ATMWithdrawalResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMWithdrawalResponse() {
		return ProtectedATMWithdrawalResponse;
	}

	public void setProtectedATMWithdrawalResponse(
			Optional<ContentInformationType10> ProtectedATMWithdrawalResponse) {
		this.ProtectedATMWithdrawalResponse = ProtectedATMWithdrawalResponse;
	}

	public Optional<ATMWithdrawalResponse1> getATMWithdrawalResponse() {
		return ATMWithdrawalResponse;
	}

	public void setATMWithdrawalResponse(
			Optional<ATMWithdrawalResponse1> ATMWithdrawalResponse) {
		this.ATMWithdrawalResponse = ATMWithdrawalResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}