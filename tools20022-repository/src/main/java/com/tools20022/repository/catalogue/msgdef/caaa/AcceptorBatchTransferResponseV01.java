package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorBatchTransferResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header3;
import com.tools20022.repository.dict.msg.CardPaymentDataSet2;
import com.tools20022.repository.dict.msg.ContentInformationType1;

/**
 * Scope The AcceptorBatchTransferResponse message is sent by the acquirer to
 * the card acceptor to acknowledge the proper reception of the
 * AcceptorBatchTransfer. Usage The AcceptorBatchTransferResponse message is
 * used by an acquirer to inform the card acceptor of the card payment
 * transactions that could not be captured in the AcceptorBatchTransfer.
 */
@NextVersion(AcceptorBatchTransferResponseV02.class)
public class AcceptorBatchTransferResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header3 Header;
	private CardPaymentDataSet2 DataSet;
	private ContentInformationType1 SecurityTrailer;

	public Header3 getHeader() {
		return Header;
	}

	public void setHeader(Header3 Header) {
		this.Header = Header;
	}

	public CardPaymentDataSet2 getDataSet() {
		return DataSet;
	}

	public void setDataSet(CardPaymentDataSet2 DataSet) {
		this.DataSet = DataSet;
	}

	public ContentInformationType1 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType1 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}