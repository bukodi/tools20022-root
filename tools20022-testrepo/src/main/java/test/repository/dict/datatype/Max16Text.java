package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max16Text extends MMText {

	private final static Max16Text INSTANCE = new Max16Text();

	public static Max16Text instance() {
		return INSTANCE;
	}
}