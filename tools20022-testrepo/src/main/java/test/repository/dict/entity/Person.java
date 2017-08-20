package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class Person extends MMBusinessComponent {

	private final static AtomicReference<Person> repoTypeRef = new AtomicReference<>();

	public static Person repoType() {
		repoTypeRef.compareAndSet(null, new Person());
		return repoTypeRef.get();
	}

	private Person() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "Person";
		super.definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
	}
}