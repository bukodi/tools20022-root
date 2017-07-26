package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header2;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdvice1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorCancellationAdvice message is sent by a card acceptor to
 * notify the cancellation of a successfully completed card payment transaction.
 * The message can be sent directly to the acquirer or through an agent. Usage
 * The AcceptorCancellationAdvice message is sent by the card acceptor to an
 * acquirer when the acquirer did not receive a correct response to the
 * AcceptorCompletionAdvice message.
 */
@NextVersion(AcceptorCancellationAdviceV02.class)
public class AcceptorCancellationAdviceV01 {

	private Header2 Header;
	private AcceptorCancellationAdvice1 CancellationAdvice;
	private ContentInformationType3 SecurityTrailer;

	public Header2 getHeader() {
		return Header;
	}

	public void setHeader(Header2 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdvice1 getCancellationAdvice() {
		return CancellationAdvice;
	}

	public void setCancellationAdvice(
			AcceptorCancellationAdvice1 CancellationAdvice) {
		this.CancellationAdvice = CancellationAdvice;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}