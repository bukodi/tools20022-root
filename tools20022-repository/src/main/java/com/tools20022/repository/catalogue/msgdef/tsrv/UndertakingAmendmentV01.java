package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.repository.dict.msg.Amendment1;
import com.tools20022.repository.dict.datatype.Max2000Text;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingAmendment message is sent (and is thus issued) by the party
 * that issued the undertaking. The message may be sent either directly to the
 * beneficiary or via an advising party. The proposed undertaking amendment
 * could be to a demand guarantee, standby letter of credit, or
 * counter-undertaking (counter-guarantee or counter-standby). The message
 * provides details on proposed changes to the undertaking, for example, to the
 * expiry date, the amount, and terms and conditions of the undertaking. It may
 * also be used to propose the termination or cancellation of the undertaking.
 * Under practice and law, this communication binds the party issuing it. The
 * message constitutes an operative financial instrument.
 */
public class UndertakingAmendmentV01 {

	private Amendment1 UndertakingAmendmentDetails;
	private List<Max2000Text> BankToBankInformation;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Amendment1 getUndertakingAmendmentDetails() {
		return UndertakingAmendmentDetails;
	}

	public void setUndertakingAmendmentDetails(
			Amendment1 UndertakingAmendmentDetails) {
		this.UndertakingAmendmentDetails = UndertakingAmendmentDetails;
	}

	public List<Max2000Text> getBankToBankInformation() {
		return BankToBankInformation;
	}

	public void setBankToBankInformation(List<Max2000Text> BankToBankInformation) {
		this.BankToBankInformation = BankToBankInformation;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}