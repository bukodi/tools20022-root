package com.tools20022.repository.dict.datatype;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMAmount;

/**
 * A number of monetary units specified in an active or a historic currency
 * where the unit of currency is explicit and compliant with ISO 4217. The
 * number of fractional digits (or minor unit of currency) is not checked as per
 * ISO 4217: It must be lesser than or equal to 13. Note: The decimal separator
 * is a dot.
 */
public class ActiveOrHistoricCurrencyAnd13DecimalAmount
		implements
			GeneratedRepoBean<MMAmount> {
}