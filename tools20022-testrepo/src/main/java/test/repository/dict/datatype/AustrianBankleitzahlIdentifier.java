package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class AustrianBankleitzahlIdentifier extends MMIdentifierSet {

	private final static AustrianBankleitzahlIdentifier INSTANCE = new AustrianBankleitzahlIdentifier();

	public static AustrianBankleitzahlIdentifier instance() {
		return INSTANCE;
	}
}