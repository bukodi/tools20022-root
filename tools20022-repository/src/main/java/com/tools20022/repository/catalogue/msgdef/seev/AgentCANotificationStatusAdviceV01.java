package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation2;
import com.tools20022.repository.dict.choice.NotificationCancellationRequestStatus1Choice;
import com.tools20022.repository.dict.choice.NotificationAdviceStatus1Choice;

/**
 * Scope This message is sent by a CSD to an issuer (or its agent) to report the
 * status, or change in status, of a notification advice or notification
 * cancellation request. Usage When this message is used to report the status of
 * a notification advice then the building block Agent Corporate Action
 * Notification Advice Identification must be present. When this message is used
 * to provide the status of a notification cancellation request then the
 * building block Notification Cancellation Request Identification must be
 * present.
 */
public class AgentCANotificationStatusAdviceV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCANotificationAdviceIdentification;
	private DocumentIdentification8 AgentCANotificationCancellationRequestIdentification;
	private CorporateActionInformation2 CorporateActionGeneralInformation;
	private NotificationCancellationRequestStatus1Choice NotificationCancellationRequestStatus;
	private NotificationAdviceStatus1Choice NotificationAdviceStatus;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCANotificationAdviceIdentification() {
		return AgentCANotificationAdviceIdentification;
	}

	public void setAgentCANotificationAdviceIdentification(
			DocumentIdentification8 AgentCANotificationAdviceIdentification) {
		this.AgentCANotificationAdviceIdentification = AgentCANotificationAdviceIdentification;
	}

	public DocumentIdentification8 getAgentCANotificationCancellationRequestIdentification() {
		return AgentCANotificationCancellationRequestIdentification;
	}

	public void setAgentCANotificationCancellationRequestIdentification(
			DocumentIdentification8 AgentCANotificationCancellationRequestIdentification) {
		this.AgentCANotificationCancellationRequestIdentification = AgentCANotificationCancellationRequestIdentification;
	}

	public CorporateActionInformation2 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation2 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public NotificationCancellationRequestStatus1Choice getNotificationCancellationRequestStatus() {
		return NotificationCancellationRequestStatus;
	}

	public void setNotificationCancellationRequestStatus(
			NotificationCancellationRequestStatus1Choice NotificationCancellationRequestStatus) {
		this.NotificationCancellationRequestStatus = NotificationCancellationRequestStatus;
	}

	public NotificationAdviceStatus1Choice getNotificationAdviceStatus() {
		return NotificationAdviceStatus;
	}

	public void setNotificationAdviceStatus(
			NotificationAdviceStatus1Choice NotificationAdviceStatus) {
		this.NotificationAdviceStatus = NotificationAdviceStatus;
	}
}