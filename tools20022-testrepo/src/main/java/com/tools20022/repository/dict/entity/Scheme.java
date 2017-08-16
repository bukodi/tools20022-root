package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.datatype.Max350Text;

/**
 * Information regarding an enumerated code list and its owner.
 */
public class Scheme extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text NameShort;
	private Max35Text Code;
	private Max35Text Version;
	private Max70Text NameLong;
	private Max350Text Description;
	private Max35Text DomainValueCode;
	private Max70Text DomainValueName;

	public Max35Text getNameShort() {
		return NameShort;
	}

	public void setNameShort(Max35Text NameShort) {
		this.NameShort = NameShort;
	}

	public Max35Text getCode() {
		return Code;
	}

	public void setCode(Max35Text Code) {
		this.Code = Code;
	}

	public Max35Text getVersion() {
		return Version;
	}

	public void setVersion(Max35Text Version) {
		this.Version = Version;
	}

	public Max70Text getNameLong() {
		return NameLong;
	}

	public void setNameLong(Max70Text NameLong) {
		this.NameLong = NameLong;
	}

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}

	public Max35Text getDomainValueCode() {
		return DomainValueCode;
	}

	public void setDomainValueCode(Max35Text DomainValueCode) {
		this.DomainValueCode = DomainValueCode;
	}

	public Max70Text getDomainValueName() {
		return DomainValueName;
	}

	public void setDomainValueName(Max70Text DomainValueName) {
		this.DomainValueName = DomainValueName;
	}
}