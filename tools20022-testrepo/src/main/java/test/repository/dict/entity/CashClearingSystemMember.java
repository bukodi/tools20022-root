package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class CashClearingSystemMember extends MMBusinessComponent {

	private final static CashClearingSystemMember INSTANCE = new CashClearingSystemMember();

	public static CashClearingSystemMember instance() {
		return INSTANCE;
	}
}