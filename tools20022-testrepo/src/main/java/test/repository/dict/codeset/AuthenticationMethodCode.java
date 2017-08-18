package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class AuthenticationMethodCode extends MMCodeSet {

	private final static AuthenticationMethodCode INSTANCE = new AuthenticationMethodCode();

	public static AuthenticationMethodCode instance() {
		return INSTANCE;
	}
}