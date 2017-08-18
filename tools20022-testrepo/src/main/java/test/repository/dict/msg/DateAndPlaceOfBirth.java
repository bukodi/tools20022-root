package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;

public class DateAndPlaceOfBirth extends MMMessageComponent {

	private final static DateAndPlaceOfBirth INSTANCE = new DateAndPlaceOfBirth();

	public static DateAndPlaceOfBirth instance() {
		return INSTANCE;
	}
}