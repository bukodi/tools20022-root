package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationRequestV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationRequestV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationRequest5;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorAuthorisationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent) , to check with the issuer (or its
 * agent) that the account associated to the card has the resources to fund the
 * payment. This checking will include validation of the card data and any
 * additional transaction data provided.
 */
@PreviousVersion(AcceptorAuthorisationRequestV04.class)
@NextVersion(AcceptorAuthorisationRequestV06.class)
public class AcceptorAuthorisationRequestV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header30 Header;
	private AcceptorAuthorisationRequest5 AuthorisationRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationRequest5 getAuthorisationRequest() {
		return AuthorisationRequest;
	}

	public void setAuthorisationRequest(
			AcceptorAuthorisationRequest5 AuthorisationRequest) {
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