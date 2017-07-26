package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.codeset.OriginatorRoleCode;

/**
 * Originator of the quote.
 */
public class QuoteOriginator extends InformationPartyRole {

	private OriginatorRoleCode QuoteOriginatorType;

	public OriginatorRoleCode getQuoteOriginatorType() {
		return QuoteOriginatorType;
	}

	public void setQuoteOriginatorType(OriginatorRoleCode QuoteOriginatorType) {
		this.QuoteOriginatorType = QuoteOriginatorType;
	}
}