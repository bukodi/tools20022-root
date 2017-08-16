package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorReconciliationResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorReconciliationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to ensure that the debits and credits
 * performed by the acceptor matches the computed balances of the acquirer for
 * the debits and credits performed during the same reconciliation period. If
 * the acceptor or the acquirer notices a difference in totals, the discrepancy
 * will be resolved by other means, outside the scope of the protocol.
 */
@PreviousVersion(AcceptorReconciliationResponseV01.class)
@NextVersion(AcceptorReconciliationResponseV03.class)
public class AcceptorReconciliationResponseV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorReconciliationResponse2 ReconciliationResponse;
	private ContentInformationType6 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationResponse2 getReconciliationResponse() {
		return ReconciliationResponse;
	}

	public void setReconciliationResponse(
			AcceptorReconciliationResponse2 ReconciliationResponse) {
		this.ReconciliationResponse = ReconciliationResponse;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}