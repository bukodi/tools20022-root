package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class DateAndPlaceOfBirth extends MMMessageComponent {

	private final static AtomicReference<DateAndPlaceOfBirth> repoTypeRef = new AtomicReference<>();

	public static DateAndPlaceOfBirth repoType() {
		repoTypeRef.compareAndSet(null, new DateAndPlaceOfBirth());
		return repoTypeRef.get();
	}

	private DateAndPlaceOfBirth() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "DateAndPlaceOfBirth";
		super.definition = "Date and place of birth of a person.";
	}
}