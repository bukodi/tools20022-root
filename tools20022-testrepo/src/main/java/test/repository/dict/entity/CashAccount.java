package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class CashAccount extends MMBusinessComponent {

	private final static CashAccount INSTANCE = new CashAccount();

	public static CashAccount instance() {
		return INSTANCE;
	}
}