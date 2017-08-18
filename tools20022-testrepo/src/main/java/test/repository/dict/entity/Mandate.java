package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Mandate extends MMBusinessComponent {

	private final static Mandate INSTANCE = new Mandate();

	public static Mandate instance() {
		return INSTANCE;
	}
}