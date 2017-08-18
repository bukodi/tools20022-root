package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class PriorityCode extends MMCodeSet {

	private final static PriorityCode INSTANCE = new PriorityCode();

	public static PriorityCode instance() {
		return INSTANCE;
	}
}