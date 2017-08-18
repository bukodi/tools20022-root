package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class ContactPoint extends MMBusinessComponent {

	private final static ContactPoint INSTANCE = new ContactPoint();

	public static ContactPoint instance() {
		return INSTANCE;
	}
}