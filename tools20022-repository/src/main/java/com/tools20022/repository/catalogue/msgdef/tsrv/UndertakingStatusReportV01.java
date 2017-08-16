package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.UndertakingStatusAdvice1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingStatusReport message is exchanged between parties that have an
 * interest in the referenced undertaking transaction. It notifies the recipient
 * of the status of the transaction, such as acceptance or rejection,
 * withdrawal, or non-conformation. The sender may add additional information,
 * as appropriate.
 */
public class UndertakingStatusReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private UndertakingStatusAdvice1 UndertakingStatusReportDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public UndertakingStatusAdvice1 getUndertakingStatusReportDetails() {
		return UndertakingStatusReportDetails;
	}

	public void setUndertakingStatusReportDetails(
			UndertakingStatusAdvice1 UndertakingStatusReportDetails) {
		this.UndertakingStatusReportDetails = UndertakingStatusReportDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}