package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class AccountSchemeName1Choice extends MMChoiceComponent {

	private final static AtomicReference<AccountSchemeName1Choice> repoTypeRef = new AtomicReference<>();

	public static AccountSchemeName1Choice repoType() {
		repoTypeRef.compareAndSet(null, new AccountSchemeName1Choice());
		return repoTypeRef.get();
	}

	private AccountSchemeName1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "AccountSchemeName1Choice";
		super.definition = "Sets of elements to identify a name of the identification scheme";
	}
}