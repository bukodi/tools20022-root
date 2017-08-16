package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header11;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorCompletionAdvice message is sent by an acceptor (or its agent) to
 * notify the acquirer (or its agent) of the outcome of the payment at the
 * acceptor, and to transfer the financial data of the transaction to the
 * acquirer (capture). A AcceptorCompletionAdvice message is also sent to
 * reverse an approved authorisation and any associated financial transfer
 * (capture), if the card payment transaction could not be completed
 * successfully.
 */
@PreviousVersion(AcceptorCompletionAdviceV03.class)
@NextVersion(AcceptorCompletionAdviceV05.class)
public class AcceptorCompletionAdviceV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header11 Header;
	private AcceptorCompletionAdvice4 CompletionAdvice;
	private ContentInformationType11 SecurityTrailer;

	public Header11 getHeader() {
		return Header;
	}

	public void setHeader(Header11 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdvice4 getCompletionAdvice() {
		return CompletionAdvice;
	}

	public void setCompletionAdvice(AcceptorCompletionAdvice4 CompletionAdvice) {
		this.CompletionAdvice = CompletionAdvice;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}