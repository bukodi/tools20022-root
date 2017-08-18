package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Scheme extends MMBusinessComponent {

	private final static Scheme INSTANCE = new Scheme();

	public static Scheme instance() {
		return INSTANCE;
	}
}