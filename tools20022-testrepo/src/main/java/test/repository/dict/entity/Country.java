package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Country extends MMBusinessComponent {

	private final static Country INSTANCE = new Country();

	public static Country instance() {
		return INSTANCE;
	}
}