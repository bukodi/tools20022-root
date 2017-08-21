package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class Account extends MMBusinessComponent {

	private final static AtomicReference<Account> repoTypeRef = new AtomicReference<>();

	public static Account repoType() {
		repoTypeRef.compareAndSet(null, new Account());
		return repoTypeRef.get();
	}

	private Account() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Account";
		super.definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
	}
}