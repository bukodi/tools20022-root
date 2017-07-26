package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.pain.CustomerPaymentReversalV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader56;
import com.tools20022.repository.dict.msg.OriginalGroupHeader3;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction21;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
@PreviousVersion(CustomerPaymentReversalV06.class)
public class CustomerPaymentReversalV07 {

	private GroupHeader56 GroupHeader;
	private OriginalGroupHeader3 OriginalGroupInformation;
	private Optional<OriginalPaymentInstruction21> OriginalPaymentInformationAndReversal;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader56 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader56 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupHeader3 getOriginalGroupInformation() {
		return OriginalGroupInformation;
	}

	public void setOriginalGroupInformation(
			OriginalGroupHeader3 OriginalGroupInformation) {
		this.OriginalGroupInformation = OriginalGroupInformation;
	}

	public Optional<OriginalPaymentInstruction21> getOriginalPaymentInformationAndReversal() {
		return OriginalPaymentInformationAndReversal;
	}

	public void setOriginalPaymentInformationAndReversal(
			Optional<OriginalPaymentInstruction21> OriginalPaymentInformationAndReversal) {
		this.OriginalPaymentInformationAndReversal = OriginalPaymentInformationAndReversal;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}