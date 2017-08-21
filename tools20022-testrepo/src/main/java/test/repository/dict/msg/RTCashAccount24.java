package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTCashAccount24 extends MMMessageComponent {

	private final static AtomicReference<RTCashAccount24> repoTypeRef = new AtomicReference<>();

	public static RTCashAccount24 repoType() {
		repoTypeRef.compareAndSet(null, new RTCashAccount24());
		return repoTypeRef.get();
	}

	private RTCashAccount24() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "CashAccount24";
		super.definition = "Provides the details to identify an account.";
	}
}