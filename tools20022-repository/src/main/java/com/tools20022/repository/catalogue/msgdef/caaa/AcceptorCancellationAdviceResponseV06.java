package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceResponseV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header24;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdviceResponse6;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCancellationAdviceResponse message is sent by the acquirer (or
 * its agent) to acknowledge the acceptor (or its agent) about the notification
 * of the payment cancellation.
 */
@PreviousVersion(AcceptorCancellationAdviceResponseV05.class)
public class AcceptorCancellationAdviceResponseV06 {

	private Header24 Header;
	private AcceptorCancellationAdviceResponse6 CancellationAdviceResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header24 getHeader() {
		return Header;
	}

	public void setHeader(Header24 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdviceResponse6 getCancellationAdviceResponse() {
		return CancellationAdviceResponse;
	}

	public void setCancellationAdviceResponse(
			AcceptorCancellationAdviceResponse6 CancellationAdviceResponse) {
		this.CancellationAdviceResponse = CancellationAdviceResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}