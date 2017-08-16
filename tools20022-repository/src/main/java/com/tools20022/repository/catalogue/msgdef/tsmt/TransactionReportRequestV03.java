package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.ReportSpecification4;

/**
 * Scope The TransactionReportRequest message is sent by a party involved in a
 * transaction to the matching application. This message is used to request a
 * report on details of transactions registered in the matching application.
 * Usage The TransactionReportRequest message can be sent by either party
 * involved in a transaction to request a report on a variety of details of all
 * transactions that the requester is involved in. For example, the message can
 * be used to request a report on all transactions that the requester is
 * involved in with a certain customer.
 */
public class TransactionReportRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 RequestIdentification;
	private ReportSpecification4 ReportSpecification;

	public MessageIdentification1 getRequestIdentification() {
		return RequestIdentification;
	}

	public void setRequestIdentification(
			MessageIdentification1 RequestIdentification) {
		this.RequestIdentification = RequestIdentification;
	}

	public ReportSpecification4 getReportSpecification() {
		return ReportSpecification;
	}

	public void setReportSpecification(ReportSpecification4 ReportSpecification) {
		this.ReportSpecification = ReportSpecification;
	}
}