package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;

public class DataSetTypeCode extends MMCodeSet {

	private final static DataSetTypeCode INSTANCE = new DataSetTypeCode();

	public static DataSetTypeCode instance() {
		return INSTANCE;
	}
}