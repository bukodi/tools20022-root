package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationResponseV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationResponse6;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorAuthorisationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to return the result of the validation
 * made by issuer about the payment transaction.
 */
@PreviousVersion(AcceptorAuthorisationResponseV05.class)
public class AcceptorAuthorisationResponseV06 {

	private Header30 Header;
	private AcceptorAuthorisationResponse6 AuthorisationResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationResponse6 getAuthorisationResponse() {
		return AuthorisationResponse;
	}

	public void setAuthorisationResponse(
			AcceptorAuthorisationResponse6 AuthorisationResponse) {
		this.AuthorisationResponse = AuthorisationResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}