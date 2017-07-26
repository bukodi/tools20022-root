package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.catalogue.msgdef.caam.ATMReconciliationAcknowledgementV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header21;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMReconciliationAcknowledgement1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMReconciliationAcknowledgement message is sent by an acquirer or its
 * agent to an ATM to acknowledge the receipt of an ATMReconciliationAdvice
 * message.
 */
@NextVersion(ATMReconciliationAcknowledgementV02.class)
public class ATMReconciliationAcknowledgementV01 {

	private Header21 Header;
	private Optional<ContentInformationType10> ProtectedATMReconciliationAcknowledgement;
	private Optional<ATMReconciliationAcknowledgement1> ATMReconciliationAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header21 getHeader() {
		return Header;
	}

	public void setHeader(Header21 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMReconciliationAcknowledgement() {
		return ProtectedATMReconciliationAcknowledgement;
	}

	public void setProtectedATMReconciliationAcknowledgement(
			Optional<ContentInformationType10> ProtectedATMReconciliationAcknowledgement) {
		this.ProtectedATMReconciliationAcknowledgement = ProtectedATMReconciliationAcknowledgement;
	}

	public Optional<ATMReconciliationAcknowledgement1> getATMReconciliationAcknowledgement() {
		return ATMReconciliationAcknowledgement;
	}

	public void setATMReconciliationAcknowledgement(
			Optional<ATMReconciliationAcknowledgement1> ATMReconciliationAcknowledgement) {
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