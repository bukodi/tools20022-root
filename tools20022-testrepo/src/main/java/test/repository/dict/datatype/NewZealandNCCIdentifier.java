package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class NewZealandNCCIdentifier extends MMIdentifierSet {

	private final static NewZealandNCCIdentifier INSTANCE = new NewZealandNCCIdentifier();

	public static NewZealandNCCIdentifier instance() {
		return INSTANCE;
	}
}