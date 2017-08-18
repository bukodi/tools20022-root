package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class Max128Text extends MMText {

	private final static Max128Text INSTANCE = new Max128Text();

	public static Max128Text instance() {
		return INSTANCE;
	}
}