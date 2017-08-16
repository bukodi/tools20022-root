package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.entity.PowerOfAttorneyRequirements;
import com.tools20022.repository.dict.entity.SecuritiesAccount;

/**
 * Document that transfers specific rights from a party to another party.
 */
public class PowerOfAttorney extends Mandate
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Party AuthorisedParty;
	private PowerOfAttorneyRequirements PowerOfAttorneyRequirements;
	private SecuritiesAccount AuthorisedAccount;

	public Party getAuthorisedParty() {
		return AuthorisedParty;
	}

	public void setAuthorisedParty(Party AuthorisedParty) {
		this.AuthorisedParty = AuthorisedParty;
	}

	public PowerOfAttorneyRequirements getPowerOfAttorneyRequirements() {
		return PowerOfAttorneyRequirements;
	}

	public void setPowerOfAttorneyRequirements(
			PowerOfAttorneyRequirements PowerOfAttorneyRequirements) {
		this.PowerOfAttorneyRequirements = PowerOfAttorneyRequirements;
	}

	public SecuritiesAccount getAuthorisedAccount() {
		return AuthorisedAccount;
	}

	public void setAuthorisedAccount(SecuritiesAccount AuthorisedAccount) {
		this.AuthorisedAccount = AuthorisedAccount;
	}
}