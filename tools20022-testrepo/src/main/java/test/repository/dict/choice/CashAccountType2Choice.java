package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;

public class CashAccountType2Choice extends MMChoiceComponent {

	private final static AtomicReference<CashAccountType2Choice> repoTypeRef = new AtomicReference<>();

	public static CashAccountType2Choice repoType() {
		repoTypeRef.compareAndSet(null, new CashAccountType2Choice());
		return repoTypeRef.get();
	}

	private CashAccountType2Choice() {
		super.name = "CashAccountType2Choice";
		super.definition = "Nature or use of the account.";
	}
}