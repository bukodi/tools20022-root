package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;

public class CanadianPaymentsARNIdentifier extends MMIdentifierSet {

	private final static CanadianPaymentsARNIdentifier INSTANCE = new CanadianPaymentsARNIdentifier();

	public static CanadianPaymentsARNIdentifier instance() {
		return INSTANCE;
	}
}