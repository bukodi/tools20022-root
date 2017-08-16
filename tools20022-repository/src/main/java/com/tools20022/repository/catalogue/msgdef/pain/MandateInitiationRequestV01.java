package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.MandateInitiationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader31;
import com.tools20022.repository.dict.msg.MandateInformation2;

/**
 * Scope The MandateInitiationRequest message is sent by the initiator of the
 * request to his agent. The initiator can either be the debtor or the creditor.
 * The MandateInitiationRequest message is forwarded by the agent of the
 * initiator to the agent of the counterparty. The MandateInitiationRequest
 * message is used to set-up the instruction that allows the debtor agent to
 * accept instructions from the creditor, through the creditor agent, to debit
 * the account of the debtor. Usage The MandateInitiationRequest message can
 * contain only one request to set-up one specific mandate. The messages can be
 * exchanged between creditor and creditor agent or debtor and debtor agent and
 * between creditor agent and debtor agent. The message can also be used by an
 * initiating party that has authority to send the message on behalf of the
 * creditor or debtor. The MandateInitiationRequest message can be used in
 * domestic and cross-border scenarios.
 */
@NextVersion(MandateInitiationRequestV02.class)
public class MandateInitiationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader31 GroupHeader;
	private MandateInformation2 Mandate;

	public GroupHeader31 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader31 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public MandateInformation2 getMandate() {
		return Mandate;
	}

	public void setMandate(MandateInformation2 Mandate) {
		this.Mandate = Mandate;
	}
}