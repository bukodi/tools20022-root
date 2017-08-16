package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Deadline;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Date by which the securities have to be registered.
 */
public class SecuritiesRegistrationDeadline extends Deadline
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODateTime RegistrationDate;

	public ISODateTime getRegistrationDate() {
		return RegistrationDate;
	}

	public void setRegistrationDate(ISODateTime RegistrationDate) {
		this.RegistrationDate = RegistrationDate;
	}
}