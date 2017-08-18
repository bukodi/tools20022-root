package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class ServiceLevelCode extends MMCodeSet {

	private final static ServiceLevelCode INSTANCE = new ServiceLevelCode();

	public static ServiceLevelCode instance() {
		return INSTANCE;
	}
}