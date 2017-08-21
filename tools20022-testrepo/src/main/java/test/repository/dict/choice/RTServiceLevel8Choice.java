package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTServiceLevel8Choice extends MMChoiceComponent {

	private final static AtomicReference<RTServiceLevel8Choice> repoTypeRef = new AtomicReference<>();

	public static RTServiceLevel8Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTServiceLevel8Choice());
		return repoTypeRef.get();
	}

	private RTServiceLevel8Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ServiceLevel8Choice";
		super.definition = "Specifies the service level of the transaction.";
	}
}