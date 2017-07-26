package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMWithdrawalCompletionAcknowledgementV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header21;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMWithdrawalCompletionAcknowledgement1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMWithdrawalCompletionAcknowledgement message is sent by an acquirer or
 * its agent to an ATM to acknowledge the receipt of an
 * ATMWithdrawalCompletionAdvice message.
 */
@NextVersion(ATMWithdrawalCompletionAcknowledgementV02.class)
public class ATMWithdrawalCompletionAcknowledgementV01 {

	private Header21 Header;
	private Optional<ContentInformationType10> ProtectedATMWithdrawalCompletionAcknowledgement;
	private Optional<ATMWithdrawalCompletionAcknowledgement1> ATMWithdrawalCompletionAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header21 getHeader() {
		return Header;
	}

	public void setHeader(Header21 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMWithdrawalCompletionAcknowledgement() {
		return ProtectedATMWithdrawalCompletionAcknowledgement;
	}

	public void setProtectedATMWithdrawalCompletionAcknowledgement(
			Optional<ContentInformationType10> ProtectedATMWithdrawalCompletionAcknowledgement) {
		this.ProtectedATMWithdrawalCompletionAcknowledgement = ProtectedATMWithdrawalCompletionAcknowledgement;
	}

	public Optional<ATMWithdrawalCompletionAcknowledgement1> getATMWithdrawalCompletionAcknowledgement() {
		return ATMWithdrawalCompletionAcknowledgement;
	}

	public void setATMWithdrawalCompletionAcknowledgement(
			Optional<ATMWithdrawalCompletionAcknowledgement1> ATMWithdrawalCompletionAcknowledgement) {
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