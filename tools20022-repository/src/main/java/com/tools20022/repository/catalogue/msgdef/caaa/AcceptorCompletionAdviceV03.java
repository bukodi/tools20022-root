package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header8;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorCompletionAdvice message is sent by an acceptor (or its agent) to
 * notify the acquirer (or its agent) of the outcome of the payment at the
 * acceptor, and to transfer the financial data of the transaction to the
 * acquirer (capture). A AcceptorCompletionAdvice message is also sent to
 * reverse an approved authorisation and any associated financial transfer
 * (capture), if the card payment transaction could not be completed
 * successfully.
 */
@PreviousVersion(AcceptorCompletionAdviceV02.class)
@NextVersion(AcceptorCompletionAdviceV04.class)
public class AcceptorCompletionAdviceV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header8 Header;
	private AcceptorCompletionAdvice3 CompletionAdvice;
	private ContentInformationType8 SecurityTrailer;

	public Header8 getHeader() {
		return Header;
	}

	public void setHeader(Header8 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdvice3 getCompletionAdvice() {
		return CompletionAdvice;
	}

	public void setCompletionAdvice(AcceptorCompletionAdvice3 CompletionAdvice) {
		this.CompletionAdvice = CompletionAdvice;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}