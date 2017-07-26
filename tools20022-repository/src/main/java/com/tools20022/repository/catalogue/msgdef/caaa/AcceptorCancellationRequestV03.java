package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorCancellationRequest3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorCancellationRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to request the cancellation of a
 * successfully completed transaction. Cancellation should only occur before the
 * transaction has been cleared.
 */
@PreviousVersion(AcceptorCancellationRequestV02.class)
@NextVersion(AcceptorCancellationRequestV04.class)
public class AcceptorCancellationRequestV03 {

	private Header7 Header;
	private AcceptorCancellationRequest3 CancellationRequest;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationRequest3 getCancellationRequest() {
		return CancellationRequest;
	}

	public void setCancellationRequest(
			AcceptorCancellationRequest3 CancellationRequest) {
		this.CancellationRequest = CancellationRequest;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}