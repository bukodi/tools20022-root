package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceResponseV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header8;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdviceResponse3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorCancellationAdviceResponse message is sent by the acquirer (or
 * its agent) to acknowledge the acceptor (or its agent) about the notification
 * of the payment cancellation.
 */
@PreviousVersion(AcceptorCancellationAdviceResponseV02.class)
@NextVersion(AcceptorCancellationAdviceResponseV04.class)
public class AcceptorCancellationAdviceResponseV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header8 Header;
	private AcceptorCancellationAdviceResponse3 CancellationAdviceResponse;
	private ContentInformationType8 SecurityTrailer;

	public Header8 getHeader() {
		return Header;
	}

	public void setHeader(Header8 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdviceResponse3 getCancellationAdviceResponse() {
		return CancellationAdviceResponse;
	}

	public void setCancellationAdviceResponse(
			AcceptorCancellationAdviceResponse3 CancellationAdviceResponse) {
		this.CancellationAdviceResponse = CancellationAdviceResponse;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}