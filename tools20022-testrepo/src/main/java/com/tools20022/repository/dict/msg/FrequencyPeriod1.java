package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class FrequencyPeriod1 extends MMMessageComponent {

	private final static AtomicReference<FrequencyPeriod1> repoTypeRef = new AtomicReference<>();

	public static FrequencyPeriod1 repoType() {
		repoTypeRef.compareAndSet(null, new FrequencyPeriod1());
		return repoTypeRef.get();
	}

	private FrequencyPeriod1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "FrequencyPeriod1";
		super.definition = "Defines a frequency in terms on counts per period for a specific period type.";
	}
}