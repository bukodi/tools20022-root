package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PaymentExecution extends MMBusinessComponent {

	private final static PaymentExecution INSTANCE = new PaymentExecution();

	public static PaymentExecution instance() {
		return INSTANCE;
	}
}