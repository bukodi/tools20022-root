package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class AuthenticationEntityCode extends MMCodeSet {

	private final static AuthenticationEntityCode INSTANCE = new AuthenticationEntityCode();

	public static AuthenticationEntityCode instance() {
		return INSTANCE;
	}
}