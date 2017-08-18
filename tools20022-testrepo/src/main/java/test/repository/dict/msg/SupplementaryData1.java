package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;

public class SupplementaryData1 extends MMMessageComponent {

	private final static SupplementaryData1 INSTANCE = new SupplementaryData1();

	public static SupplementaryData1 instance() {
		return INSTANCE;
	}
}