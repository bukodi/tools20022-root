package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class AccountIdentification extends MMBusinessComponent {

	private final static AtomicReference<AccountIdentification> repoTypeRef = new AtomicReference<>();

	public static AccountIdentification repoType() {
		repoTypeRef.compareAndSet(null, new AccountIdentification());
		return repoTypeRef.get();
	}

	private AccountIdentification() {
		super.element = Arrays.asList();
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "AccountIdentification";
		super.definition = "Unique identifier of an account, as assigned by the account servicer.";
	}
}