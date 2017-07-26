package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionEventProcessingStatusAdviceV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionEventProcessingStatusAdviceV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification14;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation52;
import com.tools20022.repository.dict.choice.EventProcessingStatus1Choice;
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
 * in the business application header (BAH). ISO 15022 - 20022 COEXISTENCE This
 * ISO 20022 message is reversed engineered from ISO 15022. Both standards will
 * coexist for a certain number of years. Until this coexistence period ends,
 * the usage of certain data types is restricted to ensure interoperability
 * between ISO 15022 and 20022 users. Compliance to these rules is mandatory in
 * a coexistence environment. The coexistence restrictions are described in a
 * Textual Rule linked to the Message Items they concern. These coexistence
 * textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionEventProcessingStatusAdviceV03.class)
@NextVersion(CorporateActionEventProcessingStatusAdviceV05.class)
public class CorporateActionEventProcessingStatusAdviceV04 {

	private Optional<DocumentIdentification9> NotificationIdentification;
	private Optional<DocumentIdentification14> OtherDocumentIdentification;
	private CorporateActionGeneralInformation52 CorporateActionGeneralInformation;
	private EventProcessingStatus1Choice EventProcessingStatus;
	private Optional<CorporateActionNarrative10> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<DocumentIdentification9> getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			Optional<DocumentIdentification9> NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public Optional<DocumentIdentification14> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification14> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public CorporateActionGeneralInformation52 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation52 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public EventProcessingStatus1Choice getEventProcessingStatus() {
		return EventProcessingStatus;
	}

	public void setEventProcessingStatus(
			EventProcessingStatus1Choice EventProcessingStatus) {
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