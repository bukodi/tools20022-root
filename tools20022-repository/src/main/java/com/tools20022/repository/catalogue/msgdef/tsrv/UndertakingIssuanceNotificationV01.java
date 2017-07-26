package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.repository.dict.msg.UndertakingAdvice2;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingIssuanceNotification message is sent by the party that issued
 * the undertaking to the applicant to notify it of the contents of an
 * undertaking issued electronically or on paper. The undertaking that is
 * notified could be a demand guarantee, standby letter of credit,
 * counter-undertaking (counter-guarantee or counter-standby), or suretyship
 * undertaking. In addition to containing details on the applicable rules,
 * expiry date, the amount, required documents, and terms and conditions of the
 * undertaking, the message may provide information from the sender such as
 * confirmation details.
 */
public class UndertakingIssuanceNotificationV01 {

	private UndertakingAdvice2 UndertakingIssuanceNotificationDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public UndertakingAdvice2 getUndertakingIssuanceNotificationDetails() {
		return UndertakingIssuanceNotificationDetails;
	}

	public void setUndertakingIssuanceNotificationDetails(
			UndertakingAdvice2 UndertakingIssuanceNotificationDetails) {
		this.UndertakingIssuanceNotificationDetails = UndertakingIssuanceNotificationDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}