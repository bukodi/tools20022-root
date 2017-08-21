package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTFrequencyPeriod1 extends MMMessageComponent {

	private final static AtomicReference<RTFrequencyPeriod1> repoTypeRef = new AtomicReference<>();

	public static RTFrequencyPeriod1 repoType() {
		repoTypeRef.compareAndSet(null, new RTFrequencyPeriod1());
		return repoTypeRef.get();
	}

	private RTFrequencyPeriod1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "FrequencyPeriod1";
		super.definition = "Defines a frequency in terms on counts per period for a specific period type.";
	}
}