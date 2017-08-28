package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies a character string with a maximum length of 16 characters.
 */
public class RTMax16Text extends MMText {

	private final static AtomicReference<RTMax16Text> repoTypeRef = new AtomicReference<>();

	public static RTMax16Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax16Text());
		return repoTypeRef.get();
	}

	private RTMax16Text() {
		super.maxLength = 16;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max16Text";
		super.definition = "Specifies a character string with a maximum length of 16 characters.";
	} }