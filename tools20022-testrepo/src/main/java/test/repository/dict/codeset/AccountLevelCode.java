package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class AccountLevelCode extends MMCodeSet {

	private final static AccountLevelCode INSTANCE = new AccountLevelCode();

	public static AccountLevelCode instance() {
		return INSTANCE;
	}
}