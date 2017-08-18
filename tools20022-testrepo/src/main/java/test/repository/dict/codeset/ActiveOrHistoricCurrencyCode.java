package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class ActiveOrHistoricCurrencyCode extends MMCodeSet {

	private final static ActiveOrHistoricCurrencyCode INSTANCE = new ActiveOrHistoricCurrencyCode();

	public static ActiveOrHistoricCurrencyCode instance() {
		return INSTANCE;
	}
}