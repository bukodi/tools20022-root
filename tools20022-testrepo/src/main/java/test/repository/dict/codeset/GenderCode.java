package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class GenderCode extends MMCodeSet {

	private final static GenderCode INSTANCE = new GenderCode();

	public static GenderCode instance() {
		return INSTANCE;
	}
}