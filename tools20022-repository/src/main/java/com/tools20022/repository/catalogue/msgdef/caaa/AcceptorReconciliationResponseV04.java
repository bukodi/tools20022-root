package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationResponseV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorReconciliationResponse3;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorReconciliationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to ensure that the debits and credits
 * performed by the acceptor matches the computed balances of the acquirer for
 * the debits and credits performed during the same reconciliation period. If
 * the acceptor or the acquirer notices a difference in totals, the discrepancy
 * will be resolved by other means, outside the scope of the protocol.
 */
@PreviousVersion(AcceptorReconciliationResponseV03.class)
@NextVersion(AcceptorReconciliationResponseV05.class)
public class AcceptorReconciliationResponseV04 {

	private Header10 Header;
	private AcceptorReconciliationResponse3 ReconciliationResponse;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationResponse3 getReconciliationResponse() {
		return ReconciliationResponse;
	}

	public void setReconciliationResponse(
			AcceptorReconciliationResponse3 ReconciliationResponse) {
		this.ReconciliationResponse = ReconciliationResponse;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}