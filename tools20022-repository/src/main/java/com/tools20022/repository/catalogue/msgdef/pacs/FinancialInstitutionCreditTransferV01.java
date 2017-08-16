package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pacs.FinancialInstitutionCreditTransferV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader4;
import com.tools20022.repository.dict.msg.CreditTransferTransactionInformation3;

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
@NextVersion(FinancialInstitutionCreditTransferV02.class)
public class FinancialInstitutionCreditTransferV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader4 GroupHeader;
	private CreditTransferTransactionInformation3 CreditTransferTransactionInformation;

	public GroupHeader4 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader4 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public CreditTransferTransactionInformation3 getCreditTransferTransactionInformation() {
		return CreditTransferTransactionInformation;
	}

	public void setCreditTransferTransactionInformation(
			CreditTransferTransactionInformation3 CreditTransferTransactionInformation) {
		this.CreditTransferTransactionInformation = CreditTransferTransactionInformation;
	}
}