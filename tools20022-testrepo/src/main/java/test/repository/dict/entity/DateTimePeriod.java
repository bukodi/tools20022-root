package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class DateTimePeriod extends MMBusinessComponent {

	private final static AtomicReference<DateTimePeriod> repoTypeRef = new AtomicReference<>();

	public static DateTimePeriod repoType() {
		repoTypeRef.compareAndSet(null, new DateTimePeriod());
		return repoTypeRef.get();
	}

	private DateTimePeriod() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "DateTimePeriod";
		super.definition = "Time span defined by a start date and time, and an end date and time.";
	}
}