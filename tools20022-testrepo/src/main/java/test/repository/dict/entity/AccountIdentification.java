package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class AccountIdentification extends MMBusinessComponent {

	private final static AccountIdentification INSTANCE = new AccountIdentification();

	public static AccountIdentification instance() {
		return INSTANCE;
	}
}