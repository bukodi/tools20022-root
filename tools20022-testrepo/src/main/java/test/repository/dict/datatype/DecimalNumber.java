package test.repository.dict.datatype;

import com.tools20022.metamodel.MMQuantity;

public class DecimalNumber extends MMQuantity {

	private final static DecimalNumber INSTANCE = new DecimalNumber();

	public static DecimalNumber instance() {
		return INSTANCE;
	}
}