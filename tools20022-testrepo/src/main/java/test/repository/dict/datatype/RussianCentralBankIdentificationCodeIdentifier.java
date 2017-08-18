package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class RussianCentralBankIdentificationCodeIdentifier
		extends
			MMIdentifierSet {

	private final static RussianCentralBankIdentificationCodeIdentifier INSTANCE = new RussianCentralBankIdentificationCodeIdentifier();

	public static RussianCentralBankIdentificationCodeIdentifier instance() {
		return INSTANCE;
	}
}