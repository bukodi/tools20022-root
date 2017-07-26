package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header2;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdviceResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorCancellationAdviceResponse message is sent by the acquirer
 * to acknowledge the proper reception of the AcceptorCancellationAdvice. The
 * message can be sent directly to the card acceptor or through an agent. Usage
 * The AcceptorCancellationAdviceResponse message should be accepted by the card
 * acceptor unless the message received was invalid.
 */
@NextVersion(AcceptorCancellationAdviceResponseV02.class)
public class AcceptorCancellationAdviceResponseV01 {

	private Header2 Header;
	private AcceptorCancellationAdviceResponse1 AcceptorCancellationAdviceResponse;
	private ContentInformationType3 SecurityTrailer;

	public Header2 getHeader() {
		return Header;
	}

	public void setHeader(Header2 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdviceResponse1 getAcceptorCancellationAdviceResponse() {
		return AcceptorCancellationAdviceResponse;
	}

	public void setAcceptorCancellationAdviceResponse(
			AcceptorCancellationAdviceResponse1 AcceptorCancellationAdviceResponse) {
		this.AcceptorCancellationAdviceResponse = AcceptorCancellationAdviceResponse;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}