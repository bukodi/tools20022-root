package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PaymentPartyRole extends MMBusinessComponent {

	private final static PaymentPartyRole INSTANCE = new PaymentPartyRole();

	public static PaymentPartyRole instance() {
		return INSTANCE;
	}
}