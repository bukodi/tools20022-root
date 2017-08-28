package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * A flag indicating a True or False value.
 */
public class RTTrueFalseIndicator extends MMIndicator {

	private final static AtomicReference<RTTrueFalseIndicator> repoTypeRef = new AtomicReference<>();

	public static RTTrueFalseIndicator repoType() {
		repoTypeRef.compareAndSet(null, new RTTrueFalseIndicator());
		return repoTypeRef.get();
	}

	private RTTrueFalseIndicator() {
		super.meaningWhenFalse = "False";
		super.meaningWhenTrue = "True";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "TrueFalseIndicator";
		super.definition = "A flag indicating a True or False value.";
	} }