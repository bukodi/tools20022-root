package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorCancellationResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorCancellationResponse message is sent by the acquirer to
 * inform the card acceptor of the outcome of the cancellation process. The
 * message can be sent directly to the acceptor or through an agent. Usage The
 * AcceptorCancellationResponse message is used to indicate one of the possible
 * outcomes of a cancellation process: - a successful cancellation; - a
 * rejection from the acquirer for financial reasons; - a rejection from the
 * acquirer for technical reasons.
 */
@NextVersion(AcceptorCancellationResponseV02.class)
public class AcceptorCancellationResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorCancellationResponse1 CancellationResponse;
	private ContentInformationType3 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationResponse1 getCancellationResponse() {
		return CancellationResponse;
	}

	public void setCancellationResponse(
			AcceptorCancellationResponse1 CancellationResponse) {
		this.CancellationResponse = CancellationResponse;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}