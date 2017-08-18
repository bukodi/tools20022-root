package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class CashAccountTypeCode extends MMCodeSet {

	private final static CashAccountTypeCode INSTANCE = new CashAccountTypeCode();

	public static CashAccountTypeCode instance() {
		return INSTANCE;
	}
}