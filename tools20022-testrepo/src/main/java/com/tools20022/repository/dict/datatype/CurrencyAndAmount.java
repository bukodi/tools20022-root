package com.tools20022.repository.dict.datatype;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMAmount;

/**
 * Number of monetary units specified in a currency, where the unit of currency
 * is explicit and compliant with ISO 4217. The decimal separator is a dot.
 * Note: A zero amount is considered a positive amount.
 */
public class CurrencyAndAmount implements InstanceOf<MMAmount> {
}