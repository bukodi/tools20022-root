package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTCashAccountType2Choice extends MMChoiceComponent {

	private final static AtomicReference<RTCashAccountType2Choice> repoTypeRef = new AtomicReference<>();

	public static RTCashAccountType2Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTCashAccountType2Choice());
		return repoTypeRef.get();
	}

	private RTCashAccountType2Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "CashAccountType2Choice";
		super.definition = "Nature or use of the account.";
	}
}