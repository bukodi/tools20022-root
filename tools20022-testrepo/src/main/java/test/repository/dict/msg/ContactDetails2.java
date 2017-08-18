package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;

public class ContactDetails2 extends MMMessageComponent {

	private final static ContactDetails2 INSTANCE = new ContactDetails2();

	public static ContactDetails2 instance() {
		return INSTANCE;
	}
}