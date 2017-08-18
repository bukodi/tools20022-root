package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class FrequencyCode extends MMCodeSet {

	private final static FrequencyCode INSTANCE = new FrequencyCode();

	public static FrequencyCode instance() {
		return INSTANCE;
	}
}