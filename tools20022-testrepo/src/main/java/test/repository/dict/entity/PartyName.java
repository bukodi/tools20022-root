package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PartyName extends MMBusinessComponent {

	private final static PartyName INSTANCE = new PartyName();

	public static PartyName instance() {
		return INSTANCE;
	}
}