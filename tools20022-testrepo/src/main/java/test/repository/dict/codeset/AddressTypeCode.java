package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class AddressTypeCode extends MMCodeSet {

	private final static AddressTypeCode INSTANCE = new AddressTypeCode();

	public static AddressTypeCode instance() {
		return INSTANCE;
	}
}