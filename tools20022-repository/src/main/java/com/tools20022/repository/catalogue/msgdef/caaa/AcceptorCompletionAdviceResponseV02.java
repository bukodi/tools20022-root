package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header2;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorCompletionAdviceResponse message is sent by the acquirer (or its
 * agent) to acknowledge the acceptor (or its agent) of the outcome of the
 * payment transaction, and the transfer the financial data of the transaction
 * contained in the completion advice.
 */
@PreviousVersion(AcceptorCompletionAdviceResponseV01.class)
@NextVersion(AcceptorCompletionAdviceResponseV03.class)
public class AcceptorCompletionAdviceResponseV02 {

	private Header2 Header;
	private AcceptorCompletionAdviceResponse2 CompletionAdviceResponse;
	private ContentInformationType6 SecurityTrailer;

	public Header2 getHeader() {
		return Header;
	}

	public void setHeader(Header2 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdviceResponse2 getCompletionAdviceResponse() {
		return CompletionAdviceResponse;
	}

	public void setCompletionAdviceResponse(
			AcceptorCompletionAdviceResponse2 CompletionAdviceResponse) {
		this.CompletionAdviceResponse = CompletionAdviceResponse;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}