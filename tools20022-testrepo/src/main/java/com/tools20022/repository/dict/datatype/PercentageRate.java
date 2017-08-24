package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMRate;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class PercentageRate extends MMRate {

	private final static AtomicReference<PercentageRate> repoTypeRef = new AtomicReference<>();

	public static PercentageRate repoType() {
		repoTypeRef.compareAndSet(null, new PercentageRate());
		return repoTypeRef.get();
	}

	private PercentageRate() {
		super.baseValue = 100.0;
		super.totalDigits = 11;
		super.fractionDigits = 10;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PercentageRate";
		super.definition = "Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a percent, and 7.0 is 7%.";
		super.example = Arrays.asList("35");
	}
}