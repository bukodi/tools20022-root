package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class AuthenticationEntityCode extends MMCodeSet {

	private final static AtomicReference<AuthenticationEntityCode> repoTypeRef = new AtomicReference<>();

	public static AuthenticationEntityCode repoType() {
		repoTypeRef.compareAndSet(null, new AuthenticationEntityCode());
		return repoTypeRef.get();
	}

	private AuthenticationEntityCode() {
		super.name = "AuthenticationEntityCode";
		super.definition = "Entity or object in charge of verifying the cardholder authenticity.";
		super.example = Arrays.asList("ICCD");
	}
}