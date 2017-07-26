package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.pain.CustomerPaymentReversalV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.CustomerPaymentReversalV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader40;
import com.tools20022.repository.dict.msg.OriginalGroupInformation22;
import com.tools20022.repository.dict.msg.OriginalPaymentInformation2;
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
@PreviousVersion(CustomerPaymentReversalV01.class)
@NextVersion(CustomerPaymentReversalV03.class)
public class CustomerPaymentReversalV02 {

	private GroupHeader40 GroupHeader;
	private OriginalGroupInformation22 OriginalGroupInformation;
	private Optional<OriginalPaymentInformation2> OriginalPaymentInformationAndReversal;

	public GroupHeader40 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader40 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation22 getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			OriginalGroupInformation22 OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<OriginalPaymentInformation2> getOriginalPaymentInformationAndReversal() {
		return OriginalPaymentInformationAndReversal;
	}

	public void setOriginalPaymentInformationAndReversal(
			Optional<OriginalPaymentInformation2> OriginalPaymentInformationAndReversal) {
		this.OriginalPaymentInformationAndReversal = OriginalPaymentInformationAndReversal;
	}
}