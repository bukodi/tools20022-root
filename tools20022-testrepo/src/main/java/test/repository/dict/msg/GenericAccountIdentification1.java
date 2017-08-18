package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;

public class GenericAccountIdentification1 extends MMMessageComponent {

	private final static GenericAccountIdentification1 INSTANCE = new GenericAccountIdentification1();

	public static GenericAccountIdentification1 instance() {
		return INSTANCE;
	}
}