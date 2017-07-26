package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.repository.dict.msg.Demand1;
import com.tools20022.repository.dict.datatype.Max2000Text;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The UndertakingDemand message and other required documents are sent by the
 * beneficiary to the party that issued the undertaking, either directly or via
 * a presenting or nominated party. It is a demand for payment and may include a
 * request to extend the undertaking expiry date. The demand itself must be
 * contained in an enclosed file within the message or must be specified as
 * narrative text within the message. It may contain other required documents in
 * addition to the demand.
 */
public class UndertakingDemandV01 {

	private Demand1 UndertakingDemandDetails;
	private List<Max2000Text> BankToBankInformation;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Demand1 getUndertakingDemandDetails() {
		return UndertakingDemandDetails;
	}

	public void setUndertakingDemandDetails(Demand1 UndertakingDemandDetails) {
		this.UndertakingDemandDetails = UndertakingDemandDetails;
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