package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header3;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType4;

/**
 * The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to
 * inform the acceptor (or its agent) of the transfer in a previous
 * AcceptorBatchTransfer of a collection of transactions.
 */
@PreviousVersion(AcceptorBatchTransferResponseV01.class)
@NextVersion(AcceptorBatchTransferResponseV03.class)
public class AcceptorBatchTransferResponseV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header3 Header;
	private CardPaymentBatchTransferResponse1 BatchTransferResponse;
	private ContentInformationType4 SecurityTrailer;

	public Header3 getHeader() {
		return Header;
	}

	public void setHeader(Header3 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransferResponse1 getBatchTransferResponse() {
		return BatchTransferResponse;
	}

	public void setBatchTransferResponse(
			CardPaymentBatchTransferResponse1 BatchTransferResponse) {
		this.BatchTransferResponse = BatchTransferResponse;
	}

	public ContentInformationType4 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType4 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}