package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max350Text extends MMText {

	private final static Max350Text INSTANCE = new Max350Text();

	public static Max350Text instance() {
		return INSTANCE;
	}
}