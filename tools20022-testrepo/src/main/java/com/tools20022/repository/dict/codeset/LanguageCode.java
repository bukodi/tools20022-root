package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class LanguageCode extends MMCodeSet {

	private final static AtomicReference<LanguageCode> repoTypeRef = new AtomicReference<>();

	public static LanguageCode repoType() {
		repoTypeRef.compareAndSet(null, new LanguageCode());
		return repoTypeRef.get();
	}

	private LanguageCode() {
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "LanguageCode";
		super.definition = "Specifies a language.";
		super.example = Arrays.asList("ENG");
		super.constraint = Arrays.asList();
	}
}