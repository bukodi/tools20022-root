package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorAuthorisationResponse message is sent by the acquirer to
 * inform the card acceptor of the outcome of the authorisation process. The
 * message can be sent directly to the acceptor or through an agent. Usage The
 * AcceptorAuthorisationResponse message is used to indicate one of the possible
 * outcomes of an authorisation process: - a successful authorisation; - a
 * decline from the acquirer for financial reasons; - a decline from the
 * acquirer for technical reasons (for instance, a timeout).
 */
@NextVersion(AcceptorAuthorisationResponseV02.class)
public class AcceptorAuthorisationResponseV01 {

	private Header1 Header;
	private AcceptorAuthorisationResponse1 AuthorisationResponse;
	private ContentInformationType3 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationResponse1 getAuthorisationResponse() {
		return AuthorisationResponse;
	}

	public void setAuthorisationResponse(
			AcceptorAuthorisationResponse1 AuthorisationResponse) {
		this.AuthorisationResponse = AuthorisationResponse;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}