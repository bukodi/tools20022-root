package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationRequestV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationRequest6;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorAuthorisationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent) , to check with the issuer (or its
 * agent) that the account associated to the card has the resources to fund the
 * payment. This checking will include validation of the card data and any
 * additional transaction data provided.
 */
@PreviousVersion(AcceptorAuthorisationRequestV05.class)
public class AcceptorAuthorisationRequestV06 {

	private Header30 Header;
	private AcceptorAuthorisationRequest6 AuthorisationRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationRequest6 getAuthorisationRequest() {
		return AuthorisationRequest;
	}

	public void setAuthorisationRequest(
			AcceptorAuthorisationRequest6 AuthorisationRequest) {
		this.AuthorisationRequest = AuthorisationRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}