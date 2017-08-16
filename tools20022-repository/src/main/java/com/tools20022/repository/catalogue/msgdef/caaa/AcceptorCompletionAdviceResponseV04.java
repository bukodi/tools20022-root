package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header11;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorCompletionAdviceResponse message is sent by the acquirer (or its
 * agent) to acknowledge the acceptor (or its agent) of the outcome of the
 * payment transaction, and the transfer the financial data of the transaction
 * contained in the completion advice.
 */
@PreviousVersion(AcceptorCompletionAdviceResponseV03.class)
@NextVersion(AcceptorCompletionAdviceResponseV05.class)
public class AcceptorCompletionAdviceResponseV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header11 Header;
	private AcceptorCompletionAdviceResponse4 CompletionAdviceResponse;
	private ContentInformationType11 SecurityTrailer;

	public Header11 getHeader() {
		return Header;
	}

	public void setHeader(Header11 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdviceResponse4 getCompletionAdviceResponse() {
		return CompletionAdviceResponse;
	}

	public void setCompletionAdviceResponse(
			AcceptorCompletionAdviceResponse4 CompletionAdviceResponse) {
		this.CompletionAdviceResponse = CompletionAdviceResponse;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}