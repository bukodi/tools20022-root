package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorCancellationResponse3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorCancellationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to return the outcome of the
 * cancellation request. If the response is positive, the acquirer has voided
 * the financial data from the captured transaction.
 */
@PreviousVersion(AcceptorCancellationResponseV02.class)
@NextVersion(AcceptorCancellationResponseV04.class)
public class AcceptorCancellationResponseV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header7 Header;
	private AcceptorCancellationResponse3 CancellationResponse;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationResponse3 getCancellationResponse() {
		return CancellationResponse;
	}

	public void setCancellationResponse(
			AcceptorCancellationResponse3 CancellationResponse) {
		this.CancellationResponse = CancellationResponse;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}