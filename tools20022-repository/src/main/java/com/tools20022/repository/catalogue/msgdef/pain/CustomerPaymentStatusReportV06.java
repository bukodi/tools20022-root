package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.pain.CustomerPaymentStatusReportV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerPaymentStatusReportV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader52;
import com.tools20022.repository.dict.msg.OriginalGroupHeader1;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction12;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The CustomerPaymentStatusReport message is sent by an instructed agent
 * to the previous party in the payment chain. It is used to inform this party
 * about the positive or negative status of an instruction (either single or
 * file). It is also used to report on a pending instruction. Usage The
 * CustomerPaymentStatusReport message is exchanged between an agent and a
 * non-financial institution customer to provide status information on
 * instructions previously sent. Its usage will always be governed by a
 * bilateral agreement between the agent and the non-financial institution
 * customer. The CustomerPaymentStatusReport message can be used to provide
 * information about the status (e.g. rejection, acceptance) of the initiation
 * of a credit transfer, a direct debit, as well as on the initiation of other
 * customer instructions. The CustomerPaymentStatusReport message refers to the
 * original instruction(s) by means of references only or by means of references
 * and a set of elements from the original instruction. The
 * CustomerPaymentStatusReport message can be used in domestic and cross-border
 * scenarios.
 */
@PreviousVersion(CustomerPaymentStatusReportV05.class)
@NextVersion(CustomerPaymentStatusReportV07.class)
public class CustomerPaymentStatusReportV06 {

	private GroupHeader52 GroupHeader;
	private OriginalGroupHeader1 OriginalGroupInformationAndStatus;
	private Optional<OriginalPaymentInstruction12> OriginalPaymentInformationAndStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader52 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader52 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupHeader1 getOriginalGroupInformationAndStatus() {
		return OriginalGroupInformationAndStatus;
	}

	public void setOriginalGroupInformationAndStatus(
			OriginalGroupHeader1 OriginalGroupInformationAndStatus) {
		this.OriginalGroupInformationAndStatus = OriginalGroupInformationAndStatus;
	}

	public Optional<OriginalPaymentInstruction12> getOriginalPaymentInformationAndStatus() {
		return OriginalPaymentInformationAndStatus;
	}

	public void setOriginalPaymentInformationAndStatus(
			Optional<OriginalPaymentInstruction12> OriginalPaymentInformationAndStatus) {
		this.OriginalPaymentInformationAndStatus = OriginalPaymentInformationAndStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}