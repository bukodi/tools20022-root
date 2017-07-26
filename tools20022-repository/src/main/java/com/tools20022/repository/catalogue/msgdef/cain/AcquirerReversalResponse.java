package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.repository.dict.msg.Header18;
import com.tools20022.repository.dict.msg.AcquirerReversalResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcquirerReversalResponse message is sent by an issuer or an agent to
 * answer to an AcquirerReversalInitiation message.
 */
public class AcquirerReversalResponse {

	private Header18 Header;
	private AcquirerReversalResponse1 ReversalResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header18 getHeader() {
		return Header;
	}

	public void setHeader(Header18 Header) {
		this.Header = Header;
	}

	public AcquirerReversalResponse1 getReversalResponse() {
		return ReversalResponse;
	}

	public void setReversalResponse(AcquirerReversalResponse1 ReversalResponse) {
		this.ReversalResponse = ReversalResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}