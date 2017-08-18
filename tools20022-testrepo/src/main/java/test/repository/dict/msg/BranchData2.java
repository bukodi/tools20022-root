package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;

public class BranchData2 extends MMMessageComponent {

	private final static BranchData2 INSTANCE = new BranchData2();

	public static BranchData2 instance() {
		return INSTANCE;
	}
}