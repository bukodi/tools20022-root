package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerDirectDebitInitiationV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerDirectDebitInitiationV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader55;
import com.tools20022.repository.dict.msg.PaymentInstruction18;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

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
 * message must be used instead.
 */
@PreviousVersion(CustomerDirectDebitInitiationV05.class)
@NextVersion(CustomerDirectDebitInitiationV07.class)
public class CustomerDirectDebitInitiationV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader55 GroupHeader;
	private PaymentInstruction18 PaymentInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader55 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader55 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public PaymentInstruction18 getPaymentInformation() {
		return PaymentInformation;
	}

	public void setPaymentInformation(PaymentInstruction18 PaymentInformation) {
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