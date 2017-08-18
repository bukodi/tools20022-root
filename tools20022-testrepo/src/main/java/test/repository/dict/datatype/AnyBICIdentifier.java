package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class AnyBICIdentifier extends MMIdentifierSet {

	private final static AnyBICIdentifier INSTANCE = new AnyBICIdentifier();

	public static AnyBICIdentifier instance() {
		return INSTANCE;
	}
}