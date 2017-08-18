package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class CurrencyCode extends MMCodeSet {

	private final static CurrencyCode INSTANCE = new CurrencyCode();

	public static CurrencyCode instance() {
		return INSTANCE;
	}
}