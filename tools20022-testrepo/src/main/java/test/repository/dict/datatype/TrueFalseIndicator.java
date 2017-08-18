package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIndicator;

public class TrueFalseIndicator extends MMIndicator {

	private final static TrueFalseIndicator INSTANCE = new TrueFalseIndicator();

	public static TrueFalseIndicator instance() {
		return INSTANCE;
	}
}