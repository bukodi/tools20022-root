package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FIToFICustomerDirectDebitV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFICustomerDirectDebitV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader50;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation17;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

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
@PreviousVersion(FIToFICustomerDirectDebitV04.class)
@NextVersion(FIToFICustomerDirectDebitV06.class)
public class FIToFICustomerDirectDebitV05 {

	private GroupHeader50 GroupHeader;
	private DirectDebitTransactionInformation17 DirectDebitTransactionInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader50 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader50 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public DirectDebitTransactionInformation17 getDirectDebitTransactionInformation() {
		return DirectDebitTransactionInformation;
	}

	public void setDirectDebitTransactionInformation(
			DirectDebitTransactionInformation17 DirectDebitTransactionInformation) {
		this.DirectDebitTransactionInformation = DirectDebitTransactionInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}