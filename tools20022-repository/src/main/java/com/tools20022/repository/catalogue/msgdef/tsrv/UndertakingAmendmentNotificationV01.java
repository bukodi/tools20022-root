package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.repository.dict.msg.Amendment6;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingAmendmentNotification message is sent by the party that issued
 * the undertaking to the applicant to notify it of the contents of a proposed
 * amendment to the undertaking (issued electronically or on paper). The
 * undertaking could be a demand guarantee, standby letter of credit,
 * counter-undertaking (counter-guarantee or counter-standby), or suretyship
 * undertaking. In addition to providing the proposed terms of the amendment and
 * details on proposed changes to the undertaking, the message may provide other
 * supporting information from the sender. It may also be used to notify the
 * proposed termination or cancellation of the undertaking.
 */
public class UndertakingAmendmentNotificationV01 {

	private Amendment6 UndertakingAmendmentNotificationDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Amendment6 getUndertakingAmendmentNotificationDetails() {
		return UndertakingAmendmentNotificationDetails;
	}

	public void setUndertakingAmendmentNotificationDetails(
			Amendment6 UndertakingAmendmentNotificationDetails) {
		this.UndertakingAmendmentNotificationDetails = UndertakingAmendmentNotificationDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}