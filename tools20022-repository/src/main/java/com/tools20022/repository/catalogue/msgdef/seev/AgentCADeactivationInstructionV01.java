package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.CorporateActionDeactivationInstruction1;

/**
 * Scope This message is sent by an issuer (or its agent) to the CSD to instruct
 * the deactivation of a corporate action event or to deactivate one or more
 * specific options of the corporate action. As of the deactivation date, the
 * CSD is allowed to reject any related election instruction received from
 * clients. Usage Deactivation refers only to the empowerment of the CSD to
 * reject further elections. To withdraw an event, the Agent Corporate Action
 * Notification Advice message must be used. This message can be used to
 * deactivate all the options of a corporate action event, in which case, no
 * option should be mentioned in the message. This message can also be used to
 * deactivate one or more specific corporate action options, in which case, the
 * option type and option number must be present. This message can only be used
 * when the deactivation date is after the market deadline. Before the market
 * deadline, an updated notification advice message must be sent with option
 * availability status: inactive or cancelled. An un-effected deactivation
 * (pending deactivation date/time) can be cancelled with an Agent Corporate
 * Action Deactivation Cancellation Request. The amendment of a deactivation is
 * effected by cancel/replace mechanism.
 */
public class AgentCADeactivationInstructionV01 {

	private DocumentIdentification8 Identification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private CorporateActionDeactivationInstruction1 DeactivationDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public CorporateActionDeactivationInstruction1 getDeactivationDetails() {
		return DeactivationDetails;
	}

	public void setDeactivationDetails(
			CorporateActionDeactivationInstruction1 DeactivationDetails) {
		this.DeactivationDetails = DeactivationDetails;
	}
}