package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMExceptionAcknowledgement1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMExceptionAcknowledgement message is sent by an acquirer or its agent
 * to an ATM to acknowledge the receipt of an ATMExceptionAdvice message.
 */
public class ATMExceptionAcknowledgementV01 {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMExceptionAcknowledgement;
	private Optional<ATMExceptionAcknowledgement1> ATMExceptionAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMExceptionAcknowledgement() {
		return ProtectedATMExceptionAcknowledgement;
	}

	public void setProtectedATMExceptionAcknowledgement(
			Optional<ContentInformationType10> ProtectedATMExceptionAcknowledgement) {
		this.ProtectedATMExceptionAcknowledgement = ProtectedATMExceptionAcknowledgement;
	}

	public Optional<ATMExceptionAcknowledgement1> getATMExceptionAcknowledgement() {
		return ATMExceptionAcknowledgement;
	}

	public void setATMExceptionAcknowledgement(
			Optional<ATMExceptionAcknowledgement1> ATMExceptionAcknowledgement) {
		this.ATMExceptionAcknowledgement = ATMExceptionAcknowledgement;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}