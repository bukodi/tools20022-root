package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header3;
import com.tools20022.repository.dict.msg.CardPaymentDataSet1;
import com.tools20022.repository.dict.msg.ContentInformationType1;

/**
 * Scope The AcceptorBatchTransfer message is sent by the card acceptor to the
 * acquirer to capture a collection of previously completed card payment
 * transactions. Usage The AcceptorBatchTransfer message embeds the information
 * required for transferring to the acquirer the data needed to perform the
 * financial settlement of these transactions (capture).
 */
@NextVersion(AcceptorBatchTransferV02.class)
public class AcceptorBatchTransferV01 {

	private Header3 Header;
	private CardPaymentDataSet1 DataSet;
	private ContentInformationType1 SecurityTrailer;

	public Header3 getHeader() {
		return Header;
	}

	public void setHeader(Header3 Header) {
		this.Header = Header;
	}

	public CardPaymentDataSet1 getDataSet() {
		return DataSet;
	}

	public void setDataSet(CardPaymentDataSet1 DataSet) {
		this.DataSet = DataSet;
	}

	public ContentInformationType1 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType1 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}