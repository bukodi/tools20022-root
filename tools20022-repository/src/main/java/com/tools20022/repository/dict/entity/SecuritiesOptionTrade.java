package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.entity.Option;

/**
 * Process of buying or selling an option which has securities as underlying
 * asset.
 */
public class SecuritiesOptionTrade extends SecuritiesTrade {

	private Option Option;

	public Option getOption() {
		return Option;
	}

	public void setOption(Option Option) {
		this.Option = Option;
	}
}