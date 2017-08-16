package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.LinkedCorporateAction1;
import com.tools20022.repository.dict.msg.CorporateActionNotification1;
import com.tools20022.repository.dict.msg.CorporateActionInformation2;
import com.tools20022.repository.dict.msg.CorporateAction2;
import com.tools20022.repository.dict.msg.CorporateActionOption1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ContactPerson1;
import com.tools20022.repository.dict.msg.CorporateActionNarrative2;

/**
 * Scope This message is sent by an issuer (or its agent) to a CSD to: - Provide
 * a CSD with the details of a corporate action along with the possible options
 * available to the clients of that CSD; and - to update a corporate action
 * notification. A notification advice can be initially sent as a preliminary
 * advice and subsequently replaced by another notification advice with updated
 * information. Usage This message is used: - to provide a CSD with the details
 * of a corporate action along with the possible options available to the
 * clients of that CSD. The information can be complete or incomplete. - to
 * update a corporate action notification advice. A notification advice can be
 * initially sent as a preliminary advice and subsequently replaced by another
 * notification advice with updated information. As per SMPG recommendation, all
 * the information should be provided in the update, not only updated
 * information. An Agent Corporate Action Notification Status Advice is sent in
 * reply to the Agent Corporate Action Notification Advice. Note: The amendment
 * of a corporate action notification is done through a replacement mechanism in
 * line with both the ISO 15022 messages used in the flow between the CSD and
 * its clients, and the ISO 20022 proxy voting messages.
 */
public class AgentCANotificationAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private LinkedCorporateAction1 NotificationTypeAndLinkage;
	private CorporateActionNotification1 NotificationGeneralInformation;
	private CorporateActionInformation2 CorporateActionGeneralInformation;
	private CorporateAction2 CorporateActionDetails;
	private Optional<CorporateActionOption1> CorporateActionOptionDetails;
	private Optional<ContactPerson1> ContactDetails;
	private Optional<CorporateActionNarrative2> AdditionalInformation;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public LinkedCorporateAction1 getNotificationTypeAndLinkage() {
		return NotificationTypeAndLinkage;
	}

	public void setNotificationTypeAndLinkage(
			LinkedCorporateAction1 NotificationTypeAndLinkage) {
		this.NotificationTypeAndLinkage = NotificationTypeAndLinkage;
	}

	public CorporateActionNotification1 getNotificationGeneralInformation() {
		return NotificationGeneralInformation;
	}

	public void setNotificationGeneralInformation(
			CorporateActionNotification1 NotificationGeneralInformation) {
		this.NotificationGeneralInformation = NotificationGeneralInformation;
	}

	public CorporateActionInformation2 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation2 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public CorporateAction2 getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			CorporateAction2 CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<CorporateActionOption1> getCorporateActionOptionDetails() {
		return CorporateActionOptionDetails;
	}

	public void setCorporateActionOptionDetails(
			Optional<CorporateActionOption1> CorporateActionOptionDetails) {
		this.CorporateActionOptionDetails = CorporateActionOptionDetails;
	}

	public Optional<ContactPerson1> getContactDetails() {
		return ContactDetails;
	}

	public void setContactDetails(Optional<ContactPerson1> ContactDetails) {
		this.ContactDetails = ContactDetails;
	}

	public Optional<CorporateActionNarrative2> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative2> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}
}