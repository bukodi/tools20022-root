package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationRequestV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationRequest4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorAuthorisationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent) , to check with the issuer (or its
 * agent) that the account associated to the card has the resources to fund the
 * payment. This checking will include validation of the card data and any
 * additional transaction data provided.
 */
@PreviousVersion(AcceptorAuthorisationRequestV03.class)
@NextVersion(AcceptorAuthorisationRequestV05.class)
public class AcceptorAuthorisationRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header10 Header;
	private AcceptorAuthorisationRequest4 AuthorisationRequest;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationRequest4 getAuthorisationRequest() {
		return AuthorisationRequest;
	}

	public void setAuthorisationRequest(
			AcceptorAuthorisationRequest4 AuthorisationRequest) {
		this.AuthorisationRequest = AuthorisationRequest;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}