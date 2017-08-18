package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max140Text extends MMText {

	private final static Max140Text INSTANCE = new Max140Text();

	public static Max140Text instance() {
		return INSTANCE;
	}
}