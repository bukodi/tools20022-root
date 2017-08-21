package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTFrequencyAndMoment1 extends MMMessageComponent {

	private final static AtomicReference<RTFrequencyAndMoment1> repoTypeRef = new AtomicReference<>();

	public static RTFrequencyAndMoment1 repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequencyAndMoment1());
		return repoTypeRef.get();
	}

	private RTFrequencyAndMoment1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "FrequencyAndMoment1";
		super.definition = "Defines a frequency in terms a specific moment within a specified period type.";
	}
}