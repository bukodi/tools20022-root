package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.GroupHeader47;
import com.tools20022.repository.dict.msg.MandateSuspension1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The MandateSuspensionRequest message is sent by the initiator of the
 * request to its agent. The initiator can either be the debtor, debtor agent,
 * creditor or creditor agent. A MandateSuspensionRequest message is used to
 * request the suspension of an existing mandate until the suspension is lifted.
 * Usage The MandateSuspensionRequest message can contain one or more suspension
 * requests. The messages can be exchanged between creditor and creditor agent
 * or debtor and debtor agent and between creditor agent and debtor agent. The
 * MandateSuspensionRequest message can be used in domestic and cross-border
 * scenarios.
 */
public class MandateSuspensionRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader47 GroupHeader;
	private MandateSuspension1 UnderlyingSuspensionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader47 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader47 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public MandateSuspension1 getUnderlyingSuspensionDetails() {
		return UnderlyingSuspensionDetails;
	}

	public void setUnderlyingSuspensionDetails(
			MandateSuspension1 UnderlyingSuspensionDetails) {
		this.UnderlyingSuspensionDetails = UnderlyingSuspensionDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}