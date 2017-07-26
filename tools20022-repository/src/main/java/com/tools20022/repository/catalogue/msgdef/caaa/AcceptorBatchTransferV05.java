package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header25;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransfer4;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer
 * the financial data of a collection of transactions to the acquirer (or its
 * agent).
 */
@PreviousVersion(AcceptorBatchTransferV04.class)
@NextVersion(AcceptorBatchTransferV06.class)
public class AcceptorBatchTransferV05 {

	private Header25 Header;
	private CardPaymentBatchTransfer4 BatchTransfer;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header25 getHeader() {
		return Header;
	}

	public void setHeader(Header25 Header) {
		this.Header = Header;
	}

	public CardPaymentBatchTransfer4 getBatchTransfer() {
		return BatchTransfer;
	}

	public void setBatchTransfer(CardPaymentBatchTransfer4 BatchTransfer) {
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