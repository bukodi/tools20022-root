package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CurrencyConversion2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CurrencyConversion5;

/**
 * Conversion between the currency of a card acceptor and the currency of a card
 * issuer, provided by a dedicated service provider. The currency conversion has
 * to be accepted by the cardholder.
 */
@NextVersion(CurrencyConversion2.class)
@NextVersion(CurrencyConversion5.class)
public class CurrencyConversion1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}