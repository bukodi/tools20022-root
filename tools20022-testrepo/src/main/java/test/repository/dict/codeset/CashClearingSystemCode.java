package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class CashClearingSystemCode extends MMCodeSet {

	private final static CashClearingSystemCode INSTANCE = new CashClearingSystemCode();

	public static CashClearingSystemCode instance() {
		return INSTANCE;
	}
}