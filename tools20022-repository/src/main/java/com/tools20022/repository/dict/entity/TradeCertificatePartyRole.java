package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.TradeCertificate;

/**
 * Role played by a party in the context of issuing trade certificates.
 */
public class TradeCertificatePartyRole extends Role {

	private TradeCertificate TradeCertificate;

	public TradeCertificate getTradeCertificate() {
		return TradeCertificate;
	}

	public void setTradeCertificate(TradeCertificate TradeCertificate) {
		this.TradeCertificate = TradeCertificate;
	}
}