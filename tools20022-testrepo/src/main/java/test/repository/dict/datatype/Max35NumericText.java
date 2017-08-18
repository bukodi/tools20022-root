package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max35NumericText extends MMText {

	private final static Max35NumericText INSTANCE = new Max35NumericText();

	public static Max35NumericText instance() {
		return INSTANCE;
	}
}