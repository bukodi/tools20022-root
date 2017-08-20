package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class Mandate extends MMBusinessComponent {

	private final static AtomicReference<Mandate> repoTypeRef = new AtomicReference<>();

	public static Mandate repoType() {
		repoTypeRef.compareAndSet(null, new Mandate());
		return repoTypeRef.get();
	}

	private Mandate() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "Mandate";
		super.definition = "Authorisation given by an issuing party to a holder party to act on the issuer's behalf.";
	}
}