package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class Scheme extends MMBusinessComponent {

	private final static AtomicReference<Scheme> repoTypeRef = new AtomicReference<>();

	public static Scheme repoType() {
		repoTypeRef.compareAndSet(null, new Scheme());
		return repoTypeRef.get();
	}

	private Scheme() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "Scheme";
		super.definition = "Information regarding an enumerated code list and its owner.";
	}
}