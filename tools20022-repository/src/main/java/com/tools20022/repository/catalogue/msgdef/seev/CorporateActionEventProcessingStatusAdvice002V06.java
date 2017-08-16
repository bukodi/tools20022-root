package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification17;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification34;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation114;
import com.tools20022.repository.dict.choice.EventProcessingStatus4Choice;
import com.tools20022.repository.dict.msg.CorporateActionNarrative19;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends the
 * CorporateActionEventProcessingStatusAdvice message to an account owner or its
 * designated agent to report processing status of a corporate action event. The
 * account servicer uses this message to provide a reason as to why a corporate
 * action event has not been completed by the announced payment dates. Usage The
 * message may also be used to: - re-send a message previously sent (the
 * sub-function of the message is Duplicate), - provide a third party with a
 * copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate), using the relevant elements
 * in the business application header (BAH).
 */
public class CorporateActionEventProcessingStatusAdvice002V06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<DocumentIdentification17> NotificationIdentification;
	private Optional<DocumentIdentification34> OtherDocumentIdentification;
	private CorporateActionGeneralInformation114 CorporateActionGeneralInformation;
	private EventProcessingStatus4Choice EventProcessingStatus;
	private Optional<CorporateActionNarrative19> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<DocumentIdentification17> getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			Optional<DocumentIdentification17> NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public Optional<DocumentIdentification34> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification34> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public CorporateActionGeneralInformation114 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation114 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public EventProcessingStatus4Choice getEventProcessingStatus() {
		return EventProcessingStatus;
	}

	public void setEventProcessingStatus(
			EventProcessingStatus4Choice EventProcessingStatus) {
		this.EventProcessingStatus = EventProcessingStatus;
	}

	public Optional<CorporateActionNarrative19> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative19> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}