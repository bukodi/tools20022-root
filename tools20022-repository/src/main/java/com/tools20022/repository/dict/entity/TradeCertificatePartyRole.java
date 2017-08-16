package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.TradeCertificate;

/**
 * Role played by a party in the context of issuing trade certificates.
 */
public class TradeCertificatePartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TradeCertificate TradeCertificate;

	public TradeCertificate getTradeCertificate() {
		return TradeCertificate;
	}

	public void setTradeCertificate(TradeCertificate TradeCertificate) {
		this.TradeCertificate = TradeCertificate;
	}
}