package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.PaymentStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader37;
import com.tools20022.repository.dict.msg.OriginalGroupInformation20;
import com.tools20022.repository.dict.msg.PaymentTransactionInformation26;
import java.util.Optional;

/**
 * Scope The FinancialInstitutionToFinancialInstitutionPaymentStatusReport
 * message is sent by an instructed agent to the previous party in the payment
 * chain. It is used to inform this party about the positive or negative status
 * of an instruction (either single or file). It is also used to report on a
 * pending instruction. Usage The FIToFIPaymentStatusReport message is exchanged
 * between agents to provide status information about instructions previously
 * sent. Its usage will always be governed by a bilateral agreement between the
 * agents. The FIToFIPaymentStatusReport message can be used to provide
 * information about the status (e.g. rejection, acceptance) of a credit
 * transfer instruction, a direct debit instruction, as well as other
 * intra-agent instructions (for example FIToFIPaymentCancellationRequest). The
 * FIToFIPaymentStatusReport message refers to the original instruction(s) by
 * means of references only or by means of references and a set of elements from
 * the original instruction. The FIToFIPaymentStatusReport message can be used
 * in domestic and cross-border scenarios.
 */
@PreviousVersion(PaymentStatusReportV02.class)
@NextVersion(FIToFIPaymentStatusReportV04.class)
public class FIToFIPaymentStatusReportV03 {

	private GroupHeader37 GroupHeader;
	private OriginalGroupInformation20 OriginalGroupInformationAndStatus;
	private Optional<PaymentTransactionInformation26> TransactionInformationAndStatus;

	public GroupHeader37 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader37 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation20 getOriginalGroupInformationAndStatus() {
		return OriginalGroupInformationAndStatus;
	}

	public void setOriginalGroupInformationAndStatus(
			OriginalGroupInformation20 OriginalGroupInformationAndStatus) {
		this.OriginalGroupInformationAndStatus = OriginalGroupInformationAndStatus;
	}

	public Optional<PaymentTransactionInformation26> getTransactionInformationAndStatus() {
		return TransactionInformationAndStatus;
	}

	public void setTransactionInformationAndStatus(
			Optional<PaymentTransactionInformation26> TransactionInformationAndStatus) {
		this.TransactionInformationAndStatus = TransactionInformationAndStatus;
	}
}