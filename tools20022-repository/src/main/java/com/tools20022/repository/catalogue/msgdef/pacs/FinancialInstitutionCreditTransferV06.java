package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FinancialInstitutionCreditTransferV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader70;
import com.tools20022.repository.dict.msg.CreditTransferTransaction23;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The FinancialInstitutionCreditTransfer message is sent by a debtor
 * financial institution to a creditor financial institution, directly or
 * through other agents and/or a payment clearing and settlement system. It is
 * used to move funds from a debtor account to a creditor, where both debtor and
 * creditor are financial institutions. Usage The
 * FinancialInstitutionCreditTransfer message is exchanged between agents and
 * can contain one or more credit transfer instructions where debtor and
 * creditor are both financial institutions. The
 * FinancialInstitutionCreditTransfer message does not allow for grouping: a
 * CreditTransferTransactionInformation block must be present for each credit
 * transfer transaction. The FinancialInstitutionCreditTransfer message can be
 * used in domestic and cross-border scenarios.
 */
@PreviousVersion(FinancialInstitutionCreditTransferV05.class)
public class FinancialInstitutionCreditTransferV06 {

	private GroupHeader70 GroupHeader;
	private CreditTransferTransaction23 CreditTransferTransactionInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader70 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader70 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public CreditTransferTransaction23 getCreditTransferTransactionInformation() {
		return CreditTransferTransactionInformation;
	}

	public void setCreditTransferTransactionInformation(
			CreditTransferTransaction23 CreditTransferTransactionInformation) {
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