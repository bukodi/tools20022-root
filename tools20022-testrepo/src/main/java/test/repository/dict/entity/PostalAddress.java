package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class PostalAddress extends MMBusinessComponent {

	private final static PostalAddress INSTANCE = new PostalAddress();

	public static PostalAddress instance() {
		return INSTANCE;
	}
}