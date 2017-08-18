package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class ExternalCode extends MMCodeSet {

	private final static ExternalCode INSTANCE = new ExternalCode();

	public static ExternalCode instance() {
		return INSTANCE;
	}
}