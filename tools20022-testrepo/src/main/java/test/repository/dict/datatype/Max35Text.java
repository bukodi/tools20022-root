package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max35Text extends MMText {

	private final static Max35Text INSTANCE = new Max35Text();

	public static Max35Text instance() {
		return INSTANCE;
	}
}