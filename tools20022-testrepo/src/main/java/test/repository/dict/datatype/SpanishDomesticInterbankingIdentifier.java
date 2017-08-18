package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class SpanishDomesticInterbankingIdentifier extends MMIdentifierSet {

	private final static SpanishDomesticInterbankingIdentifier INSTANCE = new SpanishDomesticInterbankingIdentifier();

	public static SpanishDomesticInterbankingIdentifier instance() {
		return INSTANCE;
	}
}