package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class CashAccount24 extends MMMessageComponent {

	private final static AtomicReference<CashAccount24> repoTypeRef = new AtomicReference<>();

	public static CashAccount24 repoType() {
		repoTypeRef.compareAndSet(null, new CashAccount24());
		return repoTypeRef.get();
	}

	private CashAccount24() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "CashAccount24";
		super.definition = "Provides the details to identify an account.";
	}
}