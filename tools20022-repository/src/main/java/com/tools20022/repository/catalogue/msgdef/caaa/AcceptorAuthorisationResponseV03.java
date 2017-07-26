package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationResponseV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationResponse3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorAuthorisationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to return the result of the validation
 * made by issuer about the payment transaction.
 */
@PreviousVersion(AcceptorAuthorisationResponseV02.class)
@NextVersion(AcceptorAuthorisationResponseV04.class)
public class AcceptorAuthorisationResponseV03 {

	private Header7 Header;
	private AcceptorAuthorisationResponse3 AuthorisationResponse;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationResponse3 getAuthorisationResponse() {
		return AuthorisationResponse;
	}

	public void setAuthorisationResponse(
			AcceptorAuthorisationResponse3 AuthorisationResponse) {
		this.AuthorisationResponse = AuthorisationResponse;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}