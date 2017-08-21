package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PersonName extends MMBusinessComponent {

	private final static AtomicReference<PersonName> repoTypeRef = new AtomicReference<>();

	public static PersonName repoType() {
		repoTypeRef.compareAndSet(null, new PersonName());
		return repoTypeRef.get();
	}

	private PersonName() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PersonName";
		super.definition = "Name by which a person is known and that is usually used to identify that person.";
	}
}