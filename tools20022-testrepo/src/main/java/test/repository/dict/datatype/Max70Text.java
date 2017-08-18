package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max70Text extends MMText {

	private final static Max70Text INSTANCE = new Max70Text();

	public static Max70Text instance() {
		return INSTANCE;
	}
}