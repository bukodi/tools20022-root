package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class TypeOfIdentificationCode extends MMCodeSet {

	private final static TypeOfIdentificationCode INSTANCE = new TypeOfIdentificationCode();

	public static TypeOfIdentificationCode instance() {
		return INSTANCE;
	}
}