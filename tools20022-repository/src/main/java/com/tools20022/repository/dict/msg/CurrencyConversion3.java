package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.CurrencyConversion2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CurrencyConversion7;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CurrencyConversion8;

/**
 * Conversion between the currency of a card acceptor and the currency of a card
 * issuer, provided by a dedicated service provider.
 */
@PreviousVersion(CurrencyConversion2.class)
@NextVersion(CurrencyConversion7.class)
@NextVersion(CurrencyConversion8.class)
public class CurrencyConversion3 {
}