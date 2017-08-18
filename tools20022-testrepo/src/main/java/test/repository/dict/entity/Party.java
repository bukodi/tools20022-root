package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Party extends MMBusinessComponent {

	private final static Party INSTANCE = new Party();

	public static Party instance() {
		return INSTANCE;
	}
}