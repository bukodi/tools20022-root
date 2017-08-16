package com.tools20022.repository.catalogue.msgdef.pacs;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pacs.FIToFIPaymentReversalV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader9;
import com.tools20022.repository.dict.msg.OriginalGroupInformation5;
import com.tools20022.repository.dict.msg.PaymentTransactionInformation5;
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
@NextVersion(FIToFIPaymentReversalV02.class)
public class FIToFIPaymentReversalV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader9 GroupHeader;
	private OriginalGroupInformation5 OriginalGroupInformation;
	private Optional<PaymentTransactionInformation5> TransactionInformation;

	public GroupHeader9 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader9 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation5 getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			OriginalGroupInformation5 OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransactionInformation5> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransactionInformation5> TransactionInformation) {
		this.TransactionInformation = TransactionInformation;
	}
}