package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class GermanBankleitzahlIdentifier extends MMIdentifierSet {

	private final static GermanBankleitzahlIdentifier INSTANCE = new GermanBankleitzahlIdentifier();

	public static GermanBankleitzahlIdentifier instance() {
		return INSTANCE;
	}
}