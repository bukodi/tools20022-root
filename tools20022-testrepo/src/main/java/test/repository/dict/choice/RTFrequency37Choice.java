package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTFrequency37Choice extends MMChoiceComponent {

	private final static AtomicReference<RTFrequency37Choice> repoTypeRef = new AtomicReference<>();

	public static RTFrequency37Choice repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequency37Choice());
		return repoTypeRef.get();
	}

	private RTFrequency37Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Frequency37Choice";
		super.definition = "Choice of format for a frequency, for example, the frequency of payment.";
	}
}