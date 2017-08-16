package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorCancellationRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorCancellationRequest message is sent by a card acceptor to
 * cancel a successfully completed card payment transaction. The message can be
 * sent directly to the acquirer or through an agent. Usage The
 * AcceptorCancellationRequest message is used when the card acceptor is unaware
 * of the cancellation of the transaction by the acquirer.
 */
@NextVersion(AcceptorCancellationRequestV02.class)
public class AcceptorCancellationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorCancellationRequest1 CancellationRequest;
	private ContentInformationType3 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationRequest1 getCancellationRequest() {
		return CancellationRequest;
	}

	public void setCancellationRequest(
			AcceptorCancellationRequest1 CancellationRequest) {
		this.CancellationRequest = CancellationRequest;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}