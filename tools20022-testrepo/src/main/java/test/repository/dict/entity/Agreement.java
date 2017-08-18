package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Agreement extends MMBusinessComponent {

	private final static Agreement INSTANCE = new Agreement();

	public static Agreement instance() {
		return INSTANCE;
	}
}