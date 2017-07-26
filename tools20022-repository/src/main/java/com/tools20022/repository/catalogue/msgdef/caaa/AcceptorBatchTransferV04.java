package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header12;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransfer3;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer
 * the financial data of a collection of transactions to the acquirer (or its
 * agent).
 */
@PreviousVersion(AcceptorBatchTransferV03.class)
@NextVersion(AcceptorBatchTransferV05.class)
public class AcceptorBatchTransferV04 {

	private Header12 Header;
	private CardPaymentBatchTransfer3 BatchTransfer;
	private ContentInformationType12 SecurityTrailer;

	public Header12 getHeader() {
		return Header;
	}

	public void setHeader(Header12 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransfer3 getBatchTransfer() {
		return BatchTransfer;
	}

	public void setBatchTransfer(CardPaymentBatchTransfer3 BatchTransfer) {
		this.BatchTransfer = BatchTransfer;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}