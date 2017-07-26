package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.CorporateActionEvent;

/**
 * Specifies the official date and identification of the event.
 */
public class CorporateActionEventRegistration {

	private Max35Text CorporateActionEventIdentification;
	private Max35Text OfficialCorporateActionEventIdentification;
	private ISODateTime OfficialAnnouncementPublicationDate;
	private CorporateActionEvent CorporateActionEvent;

	public Max35Text getCorporateActionEventIdentification() {
		return CorporateActionEventIdentification;
	}

	public void setCorporateActionEventIdentification(
			Max35Text CorporateActionEventIdentification) {
		this.CorporateActionEventIdentification = CorporateActionEventIdentification;
	}

	public Max35Text getOfficialCorporateActionEventIdentification() {
		return OfficialCorporateActionEventIdentification;
	}

	public void setOfficialCorporateActionEventIdentification(
			Max35Text OfficialCorporateActionEventIdentification) {
		this.OfficialCorporateActionEventIdentification = OfficialCorporateActionEventIdentification;
	}

	public ISODateTime getOfficialAnnouncementPublicationDate() {
		return OfficialAnnouncementPublicationDate;
	}

	public void setOfficialAnnouncementPublicationDate(
			ISODateTime OfficialAnnouncementPublicationDate) {
		this.OfficialAnnouncementPublicationDate = OfficialAnnouncementPublicationDate;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return CorporateActionEvent;
	}

	public void setCorporateActionEvent(
			CorporateActionEvent CorporateActionEvent) {
		this.CorporateActionEvent = CorporateActionEvent;
	}
}