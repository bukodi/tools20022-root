package test.repository.dict.datatype;

import com.tools20022.metamodel.MMDateTime;

public class ISODateTime extends MMDateTime {

	private final static ISODateTime INSTANCE = new ISODateTime();

	public static ISODateTime instance() {
		return INSTANCE;
	}
}