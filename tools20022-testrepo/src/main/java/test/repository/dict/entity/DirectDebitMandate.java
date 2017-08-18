package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class DirectDebitMandate extends MMBusinessComponent {

	private final static DirectDebitMandate INSTANCE = new DirectDebitMandate();

	public static DirectDebitMandate instance() {
		return INSTANCE;
	}
}