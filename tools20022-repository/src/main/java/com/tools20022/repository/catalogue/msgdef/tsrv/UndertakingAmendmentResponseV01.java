package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Amendment7;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingAmendmentResponse message is sent by the beneficiary to the
 * party that issued the undertaking, either directly or via one or more
 * advising parties, to indicate acceptance or rejection by the beneficiary of
 * the amendment.
 */
public class UndertakingAmendmentResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Amendment7 UndertakingAmendmentResponseDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Amendment7 getUndertakingAmendmentResponseDetails() {
		return UndertakingAmendmentResponseDetails;
	}

	public void setUndertakingAmendmentResponseDetails(
			Amendment7 UndertakingAmendmentResponseDetails) {
		this.UndertakingAmendmentResponseDetails = UndertakingAmendmentResponseDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}