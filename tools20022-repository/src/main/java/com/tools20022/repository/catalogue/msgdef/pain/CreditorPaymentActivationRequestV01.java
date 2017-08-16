package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader45;
import com.tools20022.repository.dict.msg.PaymentInstruction5;

/**
 * Scope This message is sent by the Creditor sending party to the Debtor
 * receiving party, directly or through agents. It is used to initiate a
 * creditor payment activation request.
 */
@NextVersion(CreditorPaymentActivationRequestV02.class)
public class CreditorPaymentActivationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader45 GroupHeader;
	private PaymentInstruction5 PaymentInformation;

	public GroupHeader45 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader45 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public PaymentInstruction5 getPaymentInformation() {
		return PaymentInformation;
	}

	public void setPaymentInformation(PaymentInstruction5 PaymentInformation) {
		this.PaymentInformation = PaymentInformation;
	}
}