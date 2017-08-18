package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class CopyDuplicateCode extends MMCodeSet {

	private final static CopyDuplicateCode INSTANCE = new CopyDuplicateCode();

	public static CopyDuplicateCode instance() {
		return INSTANCE;
	}
}