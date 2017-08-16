package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CurrencyConversion2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CurrencyConversion12;
import com.tools20022.core.repo.NextVersion;

/**
 * Conversion between the currency of a card acceptor and the currency of a card
 * issuer, provided by a dedicated service provider. The currency conversion has
 * to be accepted by the cardholder.
 */
@PreviousVersion(CurrencyConversion2.class)
@NextVersion(CurrencyConversion12.class)
public class CurrencyConversion6
		implements
			GeneratedRepoBean<MMMessageComponent> {
}