package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorCancellationRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorCancellationRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to request the cancellation of a
 * successfully completed transaction. Cancellation should only occur before the
 * transaction has been cleared.
 */
@PreviousVersion(AcceptorCancellationRequestV01.class)
@NextVersion(AcceptorCancellationRequestV03.class)
public class AcceptorCancellationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorCancellationRequest2 CancellationRequest;
	private ContentInformationType6 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationRequest2 getCancellationRequest() {
		return CancellationRequest;
	}

	public void setCancellationRequest(
			AcceptorCancellationRequest2 CancellationRequest) {
		this.CancellationRequest = CancellationRequest;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}