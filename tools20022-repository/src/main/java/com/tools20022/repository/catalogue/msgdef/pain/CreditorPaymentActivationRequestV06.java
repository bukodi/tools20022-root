package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader45;
import com.tools20022.repository.dict.msg.PaymentInstruction23;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The CreditorPaymentActivationRequest message is sent by the Creditor sending
 * party to the Debtor receiving party, directly or through agents. It is used
 * by a Creditor to request movement of funds from the debtor account to a
 * creditor.
 */
@PreviousVersion(CreditorPaymentActivationRequestV05.class)
public class CreditorPaymentActivationRequestV06 {

	private GroupHeader45 GroupHeader;
	private PaymentInstruction23 PaymentInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader45 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader45 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public PaymentInstruction23 getPaymentInformation() {
		return PaymentInformation;
	}

	public void setPaymentInformation(PaymentInstruction23 PaymentInformation) {
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