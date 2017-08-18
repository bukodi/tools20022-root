package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class CHIPSUniversalIdentifier extends MMIdentifierSet {

	private final static CHIPSUniversalIdentifier INSTANCE = new CHIPSUniversalIdentifier();

	public static CHIPSUniversalIdentifier instance() {
		return INSTANCE;
	}
}