package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTFrequency36Choice extends MMChoiceComponent {

	private final static AtomicReference<RTFrequency36Choice> repoTypeRef = new AtomicReference<>();

	public static RTFrequency36Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequency36Choice());
		return repoTypeRef.get();
	}

	private RTFrequency36Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Frequency36Choice";
		super.definition = "Choice of format for a frequency, for example, the frequency of payment.";
	}
}