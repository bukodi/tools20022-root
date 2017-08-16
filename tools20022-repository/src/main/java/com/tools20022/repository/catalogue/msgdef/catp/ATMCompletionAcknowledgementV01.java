package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catp.ATMCompletionAcknowledgementV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header21;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMCompletionAcknowledgement1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMCompletionAcknowledgement message is sent by an acquirer or its agent
 * to an ATM to acknowledge the receipt of an ATMCompletionAdvice message.
 */
@NextVersion(ATMCompletionAcknowledgementV02.class)
public class ATMCompletionAcknowledgementV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header21 Header;
	private Optional<ContentInformationType10> ProtectedATMCompletionAcknowledgement;
	private Optional<ATMCompletionAcknowledgement1> ATMCompletionAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header21 getHeader() {
		return Header;
	}

	public void setHeader(Header21 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMCompletionAcknowledgement() {
		return ProtectedATMCompletionAcknowledgement;
	}

	public void setProtectedATMCompletionAcknowledgement(
			Optional<ContentInformationType10> ProtectedATMCompletionAcknowledgement) {
		this.ProtectedATMCompletionAcknowledgement = ProtectedATMCompletionAcknowledgement;
	}

	public Optional<ATMCompletionAcknowledgement1> getATMCompletionAcknowledgement() {
		return ATMCompletionAcknowledgement;
	}

	public void setATMCompletionAcknowledgement(
			Optional<ATMCompletionAcknowledgement1> ATMCompletionAcknowledgement) {
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