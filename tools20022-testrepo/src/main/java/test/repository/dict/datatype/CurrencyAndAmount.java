package test.repository.dict.datatype;

import com.tools20022.metamodel.MMAmount;

public class CurrencyAndAmount extends MMAmount {

	private final static CurrencyAndAmount INSTANCE = new CurrencyAndAmount();

	public static CurrencyAndAmount instance() {
		return INSTANCE;
	}
}