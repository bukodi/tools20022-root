package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class SwissBCIdentifier extends MMIdentifierSet {

	private final static SwissBCIdentifier INSTANCE = new SwissBCIdentifier();

	public static SwissBCIdentifier instance() {
		return INSTANCE;
	}
}