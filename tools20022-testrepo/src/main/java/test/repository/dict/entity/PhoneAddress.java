package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PhoneAddress extends MMBusinessComponent {

	private final static PhoneAddress INSTANCE = new PhoneAddress();

	public static PhoneAddress instance() {
		return INSTANCE;
	}
}