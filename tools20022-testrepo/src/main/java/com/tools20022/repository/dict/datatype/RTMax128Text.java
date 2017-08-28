package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies a character string with a maximum length of 128 characters.
 */
public class RTMax128Text extends MMText {

	private final static AtomicReference<RTMax128Text> repoTypeRef = new AtomicReference<>();

	public static RTMax128Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax128Text());
		return repoTypeRef.get();
	}

	private RTMax128Text() {
		super.maxLength = 128;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max128Text";
		super.definition = "Specifies a character string with a maximum length of 128 characters.";
	} }