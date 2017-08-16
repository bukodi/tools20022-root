package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caam.ATMReconciliationAcknowledgementV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header32;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMReconciliationAcknowledgement2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMReconciliationAcknowledgement message is sent by an acquirer or its
 * agent to an ATM to acknowledge the receipt of an ATMReconciliationAdvice
 * message.
 */
@PreviousVersion(ATMReconciliationAcknowledgementV01.class)
public class ATMReconciliationAcknowledgementV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header32 Header;
	private Optional<ContentInformationType10> ProtectedATMReconciliationAcknowledgement;
	private Optional<ATMReconciliationAcknowledgement2> ATMReconciliationAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header32 getHeader() {
		return Header;
	}

	public void setHeader(Header32 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMReconciliationAcknowledgement() {
		return ProtectedATMReconciliationAcknowledgement;
	}

	public void setProtectedATMReconciliationAcknowledgement(
			Optional<ContentInformationType10> ProtectedATMReconciliationAcknowledgement) {
		this.ProtectedATMReconciliationAcknowledgement = ProtectedATMReconciliationAcknowledgement;
	}

	public Optional<ATMReconciliationAcknowledgement2> getATMReconciliationAcknowledgement() {
		return ATMReconciliationAcknowledgement;
	}

	public void setATMReconciliationAcknowledgement(
			Optional<ATMReconciliationAcknowledgement2> ATMReconciliationAcknowledgement) {
		this.ATMReconciliationAcknowledgement = ATMReconciliationAcknowledgement;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}