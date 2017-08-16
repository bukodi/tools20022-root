package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CurrencyConversion2;
import com.tools20022.core.repo.PreviousVersion;

/**
 * Currency conversion accepted by the customer, either to convert the amount to
 * dispense in the base currency of the ATM, or to convert the total requested
 * amount in the currency of the customer (so called dynamic currency
 * conversion).
 */
@PreviousVersion(CurrencyConversion2.class)
public class CurrencyConversion4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}