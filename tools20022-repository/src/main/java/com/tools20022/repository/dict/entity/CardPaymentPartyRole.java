package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.CardPayment;
import com.tools20022.repository.dict.codeset.PartyTypeCode;

/**
 * Role played by a party in the context of a payment by card.
 */
public class CardPaymentPartyRole extends Role {

	private CardPayment CardPayment;
	private PartyTypeCode PartyType;

	public CardPayment getCardPayment() {
		return CardPayment;
	}

	public void setCardPayment(CardPayment CardPayment) {
		this.CardPayment = CardPayment;
	}

	public PartyTypeCode getPartyType() {
		return PartyType;
	}

	public void setPartyType(PartyTypeCode PartyType) {
		this.PartyType = PartyType;
	}
}