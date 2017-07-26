package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.Undertaking1;
import com.tools20022.repository.dict.datatype.Max2000Text;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingApplication message is sent by the party requesting issuance
 * of the undertaking (applicant or obligor) to the party issuing the
 * undertaking. It is used to request the issuance of an undertaking (demand
 * guarantee or standby letter of credit or suretyship) or counter-undertaking
 * (counter-guarantee or counter-standby or suretyship), and provides details on
 * the applicable rules, terms, conditions and content of the undertaking to be
 * issued.
 */
public class UndertakingApplicationV01 {

	private Undertaking1 UndertakingApplicationDetails;
	private List<Max2000Text> InstructionsToBank;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Undertaking1 getUndertakingApplicationDetails() {
		return UndertakingApplicationDetails;
	}

	public void setUndertakingApplicationDetails(
			Undertaking1 UndertakingApplicationDetails) {
		this.UndertakingApplicationDetails = UndertakingApplicationDetails;
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