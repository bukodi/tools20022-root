package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMCompletionAcknowledgementV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMCompletionAcknowledgement2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMCompletionAcknowledgement message is sent by an acquirer or its agent
 * to an ATM to acknowledge the receipt of an ATMCompletionAdvice message.
 */
@PreviousVersion(ATMCompletionAcknowledgementV01.class)
public class ATMCompletionAcknowledgementV02 {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMCompletionAcknowledgement;
	private Optional<ATMCompletionAcknowledgement2> ATMCompletionAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMCompletionAcknowledgement() {
		return ProtectedATMCompletionAcknowledgement;
	}

	public void setProtectedATMCompletionAcknowledgement(
			Optional<ContentInformationType10> ProtectedATMCompletionAcknowledgement) {
		this.ProtectedATMCompletionAcknowledgement = ProtectedATMCompletionAcknowledgement;
	}

	public Optional<ATMCompletionAcknowledgement2> getATMCompletionAcknowledgement() {
		return ATMCompletionAcknowledgement;
	}

	public void setATMCompletionAcknowledgement(
			Optional<ATMCompletionAcknowledgement2> ATMCompletionAcknowledgement) {
		this.ATMCompletionAcknowledgement = ATMCompletionAcknowledgement;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}