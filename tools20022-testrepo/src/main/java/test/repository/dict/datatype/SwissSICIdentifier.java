package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class SwissSICIdentifier extends MMIdentifierSet {

	private final static SwissSICIdentifier INSTANCE = new SwissSICIdentifier();

	public static SwissSICIdentifier instance() {
		return INSTANCE;
	}
}