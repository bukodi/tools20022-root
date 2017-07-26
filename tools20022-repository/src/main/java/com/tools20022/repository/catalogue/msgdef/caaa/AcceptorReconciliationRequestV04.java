package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorReconciliationRequestV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorReconciliationRequest4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorReconciliationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent) , to ensure that the debits and credits
 * performed by the acceptor matches the computed balances of the acquirer for
 * the debits and credits performed during the same reconciliation period. If
 * the acceptor or the acquirer notices a difference in totals, the discrepancy
 * will be resolved by other means, outside the scope of the protocol.
 */
@PreviousVersion(AcceptorReconciliationRequestV03.class)
@NextVersion(AcceptorReconciliationRequestV05.class)
public class AcceptorReconciliationRequestV04 {

	private Header10 Header;
	private AcceptorReconciliationRequest4 ReconciliationRequest;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorReconciliationRequest4 getReconciliationRequest() {
		return ReconciliationRequest;
	}

	public void setReconciliationRequest(
			AcceptorReconciliationRequest4 ReconciliationRequest) {
		this.ReconciliationRequest = ReconciliationRequest;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}