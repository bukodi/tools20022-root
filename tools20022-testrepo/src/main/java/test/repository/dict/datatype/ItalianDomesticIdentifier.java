package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class ItalianDomesticIdentifier extends MMIdentifierSet {

	private final static ItalianDomesticIdentifier INSTANCE = new ItalianDomesticIdentifier();

	public static ItalianDomesticIdentifier instance() {
		return INSTANCE;
	}
}