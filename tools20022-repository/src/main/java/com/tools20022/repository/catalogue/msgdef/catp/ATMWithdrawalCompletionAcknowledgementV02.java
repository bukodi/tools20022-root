package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMWithdrawalCompletionAcknowledgementV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMWithdrawalCompletionAcknowledgement2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMWithdrawalCompletionAcknowledgement message is sent by an acquirer or
 * its agent to an ATM to acknowledge the receipt of an
 * ATMWithdrawalCompletionAdvice message.
 */
@PreviousVersion(ATMWithdrawalCompletionAcknowledgementV01.class)
public class ATMWithdrawalCompletionAcknowledgementV02 {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMWithdrawalCompletionAcknowledgement;
	private Optional<ATMWithdrawalCompletionAcknowledgement2> ATMWithdrawalCompletionAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMWithdrawalCompletionAcknowledgement() {
		return ProtectedATMWithdrawalCompletionAcknowledgement;
	}

	public void setProtectedATMWithdrawalCompletionAcknowledgement(
			Optional<ContentInformationType10> ProtectedATMWithdrawalCompletionAcknowledgement) {
		this.ProtectedATMWithdrawalCompletionAcknowledgement = ProtectedATMWithdrawalCompletionAcknowledgement;
	}

	public Optional<ATMWithdrawalCompletionAcknowledgement2> getATMWithdrawalCompletionAcknowledgement() {
		return ATMWithdrawalCompletionAcknowledgement;
	}

	public void setATMWithdrawalCompletionAcknowledgement(
			Optional<ATMWithdrawalCompletionAcknowledgement2> ATMWithdrawalCompletionAcknowledgement) {
		this.ATMWithdrawalCompletionAcknowledgement = ATMWithdrawalCompletionAcknowledgement;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}