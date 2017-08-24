package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class ActiveOrHistoricCurrencyCode extends MMCodeSet {

	private final static AtomicReference<ActiveOrHistoricCurrencyCode> repoTypeRef = new AtomicReference<>();

	public static ActiveOrHistoricCurrencyCode repoType() {
		repoTypeRef.compareAndSet(null, new ActiveOrHistoricCurrencyCode());
		return repoTypeRef.get();
	}

	private ActiveOrHistoricCurrencyCode() {
		super.pattern = "[A-Z]{3,3}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ActiveOrHistoricCurrencyCode";
		super.definition = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".";
		super.example = Arrays.asList("USD");
		super.constraint = Arrays.asList();
	}
}