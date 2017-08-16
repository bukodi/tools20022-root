package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerPaymentReversalV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader8;
import com.tools20022.repository.dict.msg.OriginalGroupInformation5;
import com.tools20022.repository.dict.msg.PaymentTransactionInformation4;
import java.util.Optional;

/**
 * Scope The CustomerPaymentReversal message is sent by the initiating party to
 * the next party in the payment chain. It is used to reverse a payment
 * previously executed. Usage The CustomerPaymentReversal message is exchanged
 * between a non-financial institution customer and an agent to reverse a
 * CustomerDirectDebitInitiation message that has been settled. The result will
 * be a credit on the debtor account. The CustomerPaymentReversal message refers
 * to the original CustomerDirectDebitInitiation message by means of references
 * only or by means of references and a set of elements from the original
 * instruction. The CustomerPaymentReversal message can be used in domestic and
 * cross-border scenarios.
 */
@NextVersion(CustomerPaymentReversalV02.class)
public class CustomerPaymentReversalV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader8 GroupHeader;
	private OriginalGroupInformation5 OriginalGroupInformation;
	private Optional<PaymentTransactionInformation4> TransactionInformation;

	public GroupHeader8 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader8 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation5 getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			OriginalGroupInformation5 OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransactionInformation4> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransactionInformation4> TransactionInformation) {
		this.TransactionInformation = TransactionInformation;
	}
}