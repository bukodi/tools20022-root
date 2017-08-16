package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationRequestV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorCancellationRequest4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorCancellationRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to request the cancellation of a
 * successfully completed transaction. Cancellation should only occur before the
 * transaction has been cleared.
 */
@PreviousVersion(AcceptorCancellationRequestV03.class)
@NextVersion(AcceptorCancellationRequestV05.class)
public class AcceptorCancellationRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header10 Header;
	private AcceptorCancellationRequest4 CancellationRequest;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationRequest4 getCancellationRequest() {
		return CancellationRequest;
	}

	public void setCancellationRequest(
			AcceptorCancellationRequest4 CancellationRequest) {
		this.CancellationRequest = CancellationRequest;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}