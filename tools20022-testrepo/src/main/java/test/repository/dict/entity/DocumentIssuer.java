package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class DocumentIssuer extends MMBusinessComponent {

	private final static DocumentIssuer INSTANCE = new DocumentIssuer();

	public static DocumentIssuer instance() {
		return INSTANCE;
	}
}