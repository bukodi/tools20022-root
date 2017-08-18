package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class MandateClassificationCode extends MMCodeSet {

	private final static MandateClassificationCode INSTANCE = new MandateClassificationCode();

	public static MandateClassificationCode instance() {
		return INSTANCE;
	}
}