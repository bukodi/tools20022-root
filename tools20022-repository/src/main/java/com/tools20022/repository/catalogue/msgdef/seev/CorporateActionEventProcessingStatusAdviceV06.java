package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionEventProcessingStatusAdviceV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification33;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation109;
import com.tools20022.repository.dict.choice.EventProcessingStatus3Choice;
import com.tools20022.repository.dict.msg.CorporateActionNarrative10;
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
@PreviousVersion(CorporateActionEventProcessingStatusAdviceV05.class)
public class CorporateActionEventProcessingStatusAdviceV06 {

	private Optional<DocumentIdentification9> NotificationIdentification;
	private Optional<DocumentIdentification33> OtherDocumentIdentification;
	private CorporateActionGeneralInformation109 CorporateActionGeneralInformation;
	private EventProcessingStatus3Choice EventProcessingStatus;
	private Optional<CorporateActionNarrative10> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<DocumentIdentification9> getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			Optional<DocumentIdentification9> NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public Optional<DocumentIdentification33> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification33> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public CorporateActionGeneralInformation109 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation109 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public EventProcessingStatus3Choice getEventProcessingStatus() {
		return EventProcessingStatus;
	}

	public void setEventProcessingStatus(
			EventProcessingStatus3Choice EventProcessingStatus) {
		this.EventProcessingStatus = EventProcessingStatus;
	}

	public Optional<CorporateActionNarrative10> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative10> AdditionalInformation) {
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