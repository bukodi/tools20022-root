package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.GroupHeader53;
import com.tools20022.repository.dict.msg.OriginalGroupInformation27;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PaymentTransaction73;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The FinancialInstitutionToFinancialInstitutionPaymentStatusRequest
 * message is sent by the debtor agent to the creditor agent, directly or
 * through other agents and/or a payment clearing and settlement system. It is
 * used to request a FIToFIPaymentStatusReport message containing information on
 * the status of a previously sent instruction. Usage The
 * FIToFIPaymentStatusRequest message is exchanged between agents to request
 * status information about instructions previously sent. Its usage will always
 * be governed by a bilateral agreement between the agents. The
 * FIToFIPaymentStatusRequest message can be used to request information about
 * the status (e.g. rejection, acceptance) of a credit transfer instruction, a
 * direct debit instruction, as well as other intra-agent instructions (for
 * example FIToFIPaymentCancellationRequest). The FIToFIPaymentStatusRequest
 * message refers to the original instruction(s) by means of references only or
 * by means of references and a set of elements from the original instruction.
 * The FIToFIPaymentStatusRequest message can be used in domestic and
 * cross-border scenarios.
 */
public class FIToFIPaymentStatusRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader53 GroupHeader;
	private Optional<OriginalGroupInformation27> OriginalGroupInformation;
	private Optional<PaymentTransaction73> TransactionInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader53 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader53 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public Optional<OriginalGroupInformation27> getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			Optional<OriginalGroupInformation27> OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransaction73> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransaction73> TransactionInformation) {
		this.TransactionInformation = TransactionInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}