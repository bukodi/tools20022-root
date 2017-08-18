package test.repository.dict.datatype;

import com.tools20022.metamodel.MMRate;

public class PercentageRate extends MMRate {

	private final static PercentageRate INSTANCE = new PercentageRate();

	public static PercentageRate instance() {
		return INSTANCE;
	}
}