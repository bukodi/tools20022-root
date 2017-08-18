package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class UPICIdentifier extends MMIdentifierSet {

	private final static UPICIdentifier INSTANCE = new UPICIdentifier();

	public static UPICIdentifier instance() {
		return INSTANCE;
	}
}