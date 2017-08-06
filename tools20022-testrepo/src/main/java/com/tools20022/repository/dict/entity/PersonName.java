package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.NamePrefix1Code;

/**
 * Name by which a person is known and that is usually used to identify that
 * person.
 */
public class PersonName {

	private NamePrefix1Code NamePrefix;

	public NamePrefix1Code getNamePrefix() {
		return NamePrefix;
	}

	public void setNamePrefix(NamePrefix1Code NamePrefix) {
		this.NamePrefix = NamePrefix;
	}
}