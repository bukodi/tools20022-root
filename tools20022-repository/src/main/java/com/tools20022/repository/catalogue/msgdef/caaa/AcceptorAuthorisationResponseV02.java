package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorAuthorisationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to return the result of the validation
 * made by issuer about the payment transaction.
 */
@PreviousVersion(AcceptorAuthorisationResponseV01.class)
@NextVersion(AcceptorAuthorisationResponseV03.class)
public class AcceptorAuthorisationResponseV02 {

	private Header1 Header;
	private AcceptorAuthorisationResponse2 AuthorisationResponse;
	private ContentInformationType6 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationResponse2 getAuthorisationResponse() {
		return AuthorisationResponse;
	}

	public void setAuthorisationResponse(
			AcceptorAuthorisationResponse2 AuthorisationResponse) {
		this.AuthorisationResponse = AuthorisationResponse;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}