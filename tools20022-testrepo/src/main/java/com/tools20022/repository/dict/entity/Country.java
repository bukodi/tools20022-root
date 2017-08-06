package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.CountryCode;

/**
 * Nation with its own government.
 */
public class Country {

	private CountryCode Code;

	public CountryCode getCode() {
		return Code;
	}

	public void setCode(CountryCode Code) {
		this.Code = Code;
	}
}