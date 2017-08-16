package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerDirectDebitInitiationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader1;
import com.tools20022.repository.dict.msg.PaymentInstructionInformation2;

/**
 * Scope The CustomerDirectDebitInitiation message is sent by the initiating
 * party to the forwarding agent or creditor agent. It is used to request single
 * or bulk collection(s) of funds from one or various debtor's account(s) for a
 * creditor. Usage The CustomerDirectDebitInitiation message can contain one or
 * more direct debit instructions. The message can be used in a direct or a
 * relay scenario: - In a direct scenario, the message is sent directly to the
 * creditor agent. The creditor agent is the account servicer of the creditor. -
 * In a relay scenario, the message is sent to a forwarding agent. The
 * forwarding agent acts as a concentrating financial institution. It will
 * forward the CustomerDirectDebitInitiation message to the creditor agent. The
 * message can also be used by an initiating party that has authority to send
 * the message on behalf of the creditor. This caters for example for the
 * scenario of a payments factory initiating all payments on behalf of a large
 * corporate. The CustomerDirectDebitInitiation message can be used in domestic
 * and cross-border scenarios. The CustomerDirectDebitInitiation may or may not
 * contain mandate related information, i.e. extracts from a mandate, such as
 * MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation
 * message must not be considered as a mandate. The
 * CustomerDirectDebitInitiation message must not be used by the creditor agent
 * to execute the direct debit instruction(s). The FIToFICustomerDirectDebit
 * message must be used instead. If it is agreed to include the payment
 * information related to the credit side only once (i.e. Grouped mode), the
 * PaymentInformation block will be present only once. If it is agreed to repeat
 * the payment information related to the credit side (i.e. Single mode), the
 * PaymentInformation block must be present once per occurrence of the
 * DirectDebitTransactionInformation block. The CustomerDirectDebitInitiation
 * message also allows for a Mixed mode where the PaymentInformation block can
 * be repeated and each PaymentInformation block can contain one or several
 * DirectDebitTransactionInformation block(s). Single When grouping is set to
 * Single, information for each individual instruction is included separately.
 * This means the PaymentInformation block is repeated, and present for each
 * occurrence of the Direct Debit TransactionInformation block. Grouped When
 * grouping is set to Grouped, the PaymentInformation block will be present once
 * and the Direct Debit TransactionInformation block will be repeated. Mixed
 * When grouping is set to Mixed, the PaymentInformation block may be present
 * once or may be repeated. Each sequence of the PaymentInformation block may
 * contain one or several Direct Debit TransactionInformation block(s).
 */
@NextVersion(CustomerDirectDebitInitiationV02.class)
public class CustomerDirectDebitInitiationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader1 GroupHeader;
	private PaymentInstructionInformation2 PaymentInformation;

	public GroupHeader1 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader1 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public PaymentInstructionInformation2 getPaymentInformation() {
		return PaymentInformation;
	}

	public void setPaymentInformation(
			PaymentInstructionInformation2 PaymentInformation) {
		this.PaymentInformation = PaymentInformation;
	}
}