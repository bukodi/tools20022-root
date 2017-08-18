package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class IrishNSCIdentifier extends MMIdentifierSet {

	private final static IrishNSCIdentifier INSTANCE = new IrishNSCIdentifier();

	public static IrishNSCIdentifier instance() {
		return INSTANCE;
	}
}