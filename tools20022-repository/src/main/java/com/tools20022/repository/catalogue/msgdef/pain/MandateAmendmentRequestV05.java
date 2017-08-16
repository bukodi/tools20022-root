package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.MandateAmendmentRequestV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader47;
import com.tools20022.repository.dict.msg.MandateAmendment5;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The MandateAmendmentRequest message is sent by the initiator of the
 * request to his agent and/or counterparty. The initiator can both be the
 * debtor or the creditor (or where appropriate the debtor agent). The
 * MandateAmendmentRequest message is forwarded by the agent of the initiator to
 * the agent of the counterparty. A MandateAmendmentRequest message is used to
 * request the amendment of specific information in an existing mandate. The
 * MandateAmendmentRequest message must reflect the new data of the element(s)
 * to be amended and at a minimum a unique reference to the existing mandate. If
 * accepted, this MandateAmendmentRequest message together with the
 * MandateAcceptanceReport message confirming the acceptance will be considered
 * as a valid amendment on an existing mandate, agreed upon by all parties. The
 * amended mandate will from then on be considered the valid mandate. Usage The
 * MandateAmendmentRequest message can contain one or more request(s) to amend a
 * specific mandate. The messages can be exchanged between creditor and creditor
 * agent or debtor and debtor agent and between creditor agent and debtor agent.
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor or debtor. The
 * MandateAmendmentRequest message can be used in domestic and cross-border
 * scenarios. If all elements in the existing Mandate need to be amended or the
 * underlying contract is different, then the MandateAmendmentRequest message
 * should not be used. The existing Mandate has to be cancelled and a new
 * Mandate has to be initiated.
 */
@PreviousVersion(MandateAmendmentRequestV04.class)
public class MandateAmendmentRequestV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader47 GroupHeader;
	private MandateAmendment5 UnderlyingAmendmentDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader47 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader47 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public MandateAmendment5 getUnderlyingAmendmentDetails() {
		return UnderlyingAmendmentDetails;
	}

	public void setUnderlyingAmendmentDetails(
			MandateAmendment5 UnderlyingAmendmentDetails) {
		this.UnderlyingAmendmentDetails = UnderlyingAmendmentDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}