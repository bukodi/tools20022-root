package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class AccountLevelCode extends MMCodeSet {

	private final static AtomicReference<AccountLevelCode> repoTypeRef = new AtomicReference<>();

	public static AccountLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new AccountLevelCode());
		return repoTypeRef.get();
	}

	private AccountLevelCode() {
		super.name = "AccountLevelCode";
		super.definition = "Defines the level of an account within the account hierarchy.";
		super.example = Arrays.asList("INTM");
	}
}