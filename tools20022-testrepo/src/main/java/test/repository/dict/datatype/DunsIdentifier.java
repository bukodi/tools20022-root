package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class DunsIdentifier extends MMIdentifierSet {

	private final static DunsIdentifier INSTANCE = new DunsIdentifier();

	public static DunsIdentifier instance() {
		return INSTANCE;
	}
}