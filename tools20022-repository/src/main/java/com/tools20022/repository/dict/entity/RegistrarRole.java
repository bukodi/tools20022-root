package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesPartyRole;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Party responsible for keeping track of the owners of securities.
 */
public class RegistrarRole extends SecuritiesPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesAccount RegistrarAccount;
	private Max35Text RegisterName;

	public SecuritiesAccount getRegistrarAccount() {
		return RegistrarAccount;
	}

	public void setRegistrarAccount(SecuritiesAccount RegistrarAccount) {
		this.RegistrarAccount = RegistrarAccount;
	}

	public Max35Text getRegisterName() {
		return RegisterName;
	}

	public void setRegisterName(Max35Text RegisterName) {
		this.RegisterName = RegisterName;
	}
}