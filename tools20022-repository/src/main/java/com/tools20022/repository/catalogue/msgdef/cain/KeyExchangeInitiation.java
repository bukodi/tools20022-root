package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.repository.dict.msg.Header17;
import com.tools20022.repository.dict.msg.AcquirerKeyExchangeInitiation1;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * The KeyExchangeInitiation message is sent by any party to an acquirer, an
 * issuer or an agent, to initiate a cryptographic key exchange.
 */
public class KeyExchangeInitiation {

	private Header17 Header;
	private AcquirerKeyExchangeInitiation1 KeyExchangeInitiation;
	private ContentInformationType12 SecurityTrailer;

	public Header17 getHeader() {
		return Header;
	}

	public void setHeader(Header17 Header) {
		this.Header = Header;
	}

	public AcquirerKeyExchangeInitiation1 getKeyExchangeInitiation() {
		return KeyExchangeInitiation;
	}

	public void setKeyExchangeInitiation(
			AcquirerKeyExchangeInitiation1 KeyExchangeInitiation) {
		this.KeyExchangeInitiation = KeyExchangeInitiation;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}