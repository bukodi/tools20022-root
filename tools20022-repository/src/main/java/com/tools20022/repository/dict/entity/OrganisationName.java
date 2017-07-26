package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PartyName;
import com.tools20022.repository.dict.entity.OrganisationIdentification;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max350Text;

/**
 * Name by which an organisation is known and which is usually used to identify
 * that organisation.
 */
public class OrganisationName extends PartyName {

	private OrganisationIdentification Organisation;
	private Max35Text LegalName;
	private Max350Text TradingName;
	private Max35Text ShortName;

	public OrganisationIdentification getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(OrganisationIdentification Organisation) {
		this.Organisation = Organisation;
	}

	public Max35Text getLegalName() {
		return LegalName;
	}

	public void setLegalName(Max35Text LegalName) {
		this.LegalName = LegalName;
	}

	public Max350Text getTradingName() {
		return TradingName;
	}

	public void setTradingName(Max350Text TradingName) {
		this.TradingName = TradingName;
	}

	public Max35Text getShortName() {
		return ShortName;
	}

	public void setShortName(Max35Text ShortName) {
		this.ShortName = ShortName;
	}
}