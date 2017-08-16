package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.UndertakingTerminationNotice1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingTerminationNotification message is sent to the applicant by
 * the party that issued the undertaking to give notification of the termination
 * or cancelation of the referenced undertaking.
 */
public class UndertakingTerminationNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private UndertakingTerminationNotice1 UndertakingTerminationNotificationDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public UndertakingTerminationNotice1 getUndertakingTerminationNotificationDetails() {
		return UndertakingTerminationNotificationDetails;
	}

	public void setUndertakingTerminationNotificationDetails(
			UndertakingTerminationNotice1 UndertakingTerminationNotificationDetails) {
		this.UndertakingTerminationNotificationDetails = UndertakingTerminationNotificationDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}