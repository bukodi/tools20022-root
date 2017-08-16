package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.MandateAcceptanceReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader31;
import com.tools20022.repository.dict.msg.MandateAcceptance1;

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
@NextVersion(MandateAcceptanceReportV02.class)
public class MandateAcceptanceReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader31 GroupHeader;
	private MandateAcceptance1 UnderlyingAcceptanceDetails;

	public GroupHeader31 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader31 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public MandateAcceptance1 getUnderlyingAcceptanceDetails() {
		return UnderlyingAcceptanceDetails;
	}

	public void setUnderlyingAcceptanceDetails(
			MandateAcceptance1 UnderlyingAcceptanceDetails) {
		this.UnderlyingAcceptanceDetails = UnderlyingAcceptanceDetails;
	}
}