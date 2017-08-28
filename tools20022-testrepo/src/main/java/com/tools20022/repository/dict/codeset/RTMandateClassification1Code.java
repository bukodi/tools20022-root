package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTMandateClassification1Code;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the type of direct debit amount, such as fixed or variable.
 */
public class RTMandateClassification1Code extends MMCodeSet {

	private final static AtomicReference<RTMandateClassification1Code> repoTypeRef = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public final MMCode codeFixed = new MMCode() {
		{
			super.owner_lazy = () -> RTMandateClassification1Code.repoType();
			super.name = "Fixed";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeUsageBased = new MMCode() {
		{
			super.owner_lazy = () -> RTMandateClassification1Code.repoType();
			super.name = "UsageBased";
		}
	};
	/**
	 * (No doc)
	 */
	public final MMCode codeVariable = new MMCode() {
		{
			super.owner_lazy = () -> RTMandateClassification1Code.repoType();
			super.name = "Variable";
		}
	};

	public static RTMandateClassification1Code repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateClassification1Code());
		return repoTypeRef.get();
	}

	private RTMandateClassification1Code() {
		super.code = Arrays.asList(codeFixed, codeUsageBased, codeVariable);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateClassification1Code";
		super.definition = "Specifies the type of direct debit amount, such as fixed or variable.";
	} }