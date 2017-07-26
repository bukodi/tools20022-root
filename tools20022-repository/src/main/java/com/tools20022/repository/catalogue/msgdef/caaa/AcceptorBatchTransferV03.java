package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header3;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransfer2;
import com.tools20022.repository.dict.msg.ContentInformationType9;

/**
 * The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer
 * the financial data of a collection of transactions to the acquirer (or its
 * agent).
 */
@PreviousVersion(AcceptorBatchTransferV02.class)
@NextVersion(AcceptorBatchTransferV04.class)
public class AcceptorBatchTransferV03 {

	private Header3 Header;
	private CardPaymentBatchTransfer2 BatchTransfer;
	private ContentInformationType9 SecurityTrailer;

	public Header3 getHeader() {
		return Header;
	}

	public void setHeader(Header3 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransfer2 getBatchTransfer() {
		return BatchTransfer;
	}

	public void setBatchTransfer(CardPaymentBatchTransfer2 BatchTransfer) {
		this.BatchTransfer = BatchTransfer;
	}

	public ContentInformationType9 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType9 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}