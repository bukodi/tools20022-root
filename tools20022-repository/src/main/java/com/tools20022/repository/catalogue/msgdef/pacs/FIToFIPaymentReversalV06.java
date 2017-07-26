package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentReversalV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentReversalV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader71;
import com.tools20022.repository.dict.msg.OriginalGroupHeader3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PaymentTransaction60;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The FinancialInstitutionToFinancialInstitutionPaymentReversal message
 * is sent by an agent to the next party in the payment chain. It is used to
 * reverse a payment previously executed. Usage The FIToFIPaymentReversal
 * message is exchanged between agents to reverse a payment message that has
 * been settled. The result will be a credit on the debtor account (when the
 * reversed payment was a Direct Debit) or a debit on the creditor account (when
 * the reversed payment was a Credit Transfer). The FIToFIPaymentReversal
 * message may or may not be the follow-up of a payment message. The
 * FIToFIPaymentReversal message refers to the original payment message by means
 * of references only or by means of references and a set of elements from the
 * original instruction. The FIToFIPaymentReversal message can be used in
 * domestic and cross-border scenarios.
 */
@PreviousVersion(FIToFIPaymentReversalV05.class)
@NextVersion(FIToFIPaymentReversalV07.class)
public class FIToFIPaymentReversalV06 {

	private GroupHeader71 GroupHeader;
	private Optional<OriginalGroupHeader3> OriginalGroupInformation;
	private Optional<PaymentTransaction60> TransactionInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader71 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader71 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public Optional<OriginalGroupHeader3> getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			Optional<OriginalGroupHeader3> OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransaction60> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransaction60> TransactionInformation) {
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