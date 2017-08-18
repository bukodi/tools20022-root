package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;

public class DateTimePeriod extends MMBusinessComponent {

	private final static DateTimePeriod INSTANCE = new DateTimePeriod();

	public static DateTimePeriod instance() {
		return INSTANCE;
	}
}