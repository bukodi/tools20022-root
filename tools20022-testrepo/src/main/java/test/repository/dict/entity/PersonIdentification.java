package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PersonIdentification extends MMBusinessComponent {

	private final static AtomicReference<PersonIdentification> repoTypeRef = new AtomicReference<>();

	public static PersonIdentification repoType() {
		repoTypeRef.compareAndSet(null, new PersonIdentification());
		return repoTypeRef.get();
	}

	private PersonIdentification() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PersonIdentification";
		super.definition = "Unique and unambiguous way to identify a person.";
	}
}