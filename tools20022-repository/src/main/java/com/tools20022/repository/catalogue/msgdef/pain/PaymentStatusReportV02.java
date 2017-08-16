package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerPaymentStatusReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader5;
import com.tools20022.repository.dict.msg.OriginalGroupInformation1;
import com.tools20022.repository.dict.msg.PaymentTransactionInformation1;
import java.util.Optional;

/**
 * Scope The PaymentStatusReport message is sent by an instructed agent to the
 * previous party in the payment chain. It is used to inform this party about
 * the positive or negative status of an instruction (either single or file). It
 * is also used to report on a pending instruction. Usage The
 * PaymentStatusReport message is exchanged between an agent and a non-financial
 * institution customer to provide status information on instructions previously
 * sent. Its usage will always be governed by a bilateral agreement between the
 * agent and the non-financial institution customer. The PaymentStatusReport
 * message can be used to provide information about the status (e.g. rejection,
 * acceptance) of the initiation of a credit transfer, a direct debit, as well
 * as on the initiation of other customer instructions (e.g.
 * PaymentCancellationRequest). The PaymentStatusReport message refers to the
 * original instruction(s) by means of references only or by means of references
 * and a set of elements from the original instruction. The PaymentStatusReport
 * message can be used in domestic and cross-border scenarios. The
 * PaymentStatusReport message exchanged between agents and non-financial
 * institution customers is identified in the schema as follows:
 * urn:iso:std:iso:20022:tech:xsd:pain.002.001.02
 */
@NextVersion(CustomerPaymentStatusReportV03.class)
public class PaymentStatusReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader5 GroupHeader;
	private OriginalGroupInformation1 OriginalGroupInformationAndStatus;
	private Optional<PaymentTransactionInformation1> TransactionInformationAndStatus;

	public GroupHeader5 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader5 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation1 getOriginalGroupInformationAndStatus() {
		return OriginalGroupInformationAndStatus;
	}

	public void setOriginalGroupInformationAndStatus(
			OriginalGroupInformation1 OriginalGroupInformationAndStatus) {
		this.OriginalGroupInformationAndStatus = OriginalGroupInformationAndStatus;
	}

	public Optional<PaymentTransactionInformation1> getTransactionInformationAndStatus() {
		return TransactionInformationAndStatus;
	}

	public void setTransactionInformationAndStatus(
			Optional<PaymentTransactionInformation1> TransactionInformationAndStatus) {
		this.TransactionInformationAndStatus = TransactionInformationAndStatus;
	}
}