package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.IBAN2007Identifier;
import com.tools20022.repository.dict.datatype.BBANIdentifier;
import com.tools20022.repository.dict.datatype.UPICIdentifier;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Unique identifier of an account, as assigned by the account servicer.
 */
public class AccountIdentification extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private IBAN2007Identifier IBAN;
	private BBANIdentifier BBAN;
	private UPICIdentifier UPIC;
	private GenericIdentification ProprietaryIdentification;
	private Max70Text Name;
	private Max35Text Number;

	public IBAN2007Identifier getIBAN() {
		return IBAN;
	}

	public void setIBAN(IBAN2007Identifier IBAN) {
		this.IBAN = IBAN;
	}

	public BBANIdentifier getBBAN() {
		return BBAN;
	}

	public void setBBAN(BBANIdentifier BBAN) {
		this.BBAN = BBAN;
	}

	public UPICIdentifier getUPIC() {
		return UPIC;
	}

	public void setUPIC(UPICIdentifier UPIC) {
		this.UPIC = UPIC;
	}

	public GenericIdentification getProprietaryIdentification() {
		return ProprietaryIdentification;
	}

	public void setProprietaryIdentification(
			GenericIdentification ProprietaryIdentification) {
		this.ProprietaryIdentification = ProprietaryIdentification;
	}

	public Max70Text getName() {
		return Name;
	}

	public void setName(Max70Text Name) {
		this.Name = Name;
	}

	public Max35Text getNumber() {
		return Number;
	}

	public void setNumber(Max35Text Number) {
		this.Number = Number;
	}
}