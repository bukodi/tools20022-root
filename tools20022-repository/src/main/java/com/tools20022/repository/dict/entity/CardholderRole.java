package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CardPaymentPartyRole;
import com.tools20022.repository.dict.entity.Authentication;

/**
 * Party entitled by a card issuer to use a card.
 */
public class CardholderRole extends CardPaymentPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Authentication Authentication;

	public Authentication getAuthentication() {
		return Authentication;
	}

	public void setAuthentication(Authentication Authentication) {
		this.Authentication = Authentication;
	}
}