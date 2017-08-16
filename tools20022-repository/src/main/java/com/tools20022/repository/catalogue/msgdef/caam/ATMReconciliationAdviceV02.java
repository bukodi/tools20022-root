package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caam.ATMReconciliationAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMReconciliationAdvice2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMReconciliationAdvice message is sent by an ATM to an acquirer or its
 * agent to send all the counters of the ATM. It can be sent by an operator
 * function or as a response of a command sent by an agent or a server.
 */
@PreviousVersion(ATMReconciliationAdviceV01.class)
public class ATMReconciliationAdviceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMReconciliationAdvice;
	private Optional<ATMReconciliationAdvice2> ATMReconciliationAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMReconciliationAdvice() {
		return ProtectedATMReconciliationAdvice;
	}

	public void setProtectedATMReconciliationAdvice(
			Optional<ContentInformationType10> ProtectedATMReconciliationAdvice) {
		this.ProtectedATMReconciliationAdvice = ProtectedATMReconciliationAdvice;
	}

	public Optional<ATMReconciliationAdvice2> getATMReconciliationAdvice() {
		return ATMReconciliationAdvice;
	}

	public void setATMReconciliationAdvice(
			Optional<ATMReconciliationAdvice2> ATMReconciliationAdvice) {
		this.ATMReconciliationAdvice = ATMReconciliationAdvice;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}