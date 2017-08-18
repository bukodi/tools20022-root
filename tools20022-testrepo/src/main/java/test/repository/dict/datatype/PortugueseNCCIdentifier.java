package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class PortugueseNCCIdentifier extends MMIdentifierSet {

	private final static PortugueseNCCIdentifier INSTANCE = new PortugueseNCCIdentifier();

	public static PortugueseNCCIdentifier instance() {
		return INSTANCE;
	}
}