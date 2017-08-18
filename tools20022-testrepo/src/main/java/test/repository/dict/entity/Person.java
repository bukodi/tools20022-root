package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Person extends MMBusinessComponent {

	private final static Person INSTANCE = new Person();

	public static Person instance() {
		return INSTANCE;
	}
}