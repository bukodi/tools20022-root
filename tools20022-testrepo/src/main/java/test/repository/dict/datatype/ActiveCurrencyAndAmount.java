package test.repository.dict.datatype;

import com.tools20022.metamodel.MMAmount;

public class ActiveCurrencyAndAmount extends MMAmount {

	private final static ActiveCurrencyAndAmount INSTANCE = new ActiveCurrencyAndAmount();

	public static ActiveCurrencyAndAmount instance() {
		return INSTANCE;
	}
}