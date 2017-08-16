package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pacs.PaymentReturnV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.PaymentReturnV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader38;
import com.tools20022.repository.dict.msg.OriginalGroupInformation21;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PaymentTransactionInformation27;

/**
 * Scope The PaymentReturn message is sent by an agent to the previous agent in
 * the payment chain to undo a payment previously settled. Usage The
 * PaymentReturn message is exchanged between agents to return funds after
 * settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer
 * message and FinancialInstitutionCreditTransfer message) or direct debit
 * instructions (FIToFICustomerDirectDebit message). The PaymentReturn message
 * should not be used between agents and non-financial institution customers.
 * Non-financial institution customers will be informed about a debit or a
 * credit on their account(s) through a BankToCustomerDebitCreditNotification
 * message ('notification') and/or
 * BankToCustomerAccountReport/BankToCustomerStatement message ('statement').
 * The PaymentReturn message can be used to return single instructions or
 * multiple instructions from one or different files. The PaymentReturn message
 * can be used in domestic and cross-border scenarios. The PaymentReturn message
 * refers to the original instruction(s) by means of references only or by means
 * of references and a set of elements from the original instruction.
 */
@PreviousVersion(PaymentReturnV01.class)
@NextVersion(PaymentReturnV03.class)
public class PaymentReturnV02 implements GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader38 GroupHeader;
	private Optional<OriginalGroupInformation21> OriginalGroupInformation;
	private Optional<PaymentTransactionInformation27> TransactionInformation;

	public GroupHeader38 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader38 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public Optional<OriginalGroupInformation21> getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			Optional<OriginalGroupInformation21> OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransactionInformation27> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransactionInformation27> TransactionInformation) {
		this.TransactionInformation = TransactionInformation;
	}
}