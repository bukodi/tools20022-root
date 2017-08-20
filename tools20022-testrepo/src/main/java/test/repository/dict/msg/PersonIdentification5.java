package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;

public class PersonIdentification5 extends MMMessageComponent {

	private final static AtomicReference<PersonIdentification5> repoTypeRef = new AtomicReference<>();

	public static PersonIdentification5 repoType() {
		repoTypeRef.compareAndSet(null, new PersonIdentification5());
		return repoTypeRef.get();
	}

	private PersonIdentification5() {
		super.name = "PersonIdentification5";
		super.definition = "Unique and unambiguous way to identify a person.";
	}
}