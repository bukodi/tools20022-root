package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Exact2NumericText extends MMText {

	private final static Exact2NumericText INSTANCE = new Exact2NumericText();

	public static Exact2NumericText instance() {
		return INSTANCE;
	}
}