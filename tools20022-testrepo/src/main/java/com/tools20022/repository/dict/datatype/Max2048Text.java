package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;

public class Max2048Text extends MMText {

	private final static AtomicReference<Max2048Text> repoTypeRef = new AtomicReference<>();

	public static Max2048Text repoType() {
		repoTypeRef.compareAndSet(null, new Max2048Text());
		return repoTypeRef.get();
	}

	private Max2048Text() {
		super.maxLength = 2048;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max2048Text";
		super.definition = "Specifies a character string with a maximum length of 2048 characters.";
	}
}