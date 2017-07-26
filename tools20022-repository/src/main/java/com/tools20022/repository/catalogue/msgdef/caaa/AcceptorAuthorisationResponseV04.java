package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationResponseV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationResponse4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorAuthorisationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to return the result of the validation
 * made by issuer about the payment transaction.
 */
@PreviousVersion(AcceptorAuthorisationResponseV03.class)
@NextVersion(AcceptorAuthorisationResponseV05.class)
public class AcceptorAuthorisationResponseV04 {

	private Header10 Header;
	private AcceptorAuthorisationResponse4 AuthorisationResponse;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationResponse4 getAuthorisationResponse() {
		return AuthorisationResponse;
	}

	public void setAuthorisationResponse(
			AcceptorAuthorisationResponse4 AuthorisationResponse) {
		this.AuthorisationResponse = AuthorisationResponse;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}