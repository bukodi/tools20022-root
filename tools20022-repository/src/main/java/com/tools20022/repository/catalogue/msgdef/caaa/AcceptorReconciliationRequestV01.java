package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorReconciliationRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorReconciliationRequest message is sent by the card acceptor
 * to the acquirer or an agent to communicate the totals of the card payment
 * transaction for a reconciliation period. An agent never forwards the message.
 * Usage The AcceptorReconciliationRequest message is used to ensure that the
 * debits and credits correspond to the balances computed by the acquirer or its
 * agent for the same reconciliation period. The AcceptorReconciliationRequest
 * message is also used to close a reconciliation period.
 */
@NextVersion(AcceptorReconciliationRequestV02.class)
public class AcceptorReconciliationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorReconciliationRequest1 ReconciliationRequest;
	private ContentInformationType3 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationRequest1 getReconciliationRequest() {
		return ReconciliationRequest;
	}

	public void setReconciliationRequest(
			AcceptorReconciliationRequest1 ReconciliationRequest) {
		this.ReconciliationRequest = ReconciliationRequest;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}