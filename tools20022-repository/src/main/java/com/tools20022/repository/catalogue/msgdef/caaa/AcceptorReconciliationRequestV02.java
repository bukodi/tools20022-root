package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorReconciliationRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorReconciliationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent) , to ensure that the debits and credits
 * performed by the acceptor matches the computed balances of the acquirer for
 * the debits and credits performed during the same reconciliation period. If
 * the acceptor or the acquirer notices a difference in totals, the discrepancy
 * will be resolved by other means, outside the scope of the protocol.
 */
@PreviousVersion(AcceptorReconciliationRequestV01.class)
@NextVersion(AcceptorReconciliationRequestV03.class)
public class AcceptorReconciliationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorReconciliationRequest2 ReconciliationRequest;
	private ContentInformationType6 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationRequest2 getReconciliationRequest() {
		return ReconciliationRequest;
	}

	public void setReconciliationRequest(
			AcceptorReconciliationRequest2 ReconciliationRequest) {
		this.ReconciliationRequest = ReconciliationRequest;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}