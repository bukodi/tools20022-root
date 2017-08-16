package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header3;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType9;

/**
 * The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to
 * inform the acceptor (or its agent) of the transfer in a previous
 * AcceptorBatchTransfer of a collection of transactions.
 */
@PreviousVersion(AcceptorBatchTransferResponseV02.class)
@NextVersion(AcceptorBatchTransferResponseV04.class)
public class AcceptorBatchTransferResponseV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header3 Header;
	private CardPaymentBatchTransferResponse2 BatchTransferResponse;
	private ContentInformationType9 SecurityTrailer;

	public Header3 getHeader() {
		return Header;
	}

	public void setHeader(Header3 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransferResponse2 getBatchTransferResponse() {
		return BatchTransferResponse;
	}

	public void setBatchTransferResponse(
			CardPaymentBatchTransferResponse2 BatchTransferResponse) {
		this.BatchTransferResponse = BatchTransferResponse;
	}

	public ContentInformationType9 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType9 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}