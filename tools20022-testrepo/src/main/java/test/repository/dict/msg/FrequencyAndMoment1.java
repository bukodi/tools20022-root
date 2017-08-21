package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class FrequencyAndMoment1 extends MMMessageComponent {

	private final static AtomicReference<FrequencyAndMoment1> repoTypeRef = new AtomicReference<>();

	public static FrequencyAndMoment1 repoType() {
		repoTypeRef.compareAndSet(null, new FrequencyAndMoment1());
		return repoTypeRef.get();
	}

	private FrequencyAndMoment1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "FrequencyAndMoment1";
		super.definition = "Defines a frequency in terms a specific moment within a specified period type.";
	}
}