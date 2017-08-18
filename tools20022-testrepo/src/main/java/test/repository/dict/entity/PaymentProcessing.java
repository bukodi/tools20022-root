package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PaymentProcessing extends MMBusinessComponent {

	private final static PaymentProcessing INSTANCE = new PaymentProcessing();

	public static PaymentProcessing instance() {
		return INSTANCE;
	}
}