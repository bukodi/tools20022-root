package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PersonName extends MMBusinessComponent {

	private final static PersonName INSTANCE = new PersonName();

	public static PersonName instance() {
		return INSTANCE;
	}
}