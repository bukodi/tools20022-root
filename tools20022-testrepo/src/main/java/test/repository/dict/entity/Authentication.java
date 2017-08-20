package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class Authentication extends MMBusinessComponent {

	private final static AtomicReference<Authentication> repoTypeRef = new AtomicReference<>();

	public static Authentication repoType() {
		repoTypeRef.compareAndSet(null, new Authentication());
		return repoTypeRef.get();
	}

	private Authentication() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "Authentication";
		super.definition = "Data related to the authentication of the cardholder.";
	}
}