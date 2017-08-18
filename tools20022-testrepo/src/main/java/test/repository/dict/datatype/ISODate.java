package test.repository.dict.datatype;

import com.tools20022.metamodel.MMDate;

public class ISODate extends MMDate {

	private final static ISODate INSTANCE = new ISODate();

	public static ISODate instance() {
		return INSTANCE;
	}
}