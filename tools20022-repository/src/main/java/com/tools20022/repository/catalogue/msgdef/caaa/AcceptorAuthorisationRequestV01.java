package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorAuthorisationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorAuthorisationRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorAuthorisationRequest message is sent by the card acceptor
 * to the acquirer or its agent when an online authorisation is required for the
 * card payment transaction. Usage The AcceptorAuthorisationRequest message may
 * embed the information required for transferring to the acquirer the data
 * needed to perform the financial settlement of the transaction (capture). An
 * intermediary agent may act on behalf of the card acceptor or of the acquirer
 * in providing additional functionality such as: switching to different
 * acquirers, loyalty processing or management of the acceptor system.
 */
@NextVersion(AcceptorAuthorisationRequestV02.class)
public class AcceptorAuthorisationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorAuthorisationRequest1 AuthorisationRequest;
	private ContentInformationType3 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorAuthorisationRequest1 getAuthorisationRequest() {
		return AuthorisationRequest;
	}

	public void setAuthorisationRequest(
			AcceptorAuthorisationRequest1 AuthorisationRequest) {
		this.AuthorisationRequest = AuthorisationRequest;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}