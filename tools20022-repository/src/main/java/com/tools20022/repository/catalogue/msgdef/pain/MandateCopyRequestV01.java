package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.dict.msg.GroupHeader47;
import com.tools20022.repository.dict.msg.MandateCopy1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The MandateCopyRequest message is sent by the initiator of the request
 * to his agent. The initiator can either be the debtor or the creditor. The
 * MandateCopyRequest message is forwarded by the agent of the initiator to the
 * agent of the counterparty. A MandateCopyRequest message is used to request a
 * copy of an existing mandate. If accepted, the mandate copy can be sent using
 * the MandateAcceptanceReport message. Usage The MandateCopyRequest message can
 * contain one or more copy requests. The messages can be exchanged between
 * creditor and creditor agent or debtor and debtor agent and between creditor
 * agent and debtor agent. The message can also be used by an initiating party
 * that has authority to send the message on behalf of the creditor or debtor.
 * The MandateCopyRequest message can be used in domestic and cross-border
 * scenarios.
 */
public class MandateCopyRequestV01 {

	private GroupHeader47 GroupHeader;
	private MandateCopy1 UnderlyingCopyRequestDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader47 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader47 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public MandateCopy1 getUnderlyingCopyRequestDetails() {
		return UnderlyingCopyRequestDetails;
	}

	public void setUnderlyingCopyRequestDetails(
			MandateCopy1 UnderlyingCopyRequestDetails) {
		this.UnderlyingCopyRequestDetails = UnderlyingCopyRequestDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}