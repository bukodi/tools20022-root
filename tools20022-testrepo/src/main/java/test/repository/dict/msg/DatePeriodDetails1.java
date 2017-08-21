package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class DatePeriodDetails1 extends MMMessageComponent {

	private final static AtomicReference<DatePeriodDetails1> repoTypeRef = new AtomicReference<>();

	public static DatePeriodDetails1 repoType() {
		repoTypeRef.compareAndSet(null, new DatePeriodDetails1());
		return repoTypeRef.get();
	}

	private DatePeriodDetails1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "DatePeriodDetails1";
		super.definition = "Range of time defined by a start date and an end date.";
	}
}