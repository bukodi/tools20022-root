package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header17;
import com.tools20022.repository.dict.msg.AcquirerKeyExchangeResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * The KeyExchangeResponse message is sent by an acquirer, an issuer or an agent
 * to answer to a KeyExchangeInitiation message and complete a cryptographic key
 * exchange.
 */
public class KeyExchangeResponse
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header17 Header;
	private AcquirerKeyExchangeResponse1 KeyExchangeResponse;
	private ContentInformationType12 SecurityTrailer;

	public Header17 getHeader() {
		return Header;
	}

	public void setHeader(Header17 Header) {
		this.Header = Header;
	}

	public AcquirerKeyExchangeResponse1 getKeyExchangeResponse() {
		return KeyExchangeResponse;
	}

	public void setKeyExchangeResponse(
			AcquirerKeyExchangeResponse1 KeyExchangeResponse) {
		this.KeyExchangeResponse = KeyExchangeResponse;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}