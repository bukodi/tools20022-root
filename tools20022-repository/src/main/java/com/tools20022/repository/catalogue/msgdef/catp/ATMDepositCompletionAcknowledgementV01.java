package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDepositCompletionAcknowledgement1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMDepositCompletionAcknowledgement message is sent by an acquirer or its
 * agent to an ATM to acknowledge the receipt of an ATMDepositCompletionAdvice
 * message.
 */
public class ATMDepositCompletionAcknowledgementV01 {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMDepositCompletionAcknowledgement;
	private Optional<ATMDepositCompletionAcknowledgement1> ATMDepositCompletionAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDepositCompletionAcknowledgement() {
		return ProtectedATMDepositCompletionAcknowledgement;
	}

	public void setProtectedATMDepositCompletionAcknowledgement(
			Optional<ContentInformationType10> ProtectedATMDepositCompletionAcknowledgement) {
		this.ProtectedATMDepositCompletionAcknowledgement = ProtectedATMDepositCompletionAcknowledgement;
	}

	public Optional<ATMDepositCompletionAcknowledgement1> getATMDepositCompletionAcknowledgement() {
		return ATMDepositCompletionAcknowledgement;
	}

	public void setATMDepositCompletionAcknowledgement(
			Optional<ATMDepositCompletionAcknowledgement1> ATMDepositCompletionAcknowledgement) {
		this.ATMDepositCompletionAcknowledgement = ATMDepositCompletionAcknowledgement;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}