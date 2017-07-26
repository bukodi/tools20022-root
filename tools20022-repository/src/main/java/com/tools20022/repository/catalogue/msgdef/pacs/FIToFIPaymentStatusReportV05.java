package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentStatusReportV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentStatusReportV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader53;
import com.tools20022.repository.dict.msg.OriginalGroupHeader1;
import com.tools20022.repository.dict.msg.PaymentTransaction43;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
@PreviousVersion(FIToFIPaymentStatusReportV04.class)
@NextVersion(FIToFIPaymentStatusReportV06.class)
public class FIToFIPaymentStatusReportV05 {

	private GroupHeader53 GroupHeader;
	private OriginalGroupHeader1 OriginalGroupInformationAndStatus;
	private Optional<PaymentTransaction43> TransactionInformationAndStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader53 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader53 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupHeader1 getOriginalGroupInformationAndStatus() {
		return OriginalGroupInformationAndStatus;
	}

	public void setOriginalGroupInformationAndStatus(
			OriginalGroupHeader1 OriginalGroupInformationAndStatus) {
		this.OriginalGroupInformationAndStatus = OriginalGroupInformationAndStatus;
	}

	public Optional<PaymentTransaction43> getTransactionInformationAndStatus() {
		return TransactionInformationAndStatus;
	}

	public void setTransactionInformationAndStatus(
			Optional<PaymentTransaction43> TransactionInformationAndStatus) {
		this.TransactionInformationAndStatus = TransactionInformationAndStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}