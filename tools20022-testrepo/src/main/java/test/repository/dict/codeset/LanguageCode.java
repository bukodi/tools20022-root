package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class LanguageCode extends MMCodeSet {

	private final static LanguageCode INSTANCE = new LanguageCode();

	public static LanguageCode instance() {
		return INSTANCE;
	}
}