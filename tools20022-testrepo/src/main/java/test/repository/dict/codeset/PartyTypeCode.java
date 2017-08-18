package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class PartyTypeCode extends MMCodeSet {

	private final static PartyTypeCode INSTANCE = new PartyTypeCode();

	public static PartyTypeCode instance() {
		return INSTANCE;
	}
}