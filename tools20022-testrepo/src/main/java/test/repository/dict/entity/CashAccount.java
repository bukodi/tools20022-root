package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class CashAccount extends MMBusinessComponent {

	private final static AtomicReference<CashAccount> repoTypeRef = new AtomicReference<>();

	public static CashAccount repoType() {
		repoTypeRef.compareAndSet(null, new CashAccount());
		return repoTypeRef.get();
	}

	private CashAccount() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "CashAccount";
		super.definition = "Account to or from which a cash entry is made.";
	}
}