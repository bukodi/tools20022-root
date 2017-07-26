package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentReversalV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentReversalV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader57;
import com.tools20022.repository.dict.msg.OriginalGroupHeader3;
import com.tools20022.repository.dict.msg.PaymentTransaction36;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The FinancialInstitutionToFinancialInstitutionPaymentReversal message
 * is sent by an agent to the next party in the payment chain. It is used to
 * reverse a payment previously executed. Usage The FIToFIPaymentReversal
 * message is exchanged between agents to reverse a FIToFICustomerDirectDebit
 * message that has been settled. The result will be a credit on the debtor
 * account. The FIToFIPaymentReversal message may or may not be the follow-up of
 * a CustomerDirectDebitInitiation message. The FIToFIPaymentReversal message
 * refers to the original FIToFICustomerDirectDebit message by means of
 * references only or by means of references and a set of elements from the
 * original instruction. The FIToFIPaymentReversal message can be used in
 * domestic and cross-border scenarios.
 */
@PreviousVersion(FIToFIPaymentReversalV02.class)
@NextVersion(FIToFIPaymentReversalV04.class)
public class FIToFIPaymentReversalV03 {

	private GroupHeader57 GroupHeader;
	private OriginalGroupHeader3 OriginalGroupInformation;
	private Optional<PaymentTransaction36> TransactionInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader57 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader57 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupHeader3 getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			OriginalGroupHeader3 OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransaction36> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransaction36> TransactionInformation) {
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