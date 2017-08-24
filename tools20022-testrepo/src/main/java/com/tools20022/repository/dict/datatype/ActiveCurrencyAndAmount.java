package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMAmount;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class ActiveCurrencyAndAmount extends MMAmount {

	private final static AtomicReference<ActiveCurrencyAndAmount> repoTypeRef = new AtomicReference<>();

	public static ActiveCurrencyAndAmount repoType() {
		repoTypeRef.compareAndSet(null, new ActiveCurrencyAndAmount());
		return repoTypeRef.get();
	}

	private ActiveCurrencyAndAmount() {
		super.minInclusive = "0";
		super.totalDigits = 18;
		super.fractionDigits = 5;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ActiveCurrencyAndAmount";
		super.definition = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.";
		super.example = Arrays.asList("6545.56");
		super.constraint = Arrays.asList();
	}
}