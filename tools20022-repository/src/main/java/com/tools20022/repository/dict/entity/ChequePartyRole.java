package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Cheque;

/**
 * Role played by a party in the context of a payment by cheque.
 */
public class ChequePartyRole extends Role {

	private Cheque Cheque;

	public Cheque getCheque() {
		return Cheque;
	}

	public void setCheque(Cheque Cheque) {
		this.Cheque = Cheque;
	}
}