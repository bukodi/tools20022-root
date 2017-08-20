package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;

public class AuthenticationResultCode extends MMCodeSet {

	private final static AtomicReference<AuthenticationResultCode> repoTypeRef = new AtomicReference<>();

	public static AuthenticationResultCode repoType() {
		repoTypeRef.compareAndSet(null, new AuthenticationResultCode());
		return repoTypeRef.get();
	}

	private AuthenticationResultCode() {
		super.name = "AuthenticationResultCode";
		super.definition = "Specifies the result of authentication done";
	}
}