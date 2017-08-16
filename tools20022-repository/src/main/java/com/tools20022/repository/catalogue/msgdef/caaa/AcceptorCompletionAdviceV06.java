package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header24;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice6;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCompletionAdvice message is sent by an acceptor (or its agent) to
 * notify the acquirer (or its agent) of the outcome of the payment at the
 * acceptor, and to transfer the financial data of the transaction to the
 * acquirer (capture). A AcceptorCompletionAdvice message is also sent to
 * reverse an approved authorisation and any associated financial transfer
 * (capture), if the card payment transaction could not be completed
 * successfully.
 */
@PreviousVersion(AcceptorCompletionAdviceV05.class)
public class AcceptorCompletionAdviceV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header24 Header;
	private AcceptorCompletionAdvice6 CompletionAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header24 getHeader() {
		return Header;
	}

	public void setHeader(Header24 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdvice6 getCompletionAdvice() {
		return CompletionAdvice;
	}

	public void setCompletionAdvice(AcceptorCompletionAdvice6 CompletionAdvice) {
		this.CompletionAdvice = CompletionAdvice;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}