package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class CashAccount extends MMBusinessComponent {

	private final static AtomicReference<CashAccount> repoTypeRef = new AtomicReference<>();

	public static CashAccount repoType() {
		repoTypeRef.compareAndSet(null, new CashAccount());
		return repoTypeRef.get();
	}

	private CashAccount() {
		super.element = Arrays.asList();
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.semanticMarkup = Arrays.asList();
		super.name = "CashAccount";
		super.definition = "Account to or from which a cash entry is made.";
	}
}