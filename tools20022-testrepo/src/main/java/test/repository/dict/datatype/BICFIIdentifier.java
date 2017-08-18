package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class BICFIIdentifier extends MMIdentifierSet {

	private final static BICFIIdentifier INSTANCE = new BICFIIdentifier();

	public static BICFIIdentifier instance() {
		return INSTANCE;
	}
}