package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.HostToATMRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The HostToATMRequest message is sent by a host to an ATM to request the ATM
 * to contact a host by sending of a maintenance messages.
 */
public class HostToATMRequestV01 {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedHostToATMRequest;
	private Optional<HostToATMRequest1> HostToATMRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedHostToATMRequest() {
		return ProtectedHostToATMRequest;
	}

	public void setProtectedHostToATMRequest(
			Optional<ContentInformationType10> ProtectedHostToATMRequest) {
		this.ProtectedHostToATMRequest = ProtectedHostToATMRequest;
	}

	public Optional<HostToATMRequest1> getHostToATMRequest() {
		return HostToATMRequest;
	}

	public void setHostToATMRequest(Optional<HostToATMRequest1> HostToATMRequest) {
		this.HostToATMRequest = HostToATMRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}