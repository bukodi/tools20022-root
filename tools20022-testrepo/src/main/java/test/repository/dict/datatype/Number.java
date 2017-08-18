package test.repository.dict.datatype;

import com.tools20022.metamodel.MMQuantity;

public class Number extends MMQuantity {

	private final static Number INSTANCE = new Number();

	public static Number instance() {
		return INSTANCE;
	}
}