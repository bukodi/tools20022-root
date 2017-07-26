package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader45;
import com.tools20022.repository.dict.msg.PaymentInstruction11;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The CreditorPaymentActivationRequest message is sent by the Creditor sending
 * party to the Debtor receiving party, directly or through agents. It is used
 * to initiate a creditor payment activation request.
 */
@PreviousVersion(CreditorPaymentActivationRequestV02.class)
@NextVersion(CreditorPaymentActivationRequestV04.class)
public class CreditorPaymentActivationRequestV03 {

	private GroupHeader45 GroupHeader;
	private PaymentInstruction11 PaymentInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader45 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader45 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public PaymentInstruction11 getPaymentInformation() {
		return PaymentInformation;
	}

	public void setPaymentInformation(PaymentInstruction11 PaymentInformation) {
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