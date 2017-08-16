package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header12;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse3;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to
 * inform the acceptor (or its agent) of the transfer in a previous
 * AcceptorBatchTransfer of a collection of transactions.
 */
@PreviousVersion(AcceptorBatchTransferResponseV03.class)
@NextVersion(AcceptorBatchTransferResponseV05.class)
public class AcceptorBatchTransferResponseV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header12 Header;
	private CardPaymentBatchTransferResponse3 BatchTransferResponse;
	private ContentInformationType12 SecurityTrailer;

	public Header12 getHeader() {
		return Header;
	}

	public void setHeader(Header12 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransferResponse3 getBatchTransferResponse() {
		return BatchTransferResponse;
	}

	public void setBatchTransferResponse(
			CardPaymentBatchTransferResponse3 BatchTransferResponse) {
		this.BatchTransferResponse = BatchTransferResponse;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}