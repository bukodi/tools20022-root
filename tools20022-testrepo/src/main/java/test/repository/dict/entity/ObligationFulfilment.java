package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class ObligationFulfilment extends MMBusinessComponent {

	private final static ObligationFulfilment INSTANCE = new ObligationFulfilment();

	public static ObligationFulfilment instance() {
		return INSTANCE;
	}
}