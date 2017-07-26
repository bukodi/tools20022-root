package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.dict.msg.GroupHeader63;
import com.tools20022.repository.dict.msg.CreditTransferTransaction9;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope: The FinancialInstitutionDirectDebit message is sent by an exchange or
 * clearing house, or a financial institution, directly or through another
 * agent, to the DebtorAgent. It is used to instruct the DebtorAgent to move
 * funds from one or more debtor(s) account(s) to one or more creditor(s), where
 * both debtor and creditor are financial institutions.
 * 
 * Usage: The FinancialInstitutionDirectDebit message is exchanged between
 * agents and can contain one or more financial institution direct debit
 * instruction(s) for one or more creditor(s). The
 * FinancialInstitutionDirectDebit message can be used in domestic and
 * cross-border scenarios.
 */
public class FinancialInstitutionDirectDebitV02 {

	private GroupHeader63 GroupHeader;
	private CreditTransferTransaction9 CreditInstruction;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader63 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader63 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public CreditTransferTransaction9 getCreditInstruction() {
		return CreditInstruction;
	}

	public void setCreditInstruction(
			CreditTransferTransaction9 CreditInstruction) {
		this.CreditInstruction = CreditInstruction;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}