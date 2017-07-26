package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header3;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransfer1;
import com.tools20022.repository.dict.msg.ContentInformationType4;

/**
 * The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer
 * the financial data of a collection of transactions to the acquirer (or its
 * agent).
 */
@PreviousVersion(AcceptorBatchTransferV01.class)
@NextVersion(AcceptorBatchTransferV03.class)
public class AcceptorBatchTransferV02 {

	private Header3 Header;
	private CardPaymentBatchTransfer1 BatchTransfer;
	private ContentInformationType4 SecurityTrailer;

	public Header3 getHeader() {
		return Header;
	}

	public void setHeader(Header3 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransfer1 getBatchTransfer() {
		return BatchTransfer;
	}

	public void setBatchTransfer(CardPaymentBatchTransfer1 BatchTransfer) {
		this.BatchTransfer = BatchTransfer;
	}

	public ContentInformationType4 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType4 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}