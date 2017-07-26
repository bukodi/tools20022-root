package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header25;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransfer5;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer
 * the financial data of a collection of transactions to the acquirer (or its
 * agent).
 */
@PreviousVersion(AcceptorBatchTransferV05.class)
public class AcceptorBatchTransferV06 {

	private Header25 Header;
	private CardPaymentBatchTransfer5 BatchTransfer;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header25 getHeader() {
		return Header;
	}

	public void setHeader(Header25 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransfer5 getBatchTransfer() {
		return BatchTransfer;
	}

	public void setBatchTransfer(CardPaymentBatchTransfer5 BatchTransfer) {
		this.BatchTransfer = BatchTransfer;
	}

	public Optional<ContentInformationType12> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType12> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}