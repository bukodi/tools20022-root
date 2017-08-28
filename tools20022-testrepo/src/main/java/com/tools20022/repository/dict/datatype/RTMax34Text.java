package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies a character string with a maximum length of 34 characters.
 */
public class RTMax34Text extends MMText {

	private final static AtomicReference<RTMax34Text> repoTypeRef = new AtomicReference<>();

	public static RTMax34Text repoType() {
		repoTypeRef.compareAndSet(null, new RTMax34Text());
		return repoTypeRef.get();
	}

	private RTMax34Text() {
		super.maxLength = 34;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max34Text";
		super.definition = "Specifies a character string with a maximum length of 34 characters.";
	} }