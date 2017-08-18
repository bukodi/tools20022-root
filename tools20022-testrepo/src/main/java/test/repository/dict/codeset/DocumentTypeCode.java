package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class DocumentTypeCode extends MMCodeSet {

	private final static DocumentTypeCode INSTANCE = new DocumentTypeCode();

	public static DocumentTypeCode instance() {
		return INSTANCE;
	}
}