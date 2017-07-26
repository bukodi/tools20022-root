package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMCompletionAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header21;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMCompletionAdvice1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMCompletionAdvice message is sent by an ATM to an acquirer or its agent
 * to inform of the result of a transaction performed on the ATM.
 */
@NextVersion(ATMCompletionAdviceV02.class)
public class ATMCompletionAdviceV01 {

	private Header21 Header;
	private Optional<ContentInformationType10> ProtectedATMCompletionAdvice;
	private Optional<ATMCompletionAdvice1> ATMCompletionAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header21 getHeader() {
		return Header;
	}

	public void setHeader(Header21 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMCompletionAdvice() {
		return ProtectedATMCompletionAdvice;
	}

	public void setProtectedATMCompletionAdvice(
			Optional<ContentInformationType10> ProtectedATMCompletionAdvice) {
		this.ProtectedATMCompletionAdvice = ProtectedATMCompletionAdvice;
	}

	public Optional<ATMCompletionAdvice1> getATMCompletionAdvice() {
		return ATMCompletionAdvice;
	}

	public void setATMCompletionAdvice(
			Optional<ATMCompletionAdvice1> ATMCompletionAdvice) {
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