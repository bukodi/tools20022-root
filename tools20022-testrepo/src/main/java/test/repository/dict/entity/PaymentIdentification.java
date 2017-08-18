package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PaymentIdentification extends MMBusinessComponent {

	private final static PaymentIdentification INSTANCE = new PaymentIdentification();

	public static PaymentIdentification instance() {
		return INSTANCE;
	}
}