package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceResponseV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header11;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdviceResponse4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorCancellationAdviceResponse message is sent by the acquirer (or
 * its agent) to acknowledge the acceptor (or its agent) about the notification
 * of the payment cancellation.
 */
@PreviousVersion(AcceptorCancellationAdviceResponseV03.class)
@NextVersion(AcceptorCancellationAdviceResponseV05.class)
public class AcceptorCancellationAdviceResponseV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header11 Header;
	private AcceptorCancellationAdviceResponse4 CancellationAdviceResponse;
	private ContentInformationType11 SecurityTrailer;

	public Header11 getHeader() {
		return Header;
	}

	public void setHeader(Header11 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdviceResponse4 getCancellationAdviceResponse() {
		return CancellationAdviceResponse;
	}

	public void setCancellationAdviceResponse(
			AcceptorCancellationAdviceResponse4 CancellationAdviceResponse) {
		this.CancellationAdviceResponse = CancellationAdviceResponse;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}