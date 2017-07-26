package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationResponseV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorReconciliationResponse4;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorReconciliationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to ensure that the debits and credits
 * performed by the acceptor matches the computed balances of the acquirer for
 * the debits and credits performed during the same reconciliation period. If
 * the acceptor or the acquirer notices a difference in totals, the discrepancy
 * will be resolved by other means, outside the scope of the protocol.
 */
@PreviousVersion(AcceptorReconciliationResponseV04.class)
public class AcceptorReconciliationResponseV05 {

	private Header30 Header;
	private AcceptorReconciliationResponse4 ReconciliationResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationResponse4 getReconciliationResponse() {
		return ReconciliationResponse;
	}

	public void setReconciliationResponse(
			AcceptorReconciliationResponse4 ReconciliationResponse) {
		this.ReconciliationResponse = ReconciliationResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}