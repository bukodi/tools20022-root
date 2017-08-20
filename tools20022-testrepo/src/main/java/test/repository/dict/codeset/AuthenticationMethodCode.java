package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class AuthenticationMethodCode extends MMCodeSet {

	private final static AtomicReference<AuthenticationMethodCode> repoTypeRef = new AtomicReference<>();

	public static AuthenticationMethodCode repoType() {
		repoTypeRef.compareAndSet(null, new AuthenticationMethodCode());
		return repoTypeRef.get();
	}

	private AuthenticationMethodCode() {
		super.name = "AuthenticationMethodCode";
		super.definition = "Method used to authenticate a cardholder.";
		super.example = Arrays.asList("UKNW");
	}
}