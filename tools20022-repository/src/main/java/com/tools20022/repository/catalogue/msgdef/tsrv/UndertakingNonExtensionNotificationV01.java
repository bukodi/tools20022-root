package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.UndertakingNonExtensionStatusAdvice1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingNonExtensionNotification message is sent by the party that
 * issued the undertaking to the beneficiary, either directly or via one or more
 * advising parties, to notify it of the non-extension of the referenced
 * undertaking beyond the current expiry date.
 */
public class UndertakingNonExtensionNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private UndertakingNonExtensionStatusAdvice1 UndertakingNonExtensionNotificationDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public UndertakingNonExtensionStatusAdvice1 getUndertakingNonExtensionNotificationDetails() {
		return UndertakingNonExtensionNotificationDetails;
	}

	public void setUndertakingNonExtensionNotificationDetails(
			UndertakingNonExtensionStatusAdvice1 UndertakingNonExtensionNotificationDetails) {
		this.UndertakingNonExtensionNotificationDetails = UndertakingNonExtensionNotificationDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}