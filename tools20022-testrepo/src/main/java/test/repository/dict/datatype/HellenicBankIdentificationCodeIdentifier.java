package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class HellenicBankIdentificationCodeIdentifier extends MMIdentifierSet {

	private final static HellenicBankIdentificationCodeIdentifier INSTANCE = new HellenicBankIdentificationCodeIdentifier();

	public static HellenicBankIdentificationCodeIdentifier instance() {
		return INSTANCE;
	}
}