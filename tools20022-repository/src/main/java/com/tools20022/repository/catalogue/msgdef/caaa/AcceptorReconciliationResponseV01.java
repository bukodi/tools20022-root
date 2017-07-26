package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorReconciliationResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorReconciliationResponse message is sent by the acquirer to
 * communicate to the card acceptor the totals of the card payment transaction
 * performed for the reconciliation period. An agent never forwards the message.
 * Usage The AcceptorReconciliationResponse message is used to compare the
 * totals between a card acceptor and an acquirer for the reconciliation period.
 */
@NextVersion(AcceptorReconciliationResponseV02.class)
public class AcceptorReconciliationResponseV01 {

	private Header1 Header;
	private AcceptorReconciliationResponse1 ReconciliationResponse;
	private ContentInformationType3 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationResponse1 getReconciliationResponse() {
		return ReconciliationResponse;
	}

	public void setReconciliationResponse(
			AcceptorReconciliationResponse1 ReconciliationResponse) {
		this.ReconciliationResponse = ReconciliationResponse;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}