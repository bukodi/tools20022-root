package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class AuthenticationResultCode extends MMCodeSet {

	private final static AuthenticationResultCode INSTANCE = new AuthenticationResultCode();

	public static AuthenticationResultCode instance() {
		return INSTANCE;
	}
}