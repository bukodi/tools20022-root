package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header8;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorCompletionAdviceResponse message is sent by the acquirer (or its
 * agent) to acknowledge the acceptor (or its agent) of the outcome of the
 * payment transaction, and the transfer the financial data of the transaction
 * contained in the completion advice.
 */
@PreviousVersion(AcceptorCompletionAdviceResponseV02.class)
@NextVersion(AcceptorCompletionAdviceResponseV04.class)
public class AcceptorCompletionAdviceResponseV03 {

	private Header8 Header;
	private AcceptorCompletionAdviceResponse3 CompletionAdviceResponse;
	private ContentInformationType8 SecurityTrailer;

	public Header8 getHeader() {
		return Header;
	}

	public void setHeader(Header8 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdviceResponse3 getCompletionAdviceResponse() {
		return CompletionAdviceResponse;
	}

	public void setCompletionAdviceResponse(
			AcceptorCompletionAdviceResponse3 CompletionAdviceResponse) {
		this.CompletionAdviceResponse = CompletionAdviceResponse;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}