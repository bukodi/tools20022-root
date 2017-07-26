package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceResponseV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header24;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdviceResponse5;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCompletionAdviceResponse message is sent by the acquirer (or its
 * agent) to acknowledge the acceptor (or its agent) of the outcome of the
 * payment transaction, and the transfer the financial data of the transaction
 * contained in the completion advice.
 */
@PreviousVersion(AcceptorCompletionAdviceResponseV04.class)
@NextVersion(AcceptorCompletionAdviceResponseV06.class)
public class AcceptorCompletionAdviceResponseV05 {

	private Header24 Header;
	private AcceptorCompletionAdviceResponse5 CompletionAdviceResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header24 getHeader() {
		return Header;
	}

	public void setHeader(Header24 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdviceResponse5 getCompletionAdviceResponse() {
		return CompletionAdviceResponse;
	}

	public void setCompletionAdviceResponse(
			AcceptorCompletionAdviceResponse5 CompletionAdviceResponse) {
		this.CompletionAdviceResponse = CompletionAdviceResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}