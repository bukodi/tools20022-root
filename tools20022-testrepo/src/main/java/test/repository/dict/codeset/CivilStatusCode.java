package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class CivilStatusCode extends MMCodeSet {

	private final static CivilStatusCode INSTANCE = new CivilStatusCode();

	public static CivilStatusCode instance() {
		return INSTANCE;
	}
}