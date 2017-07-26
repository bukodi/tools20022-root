package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FIToFICustomerDirectDebitV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader3;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation2;

/**
 * Scope The FinancialInstitutionToFinancialInstitutionCustomerDirectDebit
 * message is sent by the creditor agent to the debtor agent, directly or
 * through other agents and/or a payment clearing and settlement system. It is
 * used to collect funds from a debtor account for a creditor. Usage The
 * FItoFICustomerDirectDebit message can contain one or more customer direct
 * debit instructions. The FIToFICustomerDirectDebit message does not allow for
 * grouping: the PaymentInformation block must be present once per occurrence of
 * a DirectDebitTransactionInformation block. The FItoFICustomerDirectDebit
 * message may or may not contain mandate related information, i.e. extracts
 * from a mandate, such as the MandateIdentification or DateOfSignature. The
 * FIToFICustomerDirectDebit message must not be considered as a mandate. The
 * FItoFICustomerDirectDebit message can be used in domestic and cross-border
 * scenarios.
 */
@NextVersion(FIToFICustomerDirectDebitV02.class)
public class FIToFICustomerDirectDebitV01 {

	private GroupHeader3 GroupHeader;
	private DirectDebitTransactionInformation2 DirectDebitTransactionInformation;

	public GroupHeader3 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader3 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public DirectDebitTransactionInformation2 getDirectDebitTransactionInformation() {
		return DirectDebitTransactionInformation;
	}

	public void setDirectDebitTransactionInformation(
			DirectDebitTransactionInformation2 DirectDebitTransactionInformation) {
		this.DirectDebitTransactionInformation = DirectDebitTransactionInformation;
	}
}