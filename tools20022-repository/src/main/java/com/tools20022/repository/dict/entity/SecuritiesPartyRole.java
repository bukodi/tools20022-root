package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.AssetPartyRole;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.Security;

/**
 * Specifies roles played by a party that are linked to the handling of
 * securities but not related to a specific process.
 */
public class SecuritiesPartyRole extends AssetPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesAccount SecuritiesAccount;
	private CashAccount CashAccount;
	private Security Security;

	public SecuritiesAccount getSecuritiesAccount() {
		return SecuritiesAccount;
	}

	public void setSecuritiesAccount(SecuritiesAccount SecuritiesAccount) {
		this.SecuritiesAccount = SecuritiesAccount;
	}

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}
}