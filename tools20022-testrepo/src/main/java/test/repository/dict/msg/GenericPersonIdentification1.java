package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;

public class GenericPersonIdentification1 extends MMMessageComponent {

	private final static GenericPersonIdentification1 INSTANCE = new GenericPersonIdentification1();

	public static GenericPersonIdentification1 instance() {
		return INSTANCE;
	}
}