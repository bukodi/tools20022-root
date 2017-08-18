package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class Authentication extends MMBusinessComponent {

	private final static Authentication INSTANCE = new Authentication();

	public static Authentication instance() {
		return INSTANCE;
	}
}