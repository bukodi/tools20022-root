package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies a character string with a maximum length of 140 characters.
 */
public class RTMax140Text extends MMText {

	private final static AtomicReference<RTMax140Text> repoTypeRef = new AtomicReference<>();

	public static RTMax140Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax140Text());
		return repoTypeRef.get();
	}

	private RTMax140Text() {
		super.maxLength = 140;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max140Text";
		super.definition = "Specifies a character string with a maximum length of 140 characters.";
	} }