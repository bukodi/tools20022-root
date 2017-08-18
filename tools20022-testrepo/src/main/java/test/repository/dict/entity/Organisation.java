package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Organisation extends MMBusinessComponent {

	private final static Organisation INSTANCE = new Organisation();

	public static Organisation instance() {
		return INSTANCE;
	}
}