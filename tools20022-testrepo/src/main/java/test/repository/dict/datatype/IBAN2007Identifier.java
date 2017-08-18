package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class IBAN2007Identifier extends MMIdentifierSet {

	private final static IBAN2007Identifier INSTANCE = new IBAN2007Identifier();

	public static IBAN2007Identifier instance() {
		return INSTANCE;
	}
}