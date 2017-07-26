package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header24;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice5;
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
@PreviousVersion(AcceptorCompletionAdviceV04.class)
@NextVersion(AcceptorCompletionAdviceV06.class)
public class AcceptorCompletionAdviceV05 {

	private Header24 Header;
	private AcceptorCompletionAdvice5 CompletionAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header24 getHeader() {
		return Header;
	}

	public void setHeader(Header24 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdvice5 getCompletionAdvice() {
		return CompletionAdvice;
	}

	public void setCompletionAdvice(AcceptorCompletionAdvice5 CompletionAdvice) {
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