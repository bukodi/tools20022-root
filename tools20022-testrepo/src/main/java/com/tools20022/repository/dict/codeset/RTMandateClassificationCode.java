package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTMandateClassificationCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the type of direct debit amount, such as fixed or variable.
 */
public class RTMandateClassificationCode extends MMCodeSet {

	private final static AtomicReference<RTMandateClassificationCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Direct debit amount is fixed.
	 */
	public final MMCode codeFixed = new MMCode() {
		{
			super.owner_lazy = () -> RTMandateClassificationCode.repoType();
			super.codeName = "FIXE";
			super.name = "Fixed";
			super.definition = "Direct debit amount is fixed.";
		}
	};
	/**
	 * Direct debit amount is variable.
	 */
	public final MMCode codeVariable = new MMCode() {
		{
			super.owner_lazy = () -> RTMandateClassificationCode.repoType();
			super.codeName = "VARI";
			super.name = "Variable";
			super.definition = "Direct debit amount is variable.";
		}
	};
	/**
	 * Direct debit amount is based on usage.
	 */
	public final MMCode codeUsageBased = new MMCode() {
		{
			super.owner_lazy = () -> RTMandateClassificationCode.repoType();
			super.codeName = "USGB";
			super.name = "UsageBased";
			super.definition = "Direct debit amount is based on usage.";
		}
	};

	public static RTMandateClassificationCode repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateClassificationCode());
		return repoTypeRef.get();
	}

	private RTMandateClassificationCode() {
		super.code = Arrays.asList(codeFixed, codeVariable, codeUsageBased);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateClassificationCode";
		super.definition = "Specifies the type of direct debit amount, such as fixed or variable.";
		super.example = Arrays.asList("FIXE");
	} }