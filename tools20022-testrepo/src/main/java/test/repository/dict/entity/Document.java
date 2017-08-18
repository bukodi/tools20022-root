package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Document extends MMBusinessComponent {

	private final static Document INSTANCE = new Document();

	public static Document instance() {
		return INSTANCE;
	}
}