package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDepositCompletionAdvice1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMDepositCompletionAdvice message is sent by an ATM to an acquirer or
 * its agent to inform of the result of a deposit transaction at an ATM. If the
 * ATM is configured to only send negative completion, a generic completion
 * message should be used instead of ATMCompletionAdvice. This message can be
 * used each time a bundle is put in the ATM safe and/or at the end of a multi
 * bundle deposit.
 */
public class ATMDepositCompletionAdviceV01 {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMDepositCompletionAdvice;
	private Optional<ATMDepositCompletionAdvice1> ATMDepositCompletionAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDepositCompletionAdvice() {
		return ProtectedATMDepositCompletionAdvice;
	}

	public void setProtectedATMDepositCompletionAdvice(
			Optional<ContentInformationType10> ProtectedATMDepositCompletionAdvice) {
		this.ProtectedATMDepositCompletionAdvice = ProtectedATMDepositCompletionAdvice;
	}

	public Optional<ATMDepositCompletionAdvice1> getATMDepositCompletionAdvice() {
		return ATMDepositCompletionAdvice;
	}

	public void setATMDepositCompletionAdvice(
			Optional<ATMDepositCompletionAdvice1> ATMDepositCompletionAdvice) {
		this.ATMDepositCompletionAdvice = ATMDepositCompletionAdvice;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}