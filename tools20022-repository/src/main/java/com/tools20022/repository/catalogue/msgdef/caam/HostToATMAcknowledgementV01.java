package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.HostToATMAcknowledgement1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The HostToATMAcknowledgement message is sent by an ATM to a host to
 * acknowledge the receipt of a HostToATMRequest message.
 */
public class HostToATMAcknowledgementV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedHostToATMAcknowledgement;
	private Optional<HostToATMAcknowledgement1> HostToATMAcknowledgement;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedHostToATMAcknowledgement() {
		return ProtectedHostToATMAcknowledgement;
	}

	public void setProtectedHostToATMAcknowledgement(
			Optional<ContentInformationType10> ProtectedHostToATMAcknowledgement) {
		this.ProtectedHostToATMAcknowledgement = ProtectedHostToATMAcknowledgement;
	}

	public Optional<HostToATMAcknowledgement1> getHostToATMAcknowledgement() {
		return HostToATMAcknowledgement;
	}

	public void setHostToATMAcknowledgement(
			Optional<HostToATMAcknowledgement1> HostToATMAcknowledgement) {
		this.HostToATMAcknowledgement = HostToATMAcknowledgement;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}