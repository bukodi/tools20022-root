package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorCancellationResponse4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorCancellationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to return the outcome of the
 * cancellation request. If the response is positive, the acquirer has voided
 * the financial data from the captured transaction.
 */
@PreviousVersion(AcceptorCancellationResponseV03.class)
@NextVersion(AcceptorCancellationResponseV05.class)
public class AcceptorCancellationResponseV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header10 Header;
	private AcceptorCancellationResponse4 CancellationResponse;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationResponse4 getCancellationResponse() {
		return CancellationResponse;
	}

	public void setCancellationResponse(
			AcceptorCancellationResponse4 CancellationResponse) {
		this.CancellationResponse = CancellationResponse;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}