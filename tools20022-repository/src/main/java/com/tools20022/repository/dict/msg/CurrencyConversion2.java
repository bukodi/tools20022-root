package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.CurrencyConversion1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CurrencyConversion3;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CurrencyConversion4;
import com.tools20022.repository.dict.msg.CurrencyConversion6;

/**
 * Conversion between the currency of a card acceptor and the currency of a card
 * issuer, provided by a dedicated service provider. The currency conversion has
 * to be accepted by the cardholder.
 */
@PreviousVersion(CurrencyConversion1.class)
@NextVersion(CurrencyConversion3.class)
@NextVersion(CurrencyConversion4.class)
@NextVersion(CurrencyConversion6.class)
public class CurrencyConversion2 {
}