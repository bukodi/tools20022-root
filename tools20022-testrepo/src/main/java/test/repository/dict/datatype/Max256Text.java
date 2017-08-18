package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max256Text extends MMText {

	private final static Max256Text INSTANCE = new Max256Text();

	public static Max256Text instance() {
		return INSTANCE;
	}
}