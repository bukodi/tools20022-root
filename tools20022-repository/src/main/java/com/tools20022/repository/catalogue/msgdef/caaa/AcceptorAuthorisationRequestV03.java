package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationRequest3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorAuthorisationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent) , to check with the issuer (or its
 * agent) that the account associated to the card has the resources to fund the
 * payment. This checking will include validation of the card data and any
 * additional transaction data provided.
 */
@PreviousVersion(AcceptorAuthorisationRequestV02.class)
@NextVersion(AcceptorAuthorisationRequestV04.class)
public class AcceptorAuthorisationRequestV03 {

	private Header7 Header;
	private AcceptorAuthorisationRequest3 AuthorisationRequest;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationRequest3 getAuthorisationRequest() {
		return AuthorisationRequest;
	}

	public void setAuthorisationRequest(
			AcceptorAuthorisationRequest3 AuthorisationRequest) {
		this.AuthorisationRequest = AuthorisationRequest;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}