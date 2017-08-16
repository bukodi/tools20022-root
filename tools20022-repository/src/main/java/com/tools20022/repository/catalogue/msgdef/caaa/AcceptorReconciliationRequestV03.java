package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorReconciliationRequest3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorReconciliationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent) , to ensure that the debits and credits
 * performed by the acceptor matches the computed balances of the acquirer for
 * the debits and credits performed during the same reconciliation period. If
 * the acceptor or the acquirer notices a difference in totals, the discrepancy
 * will be resolved by other means, outside the scope of the protocol.
 */
@PreviousVersion(AcceptorReconciliationRequestV02.class)
@NextVersion(AcceptorReconciliationRequestV04.class)
public class AcceptorReconciliationRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header7 Header;
	private AcceptorReconciliationRequest3 ReconciliationRequest;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationRequest3 getReconciliationRequest() {
		return ReconciliationRequest;
	}

	public void setReconciliationRequest(
			AcceptorReconciliationRequest3 ReconciliationRequest) {
		this.ReconciliationRequest = ReconciliationRequest;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}