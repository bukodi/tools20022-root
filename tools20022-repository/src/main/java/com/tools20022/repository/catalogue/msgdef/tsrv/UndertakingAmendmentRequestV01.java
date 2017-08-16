package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Amendment3;
import com.tools20022.repository.dict.datatype.Max2000Text;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingAmendmentRequest message is sent by the party that requested
 * issuance of the undertaking (applicant or obligor) to the party that issued
 * the undertaking to request issuance of a proposed amendment to the
 * undertaking. The undertaking could be a demand guarantee, standby letter of
 * credit, counter-undertaking (counter-guarantee or counter-standby), or
 * suretyship undertaking. The message provides details on proposed changes to
 * the undertaking, for example, to the expiry date, amount, and/or terms and
 * conditions. It may also be used to request termination or cancellation of the
 * undertaking.
 */
public class UndertakingAmendmentRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Amendment3 UndertakingAmendmentRequestDetails;
	private List<Max2000Text> InstructionsToBank;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Amendment3 getUndertakingAmendmentRequestDetails() {
		return UndertakingAmendmentRequestDetails;
	}

	public void setUndertakingAmendmentRequestDetails(
			Amendment3 UndertakingAmendmentRequestDetails) {
		this.UndertakingAmendmentRequestDetails = UndertakingAmendmentRequestDetails;
	}

	public List<Max2000Text> getInstructionsToBank() {
		return InstructionsToBank;
	}

	public void setInstructionsToBank(List<Max2000Text> InstructionsToBank) {
		this.InstructionsToBank = InstructionsToBank;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}