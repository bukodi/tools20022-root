package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMCompletionAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMCompletionAdvice2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMCompletionAdvice message is sent by an ATM to an acquirer or its agent
 * to inform of the result of a transaction performed on the ATM.
 */
@PreviousVersion(ATMCompletionAdviceV01.class)
public class ATMCompletionAdviceV02 {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMCompletionAdvice;
	private Optional<ATMCompletionAdvice2> ATMCompletionAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMCompletionAdvice() {
		return ProtectedATMCompletionAdvice;
	}

	public void setProtectedATMCompletionAdvice(
			Optional<ContentInformationType10> ProtectedATMCompletionAdvice) {
		this.ProtectedATMCompletionAdvice = ProtectedATMCompletionAdvice;
	}

	public Optional<ATMCompletionAdvice2> getATMCompletionAdvice() {
		return ATMCompletionAdvice;
	}

	public void setATMCompletionAdvice(
			Optional<ATMCompletionAdvice2> ATMCompletionAdvice) {
		this.ATMCompletionAdvice = ATMCompletionAdvice;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}