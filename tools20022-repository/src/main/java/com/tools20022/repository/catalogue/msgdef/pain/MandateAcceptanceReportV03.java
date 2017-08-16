package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.MandateAcceptanceReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.MandateAcceptanceReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader47;
import com.tools20022.repository.dict.msg.MandateAcceptance3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The MandateAcceptanceReport message is sent from the agent of the
 * receiver (debtor or creditor) of the MandateRequest message (initiation,
 * amendment or cancellation) to the agent of the initiator of the
 * MandateRequest message (debtor or creditor). A MandateAcceptanceReport
 * message is used to confirm the acceptance or rejection of a MandateRequest
 * message. Where acceptance is part of the full process flow, a MandateRequest
 * message only becomes valid after a confirmation of acceptance is received
 * through a MandateAcceptanceReport message from the agent of the receiver.
 * Usage The MandateAcceptanceReport message can contain one or more
 * confirmation(s) of acceptance or rejection of a specific Mandate Request. The
 * messages can be exchanged between debtor agent and creditor agent and between
 * debtor agent and debtor and creditor agent and creditor. The
 * MandateAcceptanceReport message can be used in domestic and cross-border
 * scenarios.
 */
@PreviousVersion(MandateAcceptanceReportV02.class)
@NextVersion(MandateAcceptanceReportV04.class)
public class MandateAcceptanceReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader47 GroupHeader;
	private MandateAcceptance3 UnderlyingAcceptanceDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader47 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader47 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public MandateAcceptance3 getUnderlyingAcceptanceDetails() {
		return UnderlyingAcceptanceDetails;
	}

	public void setUnderlyingAcceptanceDetails(
			MandateAcceptance3 UnderlyingAcceptanceDetails) {
		this.UnderlyingAcceptanceDetails = UnderlyingAcceptanceDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}