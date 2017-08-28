package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies a character string with a maximum length of 350 characters.
 */
public class RTMax350Text extends MMText {

	private final static AtomicReference<RTMax350Text> repoTypeRef = new AtomicReference<>();

	public static RTMax350Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax350Text());
		return repoTypeRef.get();
	}

	private RTMax350Text() {
		super.maxLength = 350;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max350Text";
		super.definition = "Specifies a character string with a maximum length of 350 characters.";
	} }