package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.MandateAcceptanceReportV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.MandateAcceptanceReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader47;
import com.tools20022.repository.dict.msg.MandateAcceptance2;
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
 * Usage The MandateAcceptanceReport message can contain only one confirmation
 * of acceptance of rejection of one specific MandateRequest message. The
 * messages can be exchanged between debtor agent and creditor agent and between
 * debtor agent and debtor and creditor agent and creditor. The
 * MandateAcceptanceReport message can be used in domestic and cross-border
 * scenarios.
 */
@PreviousVersion(MandateAcceptanceReportV01.class)
@NextVersion(MandateAcceptanceReportV03.class)
public class MandateAcceptanceReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader47 GroupHeader;
	private MandateAcceptance2 UnderlyingAcceptanceDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader47 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader47 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public MandateAcceptance2 getUnderlyingAcceptanceDetails() {
		return UnderlyingAcceptanceDetails;
	}

	public void setUnderlyingAcceptanceDetails(
			MandateAcceptance2 UnderlyingAcceptanceDetails) {
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