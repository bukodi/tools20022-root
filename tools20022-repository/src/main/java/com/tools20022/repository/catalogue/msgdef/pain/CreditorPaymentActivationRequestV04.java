package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader45;
import com.tools20022.repository.dict.msg.PaymentInstruction17;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The CreditorPaymentActivationRequest message is sent by the Creditor sending
 * party to the Debtor receiving party, directly or through agents. It is used
 * to initiate a creditor payment activation request.
 */
@PreviousVersion(CreditorPaymentActivationRequestV03.class)
@NextVersion(CreditorPaymentActivationRequestV05.class)
public class CreditorPaymentActivationRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader45 GroupHeader;
	private PaymentInstruction17 PaymentInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader45 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader45 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public PaymentInstruction17 getPaymentInformation() {
		return PaymentInformation;
	}

	public void setPaymentInformation(PaymentInstruction17 PaymentInformation) {
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