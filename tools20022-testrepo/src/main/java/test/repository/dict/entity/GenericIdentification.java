package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class GenericIdentification extends MMBusinessComponent {

	private final static GenericIdentification INSTANCE = new GenericIdentification();

	public static GenericIdentification instance() {
		return INSTANCE;
	}
}