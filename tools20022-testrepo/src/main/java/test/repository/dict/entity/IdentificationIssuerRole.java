package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class IdentificationIssuerRole extends MMBusinessComponent {

	private final static IdentificationIssuerRole INSTANCE = new IdentificationIssuerRole();

	public static IdentificationIssuerRole instance() {
		return INSTANCE;
	}
}