package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.MandateCancellationRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.MandateCancellationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader47;
import com.tools20022.repository.dict.msg.MandateCancellation3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The MandateCancellationRequest message is sent by the initiator of the
 * request to his agent. The initiator can either be the debtor or the creditor.
 * The MandateCancellationRequest message is forwarded by the agent of the
 * initiator to the agent of the counterparty. A MandateCancellationRequest
 * message is used to request the cancellation of an existing mandate. If
 * accepted, this MandateCancellationRequest message together with the
 * MandateAcceptanceReport message confirming the acceptance will be considered
 * a valid cancellation of an existing mandate, agreed upon by all parties.
 * Usage The MandateCancellationRequest message can contain one or more
 * request(s) to cancel a specific mandate. The messages can be exchanged
 * between creditor and creditor agent or debtor and debtor agent and between
 * creditor agent and debtor agent. The message can also be used by an
 * initiating party that has authority to send the message on behalf of the
 * creditor or debtor. The MandateCancellationRequest message can be used in
 * domestic and cross-border scenarios.
 */
@PreviousVersion(MandateCancellationRequestV02.class)
@NextVersion(MandateCancellationRequestV04.class)
public class MandateCancellationRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader47 GroupHeader;
	private MandateCancellation3 UnderlyingCancellationDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader47 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader47 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public MandateCancellation3 getUnderlyingCancellationDetails() {
		return UnderlyingCancellationDetails;
	}

	public void setUnderlyingCancellationDetails(
			MandateCancellation3 UnderlyingCancellationDetails) {
		this.UnderlyingCancellationDetails = UnderlyingCancellationDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}