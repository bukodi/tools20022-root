package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationResponseV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorReconciliationResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorReconciliationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to ensure that the debits and credits
 * performed by the acceptor matches the computed balances of the acquirer for
 * the debits and credits performed during the same reconciliation period. If
 * the acceptor or the acquirer notices a difference in totals, the discrepancy
 * will be resolved by other means, outside the scope of the protocol.
 */
@PreviousVersion(AcceptorReconciliationResponseV02.class)
@NextVersion(AcceptorReconciliationResponseV04.class)
public class AcceptorReconciliationResponseV03 {

	private Header7 Header;
	private AcceptorReconciliationResponse2 ReconciliationResponse;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationResponse2 getReconciliationResponse() {
		return ReconciliationResponse;
	}

	public void setReconciliationResponse(
			AcceptorReconciliationResponse2 ReconciliationResponse) {
		this.ReconciliationResponse = ReconciliationResponse;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}