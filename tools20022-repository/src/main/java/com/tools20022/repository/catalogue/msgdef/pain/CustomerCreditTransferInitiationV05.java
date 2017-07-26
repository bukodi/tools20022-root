package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.pain.CustomerCreditTransferInitiationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerCreditTransferInitiationV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader48;
import com.tools20022.repository.dict.msg.PaymentInstruction9;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The CustomerCreditTransferInitiation message is sent by the initiating
 * party to the forwarding agent or debtor agent. It is used to request movement
 * of funds from the debtor account to a creditor. Usage The
 * CustomerCreditTransferInitiation message can contain one or more customer
 * credit transfer instructions. The CustomerCreditTransferInitiation message is
 * used to exchange: - One or more instances of a credit transfer initiation; -
 * Payment transactions that result in book transfers at the debtor agent or
 * payments to another financial institution; - Payment transactions that result
 * in an electronic cash transfer to the creditor account or in the emission of
 * a cheque. The message can be used in a direct or a relay scenario: - In a
 * direct scenario, the message is sent directly to the debtor agent. The debtor
 * agent is the account servicer of the debtor. - In a relay scenario, the
 * message is sent to a forwarding agent. The forwarding agent acts as a
 * concentrating financial institution. It will forward the
 * CustomerCreditTransferInitiation message to the debtor agent. The message can
 * also be used by an initiating party that has authority to send the message on
 * behalf of the debtor. This caters for example for the scenario of a payments
 * factory initiating all payments on behalf of a large corporate. The
 * CustomerCreditTransferInitiation message can be used in domestic and
 * cross-border scenarios. The CustomerCreditTransferInitiation message must not
 * be used by the debtor agent to execute the credit transfer instruction(s).
 * The FIToFICustomerCreditTransfer message must be used instead.
 */
@PreviousVersion(CustomerCreditTransferInitiationV04.class)
@NextVersion(CustomerCreditTransferInitiationV06.class)
public class CustomerCreditTransferInitiationV05 {

	private GroupHeader48 GroupHeader;
	private PaymentInstruction9 PaymentInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader48 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader48 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public PaymentInstruction9 getPaymentInformation() {
		return PaymentInformation;
	}

	public void setPaymentInformation(PaymentInstruction9 PaymentInformation) {
		this.PaymentInformation = PaymentInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}