package test.repository.dict.datatype;

import com.tools20022.metamodel.MMBinary;

public class Max140Binary extends MMBinary {

	private final static Max140Binary INSTANCE = new Max140Binary();

	public static Max140Binary instance() {
		return INSTANCE;
	}
}