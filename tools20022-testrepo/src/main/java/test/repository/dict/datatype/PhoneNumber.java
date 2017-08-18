package test.repository.dict.datatype;

import com.tools20022.metamodel.MMText;

public class PhoneNumber extends MMText {

	private final static PhoneNumber INSTANCE = new PhoneNumber();

	public static PhoneNumber instance() {
		return INSTANCE;
	}
}