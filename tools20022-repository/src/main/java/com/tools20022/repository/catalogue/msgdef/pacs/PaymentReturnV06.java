package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.PaymentReturnV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.PaymentReturnV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader72;
import com.tools20022.repository.dict.msg.OriginalGroupHeader2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PaymentTransaction65;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
@PreviousVersion(PaymentReturnV05.class)
@NextVersion(PaymentReturnV07.class)
public class PaymentReturnV06 {

	private GroupHeader72 GroupHeader;
	private Optional<OriginalGroupHeader2> OriginalGroupInformation;
	private Optional<PaymentTransaction65> TransactionInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader72 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader72 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public Optional<OriginalGroupHeader2> getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			Optional<OriginalGroupHeader2> OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransaction65> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransaction65> TransactionInformation) {
		this.TransactionInformation = TransactionInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}