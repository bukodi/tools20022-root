package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class ResidentialStatusCode extends MMCodeSet {

	private final static ResidentialStatusCode INSTANCE = new ResidentialStatusCode();

	public static ResidentialStatusCode instance() {
		return INSTANCE;
	}
}