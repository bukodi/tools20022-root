package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.GroupHeader47;
import com.tools20022.repository.dict.msg.Mandate10;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The MandateInitiationRequest message is sent by the initiator of the
 * request to his agent. The initiator can either be the debtor or the creditor.
 * The MandateInitiationRequest message is forwarded by the agent of the
 * initiator to the agent of the counterparty. The MandateInitiationRequest
 * message is used to setup the instruction that allows the debtor agent to
 * accept instructions from the creditor, through the creditor agent, to debit
 * the account of the debtor. Usage The MandateInitiationRequest message can
 * contain one or more request(s) to setup a specific mandate. The messages can
 * be exchanged between creditor and creditor agent or debtor and debtor agent
 * and between creditor agent and debtor agent. The message can also be used by
 * an initiating party that has authority to send the message on behalf of the
 * creditor or debtor. The MandateInitiationRequest message can be used in
 * domestic and cross-border scenarios.
 */
public class MandateInitiationRequestV05
		implements
			InstanceOf<MMMessageDefinition> {

	private GroupHeader47 GroupHeader;
	private Mandate10 Mandate;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader47 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader47 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public Mandate10 getMandate() {
		return Mandate;
	}

	public void setMandate(Mandate10 Mandate) {
		this.Mandate = Mandate;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}