package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header2;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorCompletionAdviceResponse message is sent by the acquirer to
 * acknowledge the proper receipt of an AcceptorCompletionAdvice. The message
 * can be sent directly to the card acceptor or through an agent. Usage The
 * AcceptorCompletionAdviceResponse message is used to acknowledge the data
 * capture process performed by the acquirer based on the data required to carry
 * out the financial clearing and settlement of the transaction.
 */
@NextVersion(AcceptorCompletionAdviceResponseV02.class)
public class AcceptorCompletionAdviceResponseV01 {

	private Header2 Header;
	private AcceptorCompletionAdviceResponse1 CompletionAdviceResponse;
	private ContentInformationType3 SecurityTrailer;

	public Header2 getHeader() {
		return Header;
	}

	public void setHeader(Header2 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdviceResponse1 getCompletionAdviceResponse() {
		return CompletionAdviceResponse;
	}

	public void setCompletionAdviceResponse(
			AcceptorCompletionAdviceResponse1 CompletionAdviceResponse) {
		this.CompletionAdviceResponse = CompletionAdviceResponse;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}