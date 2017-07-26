package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.camt.CustomerPaymentCancellationRequestV01;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader7;
import com.tools20022.repository.dict.msg.OriginalGroupInformation4;
import com.tools20022.repository.dict.msg.PaymentTransactionInformation3;
import java.util.Optional;

/**
 * Scope The PaymentCancellationRequest message is sent by the initiating party
 * or any agent, to the next party in the payment chain. It is used to request
 * the cancellation of an instruction previously sent. Usage The
 * PaymentCancellationRequest message is exchanged between non-financial
 * institution customers and agents to request the cancellation of a payment
 * initiation message previously sent (i.e. the CustomerCreditTransferInitiation
 * message and the CustomerDirectDebitInitiation messages). The
 * PaymentCancellationRequest message can be used to request the cancellation of
 * single instructions or multiple instructions, from one or multiple files. The
 * PaymentCancellationRequest message can be used in domestic and cross-border
 * scenarios. The PaymentCancellationRequest message refers to the original
 * instruction(s) by means of references only or by means of references and a
 * set of elements from the original instruction. The PaymentCancellationRequest
 * message exchanged between non-financial institution customers and agents is
 * identified in the schema as follows:
 * urn:iso:std:iso:20022:tech:xsd:pain.006.001.01
 */
@NextVersion(CustomerPaymentCancellationRequestV01.class)
public class PaymentCancellationRequestV01 {

	private GroupHeader7 GroupHeader;
	private OriginalGroupInformation4 OriginalGroupInformation;
	private Optional<PaymentTransactionInformation3> TransactionInformation;

	public GroupHeader7 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader7 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation4 getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			OriginalGroupInformation4 OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<PaymentTransactionInformation3> getTransactionInformation() {
		return TransactionInformation;
	}

	public void setTransactionInformation(
			Optional<PaymentTransactionInformation3> TransactionInformation) {
		this.TransactionInformation = TransactionInformation;
	}
}