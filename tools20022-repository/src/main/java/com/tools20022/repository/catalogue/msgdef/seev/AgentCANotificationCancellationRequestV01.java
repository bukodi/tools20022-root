package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.NotificationCancellation1;
import com.tools20022.repository.dict.msg.CorporateActionInformation2;
import com.tools20022.repository.dict.msg.CorporateActionNotificationAdvice1;
import java.util.Optional;

/**
 * Scope This message is sent by an issuer (or its agent) to a CSD to request
 * the cancellation of a notification advice message. Usage When this message is
 * used to request the cancellation of a notification advice message, the
 * function of the message must be cancellation. When this message is used to
 * request the withdrawal of a Corporate Action event or option, then the
 * function of the message must be withdrawal. In both cases, the building block
 * notification advice identification must be present to link this cancellation
 * request to the notification advice that was previously sent.
 */
public class AgentCANotificationCancellationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private NotificationCancellation1 NotificationCancellationTypeAndLinkage;
	private CorporateActionInformation2 CorporateActionGeneralInformation;
	private Optional<CorporateActionNotificationAdvice1> CorporateActionNotificationDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public NotificationCancellation1 getNotificationCancellationTypeAndLinkage() {
		return NotificationCancellationTypeAndLinkage;
	}

	public void setNotificationCancellationTypeAndLinkage(
			NotificationCancellation1 NotificationCancellationTypeAndLinkage) {
		this.NotificationCancellationTypeAndLinkage = NotificationCancellationTypeAndLinkage;
	}

	public CorporateActionInformation2 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation2 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public Optional<CorporateActionNotificationAdvice1> getCorporateActionNotificationDetails() {
		return CorporateActionNotificationDetails;
	}

	public void setCorporateActionNotificationDetails(
			Optional<CorporateActionNotificationAdvice1> CorporateActionNotificationDetails) {
		this.CorporateActionNotificationDetails = CorporateActionNotificationDetails;
	}
}