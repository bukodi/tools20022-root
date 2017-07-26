package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header25;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse5;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to
 * inform the acceptor (or its agent) of the transfer in a previous
 * AcceptorBatchTransfer of a collection of transactions.
 */
@PreviousVersion(AcceptorBatchTransferResponseV05.class)
public class AcceptorBatchTransferResponseV06 {

	private Header25 Header;
	private CardPaymentBatchTransferResponse5 BatchTransferResponse;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header25 getHeader() {
		return Header;
	}

	public void setHeader(Header25 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransferResponse5 getBatchTransferResponse() {
		return BatchTransferResponse;
	}

	public void setBatchTransferResponse(
			CardPaymentBatchTransferResponse5 BatchTransferResponse) {
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