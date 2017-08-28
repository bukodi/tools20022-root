package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies a character string with a maximum length of 35 characters.
 */
public class RTMax35Text extends MMText {

	private final static AtomicReference<RTMax35Text> repoTypeRef = new AtomicReference<>();

	public static RTMax35Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax35Text());
		return repoTypeRef.get();
	}

	private RTMax35Text() {
		super.maxLength = 35;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max35Text";
		super.definition = "Specifies a character string with a maximum length of 35 characters.";
	} }