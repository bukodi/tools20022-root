package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class BBANIdentifier extends MMIdentifierSet {

	private final static BBANIdentifier INSTANCE = new BBANIdentifier();

	public static BBANIdentifier instance() {
		return INSTANCE;
	}
}