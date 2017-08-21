package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class DirectDebitMandate extends MMBusinessComponent {

	private final static AtomicReference<DirectDebitMandate> repoTypeRef = new AtomicReference<>();

	public static DirectDebitMandate repoType() {
		repoTypeRef.compareAndSet(null, new DirectDebitMandate());
		return repoTypeRef.get();
	}

	private DirectDebitMandate() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "DirectDebitMandate";
		super.definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
	}
}