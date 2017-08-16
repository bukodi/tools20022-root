package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.UndertakingNonExtensionRequest1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingNonExtensionRequest message is sent by the party that
 * requested issuance of the undertaking (applicant or obligor) to the party
 * that issued the undertaking. It is used to request no further automatic
 * extensions to the expiry of the referenced undertaking.
 */
public class UndertakingNonExtensionRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private UndertakingNonExtensionRequest1 UndertakingNonExtensionRequestDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public UndertakingNonExtensionRequest1 getUndertakingNonExtensionRequestDetails() {
		return UndertakingNonExtensionRequestDetails;
	}

	public void setUndertakingNonExtensionRequestDetails(
			UndertakingNonExtensionRequest1 UndertakingNonExtensionRequestDetails) {
		this.UndertakingNonExtensionRequestDetails = UndertakingNonExtensionRequestDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}