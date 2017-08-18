package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class SouthAfricanNCCIdentifier extends MMIdentifierSet {

	private final static SouthAfricanNCCIdentifier INSTANCE = new SouthAfricanNCCIdentifier();

	public static SouthAfricanNCCIdentifier instance() {
		return INSTANCE;
	}
}