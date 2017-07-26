package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.PowerOfAttorneyLegalisationCode;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.PowerOfAttorney;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Specifies the conditions to be filled in to obtain a valid power of attorney.
 */
public class PowerOfAttorneyRequirements {

	private PowerOfAttorneyLegalisationCode LegalRequirement;
	private Max350Text OtherDocumentation;
	private PowerOfAttorney PowerOfAttorney;
	private Meeting Meeting;

	public PowerOfAttorneyLegalisationCode getLegalRequirement() {
		return LegalRequirement;
	}

	public void setLegalRequirement(
			PowerOfAttorneyLegalisationCode LegalRequirement) {
		this.LegalRequirement = LegalRequirement;
	}

	public Max350Text getOtherDocumentation() {
		return OtherDocumentation;
	}

	public void setOtherDocumentation(Max350Text OtherDocumentation) {
		this.OtherDocumentation = OtherDocumentation;
	}

	public PowerOfAttorney getPowerOfAttorney() {
		return PowerOfAttorney;
	}

	public void setPowerOfAttorney(PowerOfAttorney PowerOfAttorney) {
		this.PowerOfAttorney = PowerOfAttorney;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}
}