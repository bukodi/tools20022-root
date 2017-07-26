package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationResponseV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorCancellationResponse5;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCancellationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to return the outcome of the
 * cancellation request. If the response is positive, the acquirer has voided
 * the financial data from the captured transaction.
 */
@PreviousVersion(AcceptorCancellationResponseV04.class)
@NextVersion(AcceptorCancellationResponseV06.class)
public class AcceptorCancellationResponseV05 {

	private Header30 Header;
	private AcceptorCancellationResponse5 CancellationResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationResponse5 getCancellationResponse() {
		return CancellationResponse;
	}

	public void setCancellationResponse(
			AcceptorCancellationResponse5 CancellationResponse) {
		this.CancellationResponse = CancellationResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}