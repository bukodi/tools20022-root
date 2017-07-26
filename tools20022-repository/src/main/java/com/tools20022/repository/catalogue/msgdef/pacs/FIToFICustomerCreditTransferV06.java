package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FIToFICustomerCreditTransferV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader70;
import com.tools20022.repository.dict.msg.CreditTransferTransaction25;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer
 * message is sent by the debtor agent to the creditor agent, directly or
 * through other agents and/or a payment clearing and settlement system. It is
 * used to move funds from a debtor account to a creditor. Usage The
 * FIToFICustomerCreditTransfer message is exchanged between agents and can
 * contain one or more customer credit transfer instructions. The
 * FIToFICustomerCreditTransfer message does not allow for grouping: a
 * CreditTransferTransactionInformation block must be present for each credit
 * transfer transaction. The FIToFICustomerCreditTransfer message can be used in
 * different ways: - If the instructing agent and the instructed agent wish to
 * use their direct account relationship in the currency of the transfer then
 * the message contains both the funds for the customer transfer(s) as well as
 * the payment details; - If the instructing agent and the instructed agent have
 * no direct account relationship in the currency of the transfer, or do not
 * wish to use their account relationship, then other (reimbursement) agents
 * will be involved to cover for the customer transfer(s). The
 * FIToFICustomerCreditTransfer contains only the payment details and the
 * instructing agent must cover the customer transfer by sending a
 * FinancialInstitutionCreditTransfer to a reimbursement agent. This payment
 * method is called the Cover method; - If more than two financial institutions
 * are involved in the payment chain and if the FIToFICustomerCreditTransfer is
 * sent from one financial institution to the next financial institution in the
 * payment chain, then the payment method is called the Serial method. The
 * FIToFICustomerCreditTransfer message can be used in domestic and cross-border
 * scenarios.
 */
@PreviousVersion(FIToFICustomerCreditTransferV05.class)
public class FIToFICustomerCreditTransferV06 {

	private GroupHeader70 GroupHeader;
	private CreditTransferTransaction25 CreditTransferTransactionInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader70 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader70 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public CreditTransferTransaction25 getCreditTransferTransactionInformation() {
		return CreditTransferTransactionInformation;
	}

	public void setCreditTransferTransactionInformation(
			CreditTransferTransaction25 CreditTransferTransactionInformation) {
		this.CreditTransferTransactionInformation = CreditTransferTransactionInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}