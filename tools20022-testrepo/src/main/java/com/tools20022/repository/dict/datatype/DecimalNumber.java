package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMQuantity;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class DecimalNumber extends MMQuantity {

	private final static AtomicReference<DecimalNumber> repoTypeRef = new AtomicReference<>();

	public static DecimalNumber repoType() {
		repoTypeRef.compareAndSet(null, new DecimalNumber());
		return repoTypeRef.get();
	}

	private DecimalNumber() {
		super.totalDigits = 18;
		super.fractionDigits = 17;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DecimalNumber";
		super.definition = "Number of objects represented as a decimal number, eg, 0.75 or 45.6.";
		super.example = Arrays.asList("123456789.123456789");
	}
}