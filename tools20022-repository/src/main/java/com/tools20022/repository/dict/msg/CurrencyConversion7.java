package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CurrencyConversion3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CurrencyConversion11;
import com.tools20022.core.repo.NextVersion;

/**
 * Conversion between the currency of a card acceptor and the currency of a card
 * issuer, provided by a dedicated service provider.
 */
@PreviousVersion(CurrencyConversion3.class)
@NextVersion(CurrencyConversion11.class)
public class CurrencyConversion7
		implements
			GeneratedRepoBean<MMMessageComponent> {
}