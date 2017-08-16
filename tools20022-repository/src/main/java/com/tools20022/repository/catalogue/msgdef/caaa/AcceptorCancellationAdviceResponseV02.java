package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header2;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdviceResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorCancellationAdviceResponse message is sent by the acquirer (or
 * its agent) to acknowledge the acceptor (or its agent) about the notification
 * of the payment cancellation.
 */
@PreviousVersion(AcceptorCancellationAdviceResponseV01.class)
@NextVersion(AcceptorCancellationAdviceResponseV03.class)
public class AcceptorCancellationAdviceResponseV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header2 Header;
	private AcceptorCancellationAdviceResponse2 CancellationAdviceResponse;
	private ContentInformationType6 SecurityTrailer;

	public Header2 getHeader() {
		return Header;
	}

	public void setHeader(Header2 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdviceResponse2 getCancellationAdviceResponse() {
		return CancellationAdviceResponse;
	}

	public void setCancellationAdviceResponse(
			AcceptorCancellationAdviceResponse2 CancellationAdviceResponse) {
		this.CancellationAdviceResponse = CancellationAdviceResponse;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}