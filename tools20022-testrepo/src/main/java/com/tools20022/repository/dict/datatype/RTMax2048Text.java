package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies a character string with a maximum length of 2048 characters.
 */
public class RTMax2048Text extends MMText {

	private final static AtomicReference<RTMax2048Text> repoTypeRef = new AtomicReference<>();

	public static RTMax2048Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax2048Text());
		return repoTypeRef.get();
	}

	private RTMax2048Text() {
		super.maxLength = 2048;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max2048Text";
		super.definition = "Specifies a character string with a maximum length of 2048 characters.";
	} }