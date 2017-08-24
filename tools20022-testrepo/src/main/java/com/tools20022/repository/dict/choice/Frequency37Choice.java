package com.tools20022.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Frequency37Choice extends MMChoiceComponent {

	private final static AtomicReference<Frequency37Choice> repoTypeRef = new AtomicReference<>();

	public static Frequency37Choice repoType() {
		repoTypeRef.compareAndSet(null, new Frequency37Choice());
		return repoTypeRef.get();
	}

	private Frequency37Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Frequency37Choice";
		super.definition = "Choice of format for a frequency, for example, the frequency of payment.";
	}
}