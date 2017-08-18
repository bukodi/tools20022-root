package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class PINFormatCode extends MMCodeSet {

	private final static PINFormatCode INSTANCE = new PINFormatCode();

	public static PINFormatCode instance() {
		return INSTANCE;
	}
}