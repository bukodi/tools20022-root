package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMExceptionAdvice1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMExceptionAdvice message is sent by an ATM to an acquirer or its agent
 * to inform of that an exception occurred outside a service.
 */
public class ATMExceptionAdviceV01 {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMExceptionAdvice;
	private Optional<ATMExceptionAdvice1> ATMExceptionAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMExceptionAdvice() {
		return ProtectedATMExceptionAdvice;
	}

	public void setProtectedATMExceptionAdvice(
			Optional<ContentInformationType10> ProtectedATMExceptionAdvice) {
		this.ProtectedATMExceptionAdvice = ProtectedATMExceptionAdvice;
	}

	public Optional<ATMExceptionAdvice1> getATMExceptionAdvice() {
		return ATMExceptionAdvice;
	}

	public void setATMExceptionAdvice(
			Optional<ATMExceptionAdvice1> ATMExceptionAdvice) {
		this.ATMExceptionAdvice = ATMExceptionAdvice;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}