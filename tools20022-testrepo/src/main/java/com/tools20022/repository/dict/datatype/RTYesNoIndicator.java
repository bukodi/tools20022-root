package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Indicates a "Yes" or "No" type of answer for an element.
 */
public class RTYesNoIndicator extends MMIndicator {

	private final static AtomicReference<RTYesNoIndicator> repoTypeRef = new AtomicReference<>();

	public static RTYesNoIndicator repoType() {
		repoTypeRef.compareAndSet(null, new RTYesNoIndicator());
		return repoTypeRef.get();
	}

	private RTYesNoIndicator() {
		super.meaningWhenFalse = "No";
		super.meaningWhenTrue = "Yes";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "YesNoIndicator";
		super.definition = "Indicates a \"Yes\" or \"No\" type of answer for an element.";
	} }