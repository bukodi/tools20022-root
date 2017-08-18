package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class SequenceTypeCode extends MMCodeSet {

	private final static SequenceTypeCode INSTANCE = new SequenceTypeCode();

	public static SequenceTypeCode instance() {
		return INSTANCE;
	}
}