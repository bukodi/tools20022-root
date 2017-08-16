package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header2;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorCompletionAdvice message is sent by an acceptor (or its agent) to
 * notify the acquirer (or its agent) of the outcome of the payment at the
 * acceptor, and to transfer the financial data of the transaction to the
 * acquirer (capture). A AcceptorCompletionAdvice message is also sent to
 * reverse an approved authorisation and any associated financial transfer
 * (capture), if the card payment transaction could not be completed
 * successfully.
 */
@PreviousVersion(AcceptorCompletionAdviceV01.class)
@NextVersion(AcceptorCompletionAdviceV03.class)
public class AcceptorCompletionAdviceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header2 Header;
	private AcceptorCompletionAdvice2 CompletionAdvice;
	private ContentInformationType6 SecurityTrailer;

	public Header2 getHeader() {
		return Header;
	}

	public void setHeader(Header2 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdvice2 getCompletionAdvice() {
		return CompletionAdvice;
	}

	public void setCompletionAdvice(AcceptorCompletionAdvice2 CompletionAdvice) {
		this.CompletionAdvice = CompletionAdvice;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}