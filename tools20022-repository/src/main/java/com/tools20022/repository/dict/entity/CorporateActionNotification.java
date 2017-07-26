package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CorporateActionServicing;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.CorporateActionNotificationTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * The process of notifying of an upcoming corporate action. It provides
 * corporate action details including the different options.
 */
public class CorporateActionNotification {

	private CorporateActionServicing RelatedServicing;
	private Max35Text CorporateActionNotificationIdentification;
	private CorporateActionNotificationTypeCode NotificationType;
	private ISODateTime CreationDateTime;

	public CorporateActionServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(CorporateActionServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}

	public Max35Text getCorporateActionNotificationIdentification() {
		return CorporateActionNotificationIdentification;
	}

	public void setCorporateActionNotificationIdentification(
			Max35Text CorporateActionNotificationIdentification) {
		this.CorporateActionNotificationIdentification = CorporateActionNotificationIdentification;
	}

	public CorporateActionNotificationTypeCode getNotificationType() {
		return NotificationType;
	}

	public void setNotificationType(
			CorporateActionNotificationTypeCode NotificationType) {
		this.NotificationType = NotificationType;
	}

	public ISODateTime getCreationDateTime() {
		return CreationDateTime;
	}

	public void setCreationDateTime(ISODateTime CreationDateTime) {
		this.CreationDateTime = CreationDateTime;
	}
}