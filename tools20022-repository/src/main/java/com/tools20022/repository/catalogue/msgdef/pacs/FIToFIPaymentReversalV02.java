package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentReversalV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentReversalV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader41;
import com.tools20022.repository.dict.msg.OriginalGroupInformation22;
import com.tools20022.repository.dict.msg.PaymentTransactionInformation29;
import java.util.Optional;

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
@PreviousVersion(FIToFIPaymentReversalV01.class)
@NextVersion(FIToFIPaymentReversalV03.class)
public class FIToFIPaymentReversalV02 {

	private GroupHeader41 GroupHeader;
	private OriginalGroupInformation22 OriginalGroupInformation;
	private Optional<PaymentTransactionInformation29> TransactionInformation;

	public GroupHeader41 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader41 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation22 getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			OriginalGroupInformation22 OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransactionInformation29> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransactionInformation29> TransactionInformation) {
		this.TransactionInformation = TransactionInformation;
	}
}