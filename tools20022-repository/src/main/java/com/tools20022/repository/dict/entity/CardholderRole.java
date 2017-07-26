package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CardPaymentPartyRole;
import com.tools20022.repository.dict.entity.Authentication;

/**
 * Party entitled by a card issuer to use a card.
 */
public class CardholderRole extends CardPaymentPartyRole {

	private Authentication Authentication;

	public Authentication getAuthentication() {
		return Authentication;
	}

	public void setAuthentication(Authentication Authentication) {
		this.Authentication = Authentication;
	}
}