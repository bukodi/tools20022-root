package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCompletionAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header2;
import com.tools20022.repository.dict.msg.AcceptorCompletionAdvice1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorCompletionAdvice message is sent by a card acceptor to
 * notify an acquirer about the completion and final outcome of a card payment
 * transaction. The message can be sent directly to the acquirer or through an
 * agent. Usage The AcceptorCompletionAdvice message is used either to: - inform
 * the acquirer about the successful end of a transaction; - reverse a
 * transaction which was not successfully completed (for example, cancellation
 * of transaction by the cardholder), but where an authorisation had been
 * previously given. The AcceptorCompletionAdvice message may also embed the
 * information required for transferring to the acquirer all data needed to
 * perform the financial settlement of the transaction (capture). Should the
 * acquirer not receive a correct response to an AcceptorCompletionAdvice
 * message; the card acceptor sends back an AcceptorCompletionAdvice message to
 * the acquirer.
 */
@NextVersion(AcceptorCompletionAdviceV02.class)
public class AcceptorCompletionAdviceV01 {

	private Header2 Header;
	private AcceptorCompletionAdvice1 CompletionAdvice;
	private ContentInformationType3 SecurityTrailer;

	public Header2 getHeader() {
		return Header;
	}

	public void setHeader(Header2 Header) {
		this.Header = Header;
	}

	public AcceptorCompletionAdvice1 getCompletionAdvice() {
		return CompletionAdvice;
	}

	public void setCompletionAdvice(AcceptorCompletionAdvice1 CompletionAdvice) {
		this.CompletionAdvice = CompletionAdvice;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}