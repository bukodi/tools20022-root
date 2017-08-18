package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Account extends MMBusinessComponent {

	private final static Account INSTANCE = new Account();

	public static Account instance() {
		return INSTANCE;
	}
}