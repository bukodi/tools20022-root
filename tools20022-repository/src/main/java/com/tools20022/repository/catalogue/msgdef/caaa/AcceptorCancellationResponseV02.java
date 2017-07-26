package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorCancellationResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorCancellationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to return the outcome of the
 * cancellation request. If the response is positive, the acquirer has voided
 * the financial data from the captured transaction.
 */
@PreviousVersion(AcceptorCancellationResponseV01.class)
@NextVersion(AcceptorCancellationResponseV03.class)
public class AcceptorCancellationResponseV02 {

	private Header1 Header;
	private AcceptorCancellationResponse2 CancellationResponse;
	private ContentInformationType6 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationResponse2 getCancellationResponse() {
		return CancellationResponse;
	}

	public void setCancellationResponse(
			AcceptorCancellationResponse2 CancellationResponse) {
		this.CancellationResponse = CancellationResponse;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}