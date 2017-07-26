package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Exchange of securities.
 */
public class SecuritiesTransaction extends SecuritiesTrade {

	private CurrencyAndAmount ReplacedAmount;

	public CurrencyAndAmount getReplacedAmount() {
		return ReplacedAmount;
	}

	public void setReplacedAmount(CurrencyAndAmount ReplacedAmount) {
		this.ReplacedAmount = ReplacedAmount;
	}
}