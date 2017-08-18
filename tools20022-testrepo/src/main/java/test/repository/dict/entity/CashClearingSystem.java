package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class CashClearingSystem extends MMBusinessComponent {

	private final static CashClearingSystem INSTANCE = new CashClearingSystem();

	public static CashClearingSystem instance() {
		return INSTANCE;
	}
}