package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;

public class MandateAuthentication1 extends MMMessageComponent {

	private final static MandateAuthentication1 INSTANCE = new MandateAuthentication1();

	public static MandateAuthentication1 instance() {
		return INSTANCE;
	}
}