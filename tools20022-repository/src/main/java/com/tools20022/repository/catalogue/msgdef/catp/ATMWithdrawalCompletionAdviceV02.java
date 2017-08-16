package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catp.ATMWithdrawalCompletionAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMWithdrawalCompletionAdvice2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMWithdrawalCompletionAdvice message is sent by an ATM to an acquirer or
 * its agent to inform of the result of a withdrawal transaction at an ATM. If
 * the ATM is configured to only send negative completion, a generic completion
 * message should be used instead of ATMCompletionAdvice.
 */
@PreviousVersion(ATMWithdrawalCompletionAdviceV01.class)
public class ATMWithdrawalCompletionAdviceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMWithdrawalCompletionAdvice;
	private Optional<ATMWithdrawalCompletionAdvice2> ATMWithdrawalCompletionAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMWithdrawalCompletionAdvice() {
		return ProtectedATMWithdrawalCompletionAdvice;
	}

	public void setProtectedATMWithdrawalCompletionAdvice(
			Optional<ContentInformationType10> ProtectedATMWithdrawalCompletionAdvice) {
		this.ProtectedATMWithdrawalCompletionAdvice = ProtectedATMWithdrawalCompletionAdvice;
	}

	public Optional<ATMWithdrawalCompletionAdvice2> getATMWithdrawalCompletionAdvice() {
		return ATMWithdrawalCompletionAdvice;
	}

	public void setATMWithdrawalCompletionAdvice(
			Optional<ATMWithdrawalCompletionAdvice2> ATMWithdrawalCompletionAdvice) {
		this.ATMWithdrawalCompletionAdvice = ATMWithdrawalCompletionAdvice;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}