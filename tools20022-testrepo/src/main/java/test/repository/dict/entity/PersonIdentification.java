package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PersonIdentification extends MMBusinessComponent {

	private final static PersonIdentification INSTANCE = new PersonIdentification();

	public static PersonIdentification instance() {
		return INSTANCE;
	}
}