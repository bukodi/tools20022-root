package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PartyIdentificationInformation extends MMBusinessComponent {

	private final static PartyIdentificationInformation INSTANCE = new PartyIdentificationInformation();

	public static PartyIdentificationInformation instance() {
		return INSTANCE;
	}
}