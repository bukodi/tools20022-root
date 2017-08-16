package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.entity.SystemIdentification;

/**
 * Name of a system.
 */
public class SystemName extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max70Text Name;
	private SystemIdentification SystemIdentification;

	public Max70Text getName() {
		return Name;
	}

	public void setName(Max70Text Name) {
		this.Name = Name;
	}

	public SystemIdentification getSystemIdentification() {
		return SystemIdentification;
	}

	public void setSystemIdentification(
			SystemIdentification SystemIdentification) {
		this.SystemIdentification = SystemIdentification;
	}
}