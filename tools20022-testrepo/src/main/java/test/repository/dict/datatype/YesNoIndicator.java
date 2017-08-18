package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIndicator;

public class YesNoIndicator extends MMIndicator {

	private final static YesNoIndicator INSTANCE = new YesNoIndicator();

	public static YesNoIndicator instance() {
		return INSTANCE;
	}
}