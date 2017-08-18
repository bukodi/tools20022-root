package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class BICNonFIIdentifier extends MMIdentifierSet {

	private final static BICNonFIIdentifier INSTANCE = new BICNonFIIdentifier();

	public static BICNonFIIdentifier instance() {
		return INSTANCE;
	}
}