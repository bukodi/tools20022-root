package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTDateAndPlaceOfBirth extends MMMessageComponent {

	private final static AtomicReference<RTDateAndPlaceOfBirth> repoTypeRef = new AtomicReference<>();

	public static RTDateAndPlaceOfBirth repoType() {
		repoTypeRef.compareAndSet(null, new RTDateAndPlaceOfBirth());
		return repoTypeRef.get();
	}

	private RTDateAndPlaceOfBirth() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "DateAndPlaceOfBirth";
		super.definition = "Date and place of birth of a person.";
	}
}