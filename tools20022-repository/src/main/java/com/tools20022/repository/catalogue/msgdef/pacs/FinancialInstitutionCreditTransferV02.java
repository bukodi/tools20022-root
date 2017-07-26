package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FinancialInstitutionCreditTransferV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FinancialInstitutionCreditTransferV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader35;
import com.tools20022.repository.dict.msg.CreditTransferTransactionInformation13;

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
@PreviousVersion(FinancialInstitutionCreditTransferV01.class)
@NextVersion(FinancialInstitutionCreditTransferV03.class)
public class FinancialInstitutionCreditTransferV02 {

	private GroupHeader35 GroupHeader;
	private CreditTransferTransactionInformation13 CreditTransferTransactionInformation;

	public GroupHeader35 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader35 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public CreditTransferTransactionInformation13 getCreditTransferTransactionInformation() {
		return CreditTransferTransactionInformation;
	}

	public void setCreditTransferTransactionInformation(
			CreditTransferTransactionInformation13 CreditTransferTransactionInformation) {
		this.CreditTransferTransactionInformation = CreditTransferTransactionInformation;
	}
}