package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class FedwireRoutingNumberIdentifier extends MMIdentifierSet {

	private final static FedwireRoutingNumberIdentifier INSTANCE = new FedwireRoutingNumberIdentifier();

	public static FedwireRoutingNumberIdentifier instance() {
		return INSTANCE;
	}
}