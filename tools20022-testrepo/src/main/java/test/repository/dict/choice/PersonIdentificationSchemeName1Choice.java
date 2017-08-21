package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PersonIdentificationSchemeName1Choice extends MMChoiceComponent {

	private final static AtomicReference<PersonIdentificationSchemeName1Choice> repoTypeRef = new AtomicReference<>();

	public static PersonIdentificationSchemeName1Choice repoType() {
		repoTypeRef.compareAndSet(null,
				new PersonIdentificationSchemeName1Choice());
		return repoTypeRef.get();
	}

	private PersonIdentificationSchemeName1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PersonIdentificationSchemeName1Choice";
		super.definition = "Sets of elements to identify a name of the identification scheme.";
	}
}