package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFICustomerDirectDebitV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFICustomerDirectDebitV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader34;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation10;

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
@PreviousVersion(FIToFICustomerDirectDebitV01.class)
@NextVersion(FIToFICustomerDirectDebitV03.class)
public class FIToFICustomerDirectDebitV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader34 GroupHeader;
	private DirectDebitTransactionInformation10 DirectDebitTransactionInformation;

	public GroupHeader34 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader34 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public DirectDebitTransactionInformation10 getDirectDebitTransactionInformation() {
		return DirectDebitTransactionInformation;
	}

	public void setDirectDebitTransactionInformation(
			DirectDebitTransactionInformation10 DirectDebitTransactionInformation) {
		this.DirectDebitTransactionInformation = DirectDebitTransactionInformation;
	}
}