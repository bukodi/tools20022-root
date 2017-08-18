package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class LEIIdentifier extends MMIdentifierSet {

	private final static LEIIdentifier INSTANCE = new LEIIdentifier();

	public static LEIIdentifier instance() {
		return INSTANCE;
	}
}