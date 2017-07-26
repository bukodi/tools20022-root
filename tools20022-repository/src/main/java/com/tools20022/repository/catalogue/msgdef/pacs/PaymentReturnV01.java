package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.PaymentReturnV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader6;
import com.tools20022.repository.dict.msg.OriginalGroupInformation2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PaymentTransactionInformation2;

/**
 * Scope The PaymentReturn message is sent by an agent to the previous agent in
 * the payment chain to undo a payment previously settled. Usage The
 * PaymentReturn message is exchanged between agents to return funds after
 * settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer
 * message and FinancialInstitutionCreditTransfer message) or direct debit
 * instructions (FIToFICustomerDirectDebit message). The PaymentReturn message
 * should not be used between agents and non-financial institution customers.
 * Non-financial institution customers will be informed about a debit or a
 * credit on their account(s) through an Advice of Credit/Debit message and/or
 * Statement message. The PaymentReturn message can be used to return single
 * instructions or multiple instructions from one or different files. The
 * PaymentReturn message can be used in domestic and cross-border scenarios. The
 * PaymentReturn message refers to the original instruction(s) by means of
 * references only or by means of references and a set of elements from the
 * original instruction.
 */
@NextVersion(PaymentReturnV02.class)
public class PaymentReturnV01 {

	private GroupHeader6 GroupHeader;
	private Optional<OriginalGroupInformation2> OriginalGroupInformation;
	private Optional<PaymentTransactionInformation2> TransactionInformation;

	public GroupHeader6 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader6 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public Optional<OriginalGroupInformation2> getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			Optional<OriginalGroupInformation2> OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransactionInformation2> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransactionInformation2> TransactionInformation) {
		this.TransactionInformation = TransactionInformation;
	}
}