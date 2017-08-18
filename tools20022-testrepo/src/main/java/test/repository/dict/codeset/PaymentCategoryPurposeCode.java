package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class PaymentCategoryPurposeCode extends MMCodeSet {

	private final static PaymentCategoryPurposeCode INSTANCE = new PaymentCategoryPurposeCode();

	public static PaymentCategoryPurposeCode instance() {
		return INSTANCE;
	}
}