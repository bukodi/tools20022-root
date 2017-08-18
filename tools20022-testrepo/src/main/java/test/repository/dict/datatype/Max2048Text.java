package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max2048Text extends MMText {

	private final static Max2048Text INSTANCE = new Max2048Text();

	public static Max2048Text instance() {
		return INSTANCE;
	}
}