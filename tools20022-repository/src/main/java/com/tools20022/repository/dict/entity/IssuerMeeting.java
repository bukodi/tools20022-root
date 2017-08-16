package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Meeting;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Information about the meeting, specifying the participation requirements and
 * the voting procedures.
 */
public class IssuerMeeting extends Meeting
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text IssuerMeetingIdentification;
	private YesNoIndicator NomineePowerOfAttorneyIndicator;
	private YesNoIndicator NomineeVotingIndicator;
	private YesNoIndicator NomineeBeneficialOwnerIndicator;
	private YesNoIndicator ProxyVotingIndicator;
	private YesNoIndicator ProxyBeneficialOwnerIndicator;
	private YesNoIndicator ProxyPowerOfAttorneyIndicator;
	private YesNoIndicator ValidCreditorIndicator;
	private CurrencyAndAmount CapitalStock;

	public Max35Text getIssuerMeetingIdentification() {
		return IssuerMeetingIdentification;
	}

	public void setIssuerMeetingIdentification(
			Max35Text IssuerMeetingIdentification) {
		this.IssuerMeetingIdentification = IssuerMeetingIdentification;
	}

	public YesNoIndicator getNomineePowerOfAttorneyIndicator() {
		return NomineePowerOfAttorneyIndicator;
	}

	public void setNomineePowerOfAttorneyIndicator(
			YesNoIndicator NomineePowerOfAttorneyIndicator) {
		this.NomineePowerOfAttorneyIndicator = NomineePowerOfAttorneyIndicator;
	}

	public YesNoIndicator getNomineeVotingIndicator() {
		return NomineeVotingIndicator;
	}

	public void setNomineeVotingIndicator(YesNoIndicator NomineeVotingIndicator) {
		this.NomineeVotingIndicator = NomineeVotingIndicator;
	}

	public YesNoIndicator getNomineeBeneficialOwnerIndicator() {
		return NomineeBeneficialOwnerIndicator;
	}

	public void setNomineeBeneficialOwnerIndicator(
			YesNoIndicator NomineeBeneficialOwnerIndicator) {
		this.NomineeBeneficialOwnerIndicator = NomineeBeneficialOwnerIndicator;
	}

	public YesNoIndicator getProxyVotingIndicator() {
		return ProxyVotingIndicator;
	}

	public void setProxyVotingIndicator(YesNoIndicator ProxyVotingIndicator) {
		this.ProxyVotingIndicator = ProxyVotingIndicator;
	}

	public YesNoIndicator getProxyBeneficialOwnerIndicator() {
		return ProxyBeneficialOwnerIndicator;
	}

	public void setProxyBeneficialOwnerIndicator(
			YesNoIndicator ProxyBeneficialOwnerIndicator) {
		this.ProxyBeneficialOwnerIndicator = ProxyBeneficialOwnerIndicator;
	}

	public YesNoIndicator getProxyPowerOfAttorneyIndicator() {
		return ProxyPowerOfAttorneyIndicator;
	}

	public void setProxyPowerOfAttorneyIndicator(
			YesNoIndicator ProxyPowerOfAttorneyIndicator) {
		this.ProxyPowerOfAttorneyIndicator = ProxyPowerOfAttorneyIndicator;
	}

	public YesNoIndicator getValidCreditorIndicator() {
		return ValidCreditorIndicator;
	}

	public void setValidCreditorIndicator(YesNoIndicator ValidCreditorIndicator) {
		this.ValidCreditorIndicator = ValidCreditorIndicator;
	}

	public CurrencyAndAmount getCapitalStock() {
		return CapitalStock;
	}

	public void setCapitalStock(CurrencyAndAmount CapitalStock) {
		this.CapitalStock = CapitalStock;
	}
}