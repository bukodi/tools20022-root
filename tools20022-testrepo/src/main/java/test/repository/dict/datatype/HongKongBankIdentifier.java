package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class HongKongBankIdentifier extends MMIdentifierSet {

	private final static HongKongBankIdentifier INSTANCE = new HongKongBankIdentifier();

	public static HongKongBankIdentifier instance() {
		return INSTANCE;
	}
}