package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Amendment9;
import com.tools20022.repository.dict.datatype.Max2000Text;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyAndSignature2;

/**
 * The UndertakingAmendmentResponseNotification message is sent by the advising
 * party to the party that issued the undertaking, either directly or via one or
 * more other parties, to notify the recipient of the acceptance or rejection by
 * the beneficiary of the amendment. On receipt of this message or the
 * UndertakingAmendmentResponse message, the issuer may also send the
 * UndertakingAmendmentResponseNotification to the applicant.
 */
public class UndertakingAmendmentResponseNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Amendment9 UndertakingAmendmentResponseNotificationDetails;
	private Optional<Max2000Text> AdditionalInformation;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Amendment9 getUndertakingAmendmentResponseNotificationDetails() {
		return UndertakingAmendmentResponseNotificationDetails;
	}

	public void setUndertakingAmendmentResponseNotificationDetails(
			Amendment9 UndertakingAmendmentResponseNotificationDetails) {
		this.UndertakingAmendmentResponseNotificationDetails = UndertakingAmendmentResponseNotificationDetails;
	}

	public Optional<Max2000Text> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<Max2000Text> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}