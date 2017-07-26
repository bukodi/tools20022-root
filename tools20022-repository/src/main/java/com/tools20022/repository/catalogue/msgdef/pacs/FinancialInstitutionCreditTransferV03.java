package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FinancialInstitutionCreditTransferV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FinancialInstitutionCreditTransferV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader51;
import com.tools20022.repository.dict.msg.CreditTransferTransaction4;
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
@PreviousVersion(FinancialInstitutionCreditTransferV02.class)
@NextVersion(FinancialInstitutionCreditTransferV04.class)
public class FinancialInstitutionCreditTransferV03 {

	private GroupHeader51 GroupHeader;
	private CreditTransferTransaction4 CreditTransferTransactionInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader51 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader51 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public CreditTransferTransaction4 getCreditTransferTransactionInformation() {
		return CreditTransferTransactionInformation;
	}

	public void setCreditTransferTransactionInformation(
			CreditTransferTransaction4 CreditTransferTransactionInformation) {
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