package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.PaymentStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerPaymentStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader36;
import com.tools20022.repository.dict.msg.OriginalGroupInformation20;
import com.tools20022.repository.dict.msg.OriginalPaymentInformation1;
import java.util.Optional;

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
@PreviousVersion(PaymentStatusReportV02.class)
@NextVersion(CustomerPaymentStatusReportV04.class)
public class CustomerPaymentStatusReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader36 GroupHeader;
	private OriginalGroupInformation20 OriginalGroupInformationAndStatus;
	private Optional<OriginalPaymentInformation1> OriginalPaymentInformationAndStatus;

	public GroupHeader36 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader36 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation20 getOriginalGroupInformationAndStatus() {
		return OriginalGroupInformationAndStatus;
	}

	public void setOriginalGroupInformationAndStatus(
			OriginalGroupInformation20 OriginalGroupInformationAndStatus) {
		this.OriginalGroupInformationAndStatus = OriginalGroupInformationAndStatus;
	}

	public Optional<OriginalPaymentInformation1> getOriginalPaymentInformationAndStatus() {
		return OriginalPaymentInformationAndStatus;
	}

	public void setOriginalPaymentInformationAndStatus(
			Optional<OriginalPaymentInformation1> OriginalPaymentInformationAndStatus) {
		this.OriginalPaymentInformationAndStatus = OriginalPaymentInformationAndStatus;
	}
}