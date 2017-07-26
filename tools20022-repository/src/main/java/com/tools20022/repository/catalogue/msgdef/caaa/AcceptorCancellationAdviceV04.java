package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header11;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdvice4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorCancellationAdvice message is sent by an acceptor (or its agent)
 * to notify the acquirer (or its agent) of the cancellation of a successfully
 * completed transaction. The transaction has been completed without financial
 * transfer, or the acceptor is aware that the transaction was not cleared by
 * the acquirer.
 */
@PreviousVersion(AcceptorCancellationAdviceV03.class)
@NextVersion(AcceptorCancellationAdviceV05.class)
public class AcceptorCancellationAdviceV04 {

	private Header11 Header;
	private AcceptorCancellationAdvice4 CancellationAdvice;
	private ContentInformationType11 SecurityTrailer;

	public Header11 getHeader() {
		return Header;
	}

	public void setHeader(Header11 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdvice4 getCancellationAdvice() {
		return CancellationAdvice;
	}

	public void setCancellationAdvice(
			AcceptorCancellationAdvice4 CancellationAdvice) {
		this.CancellationAdvice = CancellationAdvice;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}