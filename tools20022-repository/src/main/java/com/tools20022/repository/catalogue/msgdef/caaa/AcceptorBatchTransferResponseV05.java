package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header25;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse4;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to
 * inform the acceptor (or its agent) of the transfer in a previous
 * AcceptorBatchTransfer of a collection of transactions.
 */
@PreviousVersion(AcceptorBatchTransferResponseV04.class)
@NextVersion(AcceptorBatchTransferResponseV06.class)
public class AcceptorBatchTransferResponseV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header25 Header;
	private CardPaymentBatchTransferResponse4 BatchTransferResponse;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header25 getHeader() {
		return Header;
	}

	public void setHeader(Header25 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransferResponse4 getBatchTransferResponse() {
		return BatchTransferResponse;
	}

	public void setBatchTransferResponse(
			CardPaymentBatchTransferResponse4 BatchTransferResponse) {
		this.BatchTransferResponse = BatchTransferResponse;
	}

	public Optional<ContentInformationType12> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType12> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}