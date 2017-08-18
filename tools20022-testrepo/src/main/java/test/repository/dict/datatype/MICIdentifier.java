package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class MICIdentifier extends MMIdentifierSet {

	private final static MICIdentifier INSTANCE = new MICIdentifier();

	public static MICIdentifier instance() {
		return INSTANCE;
	}
}