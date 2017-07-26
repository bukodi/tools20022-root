package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationRequestV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorCancellationRequest6;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCancellationRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to request the cancellation of a
 * successfully completed transaction. Cancellation should only occur before the
 * transaction has been cleared.
 */
@PreviousVersion(AcceptorCancellationRequestV05.class)
public class AcceptorCancellationRequestV06 {

	private Header30 Header;
	private AcceptorCancellationRequest6 CancellationRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationRequest6 getCancellationRequest() {
		return CancellationRequest;
	}

	public void setCancellationRequest(
			AcceptorCancellationRequest6 CancellationRequest) {
		this.CancellationRequest = CancellationRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}