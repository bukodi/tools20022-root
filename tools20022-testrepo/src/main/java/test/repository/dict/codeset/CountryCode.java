package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class CountryCode extends MMCodeSet {

	private final static CountryCode INSTANCE = new CountryCode();

	public static CountryCode instance() {
		return INSTANCE;
	}
}